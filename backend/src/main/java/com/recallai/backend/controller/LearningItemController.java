package com.recallai.backend.controller;

import com.recallai.backend.entity.LearningItem;
import com.recallai.backend.service.LearningItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/learning-items")
public class LearningItemController {

    private final LearningItemService learningItemService;

    public LearningItemController(LearningItemService learningItemService) {
        this.learningItemService = learningItemService;
    }

    // Create
    @PostMapping
    public LearningItem createLearningItem(
            @RequestBody LearningItem learningItem) {

        return learningItemService.saveLearningItem(learningItem);
    }

    // Get all
    @GetMapping
    public List<LearningItem> getAllLearningItems() {

        return learningItemService.getAllLearningItems();
    }

    // Get by user
    @GetMapping("/user/{userId}")
    public List<LearningItem> getLearningItemsByUserId(
            @PathVariable Long userId) {

        return learningItemService.getLearningItemsByUserId(userId);
    }

    // Update
    @PutMapping("/{id}")
    public LearningItem updateLearningItem(
            @PathVariable Long id,
            @RequestBody LearningItem learningItem) {

        return learningItemService.updateLearningItem(id, learningItem);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteLearningItem(@PathVariable Long id) {

        learningItemService.deleteLearningItem(id);

        return "Learning item deleted successfully";
    }
}