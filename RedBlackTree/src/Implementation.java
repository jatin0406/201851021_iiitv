import org.w3c.dom.Node;

public class Implementation<D>{
    NodeAvl<D> root=null;
Integer counter=0;
    public void add(D object){
        root=AddInternal(root,object);
        root.color=0;
    }
<<<<<<< HEAD
    public NodeAvl AddInternal(NodeAvl root,D value){
        if(root==null){
            root=new NodeAvl<D>(value);
            return root;
        }
        else if((Integer)root.value>(Integer)value){
            root.left=AddInternal(root.left,value);
            root.left.parent=root;
            if(root.parent==null){
                return root;
            }
            else{
                if((Integer)root.parent.value>(Integer) root.value){
                    if(root.color==1&&root.parent.right==null){
                        root=rightrotate(root.parent);
                        invertcolor(root);
                        invertcolor(root.right);
                        return root;
                    }
                    else if(root.color==1&&root.parent.right.color==1){
                        if(root.parent.color==1){
                            root.parent.color=0;
                            root.color=0;
                            root.parent.right.color=0;
                            return root;}
                        else if(root.parent.color==0){
                            root.parent.color=1;
                            root.color=0;
                            root.parent.right.color=0;
                            return root;
                        }
                    }
                    else if(root.color==1&&root.parent.right.color==0){
                        root=rightrotate(root.parent);
                        root.color=0;
                        root.right.color=1;
                        return root;
                    }
=======

    public NodeAvl AddInternal(NodeAvl<D> root, D value) {//        //if (seeker == -1) {
//            System.out.println("seeker=-1");
//            if ((root.left.color == 0||root.left==null) &&((Integer) root.right.value < (Integer) value)){
//                leftrotate(root.right);
//            }
//            else if ((root.left.color == 0||root.left==null) && ((Integer) root.right.value > (Integer) value)) {
//                root.right = rightrotate(root.right);
//                leftrotate(root.right);
//            }
//            else if (root.left.color == 1) {
//                root.left.color = 0;
//                root.right.color = 0;
//            }
//
//        } else if (seeker == -2) {
//             if ((root.right==null) && ((Integer) root.left.value < (Integer) value)) {
//                root.left = leftrotate(root.left);
//                rightrotate(root.left);
//             }
//                else if((root.right.color==0) && ((Integer) root.left.value < (Integer) value)) {
//                     root.left = leftrotate(root.left);
//                     rightrotate(root.left);
//
//                 }
//                if((root.right==null) && ((Integer) root.left.value > (Integer) value)) {
//                rightrotate(root.left);
//            }
//
//            if (root.right.color == 1) {
//                root.right.color = 0;
//                root.left.color = 0;
//            }
//
//        }
        if (root == null) {
            NodeAvl<D> node = new NodeAvl<D>(value);
            node.color = 1;
            return node;
        } else if ((Integer) value > (Integer) root.value) {
            root.right = AddInternal(root.right, value);
            root.right.parent = root;

            helper(root.parent,root,value);


        } else if ((Integer) value < (Integer) root.value) {
            root.left = AddInternal(root.left, value);
            root.left.parent = root;
            helper(root.parent,root,value);


        }

        return root;
    }
public void helper(NodeAvl iter,NodeAvl root,D value){

        if(iter== null){
            return;
        }
            else if ((int) iter.value > (int) root.value) {
            if ((int) iter.value > (int) root.value) {

                if (iter.right == null && (int) root.value > (int) value) {
                    rightrotate(iter);
                } else if (iter.right == null && (int) root.value < (int) value) {
                    iter.left= leftrotate(root);
                    rightrotate(iter);
                } else if (iter.right.color == 0 && (int) root.value > (int) value) {
                    rightrotate(iter);
                } else if (iter.right.color == 0 && ((int) root.value < (int) value)) {
                    iter.left= leftrotate(root);
                    rightrotate(iter);
                } else if (iter.right.color == 1) {
                    root.color = 0;
                    iter.right.color = 0;
>>>>>>> 927c10df996a886996541cd109166f37a90dde50
                }
                else if((Integer)root.parent.value<(Integer) root.value) {
                    if ((root.parent.left == null||root.parent.left.color==0)&&root.color==1) {
                        root = rightrotate(root);
                        leftrotate(root.parent);
                        invertcolor(root);
                        invertcolor(root.left);
                        return root;
                    }

//                    else if(root.parent.left.color==1&&root.color==1){
//                        invertcolor(root.parent);
//                        invertcolor(root);
//                        invertcolor(root.parent.left);
//                        return root;
//                    }
                }
            }

        }
        else if((Integer)root.value<(Integer)value){
            root.right=AddInternal(root.right,value);
            root.right.parent=root;
            if(root.parent==null){
                return root;
            }
            else{
                if((Integer)root.parent.value>(Integer) root.value){
                    if(root.color==1&&root.parent.right==null){
                        root=leftrotate(root);
                        rightrotate(root.parent);
                        invertcolor(root.right);
                        invertcolor(root);
                        return root;

                    }
                    else if(root.color==1&&root.parent.right.color==1){
                            invertcolor(root);
                            invertcolor(root.parent.right);
                            invertcolor(root.parent);
                        return root;

                    }
                    else if(root.color==1&&root.parent.right.color==0){
                        root=leftrotate(root);
                        root=rightrotate(root.parent);
                        invertcolor(root);
                        invertcolor(root.right);
                        return root;

                    }
                }
                else if((Integer)root.parent.value<(Integer) root.value) {
                    if (root.parent.left == null||root.parent.left.color==0&&root.color==1) {
                        leftrotate(root.parent);

                        invertcolor(root);
                        invertcolor(root.left);
                        return root;
                    }
//                    else if (root.parent.left.color==0&&root.color==1) {
//                        leftrotate(root.parent);
//
//                        invertcolor(root);
//                        invertcolor(root.left);
//                        return root;
//                    }
                    else if(root.parent.left.color==1&&root.color==1){
                        invertcolor(root.parent);
                        invertcolor(root);
                        invertcolor(root.parent.left);
                    return root;
                    }

                }
            }


        }

        return root;
    }

    public void invertcolor(NodeAvl root){
        if(root==null){
            return;
        }
        else if(root.color==1){
            root.color=0;
        }
        else if(root.color==0){
            root.color=1;
        }
<<<<<<< HEAD
    }
    public NodeAvl<D> leftrotate(NodeAvl root){
        if(root.right==null){
            return root;
        }
        NodeAvl temp1,temp2;
        temp1=null;
        temp2=null;
        temp1=root;
        temp2=root.right.left;
        root=root.right;
        temp2=temp1;
        return root;
=======
        Integer Lheight = BlackHeight(root.left);
        Integer Rheight = BlackHeight(root.right);

        if (root.color == 0) {
            return 1 + maxreturn(Lheight, Rheight);
        } else {
            return maxreturn(Lheight, Rheight);
        }
    }

    public void print() {
        Printer(root);
    }

    public void Printer(NodeAvl root) {
        if (root == null) {
            return;
        }
        Printer(root.left);
        if (root.color == 1) {
            System.out.println(root.value + " " + "red ");
        } else if (root.color == 0) {
            System.out.println(root.value + " " + "black");
        }
        Printer(root.right);
        
>>>>>>> 927c10df996a886996541cd109166f37a90dde50
    }
    public NodeAvl<D> rightrotate(NodeAvl root){
        if(root.left==null){
            return root;
        }
        NodeAvl temp1,temp2=null;
        temp1=root;
        temp2=root.left.right;
        root=root.left;
        temp2=temp1;
        return root;

    }
    public void Print(){
        Printer(root);
    }
    public void Printer(NodeAvl root){
        if(counter==0){
            System.out.println("this is root>>"+root.value+"color"+root.color);
            counter++;
        }
        if(root==null){
            return;
        }
        else{
            Printer(root.left);
            if(root.color==0)
                System.out.println(root.value+ ">>black");
            if(root.color==1)
                System.out.println(root.value+" >>red");
            Printer(root.right);
        }
    }


}