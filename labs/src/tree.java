import java.util.Scanner;
public class tree {
    tree leftnode;
    tree rightnode;
    tree previous;
    tree(){
        previous=null;
    }
}
class left extends tree{
    Object data;
}
class right extends tree{
    Object data;
}


class aniket{
    Scanner scan=new Scanner(System.in);
    public static void main(String[] args){

        input();
    }
    void input(){
        int counter==1;
        System.out.println("enter the root");
        class tree=new tree();

        int x=scan.nextInt();
        while(true){
            System.out.println("enter which side to go");

            System.out.println("1 for left 2 for right");
            x=scan.nextInt();
            if(x==1){

            }
        }
    }
}