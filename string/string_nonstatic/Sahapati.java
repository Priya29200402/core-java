package com.xworkz.string.string_nonstatic;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Sahapati {
    public static void main(String[] args) throws InterruptedException {
        String name="Prema";
        String name2="Goudti";

        String charArray= Arrays.toString(name.toCharArray());
        System.out.println(charArray);

        String charArrayName2= Arrays.toString(name2.toCharArray());
        System.out.println(charArrayName2);

        //toString----->not getting

        String getBytesName= Arrays.toString(name.getBytes());
        System.out.println(getBytesName);

        String getBytesName2= Arrays.toString(name2.getBytes());
        System.out.println(getBytesName2);

        String getBytes= Arrays.toString(name.getBytes(StandardCharsets.UTF_8));
        System.out.println(getBytes); // Same as getBytes without parameter

        String toLowerName=name.toLowerCase(Locale.ROOT); //For converting string into Lowercase
        System.out.println(toLowerName);

        String lowerName2=name2.toLowerCase();
        System.out.println(lowerName2);

        String nameUpper1=name.toUpperCase();
        System.out.println(nameUpper1);

        String name2Upper=name2.toUpperCase();
        System.out.println(name2Upper);

        String containsName1= String.valueOf(true);
        System.out.println(containsName1);

        String charAtName1= String.valueOf(name.charAt(3)); // to access index value
        System.out.println(charAtName1);

        String codepointName1= String.valueOf(name.codePointAt(2)); //getting Byte value of particular index value
        System.out.println(codepointName1);

        String codePointCountName1= String.valueOf(name.codePointCount(0,4)); // Don't Know the Use
        System.out.println(codePointCountName1);

        String compareToName1= String.valueOf(0);
        System.out.println(compareToName1);

       String IgnoreCasename1 = String.valueOf(name.compareToIgnoreCase("Goudti"));
        System.out.println(IgnoreCasename1);

       String ConcatName1= name.concat(" Totagi");
        System.out.println(ConcatName1);

        String hasCodeName1= String.valueOf(name.hashCode());
        System.out.println(hasCodeName1);

        String endsWithCharName1= String.valueOf(name.endsWith("a")); // Checking String Ends with Which Character
        System.out.println(endsWithCharName1);

        String lastIndexName2= String.valueOf(name.lastIndexOf("Goudti"));
        System.out.println(lastIndexName2);

       String replaceWithName1= name.replace("Prema","Prema Totagi"); // Replacing string with new String
        System.out.println(replaceWithName1);

        String trimName1=name.trim(); // For Trimming Words in String
        System.out.println(trimName1);

        String startsWithName1= String.valueOf(name.startsWith("P")); // For checking String Starts with provided character or Not
        System.out.println(startsWithName1);

        String startWithName2= String.valueOf(name.startsWith("g"));
        System.out.println(startWithName2);

    }
}
