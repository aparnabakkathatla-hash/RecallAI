package com.recallai.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "learning_items")
public class LearningItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;

    private String content;

    private String subject;

    // Connect LearningItem to User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Default constructor
    public LearningItem() {
    }

    // Constructor
    public LearningItem(Long id, String topic, String content, String subject, User user) {
        this.id = id;
        this.topic = topic;
        this.content = content;
        this.subject = subject;
        this.user = user;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}