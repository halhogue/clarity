package com.ean.clarity;

import com.ean.clarity.util.Baugus;

import java.util.Scanner;

/**
 * Does main stuff.
 */
public class Main {

    private static final String CLARITY_URL = "http://clarity.expedia.biz";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timesheet timesheet = new Timesheet();

        // TODO: Change these submits to trigger on Tab key instead of Enter key (for MacBook Pro Tab8 support)

        log("Monday hours: ");
        timesheet.setMondayHours(scanner.nextInt());
        log("Tuesday hours: ");
        timesheet.setTuesdayHours(scanner.nextInt());
        log("Wednesday hours: ");
        timesheet.setWednesdayHours(scanner.nextInt());
        log("Thursday hours: ");
        timesheet.setThursdayHours(scanner.nextInt());
        log("Friday hours: ");
        timesheet.setFridayHours(scanner.nextInt());

        if (!timesheet.isValid()) {
            log("Invalid timesheet. Please do not enter any number other than 8.");
        } else {
            try {
                timesheet.submit();
                log("Your timesheet was maybe submitted to " + CLARITY_URL + "!");
            } catch (UnsupportedOperationException use) {
                log("Your timesheet was not submitted because reasons. Attempting to fix the problem...\n");
                Baugus baugus = new Baugus();
                if (baugus.fixProblem()) {
                    log("Baugus has fixed the problem!");
                } else {
                    log("Baugus has failed to fix the problem. Please contact malbera@expedia.com.");
                }
            }
        }
    }

    private static void log(final String message) {
        System.out.print(message);
    }

}
