package com.example.javafxprojects.SWING.TIK_TAK_TOE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;
//import java.util.jar.JarEntry;

public class tik_tak_toe implements ActionListener {
    int draw=0;
    Random random = new Random();
    JFrame frame = new JFrame("TIK TAK TOE");
    JPanel title_panel = new JPanel();
    JPanel button_panel= new JPanel();
    JButton[] button = new JButton[9];
    JTextField text = new JTextField();
    boolean player1_turn;
    tik_tak_toe(){
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.getContentPane().setBackground(new Color(26,24,19));
        frame.setLayout(new BorderLayout());


        text.setText("TIK TAK TOE");
        text.setBackground(new Color(26,24,19));
        text.setForeground(new Color(255,255,255));
        text.setFont(new Font("Ink Free",Font.BOLD,75));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setFocusable(false);
        text.setOpaque(true);
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,500,75);
//-----------------------------------------------------------------------
        // creating the buttons

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));
        button_panel.setBounds(0,75,500,650);
        for(int j=0;j<9;j++) {
//            System.out.println("enter into the loop");
            button[j] = new JButton(" ");
            button_panel.add(button[j]);
            button[j].setBackground(new Color(26,24,14));
            button[j].setFont(new Font("MV Bola", Font.BOLD, 120));
            button[j].setFocusable(false);
            button[j].setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
            button[j].addActionListener(this);
        }
        title_panel.add(text);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel,BorderLayout.SOUTH);
        if(draw==9){
            text.setText("DRAW");
        }
        firstturn();
        frame.setVisible(true);
    }

    public void firstturn(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if(random.nextInt(2)==0){
            player1_turn = true;
            text.setText("X turn");
        }
        else{
            player1_turn = false;
            text.setText("O turn");
        }
    }
    public void check(){
        if(Objects.equals(button[0].getText(), "X")&&
                Objects.equals(button[1].getText(), "X")&&
                Objects.equals(button[2].getText(), "X")
        ){
            System.out.println("enter into the 0,1,2");
            xwins(0,1,2);
        }
        if(Objects.equals(button[3].getText(), "X")&&
                Objects.equals(button[4].getText(), "X")&&
                Objects.equals(button[5].getText(), "X")
        ){
            xwins(3,4,5);
        }
        if(Objects.equals(button[6].getText(), "X")&&
                Objects.equals(button[7].getText(), "X")&&
                Objects.equals(button[8].getText(), "X")
        ){
            xwins(6,7,8);
        }
        if(Objects.equals(button[0].getText(), "X")&&
                Objects.equals(button[4].getText(), "X")&&
                Objects.equals(button[8].getText(), "X")
        ){
            xwins(0,4,8);
        }

        if(Objects.equals(button[2].getText(), "X")&&
                Objects.equals(button[4].getText(), "X")&&
                Objects.equals(button[6].getText(), "X")
        ){
            xwins(2,4,6);
        }
        if(Objects.equals(button[2].getText(), "X")&&
                Objects.equals(button[5].getText(), "X")&&
                Objects.equals(button[8].getText(), "X")
        ){
            xwins(2,5,8);
        }
        if(Objects.equals(button[0].getText(), "X")&&
                Objects.equals(button[3].getText(), "X")&&
                Objects.equals(button[6].getText(), "X")
        ){
            xwins(0,3,6);
        }
        if(Objects.equals(button[1].getText(), "X")&&
                Objects.equals(button[4].getText(), "X")&&
                Objects.equals(button[7].getText(), "X")
        ){
            xwins(2,4,6);
        }
//        ?--------------- o wins -------------------
        if(Objects.equals(button[0].getText(), "O")&&
                Objects.equals(button[1].getText(), "O")&&
                Objects.equals(button[2].getText(), "O")
        ){
            owins(0,1,2);
        }
        if(Objects.equals(button[3].getText(), "O")&&
                Objects.equals(button[4].getText(), "O")&&
                Objects.equals(button[5].getText(), "O")
        ){
            owins(3,4,5);
        }
        if(Objects.equals(button[6].getText(), "O")&&
                Objects.equals(button[7].getText(), "O")&&
                Objects.equals(button[8].getText(), "O")
        ){
            owins(6,7,8);
        }
        if(Objects.equals(button[0].getText(), "O")&&
                Objects.equals(button[4].getText(), "O")&&
                Objects.equals(button[8].getText(), "O")
        ){
            owins(0,4,8);
        }
        if(Objects.equals(button[2].getText(), "O")&&
                Objects.equals(button[4].getText(), "O")&&
                Objects.equals(button[6].getText(), "O")
        ){
            owins(2,4,6);
        }
        if(Objects.equals(button[2].getText(), "O")&&
                Objects.equals(button[5].getText(), "O")&&
                Objects.equals(button[8].getText(), "O")
        ){
            xwins(2,5,8);
        }
        if(Objects.equals(button[0].getText(), "O")&&
                Objects.equals(button[3].getText(), "O")&&
                Objects.equals(button[6].getText(), "O")
        ){
            xwins(0,3,6);
        }
        if(Objects.equals(button[1].getText(), "O")&&
                Objects.equals(button[4].getText(), "O")&&
                Objects.equals(button[7].getText(), "O")
        ){
            xwins(2,4,6);
        }

    }

public void xwins(int a ,int b,int c){
    button[a].setBackground(Color.green);
    button[b].setBackground(Color.green);
    button[c].setBackground(Color.green);
    for(int i=0;i<9;i++){
        button[i].setEnabled(false);
    }
    text.setText("X WINS");
}
public void owins(int a,int b,int c){
    button[a].setBackground(Color.green);
    button[b].setBackground(Color.green);
    button[c].setBackground(Color.green);
    for(int i=0;i<9;i++){
        button[i].setEnabled(false);
    }
    text.setText("O WINS");
}



    public static void main(String[] args) {
        new tik_tak_toe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<9;i++){
            if(e.getSource()==button[i]){
                if(player1_turn){
                    if(Objects.equals(button[i].getText(), " ")){
                        button[i].setForeground(new Color(255,255,255));
                        button[i].setText("X");
                        player1_turn = false;
                        text.setText("O turn");
                        if(i==8){
                            text.setText("DRAW");
                        }
                        check();
                    }
                }
                else{
                    if(Objects.equals(button[i].getText(), " ")){
                        button[i].setForeground(new Color(255,255,255));
                        button[i].setText("O");
                        player1_turn = true;
                        text.setText("X turn");
                        if(i==8){
                            text.setText("DRAW");
                        }
                        check();
                    }
                }
            }
            draw++;
        }
    }


}
