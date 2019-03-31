public class queue_implementation_Linked_list<D>{
    LinkedListForQueue<D>head,iter;
    Integer counter;
    queue_implementation_Linked_list(){
        head=iter=null;
        counter=0;
    }
    public void enqueue(D object){
        LinkedListForQueue<D> obj=new LinkedListForQueue<D>(object);
        if(counter==0){
            head=iter=obj;
            counter=-1;
        }
        else{
            iter.node=obj;
            iter=obj;
        }
    }
    public void transverse(){

        iter=head;
        if(iter==null){
            System.out.println("queue is empty");
        }
        else{
        while(iter!=null) {
            System.out.println(iter.value);
            iter = iter.node;
        }
        }

    }
    public void dequeue(){
        try{
            if(head==null){
                throw new InterruptedException("");
            }
            else{
                head=head.node;
            }
        }
        catch (InterruptedException e){
            System.out.println("queue is empty here");
            return;
        }
    }

    public void peek(){
        iter=head;
        if(iter==null){
            System.out.println("the stack is empty");
        }
        else{
            System.out.println(iter.value);
        }
    }

}