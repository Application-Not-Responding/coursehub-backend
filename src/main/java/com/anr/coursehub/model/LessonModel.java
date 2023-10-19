package com.anr.coursehub.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class LessonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String materials;

    @ManyToOne
    @JoinColumn(name="topic_id")
    private TopicModel topic;
}