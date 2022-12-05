import java.awt.*;
import java.applet.*;

//class that will draw my project
public class DrawingPoint extends Applet {
    public void paint (Graphics g){

        Background.drawSky(g);
        Background.drawGround(g);

        Tower.drawTower(g);
        Tower.drawWindow(g);
        Tower.drawDoor(g);
        Tower.drawDoorKnob(g);

        Sky.drawSun(g);
        Sky.drawClouds(g);
        Sky.drawBirds(g);




    }


}
