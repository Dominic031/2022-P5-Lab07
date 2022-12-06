import java.awt.*;

public class Tower {
    public static void drawTower(Graphics g){
        g.setColor(new Color(50,50,50));
        g.fillRect(400,25,250,500);
    }
    public static void drawWindow(Graphics g){
        g.setColor(new Color(128,200,200));
        g.fillRect(400,50,250,25);
        g.fillRect(400,100,250,50);
        g.fillRect(400,250,250,50);
        g.fillRect(400,175,250,50);
        g.fillRect(400,325,250,50);
        g.fillRect(400,325,250,50);

    }

    public static void drawDoor(Graphics g){
        g.setColor(new Color(245,245,240));
        g.fillRect(500,425,50,100);
    }

    public static void drawDoorKnob(Graphics g){
        g.setColor(new Color(191,167,133));
        g.fillOval(535,465,10,10);

    }


}










