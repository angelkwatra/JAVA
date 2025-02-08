class SuperClass {
    private int Number = 42; 
    public int getNumber() {
        return Number;
    }
}

class SubClass extends SuperClass {
    public void display() {
        // System.out.println("Private variable: " + Number); Can't Access directly from Private variable 
        
        System.out.println("Private variable accessed using getter is: " + getNumber());
    }
}

public class L5q1 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
