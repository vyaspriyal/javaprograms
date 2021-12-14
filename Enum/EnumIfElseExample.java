public class EnumIfElseExample{ 
public enum Day{
SUNDAY,MONDAY, TUESDAY,THURSDAY,FRIDAY,SATURDAY}


public static void main(String [] args){

Day day = Day.MONDAY;
check(day);
}//end of main method


public static void check(Day day){

if(day == Day.MONDAY){
System.out.print("it works!!");
}
else{
System.out.println("oops try something else");
}//end of else

}//end of check method
}//end of class

