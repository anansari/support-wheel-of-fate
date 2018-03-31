package com.soda.supportwheeloffate.rule;

import java.util.List;

/**
 *
 * @author aneel
 */
public interface Rule {

    public boolean isValid(List<String> shifts, String engineer);
}
