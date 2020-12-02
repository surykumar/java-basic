package com.test.designpattern.prototype.movie;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        try {
            MovieDataBase originalObject = new MovieDataBase(); // Default Constructor call
            originalObject.getData(); // External API call

            System.out.println("originalObject: " + originalObject);
            System.out.println("*******************************************************");
            MovieDataBase clonedObject = originalObject.clone(); // Object creation using Cloning
            clonedObject.getRatings().remove(2); // change in mutable rating field which is deep cloned
            clonedObject.getGenre().add("SuperHero"); // change in genre which is shallow cloned
            System.out.println("clonedObject: " + clonedObject); // clonedObject shows all above changes
            System.out.println("*******************************************************");
            System.out.println("originalObject: " + originalObject); // Original Object shows changes in    //only genre as it was shallow cloned. Changes in rating will not occur in original object as it is deep //cloned.
            System.out.println("*******************************************************");


            // Real world example -
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
            System.out.println("content of the list "+ list);

            //Let's now duplicate the list using the prototype method
            ArrayList<Integer> duplicatedSet = (ArrayList<Integer>) list.clone();
            System.out.println("content of the duplicated list "+ duplicatedSet);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
