package com.first;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = "123";
        ArrayList<String>  a = letterCombinations(s1);
        System.out.println(a);
    }
    static String [] code = {":,","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static ArrayList<String> letterCombinations(String s1){

      if(s1.length() == 1){
          String find3 = s1.charAt(0)+"";
          int x3 = Integer.parseInt(find3);

           ArrayList<String> res = new ArrayList<String>();
           String t  = code[x3];
for(int i = 0; i<t.length();i++) res.add(t.charAt(i)+"");

           return res;
       }
       String find2 = s1.charAt(0)+"";
       int x3 = Integer.parseInt(find2);
 String    found = code[x3];
       ArrayList<String> finalans = new ArrayList<String>();
    ArrayList<String> ans1 = letterCombinations(s1.substring(1));
    for(int i = 0; i < found.length();i++) {
        char letter = found.charAt(i);
        for (String ans : ans1) {
            String one = letter + ans;
            finalans.add(one);
        }
    }
return finalans;
}
}
//output :-[adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, cdi, ceg, ceh, cei, cfg, cfh, cfi]
 
