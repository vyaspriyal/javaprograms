package com.first;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class SubSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = "abc";
        ArrayList<String>  a =SubSequence(s1);
        System.out.println(a);
    }
public static ArrayList<String> SubSequence(String s1){
        if(s1.length() == 0){
            ArrayList<String> last = new ArrayList<String>();
            last.add("");
            return last;
        }
  char letter = s1.charAt(0);
  String pass = s1.substring(1);
  ArrayList<String> res = SubSequence(pass);
  ArrayList<String> finalAns = new ArrayList<String>();
    for(String s: res ){
        finalAns.add(letter + s);

    }
  for(String s: res ){
      finalAns.add(s);

  }


return finalAns;
}
}
