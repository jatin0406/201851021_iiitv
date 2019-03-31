import java.util.Scanner;
public class DriverHeap {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        HeapImplementation<Integer> heap=new HeapImplementation<Integer>();
        Integer x=0;
        Integer choice=0;
        while(x==0){
            System.out.println("ENTER AN OPTION");
            System.out.println("1>>enter a element into heap");
            System.out.println("2>>maxheapfiy() the heap");
            System.out.println("3>>minheapfiy() the heap");
            System.out.println("4>>print and remove the minimum");
            System.out.println("5>>PRINT THE HEAP");
            System.out.println("6>>heap sort the heap");
            System.out.println("7>>exit the program");
            choice=scan.nextInt();
        switch (choice){
            case 1:
                heap.Insert(scan.nextInt());
                break;
            case 2:
                heap.BuildMax();
                break;
            case 3:
                heap.BuildMin();
                break;
            case 4:heap.extractmin();
            break;
            case 5:heap.transverse();
                break;
            case 6:
                heap.HeapSort();
                break;
            case 7:x=1;
            break;
            default:
                System.out.println("sorry dude this option ain't available");
        }
        }
    }
}
