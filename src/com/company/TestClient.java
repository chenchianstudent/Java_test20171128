package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestClient extends JFrame {
    private Container cp;
    private JButton btstart = new JButton("Connect");
    private JButton btstop = new JButton("Stop");
    private JButton btexit = new JButton("Exit");
    private JButton btsend = new JButton("Send");
    private JButton bts[] = new JButton[9];
    private int n[] = new int[9];
    private TextField tf1 = new TextField();
    private TextField tf2 = new TextField("1723");
    private JTextArea textlab = new JTextArea("poi");
    private JLabel labIP = new JLabel("Server IP:");
    private JLabel labwebsite = new JLabel("10.51.3.69");
    private JLabel labport = new JLabel("Port:");
    private JPanel panl1 = new JPanel(new GridLayout(7, 1, 5, 5));
    private JPanel panl2 = new JPanel(new BorderLayout(2,2));
    private JPanel panl3 = new JPanel(new GridLayout(3, 3, 5, 5));
    private int a, b, c, d, i, f, g, h;
    public TestClient() {
        init();
    }

    private void init() {
        this.setTitle("Client");
        this.setBounds(200, 300, 500, 400);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(5, 5));
        cp.add(panl3, BorderLayout.CENTER);
        for (int i = 0; i < 9; i++) {
            bts[i] = new JButton("");
            bts[i].setBackground(new Color(74, 250, 255));
            bts[i].setEnabled(false);
            panl3.add(bts[i]);
        }
        cp.add(panl2, BorderLayout.SOUTH);
        panl2.setSize(400,30);
        panl2.add(tf1,BorderLayout.CENTER);
        panl2.add(btsend,BorderLayout.EAST);
        cp.add(textlab, BorderLayout.WEST);
        cp.add(panl1, BorderLayout.EAST);
        panl1.add(labIP);
        panl1.add(labwebsite);
        panl1.add(labport);
        panl1.add(tf2);
        panl1.add(btstart);
        panl1.add(btstop);
        panl1.add(btexit);
        textlab.setEnabled(false);
        btexit.setBackground(new Color(255, 161, 212));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textlab.setPreferredSize(new Dimension(80, 100));
        textlab.setLineWrap(true);
        btexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btstart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        a = n[0] + n[1] + n[2];
        b = n[3] + n[4] + n[5];
        c = n[6] + n[7] + n[8];
        d = n[0] + n[3] + n[6];
        i = n[1] + n[4] + n[7];
        f = n[2] + n[5] + n[8];
        g = n[0] + n[4] + n[8];
        h = n[2] + n[4] + n[6];



    }
}

