class EnumWithSwitchCase{

enum Days {Monday,Sunday,Tuesday,Thursday,
Wednesday,Friday,Saturday}
public static void main(String [] args){

Days day = Days.Monday;
switch(day){

case Sunday:
System.out.println("sunday");
break;
case Monday:
System.out.println("monday");
break;
default:
System.out.println("other day");


}//end of switch case


}//end of main method
}//end of program
