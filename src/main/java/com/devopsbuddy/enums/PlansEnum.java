package com.devopsbuddy.enums;

/**
 * Created by m on 1/29/17.
 */
public enum PlansEnum {
    BASIC(1, "Basic"),
    PRO(2, "Pro");


    private final int id;

    private final String planName;

    PlansEnum(int id, String planName) {
        this.id = id;
        this.planName = planName;
    }

    public int getId() {
        return id;
    }

    public String getPlanName() {
        return planName;
    }
}
