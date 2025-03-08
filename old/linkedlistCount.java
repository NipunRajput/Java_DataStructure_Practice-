//public class linkedlistCount {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data1, Node next1) {
//            this.data = data1;
//            this.next = next1;
//        }
//
//        Node(int data1) {
//            this.data = data1;
//            this.next = null;
//        }
//    }
//
//    private Node head;
//
//    public void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + "-->");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//    public int length(){
//        if(head== null){
//            return 0;
//        }
//        int count=0;
//        Node current=head;
//        while(current!=null){
//            count++;
//            current=current.next;
//        }
//        return count;
//    }
//    public void insert(int value){
//        Node NewFirst=new Node(value);
//        NewFirst.next=head;
//        head=NewFirst;
//    }
//    public void insertatend(int value){
//        Node endnewNode=new Node(value);
//        if(head==null){
//            head=endnewNode;
//        }
//        Node current=head;
//        while(head!=current.next){
//            current=current.next;
//        }
//        current.next=endnewNode;
//    }
//
//    public static void main(String[] args) {
//        linkedlistCount llc = new linkedlistCount();
////        llc.head = new Node(10);
////        Node second = new Node(5);
////        Node third = new Node(5);
////        Node fourth = new Node(5);
////        llc.head.next = second;
////        second.next = third;
////        third.next = fourth;
//        llc.insert(15);
//        llc.insert(1);
//        llc.insert(5);
//        llc.insertatend(11);
//        llc.display();
//        System.out.println("length is--"+llc.length());
//    }
//}
