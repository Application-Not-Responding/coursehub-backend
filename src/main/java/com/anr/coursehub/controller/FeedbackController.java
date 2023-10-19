package com.anr.coursehub.controller;

import com.anr.openapi.api.FeedbackApi;
import com.anr.openapi.model.Feedback;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class FeedbackController implements FeedbackApi {

    @Override
    public ResponseEntity<Void> addFeedback(String courseId, Feedback feedback) {
        return FeedbackApi.super.addFeedback(courseId, feedback);
    }

    @Override
    public ResponseEntity<Feedback> getFeedback(String courseId) {
        return FeedbackApi.super.getFeedback(courseId);
    }
}
