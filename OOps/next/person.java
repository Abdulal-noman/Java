public class person {
    
    private String name;
    private int id;
    private  double sallary;

    // all set function
    public void setname(String name){
        this.name=name;
    }
    public void setid(int id){
        this.id=id;

    }
    public void setsellary(double sallary){
        this.sallary=sallary;
    }

    // all get function 

    public String getname(){
        return this.name;
    }
    public int getid(){
       return this.id;
    }
    public double getsallary(){
       return this.sallary;
    }
}
