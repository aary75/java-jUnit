package com.bridgelabz.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeOutFunctionTest {

    @Test
    @Timeout(2)
    void shouldFailAfterOneSecond() throws InterruptedException {
        Thread.sleep(3000);
    }
}

//java.util.concurrent.TimeoutException: shouldFailAfterOneSecond() timed out after 2 seconds
//
//at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
//at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
//Suppressed: java.lang.InterruptedException: sleep interrupted
//at java.base/java.lang.Thread.sleepNanos0(Native Method)
//at java.base/java.lang.Thread.sleepNanos(Thread.java:496)
//at java.base/java.lang.Thread.sleep(Thread.java:527)
//at com.bridgelabz.testing.TimeOutFunctionTest.shouldFailAfterOneSecond(TimeOutFunctionTest.java:11)
//at java.base/java.lang.reflect.Method.invoke(Method.java:580)
//		... 2 more

