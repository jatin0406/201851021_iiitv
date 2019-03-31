import java.util.Scanner;
class LinearList<D> implements List_Interface<D> {
    LinearObject<D> head;
    LinearObject<D> tail;
    LinearObject<D> iter;
    Integer counter;
    Scanner scan;
    LinearList(){
        head=tail=iter=null;
        counter=0;
        scan=new Scanner(System.in);
    }

    @Override
    public void getElementat(Integer pos) {
        try{
            counter=0;
            iter=head;
            while(iter!=null){
            iter=iter.next;
            counter++;
            }



        if(pos<0||pos>counter)
            throw new ArrayIndexOutOfBoundsException("");
        else{
            iter=head;
        for(counter=0;counter<pos;counter++){
            iter=iter.next;
        }
        System.out.println("element is>>"+iter.value);
        }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("sorry wrong index,enter another value");
            getElementat(scan.nextInt());
        }
    }


    @Override
    public void reverse() {
        LinearObject<D>prev=null;
        LinearObject<D>current;
        LinearObject<D>next=null;
        current=head;
        tail=head;
        while(current.next!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        current.next=prev;

        head=current;
    }

    @Override
    public void add(D object) {
        if(head==null){
            LinearObject<D> obj=new LinearObject<D>(object);
            head=tail=obj;

        }
        else{
            LinearObject<D> obj=new LinearObject<D>(object);
            tail.next=obj;
            tail=obj;
        }

    }

    @Override
    public void search(D object) {
        Integer flag=0;
        counter=0;

        iter=head;

        while(iter!=null){
            if(iter.value==object){
                System.out.println("element found ar index >>"+counter);

                flag=1;

            }
            iter=iter.next;
            counter++;

        }
        if(flag==0){
            System.out.println("element not found");
        }

    }

    @Override
    public void add(D object, Integer pos) {
        try {
            counter = 0;
            iter = head;
            while (iter != null) {
                counter++;
                iter = iter.next;
            }

            if (pos < 0 || pos > counter) {
                throw new IndexOutOfBoundsException("");
            }
            else {
                iter = head;
                counter = 0;
                while (counter <pos-1 ) {
                    iter=iter.next;
                    counter++;
                }
                LinearObject<D> obj = new LinearObject<D>(object);
                obj.next = iter.next;
                iter.next = obj;
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("wrong position index enter another position");
            Integer x=scan.nextInt();
            add(object,x);

        }
    }

    @Override
    public void transverse() {
    iter=head;
    while(iter!=null){
        System.out.println(iter.value);
        iter=iter.next;

    }
    }

    @Override
    public void remove(Integer pos) {
        counter = 0;
        iter = head;
        while (iter != null) {
            counter++;
            iter = iter.next;
        }
        try {
            if (pos > counter) {
                throw new IndexOutOfBoundsException("");
            } else {
                iter = head;
                counter = 0;
                while (counter < pos - 1) {
                    iter = iter.next;
                    counter++;
                }
                iter.next = iter.next.next;

            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong index please enter correct index");
            remove(scan.nextInt());

        }
    }


    @Override
    public void sizeof() {
        iter=head;
        counter=0;
        while(iter!=null){
            iter=iter.next;
            counter++;
        }

        System.out.println("the size is>>"+ counter);
    }
}
