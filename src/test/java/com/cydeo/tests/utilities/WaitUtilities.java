package com.cydeo.tests.utilities;

public class WaitUtilities {


    public static void sleep(long second) {

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {

        }

    }
}
