package com.s19.spotvpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s19.spotvpc.model.Model;
import com.s19.spotvpc.repository.ModelRepository;

@Service
public class ModelService {
	
	@Autowired
	private ModelRepository modelRepository;

	public List<Model> getAllModel() {
		List<Model> list=(List<Model>)modelRepository.findAll();
		return list;
	}

	public Model addModel(Model model) {
		Model result=modelRepository.save(model);
	       return result;
	}

}
