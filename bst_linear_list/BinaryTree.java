public class BinaryTree<D>{
    Integer flag;
    BinaryTreeClass<D>root;
    BinaryTree(){
        flag=0;
        root=null;
    }
    public void add(D object){
        root=AddInternal(root,object);

    }
    public BinaryTreeClass<D> AddInternal(BinaryTreeClass root,D value){
        if(root==null){
            root=new BinaryTreeClass<D>(value);
            return root;
        }
        if((Integer)root.value>(Integer) value){
            root.lptr=AddInternal(root.lptr,value);
        }
        else if((Integer)root.value<(Integer)value){
            root.lptr=AddInternal(root.rptr,value);
        }
        //returning the original root or the base root back to the root of the tree here veryyy important
        return root;

    }

    public void search(D object){
        flag=SearchInternal(root,object);
        if(flag==1){
            System.out.println("element found");
        }
        else if(flag==0){
            System.out.println("element not found");
        }
    }
    public Integer SearchInternal(BinaryTreeClass root,D object){

        if(root==null){
            return 0;
        }
        else if(root.value==object){
            return 1;
        }
        else if((Integer)root.value>(Integer)object){
            flag=SearchInternal(root.lptr,object);
            return flag;
        }
        else if((Integer)root.value<(Integer)object){
            flag=SearchInternal(root.rptr,object);
            return flag;
        }
        else{
            return 0;
        }
    }
public void delete(D object){
root=DeleteInternal(root,object);
}

public BinaryTreeClass<D> DeleteInternal(BinaryTreeClass<D> root,D object) {
    if (root == null) {
        return root;
    }
    else if (root.value == object) {
        if (root.lptr != null || root.rptr != null) {
            if (root.lptr != null) {
                root = root.lptr;
            System.out.println("deleted element");
                return root;
            }

            else {
                root = root.rptr;
                System.out.println("deleted element");
                return root;
            }



        }
        else{
            root=null;
            System.out.println("deleted element");
            return root;
        }

    } else if ((Integer) root.value > (Integer) object) {
        root = DeleteInternal(root.lptr, object);

    } else if ((Integer) root.value < (Integer) object) {
        root = DeleteInternal(root.rptr, object);
    }
    return root;
}


    public void transverse() {
        TransversalInternal(root);
        }
    public void TransversalInternal(BinaryTreeClass root){
         BinaryTreeClass<D>iter=null;
         iter=root;
         while(iter!=null){
             System.out.println(iter.lptr.value);
             System.out.println(iter.value);
             TransversalInternal(iter.rptr);
         }
    }
    }
