package com.xworkz.equals;

public class Runner {
    public static void main(String[] args) {
        Wire wire1=new Wire("Copper",14.5,1200);

        Wire wire2=new Wire("Copper",13.7,1300);

       boolean sameWire= wire1.equals(wire2);
       System.out.println("Wire:"+sameWire);

       Watermelon watermelon1=new Watermelon(500,true,true);
       Watermelon watermelon2=new Watermelon(500,true,true);

       boolean sameWatermelon=watermelon1.equals(watermelon2);
       System.out.println("Watermelon:"+sameWatermelon);

       Crown crown1=new Crown("Silver","Elizibet",40000);
       Crown crown2=new Crown("Silver","Elizibet",40000);
       boolean sameCrown=crown1.equals(crown2);
       System.out.println("Crown:"+sameCrown);

       Industry industry1=new Industry("Sandalwood","Film","Banglore");
       Industry industry2=new Industry("Sandalwood","Film","Banglore");
       boolean sameIndustry=industry1.equals(industry2);
       System.out.println("Industry:"+sameIndustry);

       Oil oil1=new Oil("Cooking",200,"Freedom");
       Oil oil2=new Oil("Cooking",200,"Freedom");
       boolean sameOil=oil1.equals(oil2);
       System.out.println("Oil:"+sameOil);

       ToothPaste toothPaste1=new ToothPaste("Colgate",50,"Mint");
       ToothPaste toothPaste2=new ToothPaste("Colgate",50,"Mint");
       boolean sameToothPaste=toothPaste1.equals(toothPaste2);
       System.out.println("ToothPaste:"+sameToothPaste);

       Diamond diamond1=new Diamond("DeBeers",500000,"Ring");
       Diamond diamond2=new Diamond("DeBeers",500000,"Ring");
       boolean sameDiamond=diamond1.equals(diamond2);
       System.out.println("Diamond:"+sameDiamond);

       Fork fork1=new Fork("Steel",100,12);
       Fork fork2=new Fork("Steel",100,12);
       boolean sameFork=fork1.equals(fork2);
       System.out.println("Fork:"+sameFork);

       Trolley trolley1=new Trolley("Skybags","7000",100);
       Trolley trolley2=new Trolley("Skybags","7000",100);
       boolean sameTrolley=trolley1.equals(trolley2);
       System.out.println("Trolley:"+sameTrolley);

       Sim sim1=new Sim("Jio",9876543210L,true);
       Sim sim2=new Sim("Jio",9876543210L,true);
       boolean sameSim=sim1.equals(sim2);
       System.out.println("Sim:"+sameSim);

       Battery battery1=new Battery("Amaron",19,true);
       Battery battery2=new Battery("Amaron",19,true);
       boolean sameBattery=battery1.equals(battery2);
       System.out.println("Battery:"+sameBattery);




    }
}
