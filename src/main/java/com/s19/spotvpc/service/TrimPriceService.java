package com.s19.spotvpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s19.spotvpc.model.TrimPrice;
import com.s19.spotvpc.repository.TrimPriceRepository;

@Service
public class TrimPriceService {
	
	@Autowired
	private TrimPriceRepository trimPriceRepository;

	public List<TrimPrice> getAllTrimPrice() {
		List<TrimPrice> list=(List<TrimPrice>)trimPriceRepository.findAll();
		return list;
	}

	public TrimPrice addTrimPrice(TrimPrice trimPrice) {
		TrimPrice result=trimPriceRepository.save(trimPrice);
	    return result;
	}

}
