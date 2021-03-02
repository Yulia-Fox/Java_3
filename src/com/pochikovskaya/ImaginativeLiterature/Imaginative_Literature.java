//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//Художественная литература

package com.pochikovskaya.ImaginativeLiterature;

import com.pochikovskaya.main.Book;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Imaginative_Literature extends Book {
    static final Logger log = Logger.getLogger(String.valueOf(Imaginative_Literature.class));

    public Imaginative_Literature() {
    }

    public Imaginative_Literature(String n, String au, String y, String l, String p, String g, float c) {
        super(n, au, y, l, p, g, c);
        log.info("Создан объект класса Imaginative Literature");
    }

    public void ImaginativeLogger() {
        log.info("Some message");
    }

    static {
        FileHandler handler = null;

        try {
            handler = new FileHandler("loggin/imaginative_log.txt");
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        log.addHandler(handler);
        log.setLevel(Level.INFO);
    }
}
