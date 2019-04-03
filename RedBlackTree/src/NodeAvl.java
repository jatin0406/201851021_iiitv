//color>black=0;
//color >red=1;
public class NodeAvl<D> {
    D value;
    NodeAvl<D> left,right,parent;
    int color;
    NodeAvl(D value){
        this.value=value;
        left=right=null;
        color=0;

    }
}
