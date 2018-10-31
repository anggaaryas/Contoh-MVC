import controller.InputController;
import model.Mahasiswa;
import view.InputGUI;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        InputGUI inputGUI = new InputGUI();
        InputController controller = new InputController(inputGUI, mahasiswa);
        inputGUI.setVisible(true);
    }
}
