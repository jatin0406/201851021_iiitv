public class StackLinkedList<D> {
    LinkedObject<D> head;
    Integer counter;
    LinkedObject<D>iter;
    StackLinkedList(){
        head=null;
        counter=0;
        iter=null;
    }
    public void push(D value){
        LinkedObject<D> obj=new LinkedObject<D>(value);
        obj.next=head;
        head=obj;
    }
    public void pop(){
        try{
            if(head==null){
                throw new ArrayIndexOutOfBoundsException("");
            }
            else{
                System.out.println(head.value);
                head=head.next;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stack empty");
            return;
        }
    }
    public void peep(){
        System.out.println(head.value);
    }

    public void lookelement(Integer x){
        iter=head;
        while(iter!=null){
            counter++;
            iter=iter.next;
        }
        try{
            if(x<0||x>counter||head==null){
                throw new ArrayIndexOutOfBoundsException("");
            }
            else{
                counter=0;
                iter=head;
                while(counter<x){
                    iter=iter.next;
                    counter++;
                }
                System.out.println(iter.value);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index does not exist");
            return;
        }
    }
    public void transverse(){
        iter=head;
        if(iter==null)
            System.out.println("the stack is empty");
        while(iter!=null){
            System.out.println(iter.value);
            iter=iter.next;
        }
    }

}
