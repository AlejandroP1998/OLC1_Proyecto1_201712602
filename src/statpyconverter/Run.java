package statpyconverter;

public class Run {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                interfaz frame = new interfaz();
                frame.setVisible(true);
            }
        });
    }

}
