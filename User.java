import java.util.Scanner;
import java.io.Serializable;

public class User implements Serializable{
    int userId;
    String name;
    String contact;
    String Borrow;
    Scanner input1 = new Scanner(System.in);
    public User(int userId, String name, String contact) {
        this.userId = userId;
        this.name = name;
        this.contact = contact;
    }
    public User(){

    }
    @Override
    public String toString() {
        return userId + "," + name + "," + contact;
    }
    /*void AddUser(){
       
    System.out.print("Enter User ID: ");
    userId = input1.nextInt();
    input1.nextLine(); // Consume the newline character

    System.out.print("Enter Name: ");
   name  = input1.nextLine();

    System.out.print("Enter Contact: ");
    contact = input1.nextLine();
    input1.close();

    
    }
      static User[] adduserToLibrary(int numberOfusers) {
        User[] users = new User[numberOfusers];

        for (int i = 0; i < numberOfusers; i++) {
            users[i] = new User();
            users[i].AddUser();
        }

        return users;
    }*/
}