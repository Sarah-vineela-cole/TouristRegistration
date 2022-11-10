package com.tourist.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.entity.Tourist;
import com.tourist.service.TouristService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tourist")
public class TouristController {

	@Autowired
	private TouristService tService;
	
	@PostMapping("/add")
	public Tourist addTourist(@RequestBody Tourist tourist) {
		return tService.addTourist(tourist);
	}
	
	
	@GetMapping("/getall")
	public List<Tourist> getTouristList(){
		return tService.getTouristList();
	}
	
	@GetMapping("/get/{id}")
	public Tourist getById(@PathVariable("id") int id) {
		return tService.getById(id);
	}
	
}


