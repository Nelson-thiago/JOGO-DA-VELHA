package classes;

import java.awt.Font;
import java.awt.GraphicsEnvironment;


public class FontGame {
    public static void addFont(String fontPath) {
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, FontGame.class.getResourceAsStream(fontPath));
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(customFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
