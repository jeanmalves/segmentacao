
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Imagem 
{
    private BufferedImage bufferImage;
    private String path;
    private int[][] data;
    
    /**
     * Load the image.
     * @param filePath
     * @throws IOException 
     */
    public Imagem(String filePath) throws IOException
    {
        setPath(filePath);
        bufferImage = ImageIO.read(new File(path));
    }
    
    /**
     * New image is created.
     * @param width
     * @param height
     * @param type  = GRAY or RGB
     */
    public Imagem(int width, int height, String type)
    {
        int imageType = 0;
        if ("GRAY".equals(type)) {
            imageType = BufferedImage.TYPE_BYTE_GRAY;
        }
        
        if ("RGB".equals(type)) {
            imageType = BufferedImage.TYPE_INT_RGB;
        }
        
        bufferImage = new BufferedImage(width, height, imageType);
    }

    private void setPath(String path) 
    {
        if (path != null) {
            this.path = path;
        }
    }

    public void setData() 
    {
        for (int y = 0; y < bufferImage.getHeight(); y++){   
            for (int x = 0; x < bufferImage.getWidth(); x++) {
               // Color pixel = new Color(bufferImage.getRGB(x, y));
               // int cor = pixel.getRed() + pixel.getGreen() + pixel.getBlue();
                data[y][x] = bufferImage.getRGB(x, y) & 0xFF;
            }
        }
    }

//    public BufferedImage getBufferImage()
//    {
//        return bufferImage;
//    }

    public int getWidth() 
    {
        if (bufferImage != null) {
            return bufferImage.getWidth();
        }
        return 0;
    }

    public int getHeight()
    {
        if (bufferImage != null) {
            return bufferImage.getHeight();
        }
        return 0;
    }

    public String getPath()
    {
        return path;
    }

    public int getImageType() 
    {
        if (bufferImage != null) {
            return bufferImage.getType();
        }
        return 0;
    }

    public int[][] getData() {
        return data;
    }
    
}
