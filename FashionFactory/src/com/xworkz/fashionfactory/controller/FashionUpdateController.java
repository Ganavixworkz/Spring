package com.xworkz.fashionfactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.fashionfactory.dto.FashionFactoryDto;
import com.xworkz.fashionfactory.service.FashionFactoryService;
@Controller
@RequestMapping("/")
public class FashionUpdateController {
	@Autowired
FashionFactoryService service;
	
	@GetMapping("update")
	public String update(@RequestParam int id, Model model) {
		System.out.println("id" + id);
		FashionFactoryDto dto = service.findById(id);
		if (dto == null) {
			model.addAttribute("message", "message not found");
			return "update.jsp";
		} else {
			model.addAttribute("dto", dto);
			return "update.jsp";
		}
	}

	@PostMapping("update")
	public String updateById(@ModelAttribute FashionFactoryDto dto, Model model) {
		boolean update = service.updateById(dto);
if (update==true) {
	model.addAttribute("updateMessage", "updated successfully..........");
	return "Findall.jsp";
}else {
	model.addAttribute("updateMessage", "...not updated ..........");
	return "update.jsp";
	}
}
}

