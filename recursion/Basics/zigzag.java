public class zigzag{
    public static void main(String[] args) {
      zigzag(2);

    }
    public static void zigzag(int x){

        if(x == 0){
            return ;
        }
        System.out.println("pre" + x);
        zigzag(x-1);
        System.out.println("In"+ x);
        zigzag(x-1);
        System.out.println("Post"+x);



    }
}

//output:-
/*
pre2
pre1
In1
Post1
In2
pre1
In1
Post1
Post2
*/
