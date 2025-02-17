

public class LL {
class node{
  int data;
  node next;
  
  // consturctor
  public node(int data){
    this.data=data;
    this.next=null;
  }

}

 public node head=null;
public  node tail=null;

// add new node 
public void addnode(int data){
  node newnode =new node(data);
  if(head==null){
    head=newnode;
    tail=newnode;
  }else{
    tail.next=newnode;
    tail=newnode;
  }
}
// inseratathead
public void insertathead(int data){
  node athead=new node(data);
  athead.next=head;
  head=athead;
  if(tail==null)
  tail=athead;
}


// insert at postion

public void insertatposition(int data,int postion){
  node temp =new node(data);
  if(postion==0){
    insertathead(data);
  }


}


// print output
public void print(){
  node current=head;
  while(current!=null){
    System.out.print(current.data + "  -> ");
    current=current.next;
    
  }
  System.out.print("null");
}



    public static void main(String[] args) {
      
      LL list =new LL();
      list.addnode(4);
      list.addnode(6);
      list.addnode(8);
      list.print();
   
}
}

















