package com.glamrock.design_pattern.abstract_factory.before;

public class ComputerFactory {
    public void createComputer(String type) {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();
        /*
        BodyFactory bodyFactory = new BodyFactory();
        MonitorFactory monitorFactory = new MonitorFactory();
        SpeakerFactory speakerFactory = new SpeakerFactory();
        PrinterFactory printerFactory = new PrinterFactory();
         */

        keyboardFactory.createKeyboard(type);
        mouseFactory.createMouse(type);
        /*
        bodyFactory.createBody(type);
        monitorFactory.createMonitor(type);
        speakerFactory.createSpeaker(type);
        printerFactory.createPrinter(type);
         */
        System.out.println("--- " + type + " 컴퓨터 완성 ---");
    }
}
