
package graficas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Eventos_de_Ventana_2 extends WindowAdapter {
 
    @Override
    public void windowClosed(WindowEvent e) {
        
       System.out.println("Ventana cerrada");
    }
}
