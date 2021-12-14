package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TikTakToe extends JFrame {
    private JPanel pMain;
    private JButton bKnopf3;
    private JButton bKnopf6;
    private JButton bKnopf9;
    private JButton bKnopf7;
    private JButton bKnopf5;
    private JButton bKnopf2;
    private JButton bKnopf8;
    private JButton bKnopf4;
    private JButton bKnopf1;
    private JButton bReset;
    private JButton tAusgabe;
    private JButton bZufallsgegner;

    static int[] felder = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
    boolean zufallsgegner = false;
    int spieler = 0;




    public TikTakToe(){


        bZufallsgegner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zufallsgegner == false){
                    zufallsgegner = true;
                    bZufallsgegner.setText("Zufalls Gegner: AN");
                }else{
                    zufallsgegner = false;
                    bZufallsgegner.setText("Zufalls Gegner: AUS");
                }
            }
        });

        bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < felder.length; i++){
                    felder[i] = -1;
                }
                bKnopf1.setText("empty");
                bKnopf2.setText("empty");
                bKnopf3.setText("empty");
                bKnopf4.setText("empty");
                bKnopf5.setText("empty");
                bKnopf6.setText("empty");
                bKnopf7.setText("empty");
                bKnopf8.setText("empty");
                bKnopf9.setText("empty");
                tAusgabe.setText("");
            }
        });

        bKnopf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[0] == -1){
                    if(spieler == 0){
                        bKnopf1.setText("X");
                    }else if(spieler == 1){
                        bKnopf1.setText("O");
                    }
                    felder[0] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[1] == -1){
                    if(spieler == 0){
                        bKnopf2.setText("X");
                    }else if(spieler == 1){
                        bKnopf2.setText("O");
                    }
                    felder[1] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[2] == -1){
                    if(spieler == 0){
                        bKnopf3.setText("X");
                    }else if(spieler == 1){
                        bKnopf3.setText("O");
                    }
                    felder[2] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[3] == -1){
                    if(spieler == 0){
                        bKnopf4.setText("X");
                    }else if(spieler == 1){
                        bKnopf4.setText("O");
                    }
                    felder[3] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[4] == -1){
                    if(spieler == 0){
                        bKnopf5.setText("X");
                    }else if(spieler == 1){
                        bKnopf5.setText("O");
                    }
                    felder[4] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[5] == -1){
                    if(spieler == 0){
                        bKnopf6.setText("X");
                    }else if(spieler == 1){
                        bKnopf6.setText("O");
                    }
                    felder[5] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[6] == -1){
                    if(spieler == 0){
                        bKnopf7.setText("X");
                    }else if(spieler == 1){
                        bKnopf7.setText("O");
                    }
                    felder[6] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[7] == -1){
                    if(spieler == 0){
                        bKnopf8.setText("X");
                    }else if(spieler == 1){
                        bKnopf8.setText("O");
                    }
                    felder[7] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        bKnopf9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(felder[8] == -1){
                    if(spieler == 0){
                        bKnopf9.setText("X");
                    }else if(spieler == 1){
                        bKnopf9.setText("O");
                    }
                    felder[8] = 1;
                    nächsterZug();
                }else{
                    tAusgabe.setText("Du musst ein anderes Feld auswählen!");
                }
            }
        });

        setTitle("Tik Tak Toe");
        add(pMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

    }

    public void kiZug(){
        boolean freiesFeld = false;
        int freiesFeldFragezeichen = 0;
        for(int i = 0; i < felder.length; i++){
            if(felder[i] == -1){
                freiesFeldFragezeichen++;
            }
        }
        if(freiesFeldFragezeichen > 0){
            freiesFeld = true;
        }
        if(freiesFeld == true){
            boolean feldGefunden = false;
            while(feldGefunden == false){
                int x = (int)(Math.random()* (8 + 1));
                if(felder[x] == -1){
                    feldGefunden = true;
                    felder[x] = 2;

                    if(x == 0){
                        bKnopf1.setText("X");
                    }else if(x == 1){
                        bKnopf2.setText("X");
                    }else if(x == 2){
                        bKnopf3.setText("X");
                    }else if(x == 3){
                        bKnopf4.setText("X");
                    }else if(x == 4){
                        bKnopf5.setText("X");
                    }else if(x == 5){
                        bKnopf6.setText("X");
                    }else if(x == 6){
                        bKnopf7.setText("X");
                    }else if(x == 7){
                        bKnopf8.setText("X");
                    }else if(x == 8){
                        bKnopf9.setText("X");
                    }
                }
            }
        }



    }

    public void nächsterZug(){
        if(zufallsgegner == true){
            kiZug();
        }else if(zufallsgegner == false){
            if(spieler == 0){
                spieler = 1;
            }else if(spieler == 1){
                spieler = 0;
            }
        }
    }



    public static void main(String[] args) {
        new TikTakToe();
    }
}


// immer class + extends JFrame sonst gehen so Befehle wie add() nicht
