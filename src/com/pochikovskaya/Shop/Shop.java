//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pochikovskaya.Shop;

import com.pochikovskaya.BusinessLiterature.Business_Literature;
import com.pochikovskaya.EducationalLiterature.Educational_Literature;
import com.pochikovskaya.ImaginativeLiterature.Imaginative_Literature;
import com.pochikovskaya.main.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop {
    public List<Imaginative_Literature> Imaginative_Literature = new ArrayList();
    public List<Business_Literature> Business_Literature = new ArrayList();
    public List<Educational_Literature> Educational_Literature = new ArrayList();
    public List<Book> books = new ArrayList();

    public Shop() {
    }

    public void AddBook(Imaginative_Literature book) {
        this.Imaginative_Literature.add(book);
        this.books.add(book);
    }

    public void AddBook(Business_Literature book) {
        this.Business_Literature.add(book);
        this.books.add(book);
    }

    public void AddBook(Educational_Literature book) {
        this.Educational_Literature.add(book);
        this.books.add(book);
    }

    public void ShowAutoPark() {
        Iterator var1 = this.books.iterator();

        while(var1.hasNext()) {
            Book book = (Book)var1.next();
            book.GetBasicBookInformation();
        }

    }
}
