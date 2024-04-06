package com.s19.spotvpc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.s19.spotvpc.model.Model;
import com.s19.spotvpc.service.ModelService;

@RestController
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	@GetMapping("/model")
    public ResponseEntity<List<Model>> getModels() {
        List<Model> model = this.modelService.getAllModel();
        if (model.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(model);
    }	
	
	@PostMapping("/model")
	public ResponseEntity<Model> addModel(@RequestBody Model model) {
		Model addModel = this.modelService.addModel(model);
	    return ResponseEntity.status(HttpStatus.CREATED).body(addModel);
	}

//	@GetMapping("/model")
//	public List<Model> getModels() {
//		return this.modelService.getAllModel();
//	}
//	
//	@PostMapping("/model")
//	public Model addModel(@RequestBody Model model) {
//		Model a = this.modelService.addModel(model);
//		return a;
//	}
	
	

}
