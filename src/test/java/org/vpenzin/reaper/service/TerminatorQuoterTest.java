package org.vpenzin.reaper.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TerminatorQuoterTest {

    @Test
    void testSayQuote() {
        String message = "unit test message";
        Quoter quoter = new TerminatorQuoter();
        ((TerminatorQuoter) quoter).setMessage(message);
        Assertions.assertEquals(message, ((TerminatorQuoter) quoter).toTestMessage());
    }

}