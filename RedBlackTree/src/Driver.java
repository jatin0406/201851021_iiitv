import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Implementation<Integer> redblack=new Implementation<>();
        while(true){
            System.out.println("1>>enter the value");
            System.out.println("2>>print");
            switch (scan.nextInt()){
                case 1:redblack.add(scan.nextInt());
                break;
                case 2:
                    redblack.print();
                    break;
                    default:
                        System.out.println("wrong option");
            }
        }
    }
}
