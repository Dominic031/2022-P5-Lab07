import java.awt.*;


public class BgAdd {
    public static void drawSun(Graphics g){
        g.setColor(new Color(255,233,0));
        g.fillOval(875,25,100,100);
    }
    public static void drawClouds(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(675,100,200,100);
        g.fillOval(25,25,200,100);
        g.fillOval(200,100,150,75);

    }
    public static void drawTree(Graphics g){
        g.setColor(new Color(92,64,51));
        g.fillRect(200,300,50,200);
        g.setColor(new Color(0,30,0));
        g.fillOval(140,200,175,175);
    }
}
