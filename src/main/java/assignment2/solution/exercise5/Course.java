/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment2.solution.exercise5;

import java.util.Vector;
import java.util.Enumeration;
public class Course {
    private String title;
    private Vector courseRecords;

    Course() {
        courseRecords = new Vector();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }
//...

    public void printCourseStudents() {
    }

    public void printbestStudent() {
    }

    public void printFinalExamStudents() {
    }
//...

}