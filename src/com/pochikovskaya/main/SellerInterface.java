//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pochikovskaya.main;

import com.pochikovskaya.BusinessLiterature.Business_Literature;
import com.pochikovskaya.EducationalLiterature.Educational_Literature;
import com.pochikovskaya.ImaginativeLiterature.Imaginative_Literature;
import com.pochikovskaya.Shop.Shop;

public interface SellerInterface {
    Shop GetShop(); //Создание магазина

    void AddBook(Imaginative_Literature var1); //Добавление художественной литературы

    void AddBook(Business_Literature var1); //Добавление бизнес литературы

    void AddBook(Educational_Literature var1); //Добавление научной литературы

    void AddBook(Book var1); //Добавление книги

    Book FindBook(String var1); //Поиск книги

    void SellBook(String var1); //Продажа книги

    void SortByYear(); //Сортировка по году
}
