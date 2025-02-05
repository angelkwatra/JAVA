class Club {
    static String clubName = "Tech Club";
    
    String memberName;

    Club(String memberName) {
        this.memberName = memberName;
    }
    
    static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }
    
    void displayMember() {
        System.out.println("Member: " + memberName + ", Club: " + clubName);
    }
}

public class l4q3{
    public static void main(String[] args) {
        Club.displayClubName();
        Club member1 = new Club("Alice");
        Club member2 = new Club("Bob");
        member1.displayMember();
        member2.displayMember();
    }
}
