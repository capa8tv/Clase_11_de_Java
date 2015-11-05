package graficas;
import java.awt.*;
import javax.swing.*;

public class Marco1 extends JFrame 
{
    
    public Marco1()
    {
       
        
    }
    public void getApp()
    {
        //setSize(1024,768);
        //setLocation(200,50);
        setBounds(200,50,1024,768);
        setVisible(true);
        setTitle("..:: Hola título desde www.capa8.tv Ñandú ::..");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void getAppCentrada()
    {
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla=mipantalla.getScreenSize();
        setSize(tamanoPantalla.width/2,tamanoPantalla.height/2);
        setLocation(tamanoPantalla.width/4,tamanoPantalla.height/4);
        setVisible(true);
        
        setTitle("..:: Hola título desde www.capa8.tv Ñandú ::..");
        setResizable(true);
        
        addWindowListener(new Eventos_de_Ventana_2());
       
        
        Image icono=mipantalla.getImage("src/images/cesar.png");
        setIconImage(icono);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
