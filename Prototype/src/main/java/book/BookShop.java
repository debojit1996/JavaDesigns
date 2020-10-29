package book;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    public void loadData() {
        for(int i = 0; i < 10; i++) {
            Book b = new Book();
            b.setBookId(i+1);
            b.setBookName("Book "+(i+1));
            getBooks().add(b);
        }
    }
//The below clone method is for shallow cloning which is creating an object reference only
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShopDeepCloned = new BookShop();
        for(Book calledBookObject: this.getBooks()) {
            bookShopDeepCloned.getBooks().add(calledBookObject);
        }
        return bookShopDeepCloned;
    }
}
