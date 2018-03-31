package com.soda.supportwheeloffate.rule;

import java.util.List;

/**
 *
 * @author aneel
 */
public class ConsectiveDay implements Rule {

    public boolean isValid(List<String> shifts, String engineer, int j) {
        /**
         * Checks for shift if it is morning or afternoon all the evens are
         * morning and all the odds are afternoon
         */
        int i = j;
        if (i < 1) {
            return true;
        }

        if (i % 2 == 0) {
            if (shifts.get(i - 1).equals(engineer)
                    || shifts.get(i - 2).equals(engineer)) {
                return false;
            }
        } else if (i >= 3) {
            if (shifts.get(i - 1).equals(engineer)
                    || shifts.get(i - 2).equals(engineer)
                    || shifts.get(i - 3).equals(engineer)) {
                return false;
            }
        } else if (shifts.get(i - 1).equals(engineer)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid(List<String> shifts, String engineer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
