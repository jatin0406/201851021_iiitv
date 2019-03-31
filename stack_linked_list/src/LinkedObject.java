public class LinkedObject<D> {
    D value;
    LinkedObject<D> next;
    LinkedObject(D value){
        next=null;
        this.value=value;
    }
}
