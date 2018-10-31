package controller;

import model.Mahasiswa;
import view.InputGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputController implements ActionListener {
    private InputGUI inputGUI;
    private Mahasiswa mahasiswa;

    // * Menguhubungkan View dengan Model
    public InputController(InputGUI inputGui, Mahasiswa mahasiswa){
        this.inputGUI = inputGui;
        this.mahasiswa = mahasiswa;
        inputGui.getController(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // * Aksi ketika Tombol Oke di klik
        if(e.getSource() == inputGUI.ok){
            System.out.println("MASUK");
                       // * Mahasiswa(String nama, int Nim)
            mahasiswa = new Mahasiswa(inputGUI.jtfNama.getText(),
                    Integer.parseInt(inputGUI.jtfNim.getText()));

            JOptionPane.showMessageDialog(inputGUI, "Nama anda " + mahasiswa.getNama() +
                            " Nim anda " + mahasiswa.getNim());


        }
    }
}
