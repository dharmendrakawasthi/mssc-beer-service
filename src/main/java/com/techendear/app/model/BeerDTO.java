package com.techendear.app.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
	private UUID id;
	private Integer version;
	private OffsetDateTime createdDate;
	private OffsetDateTime lastModifiedDate;
	private String beerName;
	private BeerStyle beerStyle;
	private Long upc;
	private Double price;
	private Integer quantityOnHead;
}
