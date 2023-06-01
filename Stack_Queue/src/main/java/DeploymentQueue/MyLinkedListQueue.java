package DeploymentQueue;

public class MyLinkedListQueue {
    class Node{
        public int key;
        public Node next;
        public Node(int key){
            this.key = key;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){   // Kiểm tra nếu tail của hàng đợi là null. Điều này xảy ra khi danh sách liên kết đang rỗng,
                                  // nghĩa là không có phần tử nào trong hàng đợi.
            this.head = this.tail = temp;  //Nếu danh sách liên kết đang rỗng, thì head và tail được gán bằng temp,
                                           // tức là temp trở thành phần tử duy nhất trong hàng đợi.
            return;
        }
        this.tail.next = temp;  // Nếu danh sách liên kết không rỗng, thì next của tail được gán bằng temp,
                                // tức là phần tử mới được thêm vào cuối danh sách.

        this.tail = temp;       // Cuối cùng, tail được cập nhật để trỏ đến phần tử mới temp,
                                // vì nó là phần tử mới nhất trong hàng đợi.
    }
    public Node dequeue(){
        if (this.head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
