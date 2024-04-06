package com.s19.spotvpc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.s19.spotvpc.model.TrimPrice;
import com.s19.spotvpc.service.TrimPriceService;

@RestController
public class TrimPriceController {
	
	@Autowired
	private TrimPriceService trimPriceService;
	
	@GetMapping("/trimPrice")
    public ResponseEntity<List<TrimPrice>> getTrimPrices() {
        List<TrimPrice> trimPrice = this.trimPriceService.getAllTrimPrice();
        if (trimPrice.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(trimPrice);
    }	
	
	@PostMapping("/trimPrice")
	public ResponseEntity<TrimPrice> addTrimPrice(@RequestBody TrimPrice trimPrice) {
		TrimPrice addTrimPrice = this.trimPriceService.addTrimPrice(trimPrice);
	    return ResponseEntity.status(HttpStatus.CREATED).body(addTrimPrice);
	}

//	@GetMapping("/trimPrice")
//	public List<TrimPrice> getAllTrimPrice() {
//		return this.trimPriceService.getAllTrimPrice();
//	}
//	
//	@PostMapping("/trimPrice")
//	public TrimPrice addTrimPrice(@RequestBody TrimPrice trimPrice) {
//		TrimPrice a = this.trimPriceService.addTrimPrice(trimPrice);
//		return a;
//	}

}
