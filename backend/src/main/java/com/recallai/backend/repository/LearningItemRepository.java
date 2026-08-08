package com.recallai.backend.repository;

import com.recallai.backend.entity.LearningItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearningItemRepository extends JpaRepository<LearningItem, Long> {

}