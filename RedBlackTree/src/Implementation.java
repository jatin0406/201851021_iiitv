
public class Implementation<D> {
    NodeAvl<D> root, iter, iter2;
    Integer seeker;

    Implementation() {
        seeker = 0;

        root = null;
    }

    public void add(D value) {
        iter2 = root;
        root = AddInternal(root, value);
        iter2 = root;
        root.color = 0;
    }

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
<<<<<<< HEAD
        if(iter== null){
            return;
        }
            else if ((int) iter.value > (int) root.value) {
=======
            if ((int) iter.value > (int) root.value) {
>>>>>>> 094df282054d6047a5d82a19d96f34bce9f0d969
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
                }
            } else if ((int) iter.value < (int) root.value) {
                if (iter.left == null && (int) root.value < (int) value) {
                    leftrotate(iter);
                } else if (iter.left == null && (int) root.value > (int) value) {
                    rightrotate(root);
                    leftrotate(iter);
                } else if (iter.left.color == 0 && (int) root.value < (int) value) {
                    leftrotate(iter);
                } else if (iter.left.color == 0 && (int) root.value > (int) value) {
                    rightrotate(root);
                    leftrotate(iter);
                } else if (iter.left.color == 1) {
                    iter.left.color = 0;
                    root.color = 0;
                }
            }



    }


    public NodeAvl<D> rightrotate(NodeAvl root) {
        NodeAvl temp1, temp2;
        temp1 = root;
        temp2 = root.right.left;
        root = root.right;
        root.right = temp1;
        temp1.left = temp2;
        return root;
    }

    public NodeAvl leftrotate(NodeAvl root) {
        NodeAvl temp1, temp2;
        temp1 = root;
        temp2 = root.left.right;
        root = root.left;
        root.left = temp1;
        root.left.right = temp2;
        return root;
    }


    public Integer maxreturn(Integer x, Integer y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            return x;

        }
        return y;
    }

    public Integer BlackHeight(NodeAvl root) {
        if (root == null) {
            return 0;
        }
        if (root.color == 0) {
            return 1;
        }
        Integer Lheight = BlackHeight(root.left);
        Integer Rheight = BlackHeight(root.right);

        if (root.color == 0) {
            return 1 + maxreturn(Lheight, Rheight);
        } else {
            return maxreturn(Lheight, Rheight);
        }
    }

    public void print() {
        root = Printer(root);
    }

    public NodeAvl<D> Printer(NodeAvl root) {
        if (root == null) {
            return root;
        }
        Printer(root.left);
        if (root.color == 1) {
            System.out.println(root.value + " " + "red ");
        } else if (root.color == 0) {
            System.out.println(root.value + " " + "black");
        }
        Printer(root.right);
        return root;
    }

    public NodeAvl<D> parentnode(NodeAvl hello, NodeAvl node) {
            if((int)hello.value>(int)root.value){
                hello.left=parentnode(hello.left,node);
            }
            else if((int)hello.value<(int)root.value){
                hello.right=parentnode(hello.right,node);
            }
            if(hello.right!=null){
                if(hello.right.value==node.value){
                    iter=hello;
                    return hello;
                }
            }
            else if(hello.left!=null){
                if(hello.left.value==node.value){
                    iter=hello;
                    return hello;
                }
            }
            return hello;
    }
}




