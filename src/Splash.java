package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {


    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/img1.jpg")); //change image
        Image i2 = i1.getImage().getScaledInstance(1200,675, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image .setBounds(0,0,1170,650);
        add(image);



        setSize(1170,650); //size of layout
        setLocation(200,50); //x=position from right y=position from top
        setLayout(null);
        setVisible(true); //to display

        try{
            Thread.sleep(5000); //frame closes after 5sec
            setVisible(false);
            new Login();

        }catch(Exception e)
        {
            e.printStackTrace();

        }



    }




    public static void main(String[] args){
        new Splash();


    }
}
