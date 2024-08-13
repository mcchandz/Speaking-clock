package com.speakingClock.service;

import org.springframework.stereotype.Service;

@Service
public class TimeService {
    private final String[] hours = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
    private final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

    public String convertTimeToWords(String time) {
        if (time == null || time.isEmpty()) {
            throw new IllegalArgumentException("Time cannot be null or empty");
        }

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid time format");
        }

        if (hour == 0 && minute == 0) return "It's Midnight";
        if (hour == 12 && minute == 0) return "It's Midday";

        // Convert hour to 12-hour format
        if (hour > 12) hour -= 12;

        String hourInWords = hours[hour];
        String minuteInWords = getMinuteInWords(minute);

        return String.format("It's %s %s", hourInWords, minuteInWords);
    }

    private String getMinuteInWords(int minute) {
        if (minute == 0) return "o'clock";
        if (minute < 10) return hours[minute] + " minutes";
        if (minute < 20) return teens[minute - 10] + " minutes";
        return tens[minute / 10] + (minute % 10 == 0 ? " minutes" : " " + hours[minute % 10] + " minutes");
    }
}
