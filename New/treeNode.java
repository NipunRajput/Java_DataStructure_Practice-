public class treeNode{
    private int data;
    private treeNode left;
    private treeNode right;
    
    public treeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public static void main(String[]args){
        

        treeNode node = new treeNode(5);
        System.out.println("Node data: " + node.data);
    }
}