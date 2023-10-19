package com.anr.coursehub.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class FeedbackModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String message;
    private int rate;

    @ManyToOne
    @JoinColumn(name="course_id")
    private CourseModel course;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private StudentModel student;
}
