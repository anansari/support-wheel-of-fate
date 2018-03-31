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

    public List<String> getSchedule(List<String> engineers) {
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

    public List<String> generateSchedule(List<String> shifts) {
        EngineerFactory e = new EngineerFactory();
        int i = 0;
        int count = 0;
        List<String> toBeProcessed = e.getEngineers();

        while (!toBeProcessed.isEmpty()) {
            String engineer = e.getEngineer(toBeProcessed);
            if (!isLastElement(shifts)) {
                break;
            }
            if (new OneDay().isValid(shifts, engineer)) {
                toBeProcessed = e.removeEngineerWithOneDayCompleted(toBeProcessed, engineer);
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

//    private boolean isOneDayCompleted(List<String> shifts, String engineer) {
//        return Collections.frequency(shifts, engineer) == 2;
//    }

//    private boolean isValid(List<String> shifts, String engineer, int j) {
//        /**
//         * Checks for shift if it is morning or afternoon all the evens are
//         * morning and all the odds are afternoon
//         */
//        int i = j;
//        if (i < 1) {
//            return true;
//        }
//
//        if (i % 2 == 0) {
//            if (shifts.get(i - 1).equals(engineer)
//                    || shifts.get(i - 2).equals(engineer)) {
//                return false;
//            }
//        } else if (i >= 3) {
//            if (shifts.get(i - 1).equals(engineer)
//                    || shifts.get(i - 2).equals(engineer)
//                    || shifts.get(i - 3).equals(engineer)) {
//                return false;
//            }
//        } else if (shifts.get(i - 1).equals(engineer)) {
//            return false;
//        }
//        return true;
//    }

    private boolean isLastElement(List<String> shifts) {
        return shifts.get(shifts.size() - 1).isEmpty();
    }
}
