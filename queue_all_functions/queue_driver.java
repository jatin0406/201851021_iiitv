import java.util.Scanner;
public class queue_driver {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Arraylist_implementaion<Integer> queue=new Arraylist_implementaion<>();
        //this is to implement queue through dynamic array
        // to implement through linked list
        //uncomment this
        //queue_implementation_Linked_list<Integer> queue=new queue_implementation_Linked_list<Integer>();
        while (true){
            System.out.println("1>>enqueue");
            System.out.println("2>>dequeue");
            System.out.println("3>>print the queue");
            System.out.println("4>>peek");
            switch (scan.nextInt()){
                case 1:
                    queue.enqueue(scan.nextInt());
                    break;
                case 2:
                   queue.dequeue();
                    break;
                case 3:queue.transverse();
                break;
                case 4:queue.peek();
                break;
                default:
                    System.out.println("wrong input");

            }
        }
    }
}
