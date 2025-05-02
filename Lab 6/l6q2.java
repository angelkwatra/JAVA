import security.SecuritySystem;  
public class l6q2 {
    public static void main(String[] args) {
        SecuritySystem security = new SecuritySystem();
        security.authenticateUser("Angel", "password123");
        security.authenticateUser("user", "wrongpass"); 
    }
}
