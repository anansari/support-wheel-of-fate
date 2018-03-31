package com.soda.supportwheeloffate.rule;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author aneel
 */
public class OneDay implements Rule {

    @Override
    public boolean isValid(List<String> shifts, String engineer) {
        return Collections.frequency(shifts, engineer) == 2;
    }

}
