package com.xworkz.task6;

public class InformationRunner {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        System.out.println(book);
        Information info = new Information("The Great Gatsby", Type.BOOK, "F. Scott Fitzgerald");
        System.out.println(info);
        info.displayInfo();
        info.getInfo();
        OnlineInformation onlineInfo = new OnlineInformation("The Great Gatsby", Type.BOOK, "F. Scott Fitzgerald", "www.greatgatsby.com", "greatgatby.in");
        System.out.println(onlineInfo);
        onlineInfo.displayInfo();
        onlineInfo.getInfo();
    }
}
