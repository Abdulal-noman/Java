import java.util.ArrayList;
public class test {
    public static void main(String[] args) {

      ArrayList<String> list = new ArrayList<String>();
      ArrayList<Integer> intarr=new ArrayList<Integer>();


      list.add("Apple");
      list.add("Banana");
      list.add("Cherry");
      
    //   intarr.add("cherry");
    // used for all print in one 
    System.out.println("Frouts:" + list);

    // used for print only one properits
    System.out.println(list.get(0));

    intarr.add(10);
    intarr.add(20);
    intarr.add(30);
    System.out.println("all number is :"+ intarr);



    
    }
}
