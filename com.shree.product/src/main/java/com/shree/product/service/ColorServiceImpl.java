package com.shree.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shree.product.entity.Color;
import com.shree.product.repository.ColorRepository;

@Service
public class ColorServiceImpl implements ColorService {
	
	@Autowired
	ColorRepository colorRepository;

	@Override
	public List<Color> findAll() {
		return colorRepository.findAll();
	}
	
}
