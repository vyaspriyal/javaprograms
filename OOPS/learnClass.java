public class learnClass{
    public static void main(String[] args){

        Dog d1 = new Dog("oreo",5,"golden");
        System.out.println("Dog name:" + d1.name);
        d1.checkAge();
        d1.checkActivity(8);
        d1.hungry(false);



    }//end of main method
}// end of class

class Dog{
    String name;
    int age;
    String color;
    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }// constructor

    public void checkAge(){
        if(age <= 5 ){
            System.out.println("Its a puppy!!!");
        }
        else{
            System.out.println("Dog is grown up now hurrayy!!");
        }
    }// end of checkAge method;

    public void checkActivity(int time){
        if(time<5){
            System.out.println("sleeping");
        }
        else if(time >5 && time <10){
            System.out.println("playing");
        }
        else{
            System.out.println("enjoying");
        }
    }// end of checkActivity method

    public void hungry(boolean hunger){
        if(hunger){
            System.out.println("Pls feed him");
        }
        else{
            System.out.println("Don't Distrub Me");
        }
    }// end of hungry method
}//end of dog class
