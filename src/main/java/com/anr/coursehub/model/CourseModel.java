package com.anr.coursehub.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CourseModel {

    private Integer id;

    private String name;

    private Integer ownerId;

}
