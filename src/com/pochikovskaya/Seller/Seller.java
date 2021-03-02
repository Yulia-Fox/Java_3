//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pochikovskaya.Seller;

import com.pochikovskaya.BusinessLiterature.Business_Literature;
import com.pochikovskaya.EducationalLiterature.Educational_Literature;
import com.pochikovskaya.ImaginativeLiterature.Imaginative_Literature;
import com.pochikovskaya.Shop.Shop;
import com.pochikovskaya.main.Book;
import com.pochikovskaya.main.SellerInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Seller implements SellerInterface {
    public Shop shop;

    public Shop GetShop() {
        return this.shop;
    }

    public Seller(Shop shop) {
        this.shop = shop;
    }

    public void AddBook(Imaginative_Literature book) {
        this.shop.Imaginative_Literature.add(book);
        this.shop.books.add(book);
    }

    public void AddBook(Business_Literature book) {
        this.shop.Business_Literature.add(book);
        this.shop.books.add(book);
    }

    public void AddBook(Educational_Literature book) {
        this.shop.Educational_Literature.add(book);
        this.shop.books.add(book);
    }

    public void AddBook(Book book) {
        this.shop.books.add(book);
    }

    public Book FindBook(String name) {
        Iterator var2 = this.shop.books.iterator();

        Book book;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            book = (Book)var2.next();
        } while(!name.equals(book.GetName()));

        return book;
    }

    public void SellBook(String name) {
        try {
            Iterator var2 = this.shop.books.iterator();

            while(var2.hasNext()) {
                Book book = (Book)var2.next();
                if (name.equals(book.GetName())) {
                    this.shop.books.remove(book);
                    break;
                }
            }
        } catch (Exception var4) {
            System.out.println(var4.getMessage());
        }

    }

    public void SortByYear() {
        try {
            System.out.println("=====>Сортировка книг по году издания<=====");
            List<Book> bufferList = new ArrayList();
            Iterator var2 = this.shop.books.iterator();

            while(var2.hasNext()) {
                Book book = (Book)var2.next();
                bufferList.add(book);
            }

            if (this.shop.books.size() == 0) {
                throw new Exception("У вас нет книг");
            }

            List<Book> SortedList = new ArrayList();
            int size = bufferList.size();
            int index = 2147483647;
            float year = 2.14748365E9F;

            for(int i = 0; i < size; ++i) {
                for(int l = 0; l < bufferList.size(); ++l) {
                    if ((float)Integer.parseInt(((Book)bufferList.get(l)).GetYear()) < year) {
                        year = (float)Integer.parseInt(((Book)bufferList.get(l)).GetYear());
                        index = l;
                    }
                }

                SortedList.add((Book)bufferList.get(index));
                bufferList.remove(index);
                index = 2147483647;
                year = 2.14748365E9F;
            }

            Iterator var12 = SortedList.iterator();

            while(var12.hasNext()) {
                Book element = (Book)var12.next();
                element.GetBasicBookInformation();
            }

            System.out.println("=====>===============<=====");
        } catch (Exception var9) {
            System.out.println("\nYour exception: " + var9.getMessage() + "\n");
        }

    }
}
