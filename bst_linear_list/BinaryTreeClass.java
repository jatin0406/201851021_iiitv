public class BinaryTreeClass<D> {
    D value;
    BinaryTreeClass<D> rptr,lptr;
    BinaryTreeClass(D object){
        rptr=lptr=null;
        value=object;

    }
}
