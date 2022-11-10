package com.tourist.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tourist.entity.Tourist;
import com.tourist.repository.TouristRepository;

@Service
public class TouristService {
	
	@Autowired
	private TouristRepository tRepo;

	public Tourist addTourist(Tourist tourist) {
		return tRepo.save(tourist);
	}


	public Tourist getById(int id) {
		return tRepo.findById(id).orElse(null);
	}

	public List<Tourist> getTouristList() {
		return tRepo.findAll(Sort.by(Sort.Direction.DESC,"firstname"));
	}


}

