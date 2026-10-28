package com.example.recruitPro.services;

import com.example.recruitPro.dto.request.CandidateCreateDTO;
import com.example.recruitPro.dto.request.CandidateUpdateDTO;
import com.example.recruitPro.dto.response.CandidateResponse;

public interface CandidateService {
    CandidateResponse create(CandidateCreateDTO candidateCreateDTO);

    CandidateResponse update(long id, CandidateUpdateDTO candidateUpdateDTO);
}
