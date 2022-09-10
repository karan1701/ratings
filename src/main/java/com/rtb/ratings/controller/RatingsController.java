package com.rtb.ratings.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsController {

	Logger logger = LoggerFactory.getLogger(RatingsController.class);

	@GetMapping("/")
	public String getAllRatings() {
		logger.info("Returning all the ratings");
		return "All ratings";
	}

	@GetMapping("/{productid}")
	public Object getRatingsForAProduct(@PathVariable(name = "productid") String productId) {
		logger.info("Returning ratings for the product {}", productId);
		return "Ratings for the product id: " + productId;

	}
}
