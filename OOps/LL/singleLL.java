public class singleLL {
    
     class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }

    }   
    node head=null;
    // method to add a not at he end
    public void add(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;

        }else{
            node temp=head;
            while (temp.next!=null) {
                temp=temp.next;

            }
            temp.next=newnode;
            
        }
    }

    
    public static void main(String[] args) {
        singleLL list =new singleLL();
        
        
    }
}
