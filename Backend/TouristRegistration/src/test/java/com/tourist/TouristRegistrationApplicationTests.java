package com.tourist;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tourist.entity.Tourist;
import com.tourist.repository.TouristRepository;



@SpringBootTest
@TestMethodOrder(MethodOrderer.class)
class TouristRegistrationApplicationTests {
	
	@Autowired
	TouristRepository tRepo;

	@Test
	@Order(1)
	public void testCreate() {
		Tourist t=new Tourist();
			t.setId(20);
			t.setFirstname("Fredrick");
			t.setLastname("Emmanuel");
			t.setGender("Male");
			t.setAge(24);
			t.setFromplace("Kolkata");
			t.setNumberofdays(4);
			tRepo.save(t);
			assertNotNull(tRepo.findById(20).get());
		}
		
	@Test
	@Order(2)
	public void testReadAll() {
		List<Tourist> list=tRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	
	
	}
