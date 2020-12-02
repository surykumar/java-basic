package com.test.designpattern.factory;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();


        // calender instance. (factory pattern)
        Calendar calndr = Calendar.getInstance();

        // Calender instance. (prototype pattern) - shallow cloning
        Calendar calndr2 = (Calendar) calndr.clone();

//        Integer x =Integer.valueOf(9);
//        Integer b = Integer.valueOf("444",16);

//        String url="jdbc:mysql://localhost:3306/spring";
//        Connection con = DriverManager.getConnection(url);

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double points = 2.15;
        double totalPoints = points * 1000;
        System.out.println(n.format(points));
        System.out.println(n.format(totalPoints));

    }

}
