package com.soda.supportwheeloffate.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author aneel
 */
public class EngineerFactory {

    private final Random randomGenerator = new Random();
    private final List<String> engineers = new ArrayList<String>() {
        {
            add("Foo_1");
            add("Foo_2");
            add("Foo_3");
            add("Foo_4");
            add("Foo_5");
            add("Foo_6");
            add("Foo_7");
            add("Foo_8");
            add("Foo_9");
            add("Foo_10");
        }
    };

    public String getEngineer(List<String> engineers) {
        int random = randomGenerator.nextInt(engineers.size());
        return engineers.get(random);
    }

    public List<String> getEngineers() {
        return engineers;
    }

    public List<String> removeEngineerWithOneDayCompleted(List<String> engineers, String engineer) {
        List<String> eng = engineers;
        eng.remove(engineer);
        return eng;
    }
}
