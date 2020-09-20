
import com.udistrital.informatica.view.MainWindow;

/**
 * The App run Class
 * @author angelicaquevedo
 * 12/09/2020
 */
public class App {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
}
