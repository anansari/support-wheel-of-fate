package com.soda.supportwheeloffate.response;

import com.soda.supportwheeloffate.vo.Day;
import com.soda.supportwheeloffate.vo.Schedule;
import com.soda.supportwheeloffate.vo.Shift;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aneel
 */
public class ResponseBuilder {

    public List<Schedule> build(List<String> shifts) {
        List<Schedule> schedules = new ArrayList<>();
        int i = 0;

        for (String shf : shifts) {
            Schedule schedule = new Schedule();
            if (i % 2 == 0) {
                schedule.setShift(Shift.MORNING);
            } else {
                schedule.setShift(Shift.EVENING);
            }
            schedule.setDay(getDay(i));
            schedule.setEngineer(shf);
            
            i++;
            schedules.add(schedule);
        }
        return schedules;
    }
    
    
    private String getDay(int i){
        String day;
        switch(i){
            case 0: case 1: case 10: case 11:
                day = Day.MONDAY.toString();
                break;
            case 2: case 3: case 12: case 13:   
                day = Day.TUESDAY.toString();
                break;
            case 4: case 5: case 14: case 15:
                day = Day.WEDNESDAY.toString();
                break;
            case 6: case 7: case 16: case 17:
                day = Day.THURSDAY.toString();
                break;
            case 8: case 9: case 18: case 19:
                day = Day.FRIDAY.toString();
                break;
            default:
                day = "HOLIDAY";
        }
        return day;
    }
}
