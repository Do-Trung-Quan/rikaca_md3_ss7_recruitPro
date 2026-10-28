package com.example.recruitPro.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "candidates")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "yearOfExp")
    private int yearsOfExperience;

    @Column(name = "address")
    private String address;

    @Column(name = "bio", length = 200)
    private String bio;

    @Column(name = "tel", length = 10)
    private String tel;
}
