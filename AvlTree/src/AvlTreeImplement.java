public class AvlTreeImplement<D> {
    Node<D> root;
    AvlTreeImplement(){
        root=null;
    }

    public Integer maxreturn(Node<D> x,Node<D> y){
        if(x==null&&y==null){
            return 0;
        }
        if(x==null||y==null){

            if(x==null){
                return y.height;
            }
            else if(y==null){
                return x.height;
            }


        }
        else{
            if(x.height==y.height){
                return x.height;
            }
            else if(x.height>y.height){
                return x.height;
            }
            return y.height;
        }
        return 0;
    }
    public Integer returnbalance(Node<D> root){
        if(root==null){
            return 0;
        }
        return returnbalance(root.left)-returnbalance(root.right);
    }


    public void insert(D value){
        root=AddInternal(root,value);
    }

    public Node<D> AddInternal(Node root,D value){
        if(root==null){
            root=new Node<D>(value);
        }
        else if((Integer)value>(Integer)root.value){
            root.right=AddInternal(root.right,value);
        }
        else if((Integer)value<(Integer) root.value){
            root.left=AddInternal(root.left,value);
        }
        root.height=1+maxreturn(root.left,root.right);

        Integer balance=returnbalance(root);

        if(balance>1 && (Integer)value<(Integer) root.left.value){
            return RightRotation(root);
        }

        if(balance<-1 && (Integer)value>(Integer)root.right.value){
            return LeftRotation(root);
        }

        if(balance>1 && (Integer)value>(Integer)root.left.value){
            root.left=LeftRotation(root.left);
            return RightRotation(root);
        }
        if(balance<-1 && (Integer) value<(Integer)root.right.value){
            root.right=RightRotation(root.right);
            return LeftRotation(root);
        }
        return root;
    }

    public Node<D> RightRotation(Node root){
        Node temp=root.left;
        Node temp2=temp.right;


        temp.right=root;
        temp.right.left=temp2;
        root=temp;
        root.right.height=maxreturn(root.right.left,root.right.right);
        root.height=maxreturn(root.left,root.right);
        return root;

    }
    public Node<D> LeftRotation(Node root){
        Node temp=root.right;
        Node temp2=temp.left;

        temp.left=root;
        temp.left.right=temp2;
        root=temp;
        root.left.height=maxreturn(root.left.right,root.left.left);
        root.height=maxreturn(root.left,root.right);
        return root;
    }

    public void inorder(){
        InternalInorder(root);
    }

    public void InternalInorder(Node<D> root){
        if(root==null){
            return;
        }
        InternalInorder(root.left);
        System.out.println(root.value);
        InternalInorder(root.right);
    }
}
