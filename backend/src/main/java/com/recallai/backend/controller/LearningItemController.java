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

    // Create a learning item
    @PostMapping
    public LearningItem createLearningItem(@RequestBody LearningItem learningItem) {
        return learningItemService.saveLearningItem(learningItem);
    }

    // Get all learning items
    @GetMapping
    public List<LearningItem> getAllLearningItems() {
        return learningItemService.getAllLearningItems();
    }

    // Get learning items for a specific user
    @GetMapping("/user/{userId}")
    public List<LearningItem> getLearningItemsByUserId(@PathVariable Long userId) {
        return learningItemService.getLearningItemsByUserId(userId);
    }
}