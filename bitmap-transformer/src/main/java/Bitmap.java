import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 * "getRGB"
 *      public int getRGB(int x, int y)
 *
 *      Returns an integer pixel in the default RGB color model
 *
 *      x - the X coordinate of the pixel from which to get the pixel in the default RGB color model and sRGB color space
 *      y - the Y coordinate of the pixel from which to get the pixel in the default RGB color model and sRGB color space
 *
 *
 *
 *  "setRGB"
 *      public void setRGB(int x, int y, int rgb)
 *
 *      Sets a pixel in this BufferedImage to the specified RGB value. The pixel is assumed to be in the default RGB color model
 *
 *      x - the X coordinate of the pixel to set
 *      y - the Y coordinate of the pixel to set
 *      rgb - the RGB value
 *
 * "setRGB"
 *      Sets an array of integer pixels in the default RGB color model\
 *
 *      public void setRGB(int startX, int startY, int w, int h, int[] rgbArray. int offset, int scansize)
 *
 *      startX - the starting X coordinate
 *      startY - the starting Y coordinate
 *      w - width of the region
 *      h - height of the region
 *      rgbArray - the rgb pixels
 *      offset - offset into the rgbArray
 *      scansize - scanline stride for the rgbArray
 *
 * ".read()"
 *      public static BufferedImage read(File input)
 *          throws IOException
 *
 *      returns a BufferedImage as the result of decoding a supplied InputStream with an ImageReader chosen automatically from among those currently registered
 *
 *      Parameters:
 *          input - a File to read from
 *      Returns:
 *          a BufferedImage containing the decoded contents of the input, or null
 *
 *
 */
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



    public void flipVertically() {


        for ( int i = 0; i < this.imageData.getHeight(); i++)
            for (int j = 0; j < this.imageData.getWidth() / 2; j++) {
                int temp = this.imageData.getRGB(i, j);
                this.imageData.setRGB(i, j, this.imageData.getRGB(i, this.imageData.getWidth() - j - 1));
                this.imageData.setRGB(i, this.imageData.getWidth() - j - 1, temp);
            }


    }

    public void flipHorizontally() {



        for ( int i = 0; i < this.imageData.getHeight() / 2; i++)
            for (int j = 0; j < this.imageData.getWidth(); j++) {
                int temp = this.imageData.getRGB(i, j);
                this.imageData.setRGB(i, j, this.imageData.getRGB(this.imageData.getHeight() - i - 1, j));
                this.imageData.setRGB(this.imageData.getWidth() - i - 1,j , temp);
            }


    }

    public int[] darken() {
        for (int i = 0; i < this.imageData.getHeight(); i++) {
            for (int j = 0; j < this.imageData.getWidth(); j++) {
                int pixel = this.imageData.getRGB(i, j);
                int alpha = (pixel >> 24) & 0xff;
                int red = (pixel >> 16) & 0xff + 150;
                int green = (pixel >> 8) & 0xff + 150;
                int blue = pixel & 0xff + 150;
                pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
                this.imageData.setRGB(i, j, pixel);
            }
        }
        int[] bitmapDimensions = {this.imageData.getHeight(), this.imageData.getWidth()};

        return bitmapDimensions;
    }


    public boolean save(Path savePath){

        try{
            ImageIO.write(imageData, "bmp", savePath.toFile());

        } catch (IOException e){
            System.out.println(e);
        }


        return false;
    }
}
