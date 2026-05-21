package com.example.labo03.services.impl;

import com.example.labo03.domain.dto.request.CreateSpecimenRequest;
import com.example.labo03.domain.dto.request.UpdateSpecimenRequest;
import com.example.labo03.domain.dto.response.SpecimenResponse;

import java.util.List;
import java.util.UUID;

public interface SpecimenService {
	SpecimenResponse createSpecimen(CreateSpecimenRequest request);

	List<SpecimenResponse> getAllSpecimens();

	SpecimenResponse getSpecimenById(UUID id);

	SpecimenResponse updateSpecimen(UUID id, UpdateSpecimenRequest request);

	SpecimenResponse deleteSpecimen(UUID id);
}
