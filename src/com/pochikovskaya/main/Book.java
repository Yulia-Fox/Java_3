//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pochikovskaya.main;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Book {
    static final Logger log = Logger.getLogger(String.valueOf(Book.class));
    private String name;
    private String author;
    private String publication_year;
    private String language;
    private String publisher;
    private String genre;
    private float cost;

    public String GetName() {
        return this.name;
    }

    public String GetAuthor() {
        return this.author;
    }

    public String GetYear() {
        return this.publication_year;
    }

    public String GetLanguage() {
        return this.language;
    }

    public String GetPublisher() {
        return this.publisher;
    }

    public String GetGenre() {
        return this.genre;
    }

    public float GetCost() {
        return this.cost;
    }

    public void SetCost(float new_cost) {
        this.cost = new_cost;
    }

    public Book(String n, String au, String y, String l, String p, String g, float c) {
        this.name = n;
        this.author = au;
        this.publication_year = y;
        this.language = l;
        this.publisher = p;
        this.genre = g;
        this.cost = c;
    }

    public Book() {
    }

    public void GetBasicBookInformation() {
        System.out.println("===>BookInformation<===");
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Publication year: " + this.publication_year);
        System.out.println("Language: " + this.language);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Genre: " + this.genre);
        System.out.println("Cost: " + this.cost);
        System.out.println("===============");
    }

    static {
        FileHandler handler = null;

        try {
            handler = new FileHandler("loggin/book_log.txt");
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        log.addHandler(handler);
        log.setLevel(Level.INFO);
    }
}
