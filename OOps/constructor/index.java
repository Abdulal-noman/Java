public class index{
    
    public static class person {
        String name;
        int age;


        // consturctor
        person(String name , int age){
            this.name=name;
            this.age=age;

        }
        void display(){
            System.out.println("Name: "+ name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        person noman = new person("abdul al noman", 44);
        noman.display();
      
        
    }
}