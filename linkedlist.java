
public class linkedlist {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // /step 1 = create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 = newNode next = head
        newNode.next = head; // link

        // step 3 = head = newNode
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addmiddle(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public int search_iteraive(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
         return -1;

    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
         return idx+1;
    }
    public int recursearch(int  key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail  = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static boolean isCycle(){  //floyd's cycle algorithm
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; //cycle exist
            }
        }
        return false; //cycle doesn't exist
    } 
    public static void main(String args[]) {
        // linkedlist ll = new linkedlist();
        // ll.print();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addlast(3); 
        // ll.addlast(4);
        // ll.addmiddle(2, 6);
        // ll.print();

        // System.out.println(ll.search_iteraive(3));
        // System.out.println(ll.search_iteraive(10));

        
        // System.out.println(ll.recursearch(3));
        // System.out.println(ll.recursearch(10));


        //  ll.reverse();
        //  ll.print();

          

//  iscycle

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =  head;

        System.out.print(isCycle());

        
    }
}
