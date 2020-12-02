package com.test.designpattern.prototype.bookshop;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException{
        BookShop bs = new BookShop();
        bs.setShopName("My Book Store");
        bs.loadData();

        // New object
        BookShop bs1 = new BookShop();
        bs1.setShopName("A1");
        bs1.loadData();
        // Here again it will go to data base & will fetch all the data.
        // instead of that we can use clone (clone can copy data & create new obj from old obj)
        // Two type of cloning in java - 1. shallow cloning & 2. Deep cloning

        BookShop bsShadowCloned = (BookShop) bs.clone(); // Shallow cloning
        // Here this is just a shallow cloning which means if u update a data of bookshop, it will also affect the cloned data.
        // that's not a deep cloning, both bs & bs2 are referring to the same obj here.

        BookShop bsDeepCloned = bs.DeepCloning();

        bs.getBooks().remove(2);
        System.out.println("BookShop: " + bs);
        System.out.println("BookShop Identity Hash code: " + System.identityHashCode(bs));
        System.out.println("Shadow cloned : " + bsShadowCloned);
        System.out.println("Shadow cloned Identity Hash code: " + System.identityHashCode(bsShadowCloned));
        System.out.println("Deep cloning : " + bsDeepCloned);
        System.out.println("Deep cloned Identity Hash code: " + System.identityHashCode(bsDeepCloned));
        // We can also have Deep Cloning using custom cloning method.


        // Real world example-
        // Let's initialize a list
        // with 10  integers
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("content of the list "+ list);

        //Let's now duplicate the list using the prototype method
        ArrayList<Integer> duplicatedSet = (ArrayList<Integer>) list.clone();
        System.out.println("content of the duplicated list "+ duplicatedSet);
    }
}
