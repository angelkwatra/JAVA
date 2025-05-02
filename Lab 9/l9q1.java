import java.util.ArrayList;

public class l9q1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Autoboxing
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (Integer num : numbers) {
            int n = num; // Unboxing
            System.out.println(n + (isPrime(n) ? " is Prime" : " is not Prime"));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
