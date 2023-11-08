import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class var0323753020 {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    String userInput = JOptionPane.showInputDialog(frame, "What is your name?",
        "Question 1", JOptionPane.QUESTION_MESSAGE);
    if (userInput != null) {
      System.out.println("User entered: " + userInput);
    } else {
      System.out.println("User canceled the input.");
    }
  }
}