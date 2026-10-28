package com.example.recruitPro.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CandidateCreateDTO {
    @NotBlank
    @Size(min = 5, max = 50)
    private String fullname;

    @NotBlank
    @Email
    private String email;

    @Min(18)
    private int age;

    @PositiveOrZero
    private int yearsOfExperience;

    @Pattern(regexp = "^0[35789]\\\\d{8}$", message = "Số điện thoại không hợp lệ")
    private String tel;
}
