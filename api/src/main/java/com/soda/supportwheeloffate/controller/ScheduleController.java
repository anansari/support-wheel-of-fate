package com.soda.supportwheeloffate.controller;

import com.soda.supportwheeloffate.service.ScheduleService;

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
        System.out.println(new ScheduleService().getSchedule(null));

//        List<String> engineers = new ArrayList<String>() {
//            {
//                add("Foo_1");
//                add("Foo_2");
//                add("Foo_3");
//                add("Foo_4");
//                add("Foo_5");
//                add("Foo_6");
//                add("Foo_7");
//                add("Foo_8");
//                add("Foo_9");
//                add("Foo_10");
//            }
//        };
//        System.out.println(Collections.frequency(engineers, "Foo_5") < 3);
    }
}
