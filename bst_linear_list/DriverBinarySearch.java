import java.util.Scanner;
public class DriverBinarySearch {
    public static void main(String[] args){
        Integer x=0;
        BinaryTree<Integer> bst=new BinaryTree<>();
        Scanner scan=new Scanner(System.in);
        while(x==0){
            System.out.println("enter a choice");
            System.out.println("1>>insert element");
            System.out.println("2>>search an element");
            System.out.println("3>>delete an element");
            System.out.println("3>>print the tree");


            switch (scan.nextInt()){
                case 1:
                    bst.add(scan.nextInt());
                    break;
                case 2:
                System.out.println("enter item to search in tree");
                    bst.search(scan.nextInt());
                  break;
                case 4:bst.transverse();
                break;
                case 3:
                    bst.delete(scan.nextInt());
                    break;
                default:
                    System.out.println("sorry dude wrong input");
            }
        }
    }
}
