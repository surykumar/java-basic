package com.test.oops;

public class Main {
    public static void main(String[] args) {
        // Animal is having eat & sound method defined.
//        Animal a = new Dog();
//        a.eat(); // Dog eat method will be executed!
//        a.sound();
//        Dog d = new Dog();
//        d.sound(); // Dog sound method will be executed!
//        a = new Cat();
//        a.eat(); // Cat eat method will be executed!
//        Cat c = new Cat();
//        c.eat(); // Cat eat method will be executed!
//        c.sound();// Cat Sound method will be executed!
//        System.out.println("Cat: " + c.breed()); // getter setter method can be used to access modify parent class private member variables.
//        // Tiger is implementing NonVegan Interface. So all interface method( here isVegan only) must be overridden in Tiger
//        Animal T = new Tiger();
//        T.eat(); // Tiger eat method will be called at run time.
//        // As isVegan is not in the Animal class, This T instance wont have that isVegan method.
//        Tiger tiger = new Tiger();
//        tiger.isVegan(); // Here is Vegan method is defined in Tiger class it self, we can use that.
//        // Cow is extending Vegan abstract Class. so all the abstract method must be overidden in Cow class.
//        Vegan cow = new Cow();
//        cow.isVegan(); // Abstract method - overridden in Cow
//        cow.getFood(); // Non abstract method of abstract class can be used without overriding


        Person student = new Employee("User", "Male", 0);
        // Abstract method work is overrideen here called here
        student.work();

        Person admin = new Employee("Admin","Male",123);
        admin.work();
        // Non abstract method can also be used, here info & updateName are concrete method defined in abstract class.
        admin.info();
        admin.updateName("Root");
        admin.info();

    }
}
