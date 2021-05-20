/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.EmailForwardingExample;

public class FanHandler implements Handler {

    private Handler chain;
    @Override
    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }
    @Override
    public void forwardMail(Mail mailObj) {
        /*
         * Checking a mail subject and forwarding to next Chain Handler.
         */
        if(mailObj.getSubject().equalsIgnoreCase(Handler.FAN_MAIL)){
            System.out.println("Forwarding Mail to CEO.");
        }else{
            this.chain.forwardMail(mailObj);
        }

    }


}