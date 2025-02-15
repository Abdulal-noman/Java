public class first {


  

    public static void main(String[] args) {
       student x = new student();
       x.name="abudl al nooman";
    // x.roll=63;   
       x.persent=33.33;
       x.setroll(64);
       
       
       
       System.err.println(x.name);
    //    System.out.println(x.roll);
    System.out.println(x.getroll());
       System.out.println(x.persent+4);
      System.out.println(x.getroll());

       student s=new student();

       s.name="pinke";
       //s.roll=33;
       s.persent= 33.6;

       System.out.println(s.name);
     //  System.out.println(s.roll);
       System.out.println(s.persent);

    }
}