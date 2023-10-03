package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.AirIndiaDto.AirIndiaDto;
import com.xworkz.service.AirIndiaService;

@Component
@RequestMapping("/")
public class AirIndiaRunner {

	
	 @Autowired
     AirIndiaService ser;
	
	
@PostMapping("/click")
	public  String onSave(@ModelAttribute AirIndiaDto dto ,Model model) {
		
		model.addAttribute("AD", dto);
		System.out.println(dto);
		ser.onSave(dto);
		return "success";
	}
	}
