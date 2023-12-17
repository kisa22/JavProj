import java.util.Scanner;
import java.util.UUID;

abstract class Display {

  abstract void notification();

  void showToken(UUID token) {
    System.out.println("token generated: " + token);
  }
}

class User extends Display {
  protected String username;
  protected String password;

  protected UUID token;

  void tokenCreation() {
    token = UUID.randomUUID();
  }

  void register(String username, String password) {
    this.username = username;
    this.password = password;
    tokenCreation();
    System.out.println("username: " + this.username);
    System.out.println("password: " + this.password);
  }

  @Override
  void notification() {
    System.out.println("User created by User");
    showToken(this.token);
  }
}

class Admin extends User {
  final String role = "admin";

  @Override
  void notification() {
    System.out.println("User created by " + role);
    showToken(this.token);
  }
}

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("REGISTRASI");

    System.out.println("Masukkan Username");
    String username = input.nextLine();

    System.out.println("Masukkan Password");
    String password = input.nextLine();

    if (username.equals("van") && password.equals("123")) {
      System.out.println("Kamu bau hehe");
    } else {
      System.out.println("Kamu Ganteng");
    }

    User user = new User();
    user.register(username, password);
    user.notification();
  }
}