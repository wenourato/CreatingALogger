package com.devmountain.logging;

import javax.management.InstanceNotFoundException;
import java.io.Console;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(LogExample.class.getName());

    static {
        LOGGER.setLevel(Level.FINEST);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINEST);
        LOGGER.addHandler(consoleHandler);

    }

    public static void main(String[] args) {

        LOGGER.log(Level.INFO, "This is and example message");
    }
}
