import java.util.Scanner;
public class ArrayList {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        List_works<Integer> arraylist=new List_works<Integer>();
        arraylist.add(10);
        arraylist.add(2,3);
        arraylist.remove(1);
        arraylist.search(2);

        arraylist.transverse();
    }
}
