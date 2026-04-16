package com.xworkz.task2;


enum LanguageType{
    PROGRAMMING, SPOKEN, SIGN
}
public class Language {
    int id;
    String name;
    double rating;
    int[] versions;
    Category category;

    Language(int id,String name,double rating,int[] versions,Category category){
        this.id=id;
        this.name=name;
        this.rating=rating;
        this.versions=versions;
        this.category=category;
    }
    void info(){

        System.out.println("Getting info about the language");
    }
    void use(){

        System.out.println("Using the language");
}
    public String toString() {
        return "Language{" + "id=" + id + ", name='" + name + '\'' + ", rating=" + rating + ", versions=" + java.util.Arrays.toString(versions) + ", " +
                          "category=" + category.name + '}';
    }
}
