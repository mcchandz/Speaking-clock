package com.speakingClock;

import com.speakingClock.service.TimeService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private final TimeService timeService = new TimeService();

    @Test
    public void testConvertTimeToWords() {
        assertEquals("It's twelve o'clock", timeService.convertTimeToWords("12:00"));
        assertEquals("It's eight thirty four", timeService.convertTimeToWords("08:34"));
        assertEquals("It's Midnight", timeService.convertTimeToWords("00:00"));
        assertEquals("It's eleven twenty five", timeService.convertTimeToWords("11:25"));
    }
}