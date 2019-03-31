

public class Arraylist_implementaion<D> {
    D array[];
    Integer buffer;
    Integer size;
    Integer counter;
    Arraylist_implementaion(){
        size=0;
        buffer=5;
        array= (D[]) new Object[buffer];
    }
    public void enqueue(D object){


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

    public void peek() {
        if (size == 0) {
            System.out.println("the queue is empty");
        } else {
            System.out.println(array[0]);
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("the queue is empty");
        } else {
            for (counter = 0; counter < size - 1; counter++) {
                array[counter] = array[counter + 1];
            }
            array[size - 1] = null;
            size--;
        }
    }
    public void transverse() {
        if (size == 0)
            System.out.println("the queue is empty");
        else {
            for (counter = 0; counter < size; counter++)
                System.out.println(array[counter]);
        }
    }
}
