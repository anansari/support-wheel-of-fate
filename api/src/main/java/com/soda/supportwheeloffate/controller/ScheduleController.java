package com.soda.supportwheeloffate.controller;

import com.google.gson.Gson;
import com.soda.supportwheeloffate.response.ResponseBuilder;
import com.soda.supportwheeloffate.service.ScheduleService;
import com.soda.supportwheeloffate.vo.Schedule;
import java.util.List;

/**
 *
 * @author aneel
 */
public class ScheduleController {

    public static void main(String[] args) {
        /*
        to run 
        mvn exec:java -Dexec.mainClass="com.soda.supportwheeloffate.ScheduleCtroller"
        mvn exec:java
        visit http://localhost:4567/hello
         */
//                get("/hello", (req, res) -> new ScheduleService().generateSchedule());

        List<Schedule> schedule = new ResponseBuilder().build(new ScheduleService().getSchedule());
	Gson gson = new Gson();

        System.out.println(gson.toJson(schedule));
                //        System.out.println(Collections.frequency(engineers, "Foo_5") < 3);
    }
}
