package com.xworkz.string.string_static;


public class Parliament {
    public static void main(String[] args) {
        String name="Indian Parliament";
        String location="Delhi";

        String nameJoin= String.join("",name,location);
        System.out.println(nameJoin);

        String nameJoin1= String.join("-","Indian Parliament","Delhi");
        System.out.println(nameJoin1);

        String nameJoin2= String.join(" ","Indian Parliament","Delhi");
        System.out.println(nameJoin2);

        String valueOfname = String.valueOf(name);
        System.out.println(valueOfname);

        String valueOfLocation= String.valueOf(location);
        System.out.println(valueOfLocation);

       String valueOfBoolean= String.valueOf(name);
        System.out.println(valueOfBoolean);
        String valueOfFloat= String.valueOf(location);
        System.out.println(valueOfFloat);

        String copyValue= String.copyValueOf(name.toCharArray());
        System.out.println(copyValue);

        String copyValue1= String.copyValueOf(location.toCharArray());
        System.out.println(copyValue1);

        String format1=String.format("Parliament name is %s and location is %s",name,location);
        System.out.println(format1);

       String joinNameAndLocation= String.join(" is there in ",name,location);
       System.out.println(joinNameAndLocation);




    }

}
