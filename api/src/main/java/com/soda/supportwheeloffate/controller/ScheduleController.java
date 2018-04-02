package com.soda.supportwheeloffate.controller;

import com.google.gson.Gson;
import com.soda.supportwheeloffate.response.ResponseBuilder;
import com.soda.supportwheeloffate.service.ScheduleService;
import com.soda.supportwheeloffate.vo.Schedule;
import java.util.List;
import spark.Filter;
import static spark.Spark.after;
import static spark.Spark.get;

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
        visit http://localhost:4567/schedule
         */
        after((Filter) (request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });

        get("/schedule", (request, response) -> {
            response.type("application/json");

            List<Schedule> schedule = new ResponseBuilder().build(new ScheduleService().getSchedule());
            return new Gson().toJson(schedule);
        });
    }
}
