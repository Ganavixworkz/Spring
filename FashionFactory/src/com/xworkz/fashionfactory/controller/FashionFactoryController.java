package com.xworkz.fashionfactory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.fashionfactory.dto.FashionFactoryDto;
import com.xworkz.fashionfactory.service.FashionFactoryService;

@Controller
@RequestMapping("/")
public class FashionFactoryController {
@Autowired
	FashionFactoryService service;
	public FashionFactoryController() {
System.out.println("FashionFactoryController constructor");
	}
	@PostMapping("save")
	public String onSave(@ModelAttribute FashionFactoryDto dto,Model model) {
		model.addAttribute("d",dto);
		service.onSave(dto);
		return "success.jsp";
	}
	@GetMapping("findAll")
	public String findAll(Model model) {
		List<FashionFactoryDto> dto=service.findAll();
		model.addAttribute("dtos",dto);
		
		return "findall.jsp";
		
	}
	@GetMapping("findbyid")
	public String findById(@RequestParam int id,Model model) {
		System.out.println(id);
		FashionFactoryDto dto=service.findById(id);
		model.addAttribute("dto",dto);
		System.out.println(dto);
		
		return "findbyid.jsp";
		
	}
	@GetMapping("email")
	public String findByEmail(@RequestParam String email,Model model) {
		System.out.println(email);
		List<FashionFactoryDto> dto=service.findByEmail(email);
		model.addAttribute("em",dto);
		System.out.println(dto);
		
		return "findbyemail.jsp";
}
	@GetMapping("delete/{id}")
	public String deleteById(@PathVariable int id,Model model) {
		System.out.println("this is Delete method");
		System.out.println(id);
		boolean delete=service.deleteById(id);
		if(delete==true) {
			model.addAttribute("success","data deleted successfully");
			return "findall.jsp";
		}else {
			model.addAttribute("fail","record not delete");
			return "findall.jsp";
		}
}
}
