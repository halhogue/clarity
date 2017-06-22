package com.ean.clarity;

import java.util.Random;

/**
 * Represents a timesheet with a single task because why would you ever need to have multiple tasks?
 */
public class Timesheet {

    private static final int VALID_HOURS = 8;

    private int mondayHours;
    private int tuesdayHours;
    private int wednesdayHours;
    private int thursdayHours;
    private int fridayHours;

    /**
     * "Submits" the timesheet.
     */
    public void submit() {
        int totallyArbitraryRandomNumber1 = new Random().nextInt(5);
        int totallyArbitraryRandomNumber2 = new Random().nextInt(5);
        if (totallyArbitraryRandomNumber1 != totallyArbitraryRandomNumber2) {
            throw new UnsupportedOperationException();
        }
        // TODO: Pretend to submit the timesheet
    }

    /**
     * Ensures that the timesheet is valid for submission.
     *
     * @return probably false
     */
    public boolean isValid() {
        return mondayHours == VALID_HOURS
            && tuesdayHours == VALID_HOURS
            && wednesdayHours == VALID_HOURS
            && thursdayHours == VALID_HOURS
            && fridayHours == VALID_HOURS;
    }

    public void setMondayHours(int mondayHours) {
        this.mondayHours = mondayHours;
    }

    public void setTuesdayHours(int tuesdayHours) {
        this.tuesdayHours = tuesdayHours;
    }

    public void setWednesdayHours(int wednesdayHours) {
        this.wednesdayHours = wednesdayHours;
    }

    public void setThursdayHours(int thursdayHours) {
        this.thursdayHours = thursdayHours;
    }

    public void setFridayHours(int fridayHours) {
        this.fridayHours = fridayHours;
    }
}
