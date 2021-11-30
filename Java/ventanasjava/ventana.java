package ventanasjava;
import javax.swing.JFrame;
public class ventana extends JFrame{

    private static final long serialVersionUID = 1L;

    public ventana() {
        super("Titulo");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
      public static void main(String[] args) {
        ventana jfv = new ventana();
        jfv.setVisible(true);  
        
      }
  }