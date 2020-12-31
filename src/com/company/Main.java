package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainFrame frame = new mainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
