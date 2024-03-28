package com.graphql.course.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "course")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;

    @Column(name = "course_name")
    private String courseName;

    private String desc;

    @Column(name = "registration_date")
    private String registrationDate;

    private String duration;

}
