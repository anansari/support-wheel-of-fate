package com.soda.supportwheeloffate.vo;

/**
 *
 * @author aneel
 */
public class Schedule {

    private String day;
    private Shift shift;
    private String engineer;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public String getEngineer() {
        return engineer;
    }

    public void setEngineer(String engineer) {
        this.engineer = engineer;
    }

    @Override
    public String toString() {
        return "Schedule{" + "day=" + day + ", shift=" + shift + ", engineer=" + engineer + '}';
    }
}
