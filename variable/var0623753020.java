import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Program {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    String userInput = JOptionPane.showInputDialog(frame, "What Is Your Name", "Question 1",
        JOptionPane.QUESTION_MESSAGE);
    if (userInput != null) {
      System.out.println("You entered: " + userInput);
    } else {
      System.out.println("You canceled the input");
    }
  }
}
