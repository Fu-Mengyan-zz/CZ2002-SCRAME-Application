package com.ss4group8;

public class SubComponent extends CourseworkComponent {
    public SubComponent(String componentName, int componentWeight) {
        super(componentName, componentWeight);
    }

    public void printComponentType() {
        System.out.println("This is a sub-component.");
    }
}
