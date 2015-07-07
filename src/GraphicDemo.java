import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by rajat mittal on 7/7/2015.
 */
public class GraphicDemo implements ActionListener{
    JButton button1 ;
    JButton button2 ;
    JButton button3 ;
    JButton button4 ;
    CirclePainting painting;

    public static void main(String[] args) {
        new GraphicDemo();

    }
public GraphicDemo(){
    JFrame window=new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(400,400);

    JPanel mainpanel =new JPanel();
    window.setContentPane(mainpanel);

    this.button1 =new JButton("button1");
     this.button2 =new JButton("button2");
     this.button3 =new JButton("3button");
     this.button4 =new JButton("4button");

    this.button1.addActionListener(this);
    this.button2.addActionListener(this);
    this.button3.addActionListener(this);
    this.button4.addActionListener(this);

    mainpanel.add(this.button1);
    mainpanel.add(this.button2);
    mainpanel.add(this.button3);
    mainpanel.add(this.button4);

    this.painting =new CirclePainting();
    mainpanel.add(this.painting);
    window.setVisible(true);


}


    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {

    if(e.getSource() == button1){
    System.out.println("change button1");
        this.painting.numOfCircles=1;

    }
    else if(e.getSource()== button2){
    System.out.println("change button2");
        this.painting.numOfCircles=2;
    }
        else if(e.getSource()==button3){
        System.out.println("change button 3 ");
        this.painting.numOfCircles=3;


    }
        else{
        System.out.println("change button 4");
        this.painting.numOfCircles=4;
    }
    }
}
