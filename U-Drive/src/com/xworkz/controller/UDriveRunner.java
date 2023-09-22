package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.UDriveDto;
@Component
@RequestMapping("/")
public class UDriveRunner {
@PostMapping("/save")
	public String onSave(@ModelAttribute UDriveDto dto,Model model) {
		
	 model.addAttribute("dto",dto );
	 System.out.println(dto);
		return "success.jsp";
		
		
	}

}
