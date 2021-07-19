package weekTask2;

public class Queue {
	
	Node front,rear;
	
    Queue(){
        front=null;
        rear=null;
    }
   
    void enqueue(int data){
        Node temp = new Node(data);
        if(front==null){
            front=rear=temp;
            return;
        }
        rear.next = temp;
        rear=temp;
    }
    
    void dequeue(){
        if(front==null){
            return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    
	int searchNo(int n) {
		Node temp=front;
		int index=0;
		while(temp!=null) {
			if(temp.data == n)
				return index;
			temp=temp.next;
			index++;
		}
		return -1;
	}
	
	int getIndex(int index) {
		Node temp=front;
		int ctr=0;
		while(temp!=null) {
			if(ctr==index)
				return temp.data;
			temp=temp.next;
			ctr++;
		}
		return -1;
	}
}
