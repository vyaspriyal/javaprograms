class Enum1{

enum Season{
winter(5),spring(10),summer(15),fall(20);

private int value;
private Season(int value){
this.value = value;
}
}
public static void main(String []  args){
for(Season s :Season.values()){
System.out.println(s+ " "+ s.value);
}//end of for
}//end of main


} // end of enum1

