public class arraylist implements linearlist {
    Object arr[];

    Integer buffer;
    Integer size;
    arraylist(){
        buffer=5;
        size=0;
        arr=new Object[buffer];
    }
    public void add(Object i){
        arr[size]=i;
        size++;
        if(size==buffer){
            Object arr2[]=new Object[buffer*2];
            buffer*=2;
            for(int j=0;j<size;j++){
                arr2[j]=arr[j];

            }
            arr=arr2;
        }



    }
    public void add(Object i,Integer j){
        int counter=0;
        for (counter=size;counter>j;counter--){
            arr[counter]=arr[counter-1];

        }
        arr[j]=i;
        size++;
    }

    public void transverse(){
        int counter=0;
        for(counter=0;counter<size;counter++){
            System.out.println(arr[counter]);
        }
    }

    public void delete(Integer index) {
        int counter=0;
        for(counter=index;counter<size;counter++){
            arr[counter]=arr[counter+1];

        }
        size--;
    }
    public void length(){
        System.out.println(size);
    }

    public void search(Object i){
        arraylist index=new arraylist();

        for(int counter=0;counter<size;counter++){
        if(arr[counter]==i){
            index.add(counter);
        }
        }
        for(int counter=0;counter<index.size;counter++){
            System.out.println("found at>>"+index.arr[counter]);


        }

    }
}

