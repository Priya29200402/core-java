package com.xworkz.task2;

public class LanguageRunner {
    public static void main(String[] args) {
        Language language = new Language(1, "Java", 4.5, new int[]{1, 2, 3}, new Category("Programming"));
        System.out.println(language);
        language.info();
        language.use();

        AdvancedLanguage advancedLanguage = new AdvancedLanguage(2, "Python", 4.8, new int[]{1, 2, 3, 4}, new Category("Programming"), "Object-Oriented", true);
        System.out.println(advancedLanguage);
        advancedLanguage.info();
        advancedLanguage.use();
    }
}
