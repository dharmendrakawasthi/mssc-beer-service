package com.techendear.app.model;

import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class BeerPageList extends PageImpl<BeerDTO>{

	public BeerPageList(List<BeerDTO> content, Pageable pageable, long total) {
		super(content, pageable, total);
	}

	public BeerPageList(List<BeerDTO> content) {
		super(content);
	}
}
