import java.util.Scanner;
public class DriverLinkedList {

    public static void main(String[] args){
        Integer choice =0;
        Scanner scan=new Scanner(System.in);
        LinearList<Integer> linear=new LinearList<Integer>();
        while(true){
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("please enter a choice");
            System.out.println("1>> add an element to last of the list");
            System.out.println("2>>add element at a specific index");
            System.out.println("3>>remove element from a specifc index");
            System.out.println("4>>search for element in the list");
            System.out.println("5>>print the size of list");
            System.out.println("6>>print the list");
            System.out.println("7>>get Element position");
            System.out.println("8>>reverse the list");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the value of the element");
                    linear.add(scan.nextInt());
                        break;
                case 2:
                    System.out.println("enter the value of element");
                    Integer x=scan.nextInt();
                    System.out.println("enter the index position");
                    Integer y=scan.nextInt();
                linear.add(x,y);
                    break;
                case 3:
                    System.out.println("enter the index");
                    linear.remove(scan.nextInt());
                    break;
               case 4:
                   System.out.println("enter the value of the element to be searched");
                   linear.search(scan.nextInt());
                   break;
                case 5:linear.sizeof();
                break;
                case 6:
                    linear.transverse();
                    break;
                case 7:
                    System.out.println("enter the position index");
                    x=scan.nextInt();
                    linear.getElementat(x);
                    break;
                case 8:
                    linear.reverse();
                    break;
                default:
                    System.out.println("wrong selection option");
                break;
            }

        }
    }
}
