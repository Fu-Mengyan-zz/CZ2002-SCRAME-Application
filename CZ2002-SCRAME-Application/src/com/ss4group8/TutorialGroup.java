package com.ss4group8;

import java.util.ArrayList;

public class TutorialGroup {
    private String groupName;
    private int availableVacancies;
    private int totalSeats;

    public TutorialGroup(String groupName, int availableVacancies) {
        this.groupName = groupName;
        this.availableVacancies = availableVacancies;
    }

    public TutorialGroup(String groupName, int availableVacancies, int totalSeats) {
        this.groupName = groupName;
        this.availableVacancies = availableVacancies;
        this.totalSeats = totalSeats;
    }

    public String getGroupName() { return this.groupName; }

    public int getAvailableVacancies() { return this.availableVacancies; }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void enrolledIn () {
        this.availableVacancies -= 1;
    }

}
