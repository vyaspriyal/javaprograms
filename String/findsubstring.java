import java.util.*;
public class findsubstring{
public static void main(String args[]){
String mainstring = "i love programming";
boolean ans = find(mainstring,"hello");

System.out.println(ans);
boolean ans1 = find_method2(mainstring,"ee");
System.out.println("using .contains method " + ans1);
boolean ans2 = find_method3(mainstring,"love");
System.out.println("using .contains method " + ans2);




}//Main end
public static boolean find(String mainstring,String substring){
return mainstring.matches("(.*)"+substring+"(.*)");


}
public static boolean find_method2(String mainstring,String substring){
return mainstring.contains(substring);
}

public static boolean find_method3(String mainstring,String substring){
return mainstring.indexOf(substring)!= -1;
}
}//program end
