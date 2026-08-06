package com.recallai.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "learning_items")
public class LearningItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;

    @Column(length = 5000)
    private String content;

    private String subject;

    public LearningItem() {
    }

    public LearningItem(Long id, String topic, String content, String subject) {
        this.id = id;
        this.topic = topic;
        this.content = content;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setId(Long id) {
        this.id = id;
    }
}