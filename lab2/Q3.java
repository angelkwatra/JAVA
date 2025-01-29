public class Q3 {

    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public int calculateArea(int side) {
        return side * side;
    }


    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Q3 calculator = new Q3();

       
        System.out.println("Area of Rectangle: " + calculator.calculateArea(10, 5));
        System.out.println("Area of Square: " + calculator.calculateArea(4) );
        System.out.println("Area of Circle: " + calculator.calculateArea(3.0f) );
        System.out.println("Area of Triangle: " + calculator.calculateArea(6.0, 8.0));
    }
}
