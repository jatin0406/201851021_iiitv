import java.util.Scanner;
public class DriverClass {
    public static void main(String[] args){
        Integer x=0;

        //StackLinkedList<Integer> stack=new StackLinkedList<Integer>();
        //to implement through the generic linked list uncomment the above following code here
        array_list_implementation<Integer> stack=new array_list_implementation<>();
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("1>>push");
            System.out.println("2>>pop");
            System.out.println("3>>peep");
            System.out.println("4>>see element at a particular index");
            System.out.println("5>>print the elements in the stack");
            x=scan.nextInt();
            switch (x){
                case 1:stack.push(scan.nextInt());
                break;
                case 2:stack.pop();
                break;
                case 3:stack.peep();
                break;
                case 4:stack.lookelement(scan.nextInt());
                break;
                case 5:stack.transverse();
                break;

                default:
                    System.out.println("wrong input");
            }
        }
    }
}
