package com.shree.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shree.product.entity.Color;
import com.shree.product.service.ColorService;

@RestController
@RequestMapping("/api/colors")
public class ColorController {
	@Autowired
	ColorService colorService;

	@GetMapping
	public List<Color> findAll() {
		List<Color> list = colorService.findAll();
		return list;
	}
}