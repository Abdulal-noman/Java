public class singleLL {

    class node {// create a class
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    node head = null;
    node tail = null;// add locate the data into null for all

    // add node()
    // when we add a new data this function halp crate a new data;

    public void addnode(int data) {
        node first = new node(data);// this the new node
        if (head == null) {
            // when the ll has only a single list it has
            // only one node that why tali and head are same
            head = first;
            tail = first;

        } else {
            tail.next = first;// first determine the new node
            tail = first;// it is determine the new node tail
        }

    }

    // remove an element by value
    public void removenode(int data) {
        if (head == null)
            return;// if node is emply

        if (head.data == data) {// if the removal node is the head node

            head = head.next;// first head change to the head next node as a head

            if (head == null && tail == null) {
                // if head and tail node both are empty ll dos't exeist

                return;
            }

        }
        node curreent = head;
        while (curreent.next != null && curreent.next.data != data) {
            curreent = curreent.next;

        }
        if(curreent.next!=null){
            curreent.next=curreent.next.next;
           if(curreent.next==null)
           tail=curreent;
        }

    }



// print the linked list
    public void pirnt() {
        // sellect a node as curreent node
        // this node connect the next node
        // this node runing untill null of the node
        node current = head;// currrrent node determin as a head node

        while (current != null) {
            System.out.print(current.data + "   ->  ");
            current = current.next;

        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        singleLL list = new singleLL();
        list.addnode(0);
        list.addnode(1);
        list.addnode(2);
        list.removenode(0);
        list.pirnt();

    }
}
