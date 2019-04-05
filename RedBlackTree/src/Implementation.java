import org.w3c.dom.Node;

public class Implementation<D>{
    NodeAvl<D> root=null;
Integer counter=0;
    public void add(D object){
        root=AddInternal(root,object);
        root.color=0;
    }
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