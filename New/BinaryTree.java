public class BinaryTree{
    private treeNode root;
    private class treeNode{
        private treeNode left;
        private treeNode right;
        private int data;

        public treeNode(int data){
            this.data=data;
        }
    }

    public void createBinaryTree(){
        treeNode first=new treeNode(1);
        treeNode second=new treeNode(2);
        treeNode third=new treeNode(3);
        treeNode fourth=new treeNode(4);
        treeNode fifth=new treeNode(5);
        treeNode sixth=new treeNode(6);
        treeNode seventh=new treeNode(7);
        treeNode eighth=new treeNode(8);

        root=first;//root-----> first 
        first.left=second;
        first.right=third;//second<-----first------->third
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;
        seventh.left=eighth;
    }
    public void preOrder(treeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[]args){
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(bt.root);    

    }
}