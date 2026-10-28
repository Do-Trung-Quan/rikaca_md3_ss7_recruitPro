package com.example.recruitPro.dto.mapper;

import com.example.recruitPro.dto.response.CandidateResponse;
import com.example.recruitPro.entities.Candidate;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CandidateMapper {
    //Obj -> DTO
    CandidateResponse toCandidateResponse(Candidate candidate);

    List<CandidateResponse> toCandidateResponseList(List<Candidate> candidates);
}
