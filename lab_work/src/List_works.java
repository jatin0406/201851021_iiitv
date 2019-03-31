import java.util.Objects;
import java.util.Scanner;


public class List_works<D> implements list<D> {
    Integer buffer;
    Integer size;
    Integer counter;
    D arraylist[];
    Scanner scan=new Scanner(System.in);
    List_works(){
    buffer=5;
    size=0;
    arraylist=(D [])new Object[buffer];
  //generic arrays cannot be intialized directly thus you can do is that you can do a general object array and then type cast it inside the generic class here

    }
    @Override
    public void add(D obj) {
        arraylist[size]=obj;
        size++;
        if(size==buffer){
            D[] arraylist2=(D[])new Object[buffer*2];
            buffer*=2;
            for(counter=0;counter<size;counter++){
                arraylist2[counter]=arraylist[counter];

            }
            arraylist=arraylist2;
        }
    }

    public void add(D obj ,Integer i){
        if(size==buffer){
            D[] arraylist2=(D[])new Object[buffer*2];
            buffer*=2;
            for(counter=0;counter<size;counter++){
                arraylist2[counter]=arraylist[counter];

            }
            arraylist=arraylist2;
        }
        try {
            if (i >size) {
                throw new ArrayIndexOutOfBoundsException("please enter a valid index");
            }
            else if(i==size){
                arraylist[size]=obj;
                size++;
            }
            else{
                for (counter = size; counter > i; counter--) {
                    arraylist[counter] = arraylist[counter - 1];

                }
                arraylist[i] = obj;
                size++;
            }


        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please enter the new index position between "+"0 to "+size);
            i=scan.nextInt();
            add(obj,i);

        }


    }

    public void remove(Integer i){
        try{
            if(i>size){
                throw new ArrayIndexOutOfBoundsException("Please enter a valid index");
            }
            else if(i==size-1){
                arraylist[i]=null;
                size--;
            }
            else{
                for(counter=i;counter<size-1;counter++){
                    arraylist[i]=arraylist[i+1];

                }
                arraylist[size-1]=null;
                size--;

            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please enter a correct index");
            i=scan.nextInt();
            remove(i);
        }
    }

    public void transverse(){
        for(counter=0;counter<size;counter++){
            System.out.println(arraylist[counter]);
        }
    }

   public void search(D i){
        //implementing search
       Integer flag=0;
       Integer index=0;
       for(counter=0;counter<=size;counter++){
        if(arraylist[counter]==i) {
            flag=1;
            index=counter;
            break;
        }
       }
       if(flag==1){
           System.out.println("element found at index position>> "+index);
       }
       else{
           System.out.println("element not found");
       }

    }

}
