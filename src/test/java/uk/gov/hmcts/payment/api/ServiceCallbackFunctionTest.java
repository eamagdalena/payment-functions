package uk.gov.hmcts.payment.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceCallbackFunctionTest {

    @Test
    public void testHello() throws Exception {
        final ServiceCallbackFunction function = new ServiceCallbackFunction();

        final String ret = function.health("function", null);

        assertEquals("{status : 'OK'}", ret);
    }
}
