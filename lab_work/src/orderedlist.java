public class orderedlist {
    public static void main(String[] args){
        list_works_ordered<Integer> a=new list_works_ordered<Integer>();
        a.add(10);
        a.add(5);
        a.add(16);
        a.add(3);
        a.add(15);
        a.transverse();
        System.out.println(a.search(16));

        a.transverse();
    }
}
