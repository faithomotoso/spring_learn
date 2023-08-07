package com.exmp.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerConfig {
    private String rootLoggerLevel, printedLoggerLevel;

    public void setRootLoggerLevel(String loggerLevel) {
        this.rootLoggerLevel = loggerLevel;
    }

    public void setPrintedLoggerLevel(String printedLoggerLevel) {
        this.printedLoggerLevel = printedLoggerLevel;
    }

    public void initLogger() {
        Level rootLevel = Level.parse(rootLoggerLevel);
        Level printedLevel = Level.parse(printedLoggerLevel);

        Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        Logger loggerParent = applicationContextLogger.getParent();

        loggerParent.setLevel(rootLevel);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printedLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        loggerParent.addHandler(consoleHandler);
    }

}
