package com.example.labo03.controllers;

import com.example.labo03.domain.dto.request.CreateSpecimenRequest;
import com.example.labo03.domain.dto.request.UpdateSpecimenRequest;
import com.example.labo03.domain.dto.response.SpecimenResponse;
import com.example.labo03.services.impl.SpecimenService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/specimens")
public class SpecimenController {
	private final SpecimenService specimenService;

	@PostMapping
	public SpecimenResponse createSpecimen(@Valid @RequestBody CreateSpecimenRequest request) {
		return specimenService.createSpecimen(request);
	}

	@GetMapping
	public List<SpecimenResponse> getAllSpecimens() {
		return specimenService.getAllSpecimens();
	}

	@GetMapping("/{id}")
	public SpecimenResponse getSpecimenById(@PathVariable UUID id) {
		return specimenService.getSpecimenById(id);
	}

	@PutMapping("/{id}")
	public SpecimenResponse updateSpecimen(@PathVariable UUID id, @Valid @RequestBody UpdateSpecimenRequest request) {
		return specimenService.updateSpecimen(id, request);
	}

	@DeleteMapping("/{id}")
	public SpecimenResponse deleteSpecimen(@PathVariable UUID id) {
		return specimenService.deleteSpecimen(id);
	}
}

