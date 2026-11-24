import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SimpleResize {
    public static void main(String[] args) {
        try {
            BufferedImage originalImage = ImageIO.read(new File("photo.jpg")); // Rename your image

            if (originalImage == null) {
                System.out.println("❌ Could not read image.");
                return;
            }

            Image tmp = originalImage.getScaledInstance(600, 600, Image.SCALE_SMOOTH);
            BufferedImage resized = new BufferedImage(600, 600, BufferedImage.TYPE_INT_RGB);

            Graphics2D g2d = resized.createGraphics();
            g2d.drawImage(tmp, 0, 0, null);
            g2d.dispose();

            ImageIO.write(resized, "jpg", new File("passport_size_final.jpg"));
            System.out.println("✅ Image resized and saved as 'passport_size_final.jpg'");
        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
