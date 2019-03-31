public class HeapImplementation<D> {
    Integer size, buffer;
    D array[];

    HeapImplementation() {
        size = 0;
        buffer = 5;
        array = (D[]) new Object[buffer];
    }

    public void Insert(D object) {
        array[size] = object;
        size++;
        if (size == buffer) {
            D array2[] = (D[]) new Object[buffer * 2];
            buffer *= 2;
            for (Integer counter = 0; counter < size; counter++) {
                array2[counter] = array[counter];
            }
            array = array2;
        }
    }

    public boolean isleaf(Integer pos) {
        if (pos*2+1 >= size) {
            return true;
        }
        return false;
    }


    public void transverse(){
        for(Integer counter=0;counter<size;counter++)
            System.out.println(array[counter]);
    }

    public void maxheapify(Integer pos) {
        //max heapify one subtree at a time;
        //here we do max heap of one subtree at a time here
        if (isleaf(pos)) {
            return;
        }
        else if ((pos * 2) + 2 < size) {
            if ((Integer) array[pos] < (Integer) array[(pos * 2) + 1] || (Integer) array[pos] < (Integer) array[(pos * 2) + 2]) {
                if ((Integer) array[(pos * 2) + 1] > (Integer) array[(pos * 2) + 2]) {
                    swap(pos, (pos * 2) + 1);
                    maxheapify((pos * 2) + 1);
                }

                else {
                    swap(pos, (pos * 2) + 2);
                    maxheapify((pos * 2) + 2);
                }
            }
        }
        else {
            if ((Integer)array[pos]<(Integer)array[(pos*2)+1]) {
                swap(pos, (pos * 2) + 1);
                maxheapify((pos * 2) + 1);

            }
        }
    }
    public void BuildMax(){
        for(Integer counter=size/2;counter>=0;counter--){
            maxheapify(counter);
        }
    }
    public void minheapify(Integer pos){
        if(isleaf(pos)){
            return;
        }
        else if((pos*2)+2<size){
            if((Integer)array[pos]>(Integer)array[(pos)*2+1]||(Integer)array[pos]>(Integer)array[(pos)*2+2]){
                if ((Integer) array[(pos * 2) + 1] <(Integer)array[(pos*2)+2]) {
                    swap(pos,(pos*2)+1);
                minheapify((pos*2)+1);
                }
                else{
                        swap(pos,(pos*2)+2);
                        minheapify((pos*2)+2);

                    }

                }
            else{
                if((Integer)array[pos]>(Integer)array[(2*pos)+1]){
                    swap(pos,(2*pos)+1);
                    minheapify((2*pos)+1);
                }
            }
            }
        }

        public void BuildMin(){
        for(Integer counter=size/2;counter>=0;counter--){
            minheapify(counter);
        }
        }


    public void swap(Integer pos1,Integer pos2){
        D c=null;
        c=array[pos1];
        array[pos1]=array[pos2];
        array[pos2]=c;
    }

    public void extractmin(){
        BuildMin();
        try {
            if (size > 0) {
                System.out.println(array[0]);
                array[0] = array[size - 1];
                size--;
            }
            else{
                throw new ArrayIndexOutOfBoundsException("");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("heap is empty");
            return;
        }

    }
    public void HeapSort(){
        while(size!=0){
            extractmin();

        }
    }


}