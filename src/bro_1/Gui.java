package bro_1;

import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello "+name+" how are you");

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "hello "+age+" how are you");

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null, "holle shit you'r "+height+" !!!, you are fucking tall");


    }
}
