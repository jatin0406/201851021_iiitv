import java.util.Scanner;
public class Driver_Stack {
    public static void main(String[] args){
        Integer x=0;
        Scanner scan=new Scanner(System.in);
        stack<Integer> stack=new stack<Integer>();
        while(true){
            System.out.println("choose option");
            System.out.println("case 1>>push");
            System.out.println("case 2>>pop");
            x=scan.nextInt();
            switch (x){
                case 1:
                    stack.push(scan.nextInt());
                    stack.transeverse();
                    break;
                case 2:
                    stack.pop();
                    stack.transeverse();
                    break;
                    default:
                        System.out.println("wrong input");
            }
        }
    }

}
