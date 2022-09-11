package com.rtb.ratings.controller;

import java.text.DecimalFormat;
import java.util.Random;

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

	private final DecimalFormat df = new DecimalFormat("0.0");
	Random rd = new Random();

	@GetMapping("/{reviewid}")
	public String getRatingsForAReview(@PathVariable(name = "reviewid") Integer reviewid) {
		String rating = df.format(getRandomFloatInRange(1, 5));
		logger.info("Ratings for the review {} is {}", reviewid, rating);
		return rating;

	}

	private float getRandomFloatInRange(int min, int max) {
		float generatedFloat = min + rd.nextFloat() * (max - min);
		return generatedFloat;

	}

}
