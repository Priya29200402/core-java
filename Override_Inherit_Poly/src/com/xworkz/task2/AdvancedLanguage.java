package com.xworkz.task2;

public class AdvancedLanguage extends Language{
    String paradigm;
    boolean isOpenSource;

    AdvancedLanguage(int id, String name, double rating, int[] versions, Category category, String paradigm, boolean isOpenSource) {
        super(id, name, rating, versions, category);
        this.paradigm = paradigm;
        this.isOpenSource = isOpenSource;
    }

    @Override
    void info() {
        super.info();
    }

    @Override
    void use() {
        super.use();
    }
    public String toString() {
        return "AdvancedLanguage{" + "paradigm='" + paradigm + '\'' + ", isOpenSource=" + isOpenSource + '}';
    }
}
