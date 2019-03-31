

public class array_list_implementation<D> {
    D array[];
    Integer size,buffer,counter;
    array_list_implementation(){
        size=0;
        counter=0;
        buffer=5;
        array=(D[])new Object[buffer];
    }
    public void push(D object){
        array[size]=object;
        size++;
        if(size==buffer){
            D arr2[]=(D[]) new Object[buffer*2];
            buffer*=2;
            for(counter=0;counter<size;counter++){
                arr2[counter]=array[counter];
            }
            array=arr2;
        }
    }

    public void pop() {
        if (size == 0)
            System.out.println("the stack is empty");
        else {
            System.out.println(array[size - 1]);
            array[size - 1] = null;
            size--;

        }
    }
    public void transverse() {
        if (size == 0)
            System.out.println("stack is empty");
        else {
            for (counter = size - 1; counter >= 0; counter--)
                System.out.println(array[counter]);
        }
    }
    public void peep() {
        if (size == 0)
            System.out.println("the stack is empty");
        else {
            System.out.println(array[size - 1]);
        }
    }

    public void lookelement(Integer x) {
        if (size == 0) {
            System.out.println("the stack is empty ");
        } else if (x < 0 || x >= size) {
            System.out.println("the index is invalid");
        } else {
            System.out.println(array[size - x - 1]);
        }
    }
}
