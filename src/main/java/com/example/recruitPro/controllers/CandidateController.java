package com.example.recruitPro.controllers;

import com.example.recruitPro.dto.ApiResponse;
import com.example.recruitPro.dto.request.CandidateCreateDTO;
import com.example.recruitPro.dto.request.CandidateUpdateDTO;
import com.example.recruitPro.dto.response.CandidateResponse;
import com.example.recruitPro.services.CandidateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/candidates")
@RequiredArgsConstructor
public class CandidateController {
    private final CandidateService candidateService;

    @PostMapping
    public ResponseEntity<ApiResponse<CandidateResponse>> create(
            @Valid @RequestBody CandidateCreateDTO candidateCreateDTO
            ){
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.success("Tạo ứng viên thành công", candidateService.create(candidateCreateDTO)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<CandidateResponse>> update(
            @PathVariable long id,
            @Valid @ModelAttribute CandidateUpdateDTO candidateUpdateDTO
    ){
        return ResponseEntity.ok(ApiResponse.success("Cập nhật thông tin ứng viên thành công", candidateService.update(id, candidateUpdateDTO)));
    }
}
