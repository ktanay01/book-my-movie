package com.tanay.bookmymoview.controller;

import com.tanay.bookmymoview.model.Review;
import com.tanay.bookmymoview.resource.ReviewResource;
import com.tanay.bookmymoview.service.ReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public void addReview(@RequestBody ReviewResource reviewRequest){
        reviewService.addReview(Review.toEntity(reviewRequest));
    }

    @GetMapping("/find")
    public ReviewResource getReview(@RequestParam Long reviewId){
        return reviewService.getReviewById(reviewId);
    }
}
