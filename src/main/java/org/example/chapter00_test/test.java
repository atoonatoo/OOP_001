package org.example.chapter00_test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        String[] arrayOBJ = new String[3];

        arrayOBJ[0] = "one";
        arrayOBJ[1] = "two";
        arrayOBJ[2] = "three";
        for (int i=0; i<arrayOBJ .length; i++){
            System.out.println(arrayOBJ[i]);
        }
        ArrayList<String> al = new ArrayList();
        al.add("one");
        al.add("two");
        al.add("three");

       for(String test : al){
           System.out.println(test);
       }


    }
}


