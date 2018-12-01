import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Bitmap {

    public Path path;
    public BufferedImage imageData;


    public Bitmap(Path imagePath){
        this.path = imagePath;

        BufferedImage img = null;
        try{
            img = ImageIO.read(imagePath.toFile());
            this.imageData = img;
        } catch
            (IOException e){

            }
        }

    public void flipHorizontally() {

    }

    public boolean save(Path savePath){

        try{
            ImageIO.write(imageData, "bmp", savePath.toFile());

        } catch (IOException e){

        }


        return false;
    }
}
