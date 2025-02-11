class Animal{
    int age;
    private String name;
    public Animal(int age,String name){
        this.age=age;
        this.name = name;
    }
   
    public String getname(){
        return name;
    }

}
class dog extends Animal{
    String breed;

    public dog(int age, String name,String breed) {
        super(age,name);
        this.breed=breed;
        
    }
    
}

public class l5q1{
public static void main(String[] args){
   dog d= new dog(5,"kutta","xyz");
   System.out.println(d.getname());
   System.out.println(d.age);
   

}
}
