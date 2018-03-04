package com.wniemiec.component;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        SevenSegmentModule<Integer> sevenSegmentModule = new SevenSegmentModule<>(DefaultModuleControl.getInstance());
        sevenSegmentModule.setSize(1000, 1000);

        JPanel panel = new JPanel();
        panel.setSize(1000, 1000);
        panel.setLayout(new BorderLayout());
        panel.add(sevenSegmentModule, BorderLayout.CENTER);

        JFrame window = new JFrame();
        window.setSize(1000, 1000);
        window.add(panel);

        panel.add(sevenSegmentModule);
        panel.setVisible(true);
        window.add(panel);
        window.setVisible(true);

        sevenSegmentModule.setSize(300, 600);
        sevenSegmentModule.setSegmentThickness(120);

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sevenSegmentModule.light(i);
            Thread.sleep(500L);
        }
    }
}