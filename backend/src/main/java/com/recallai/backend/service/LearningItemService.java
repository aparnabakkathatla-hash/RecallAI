package com.recallai.backend.service;

import com.recallai.backend.entity.LearningItem;
import com.recallai.backend.repository.LearningItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningItemService {

    private final LearningItemRepository learningItemRepository;

    public LearningItemService(LearningItemRepository learningItemRepository) {
        this.learningItemRepository = learningItemRepository;
    }

    // Create
    public LearningItem saveLearningItem(LearningItem learningItem) {
        return learningItemRepository.save(learningItem);
    }

    // Get all
    public List<LearningItem> getAllLearningItems() {
        return learningItemRepository.findAll();
    }

    // Get by user
    public List<LearningItem> getLearningItemsByUserId(Long userId) {
        return learningItemRepository.findByUserId(userId);
    }

    // Update
    public LearningItem updateLearningItem(Long id, LearningItem updatedItem) {

        LearningItem existingItem = learningItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Learning item not found"));

        existingItem.setTopic(updatedItem.getTopic());
        existingItem.setContent(updatedItem.getContent());
        existingItem.setSubject(updatedItem.getSubject());

        return learningItemRepository.save(existingItem);
    }

    // Delete
    public void deleteLearningItem(Long id) {

        if (!learningItemRepository.existsById(id)) {
            throw new RuntimeException("Learning item not found");
        }

        learningItemRepository.deleteById(id);
    }
}