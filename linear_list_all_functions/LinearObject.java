public class LinearObject<D> {
    D value;
    LinearObject<D> next;
    LinearObject(D a){
        value=a;
        next=null;
    }
}
