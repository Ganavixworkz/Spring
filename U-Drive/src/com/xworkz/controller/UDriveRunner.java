package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.UDriveDto;
import com.xworkz.service.UDriveService;
@Component
@RequestMapping("/")
public class UDriveRunner {
	
    @Autowired
     UDriveService ser;
	
	
	@PostMapping("/save")
	public String onSave(@ModelAttribute UDriveDto dto,Model model) {
		
	 model.addAttribute("dto",dto);
	 System.out.println(dto);
	 ser.onSave(dto);
		return "success";
	}
    }
