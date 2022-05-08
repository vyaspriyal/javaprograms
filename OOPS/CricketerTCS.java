package com.first;

import java.util.Scanner;

public class CricketerTCS {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cricketer [] cr = new Cricketer[4];
        for(int i =0; i <4;i++){
            int a = s.nextInt();
            s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt();
            s.nextLine();
            String d = s.nextLine();
            String e  = s.nextLine();
            cr[i] = new Cricketer(a,b,c,d,e);
        }
        String x = s.nextLine();
        String y = s.nextLine();
        Cricketer result = findCricketerWithMinjercyNo(cr,x,y);
        if(result == null){
            System.out.println("There is no such cricketer");
        }
        else{
            System.out.println(result.cricketId);
        }


    }
    public static Cricketer findCricketerWithMinjercyNo(Cricketer [] cr, String x,String y){
Cricketer ans = null;
int min = Integer.MAX_VALUE;
        for(int i = 0; i < 4;i++){
if(cr[i].group.equalsIgnoreCase(x)){
    if(cr[i].type.equalsIgnoreCase(y)){
        if(cr[i].jercyNo<min)
        min = cr[i].jercyNo;
        ans = cr[i];
    }
}
}

        return ans;
    }
}
class Cricketer{
    int cricketId;
    String cricketerName;
    int jercyNo;
    String group;
    String type;
    public Cricketer(int cricketId, String cricketerName, int jercyNo, String group, String type){
        this.cricketId = cricketId;
        this.cricketerName = cricketerName;
        this.jercyNo = jercyNo;
        this.group = group;
        this.type = type;
    }

}
