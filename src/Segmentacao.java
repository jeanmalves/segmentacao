
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Segmentacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Imagem img = new Imagem("./src/caracteres.bmp");
            
        } catch (IOException ex) {
            Logger.getLogger(Segmentacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
