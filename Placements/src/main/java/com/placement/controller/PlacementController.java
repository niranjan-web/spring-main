package com.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.placement.entity.PlacementEntity;
import com.placement.placementservice.PlacementService;

@Controller
public class PlacementController 
{
	@Autowired
	PlacementService service;
	
	@GetMapping("/")
	public String startpage()
	{
		return "page1";
	}
	
	@PostMapping("/continue")
	public String continuepage(@ModelAttribute PlacementEntity place,Model model)
	{
		service.addPlacement(place);
		model.addAttribute("hello",place);
		
		
		return"page2";
	}

}
