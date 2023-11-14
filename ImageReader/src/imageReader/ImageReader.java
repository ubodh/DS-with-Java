package imageReader;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageReader {
	
   public static void main(String args[])throws IOException {
      int width = 0;
      int height = 0;
      File file = null;
      
      BufferedImage image = null;

      //read image file
      try{
         file = new File("Pictures");
         image = ImageIO.read(file);
         width = image.getWidth();
         height = image.getHeight();
         System.out.println("Image width: "+width);
         System.out.println("Image height: "+height);
      }catch(IOException e){
         System.out.println("Error: "+e);
      }
   }
}

