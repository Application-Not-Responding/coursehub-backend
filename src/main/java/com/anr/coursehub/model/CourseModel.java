package com.anr.coursehub.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CourseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private OrganizerModel organizer;

    @JsonIgnore
    @ManyToMany(mappedBy = "courses")
    private Set<StudentModel> students;

    @OneToMany(mappedBy = "course")
    private Set<TopicModel> topics;

    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private Set<FeedbackModel> feedbacks;
}