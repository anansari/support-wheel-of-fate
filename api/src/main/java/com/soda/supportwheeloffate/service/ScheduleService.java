package com.soda.supportwheeloffate.service;

import com.soda.supportwheeloffate.helper.EngineerFactory;
import com.soda.supportwheeloffate.rule.ConsectiveDay;
import com.soda.supportwheeloffate.rule.OneDay;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author aneel
 */
public class ScheduleService {
    
    public List<String> getSchedule() {
        List<String> schedule;
        while (true) {
            System.out.println(".........");
            List<String> shifts = Arrays.asList(new String[20]);

            for (int i = 0; i < shifts.size(); i++) {
                shifts.set(i, "");
            }
            schedule = generateSchedule(shifts);
            if (!schedule.get(schedule.size() - 1).isEmpty()) {
                break;
            }
        }
        return schedule;
    }

    private List<String> generateSchedule(List<String> shifts) {
        EngineerFactory engineerFactory = new EngineerFactory();
        int i = 0;
        int count = 0;
        List<String> toBeProcessed = engineerFactory.getEngineers();

        while (!toBeProcessed.isEmpty()) {
            String engineer = engineerFactory.getEngineer(toBeProcessed);
            if (!isLastElement(shifts)) {
                break;
            }
            if (new OneDay().isValid(shifts, engineer)) {
                toBeProcessed = engineerFactory.removeEngineerWithOneDayCompleted(toBeProcessed, engineer);
            } else {
                if (new ConsectiveDay().isValid(shifts, engineer, i)) {
                    shifts.set(i, engineer);
                    i++;
                }
            }
            if (count >= 100) {
                System.out.println(i);
                System.out.println("scheduling for " + engineer);
                System.out.println(shifts);
                break;
            }
            count++;

        }
        return shifts;
    }

    private boolean isLastElement(List<String> shifts) {
        return shifts.get(shifts.size() - 1).isEmpty();
    }
}
