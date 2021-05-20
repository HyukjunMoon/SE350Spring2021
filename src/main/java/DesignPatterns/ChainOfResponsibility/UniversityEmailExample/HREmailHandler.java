/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.UniversityEmailExample;

public class HREmailHandler extends MainEmailHandler {

    protected String[] assignedKeyWords() {
        // setup keywords for the receiver team
        return new String[]{"career", "job", "faculty"};
    }

    @Override
    protected String[] keyWords() {
        return new String[0];
    }

    protected void processEmailFinal(String emailText) {
        System.out.println("The Human Resources Team processed the email.");
    }

    @Override
    public void setNextEmailHandler(UniversityEmailHandler emailHandler) {

    }
}