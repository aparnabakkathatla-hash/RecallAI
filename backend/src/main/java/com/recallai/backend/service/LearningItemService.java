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

    // Save a learning item
    public LearningItem saveLearningItem(LearningItem learningItem) {
        return learningItemRepository.save(learningItem);
    }

    // Get all learning items
    public List<LearningItem> getAllLearningItems() {
        return learningItemRepository.findAll();
    }

    // Get learning items by user
    public List<LearningItem> getLearningItemsByUserId(Long userId) {
        return learningItemRepository.findByUserId(userId);
    }

    // Search by topic
    public List<LearningItem> searchByTopic(String topic) {
        return learningItemRepository.findByTopicContainingIgnoreCase(topic);
    }

    // Search by subject
    public List<LearningItem> searchBySubject(String subject) {
        return learningItemRepository.findBySubjectContainingIgnoreCase(subject);
    }
}