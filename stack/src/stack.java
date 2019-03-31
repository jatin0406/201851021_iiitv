//implementing stack through linked list
public class stack<D> {
    linkedstack<D> head;
    Integer counter;
    stack(){
        counter=0;
        head=null;
    }
    void push(D object){
        if (counter==0) {
            linkedstack<D> obj = new linkedstack<D>(object);
            head=obj;
            counter++;
        }
        else{
            linkedstack<D>obj=new linkedstack<D>(object);
            head.link=obj;
            head=obj;
        }


    }
    void pop(){
        try{
            humasn
            if(head==null) {
                throw new IllegalArgumentException("");
            }

        }
        catch (IllegalArgumentException e){
            System.out.println("can't pop as stack is empty");
            return;
        }
    }

    void transeverse(){
        linkedstack<D>iter=head;
        while(iter!=null){
            System.out.println(iter.x);
            iter=iter.link;
        }
    }
}
