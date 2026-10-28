package com.example.recruitPro.services.impl;

import com.example.recruitPro.dto.mapper.CandidateMapper;
import com.example.recruitPro.dto.request.CandidateCreateDTO;
import com.example.recruitPro.dto.request.CandidateUpdateDTO;
import com.example.recruitPro.dto.response.CandidateResponse;
import com.example.recruitPro.entities.Candidate;
import com.example.recruitPro.repositories.CandidateRepository;
import com.example.recruitPro.services.CandidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidateServiceImpl implements CandidateService {
    private final CandidateRepository candidateRepository;
    private final CandidateMapper candidateMapper;

    @Override
    public CandidateResponse create(CandidateCreateDTO candidateCreateDTO) {
        Candidate candidate = new Candidate();
        candidate.setFullname(candidateCreateDTO.getFullname());
        candidate.setEmail(candidateCreateDTO.getEmail());
        candidate.setAge(candidateCreateDTO.getAge());
        candidate.setYearsOfExperience(candidateCreateDTO.getYearsOfExperience());
        candidate.setTel(candidateCreateDTO.getTel());
        candidateRepository.save(candidate);

        return candidateMapper.toCandidateResponse(candidate);
    }

    @Override
    public CandidateResponse update(long id, CandidateUpdateDTO candidateUpdateDTO){
        //Kiểm tra tồn tại id và lấy ra candidate
        Candidate updCandidate = candidateRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy ứng viên"));

        //Update candidate
        updCandidate.setAddress(candidateUpdateDTO.getAddress());
        updCandidate.setBio(candidateUpdateDTO.getBio());
        candidateRepository.save(updCandidate);
        return candidateMapper.toCandidateResponse(updCandidate);
    }
}
