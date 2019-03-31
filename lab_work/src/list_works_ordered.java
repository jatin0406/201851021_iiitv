import java.util.Scanner;

public class list_works_ordered<D> implements list_ordered<D> {
    Integer buffer;
    Integer size;
    D[] list;
    Integer counter;
    Integer breaker=0;
    Scanner scan;
    list_works_ordered(){
        buffer=5;
        size=0;
        counter=0;
        list=(D[])new Object[buffer];
        scan=new Scanner(System.in);
    }
    public void add(D i){
        Integer index=0;
        Integer flag=0;

            for (counter = 0; counter < size; counter++) {

                if ((Integer) list[counter] >= (Integer) i) {
                    index = counter;
                    flag=1;
                    break;
                }
                else if((Integer)list[counter]<(Integer)i){
                    flag=0;
                }

            }
            if(flag==1){
            for(counter=size;counter>index;counter--){
                list[counter]=list[counter-1];

            }
            list[index]=i;
            size++;

            }
            else if(flag==0){
                list[size]=i;
                size++;
            }


        if(size==buffer){
            D[] arraylist2=(D[])new Object[buffer*2];
            buffer*=2;
            for(counter=0;counter<size;counter++){
                arraylist2[counter]=list[counter];

            }
            list=arraylist2;
        }





    }
    public void transverse(){
        for(counter=0;counter<size;counter++){
            System.out.println(list[counter]);
        }
    }
    public void remove(Integer i){
    try{
        if(i<size||i>size){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            for(counter=(Integer)i;counter<size-1;counter++){
                list[counter]=list[counter+1];

            }
            list[size-1]=null;
            size--;
        }
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("wrong index please enter another index for removal");
        Integer x=scan.nextInt();
        remove(x);

    }
    }




    public Object search(D i){
       Integer flag=0;
        Integer min=0;
        Integer max=size-1;
        Integer mid;
        while(min<=max){
            mid=(max+min)/2;
            if((Integer)list[mid]>(Integer) i){
                max=mid-1;

            }
            else if((Integer)list[mid]<(Integer)i){
                min=mid+1;
            }
            else if((Integer)list[mid]==(Integer)i){
                flag=1;
                return ("element found at location index "+mid);

            }

        }
        if(flag==0){
            return("element not found");
        }
        return ("");

    }

}
