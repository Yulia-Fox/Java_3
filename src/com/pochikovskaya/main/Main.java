//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pochikovskaya.main;

import com.pochikovskaya.EducationalLiterature.Educational_Literature;
import com.pochikovskaya.ImaginativeLiterature.Imaginative_Literature;
import com.pochikovskaya.Seller.Seller;
import com.pochikovskaya.Shop.Shop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Educational_Literature educational_literature1 = new Educational_Literature("Исследование о природе и причинах богатсва народов", "Адам Смит", "2019", "Русский", "АСТ", "Экономика", 12.0F);
        Imaginative_Literature imaginative_literature1 = new Imaginative_Literature("Финансист", "Теодор Драйзер", "2018", "Русский", "АСТ", "Роман", 24.9F);
        Shop shop = new Shop();
        shop.AddBook(imaginative_literature1);
        shop.AddBook(educational_literature1);
        SellerInterface seller = new Seller(shop);
        seller.AddBook(new Educational_Literature("Искусство управлять людьми", "В.П Шейнов", "2010", "Русский", "АСТ, Харвест", "Психология", 19.0F));
        System.out.println("\nПоиск книги по названию\n");
        if (seller.FindBook("Искусство управлять людьми") != null) {
            seller.FindBook("Искусство управлять людьми").GetBasicBookInformation();
        } else {
            System.out.println("Ничего не найдено");
        }

        System.out.println(seller.GetShop().books.size());
        seller.SellBook("Искусство управлять людьми");
        System.out.println(seller.GetShop().books.size());
        seller.SortByYear();
    }
}
