package book;

import book.BookShop;

public class PrototypeDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Novelty");
        bookShop.loadData();

        //Shallow cloning, only refernce is created here instead of a new object. Changing
        //contents of original object affects cloned object
        //BookShop bookShopShallowClone = (BookShop)bookShop.clone();

        BookShop bookShopDeepClone = bookShop.clone();
        bookShopDeepClone.setShopName("A1");
        //verify if its a new object using Deep cloning instead of a reference
        bookShop.getBooks().remove(2);
        System.out.println(bookShop);
        System.out.println(bookShopDeepClone);
    }
}
