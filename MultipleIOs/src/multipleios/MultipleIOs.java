/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleios;

/**
 *
 * @author Ryan
 */
import java.io.*;
import java.util.*;
import java.lang.System;

class MyThread extends Thread {

    File file;
    FileReader fr = null;
    LineNumberReader lnr = null;
    int lines = 0;
    String str;

    public MyThread(String s, File file) {
        super(s);
        this.file = file;
    }

    public void run() {
        try {
            fr = new FileReader(file);
            lnr = new LineNumberReader(fr);
            while (lnr.readLine() != null) {
            }
            System.out.println(getName());
            System.out.println("(" + lnr.getLineNumber() + ")");
            System.out.println(file.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MultipleIOs {

    public static void main(final String[] args)
    throws InterruptedException {
        long startTime = System.currentTimeMillis();
        MyThread[] threads = new MyThread[args.length];
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            String name = "Thread #";
            name = name + (i + 1);
            File file = new File(args[i]);
            threads[i] = new MyThread(name, file);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
