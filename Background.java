import java.awt.*;


public class Background {

    public static void drawSky(Graphics g){
        g.setColor(new Color(128,200,255));
        g.fillRect(0,0,1000,325);
    }

    public static void drawGround(Graphics g){
        g.setColor(new Color(0,90,0));
        g.fillRect(0,325,1000,650);
    }


}



