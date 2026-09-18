package com.recallai.backend.controller;

import com.recallai.backend.entity.LearningItem;
import com.recallai.backend.service.LearningItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/learning-items")
public class LearningItemController {

    private final LearningItemService learningItemService;

    public LearningItemController(LearningItemService learningItemService) {
        this.learningItemService = learningItemService;
    }

    // Create a learning item
    @PostMapping
    public LearningItem createLearningItem(
            @RequestBody LearningItem learningItem) {

        return learningItemService.saveLearningItem(learningItem);
    }

    // Get all learning items
    @GetMapping
    public List<LearningItem> getAllLearningItems() {

        return learningItemService.getAllLearningItems();
    }

    // Get learning items by user
    @GetMapping("/user/{userId}")
    public List<LearningItem> getLearningItemsByUserId(
            @PathVariable Long userId) {

        return learningItemService.getLearningItemsByUserId(userId);
    }

    // Search by topic
    @GetMapping("/search/topic")
    public List<LearningItem> searchByTopic(
            @RequestParam String topic) {

        return learningItemService.searchByTopic(topic);
    }

    // Search by subject
    @GetMapping("/search/subject")
    public List<LearningItem> searchBySubject(
            @RequestParam String subject) {

        return learningItemService.searchBySubject(subject);
    }

    // Pagination
    @GetMapping("/page")
    public Page<LearningItem> getLearningItemsWithPagination(
            Pageable pageable) {

        return learningItemService.getLearningItemsWithPagination(pageable);
    }

    // Update a learning item
    @PutMapping("/{id}")
    public LearningItem updateLearningItem(
            @PathVariable Long id,
            @RequestBody LearningItem learningItem) {

        return learningItemService.updateLearningItem(id, learningItem);
    }
}