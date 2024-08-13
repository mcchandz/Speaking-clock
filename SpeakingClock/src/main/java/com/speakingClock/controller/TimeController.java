package com.speakingClock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.speakingClock.service.TimeService;
@RestController
@RequestMapping("/api/time")
public class TimeController {
    @Autowired
    private TimeService timeService;

    @GetMapping("/convert")
    public String convertTime(@RequestParam String time) {
        return timeService.convertTimeToWords(time);
    }
}