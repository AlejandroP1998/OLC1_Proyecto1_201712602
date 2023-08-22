package statpyconverter;

public class StatPyConverter {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                interfaz frame = new interfaz();
                frame.setVisible(true);
            }
        });
    }

}
