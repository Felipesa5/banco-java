import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        OperacionesBanco op = new OperacionesBanco();
        int seguir;
        do {
            op.menuOpciones();
            seguir = JOptionPane.showConfirmDialog(null, "Desea continuar en el banco?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (seguir == JOptionPane.YES_OPTION);

        }

}
