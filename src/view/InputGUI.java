package view;

import controller.InputController;

import javax.swing.*;

public class InputGUI extends JFrame {
    private InputController inputController;

    public JLabel jlNama = new JLabel("Nama");
    public JLabel jlNim = new JLabel("NIM");
    public JTextField jtfNama = new JTextField(20);
    public JTextField jtfNim = new JTextField(20);
    public JButton ok = new JButton("OK");

    public InputGUI(){

        setTitle("Mahasiswa");
        jlNama.setBounds(32,32,100,100);
        jlNim.setBounds(48,148,100,100);
        jtfNama.setBounds(182,32,300,50);
        jtfNim.setBounds(198,148,300,50);
        ok.setBounds(300,200,100,100);
        setLayout(null);
        add(jlNama);
        add(jlNim);
        add(jtfNama);
        add(jtfNim);
        add(ok);
        setSize(900,300);

    }

    public void getController(InputController inputController){
        this.inputController = inputController;
        ok.addActionListener(inputController);
        // ! ok.addActionListener(this);
    }


}
