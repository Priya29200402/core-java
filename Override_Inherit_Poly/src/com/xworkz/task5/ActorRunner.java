package com.xworkz.task5;

public class ActorRunner {
    public static void main(String[] args) {
        String[] actresses = {"Mrunal Thakur", " Rashmika Mandanna"};
        Info info = new Info("Sita Ramam", "Hanu Raghavapudi", "Priyanka Dutt");
        Actor actor = new Actor(" Dulquer Salmaan", 40, Category.HERO, actresses, info);
        LeadActor leadActor = new LeadActor("Dulquer Salman", 40, Category.HERO, actresses, info, "Hero", 15);
        actor.info();
        System.out.println(actor);
        System.out.println("-----------------------------");
        System.out.println(leadActor);

    }
}
