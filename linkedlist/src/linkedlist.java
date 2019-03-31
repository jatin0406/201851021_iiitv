import java.util.Scanner;      //importing scanner
class linkedlist{
    public static void main(String[] args){
        int counter=1;                            //checking condition for the head
        node head=null;
        node iter=null;   //creating the iterator fo the linked list
        printobject link=new printobject();         //a object to print the linked list

        Scanner scan=new Scanner(System.in);
        while(true){
            node item=new node();        //creating the new node to store information
            if(counter==1){
                head=item;          //entering data for the head condition
                iter=head;               //making a reference
                item.data=scan.nextInt();                    //scanning data
                counter++;                                                  //breaking the head condition
                link.print(head);         //printing the entire linked list
            }

            else{
                item.data=scan.nextInt();             //scanning the data
                iter.next=item;              //storing the location of the new node into the previous node
                iter=item;                    //assigning the iter as a new reference to the new node
                link.print(head);              //printing the entire linked list


            }

        }
    }

}
class node{            //class of the node
    int data;           //storing the data
    node next;          //location to the store the location of the next node in the list
    node(){
        next=null;
    }
}
class printobject{                       //defining class with a method to print the linked list
    void print(node head){
        while(head.next!=null){
            System.out.printf("%d ",head.data);
           head=head.next;


        }
        System.out.printf("%d\n",head.data);

    }

        }