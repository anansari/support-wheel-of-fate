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
            add("James 'Logan' Howlett");
            add("Charles Francis Xavier");
            add("Scott Summers");
            add("Robert Louis 'Bobby' Drake");
            add("Jean Elaine Grey");
            add("Ororo Monroe");
            add("Anna Marie");
            add("Erik Magnus Lehnsherr");
            add("Calvin Montgomery Rankin");
            add("Suzanne Chan");
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
