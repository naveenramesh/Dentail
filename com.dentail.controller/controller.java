import java.util.Scanner;
/**
 * controller
 */
public class controller {
    static User user = new User();
    public static void main(String[] args) {
        String name,Address,phone;
        Scanner in = new Scanner(System.in);
        System.out.println("name");
        name = in.nextLine();
        System.out.println("Address");
        Address = in.nextLine();
        System.out.println("Phone");
        phone=in.nextLine();
        newUser add = new newUser();
        user = add.setNewuser(name, Address, phone);
        //System.out.println(user);
        System.out.println(add.setNewuser(name, Address, phone).getAddress());
        
        
        
        
    }
   
}