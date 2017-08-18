import javax.swing.JOptionPane;

public class Compliment {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "what is your name ?");
System.out.println(name);	
 JOptionPane.showMessageDialog(null, name+ (" you are good at sports"));
JOptionPane.showMessageDialog(null, name+(" you have nice hair"));
}
}