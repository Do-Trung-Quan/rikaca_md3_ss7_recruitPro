package com.example.recruitPro.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CandidateResponse {
    private Long id;
    private String fullname;
    private String email;
    private String tel;
    private int age;
    private int yearsOfExperience;
    private String address;
    private String bio;
}
