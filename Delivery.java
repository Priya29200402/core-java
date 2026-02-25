class Delivery {
    static void pickUp() {
        System.out.println("Pickup Items from the market");

        Market.storeVegetables();
        Market.storeGroceries();
        Market.storeFruits();
        Market.storeDryFruits();
        Market.storeJunkFood();
    }
}

class Customer{
    static void shopping(){
        System.out.println("Customer finished the shopping");
        Delivery.pickUp();
    }
}
class Owner {
    static void buy(){
        System.out.println("Owner bought items");
        Customer.shopping();
    }
}

class Person{
    static void fun() {
        System.out.println("Person had a Fun shopping");
        Owner.buy();
    }
}



