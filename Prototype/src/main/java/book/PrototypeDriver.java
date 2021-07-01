package book;


/*
     1. This is a creational design pattern
     2. This pattern is suitable when we need to perform IO read operations or some database reads repetitively
     for multiple objects. We can connect to the IO destination or DB once for fetching the data and then remaining
     objects can simply perform deep cloning to get the same data faster.
*/
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
