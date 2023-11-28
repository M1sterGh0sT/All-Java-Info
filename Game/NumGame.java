package AllInfo.GUI.Game;


import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumGame extends JFrame implements ActionListener {


    // labels
    JLabel labelNum1;
    JLabel labelNum2;

    JLabel userScore;

    JLabel botScore;

    Random random = new Random();


    // create buttons
    JButton playBtn;

    JButton button;

    JButton button2;

    NumGame() {


        // window setting
        this.setSize(750, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.darkGray);




        // font

        Font font = new Font("Helvetica BOLD", Font.BOLD, 25);

        Font font2 = new Font("Helvetica BOLD", Font.BOLD, 20);

        Font font3 = new Font("Helvetica BOLD", Font.BOLD, 15);


        // labels

        JLabel header = new JLabel();
        header.setText("Larger Number Game");
        header.setBounds(245, 0, 300, 100);
        header.setVisible(true);
        header.setForeground(Color.ORANGE);
        header.setFont(font);





        labelNum1 = new JLabel();
        labelNum1.setText("0");
        labelNum1.setBounds(285, 300, 150, 150);
        labelNum1.setVisible(true);
        labelNum1.setForeground(Color.WHITE);
        labelNum1.setFont(font3);



        labelNum2 = new JLabel();
        labelNum2.setText("0");
        labelNum2.setBounds(420, 300, 150, 150);
        labelNum2.setVisible(true);
        labelNum2.setForeground(Color.WHITE);
        labelNum2.setFont(font3);



        userScore = new JLabel();
        userScore.setText(String.format("User Score %d", 0));
        userScore.setBounds(140, 200, 150, 150);
        userScore.setVisible(true);
        userScore.setForeground(Color.WHITE);
        userScore.setFont(font2);



        botScore = new JLabel();
        botScore.setText(String.format("Bot Score %d", 0));
        botScore.setBounds(500, 200, 150, 150);
        botScore.setVisible(true);
        botScore.setForeground(Color.WHITE);
        botScore.setFont(font2);







        // buttons
        button = new JButton();
        button.setBounds(245, 400, 90 ,30);
        button.addActionListener(e -> say());
        button.setText("User");
        button.setFocusable(false);



        button2 = new JButton();
        button2.setBounds(375, 400, 90 ,30);
        button2.addActionListener(e -> say2());
        button2.setText("Bot");
        button2.setFocusable(false);


        playBtn = new JButton();
        playBtn.setBounds(310, 500, 90 ,30);
        playBtn.addActionListener(e -> playFunc());
        playBtn.setText("Play");
        playBtn.setFocusable(false);
        playBtn.setEnabled(false);





        // adding

        this.setResizable(false);
        this.add(header);
        this.add(button);
        this.add(button2);

        this.add(labelNum1);
        this.add(labelNum2);
        this.add(userScore);
        this.add(botScore);

        this.add(playBtn);




    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    static int number1;
    static int number2;

    static int user;

    static int bot;

    static int clickedPlay;


    public void say() {

        clickedPlay++;

        number1 = random.nextInt(10);
        labelNum1.setText("" + number1);
        button.setEnabled(false);

        if (clickedPlay % 2 == 0) {
            playBtn.setEnabled(true);
        }

    }


    public void say2() {

        clickedPlay++;


        number2 = random.nextInt(10);
        labelNum2.setText("" + number2);
        button2.setEnabled(false);

        if (clickedPlay % 2 == 0) {
            playBtn.setEnabled(true);
        }

    }




    public void playFunc() {



        if (number1 > number2) {
            user++;
            userScore.setText(String.format("User Score %d", user));
        } else if (number2 > number1) {
            bot++;
            botScore.setText(String.format("User Score %d", bot));
        } else {
            JOptionPane.showMessageDialog(this, "Draw :)");
        }

        // reset conditions
        if (user == 5) {
            JOptionPane.showMessageDialog(this, "You Won!");
            userScore.setText(String.format("User Score %d", 0));
            botScore.setText(String.format("User Score %d", 0));
            user = 0;
            bot = 0;
            clickedPlay = 0;

        } else if (bot == 5) {
            JOptionPane.showMessageDialog(this, "You Lost :(");
            userScore.setText(String.format("User Score %d", 0));
            botScore.setText(String.format("User Score %d", 0));
            user = 0;
            bot = 0;
            clickedPlay = 0;
        }


        labelNum1.setText("0");
        labelNum2.setText("0");
        button.setEnabled(true);
        button2.setEnabled(true);
        playBtn.setEnabled(false);

    }





}
