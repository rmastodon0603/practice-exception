package org.itstep.task05;

import java.io.IOException;
import java.util.Random;

public class Runner {
    private static final Random rnd = new Random();

    public void halt() throws IOException {
        if (rnd.nextBoolean()) {
            throw new RuntimeException ("halt");
        } else {
            throw new IOException();
        }
    }
}