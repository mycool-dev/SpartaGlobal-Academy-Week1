package com.sparta.me.SOLID.S;

import java.time.LocalDate;

public class Course {
    private int numberOfTrainees;
    private String name;
    private Spartan[] classList;
    private LocalDate startDate;

    public Course(int numberOfTrainees, String name, Spartan[] classList, LocalDate startDate) {
        this.numberOfTrainees = numberOfTrainees;
        this.name = name;
        this.classList = classList;
        this.startDate = startDate;
    }

    public int getNumberOfTrainees() {
        return numberOfTrainees;
    }

    public void setNumberOfTrainees(int numberOfTrainees) {
        this.numberOfTrainees = numberOfTrainees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spartan[] getClassList() {
        return classList;
    }

    public void setClassList(Spartan[] classList) {
        this.classList = classList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
