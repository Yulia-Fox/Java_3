//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//Бизнес литература

package com.pochikovskaya.BusinessLiterature;

import com.pochikovskaya.main.Book;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Business_Literature extends Book {
    static final Logger log = Logger.getLogger(String.valueOf(Business_Literature.class));

    public Business_Literature() {
    }

    public Business_Literature(String n, String au, String y, String l, String p, String g, float c) {
        super(n, au, y, l, p, g, c);
        log.info("Создан объект класса Business Literature");
    }

    static {
        FileHandler handler = null;

        try {
            handler = new FileHandler("loggin/business_loger.txt");
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        log.addHandler(handler);
        log.setLevel(Level.INFO);
    }
}
