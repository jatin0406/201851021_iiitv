import java.util.Scanner;
public class driver {
    public static void main(String[] args){
        AvlTreeImplement<Integer> avl=new AvlTreeImplement<>();
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("1>>INSERT");
            System.out.println("2>>print inorder");
            switch (scan.nextInt()){
                case 1:
                    avl.insert(scan.nextInt());
                    break;
                case 2:
                    avl.inorder();
                    break;
                    default:
                        System.out.println("sorry wrong option");
            }
        }
    }
}