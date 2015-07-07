import java.awt.*;

/**
 * Created by rajat mittal on 7/7/2015.
 */
public class CirclePainting extends Canvas {


    public Color arcColor =Color.white;
    public Painting(){
        setSize(300,300);

    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(arcColor);

        g.fillArc(0,0,150,150,0,360);
    }
}
