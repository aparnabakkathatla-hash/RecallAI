package com.recallai.backend.repository;

import com.recallai.backend.entity.LearningItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LearningItemRepository extends JpaRepository<LearningItem, Long> {

    List<LearningItem> findByUserId(Long userId);

    List<LearningItem> findByTopicContainingIgnoreCase(String topic);

    List<LearningItem> findBySubjectContainingIgnoreCase(String subject);
}