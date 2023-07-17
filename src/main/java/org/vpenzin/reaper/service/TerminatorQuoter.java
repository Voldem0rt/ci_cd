package org.vpenzin.reaper.service;

public class TerminatorQuoter implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
