package AllInfo.Basics;

import javax.swing.JOptionPane;

public class GUIJava {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Nickname");

        long points = Long.parseLong(JOptionPane.showInputDialog("Points"));

        String hero = JOptionPane.showInputDialog("Your Hero");

        String result = "Nickname: " + name + "\nPoints: " + points + "\nHero: " + hero;

        JOptionPane.showMessageDialog(null, result);

    }

}
