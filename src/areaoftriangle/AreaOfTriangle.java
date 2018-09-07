/*
ZhiBo Chen
2018/9/7
*/
package areaoftriangle;

import javax.swing.JOptionPane;

public class AreaOfTriangle {

    
    public static void main(String[] args) {
       //user input
       String x = JOptionPane.showInputDialog("Enter a length");
       String y = JOptionPane.showInputDialog("Enter a length");
       String z = JOptionPane.showInputDialog("Enter a length");
       
       //convert string to double
       double lengthX = Double.parseDouble(x);
       double lengthY = Double.parseDouble(y);
       double lengthZ = Double.parseDouble(z);
       //calculate s
       double s = (lengthX+lengthY+lengthZ)/2;
       //calculate area
       double area= Math.sqrt(s*(s-lengthX)*(s-lengthY)*(s-lengthZ));
      //output
       JOptionPane.showMessageDialog(null, "The area of the truangle is "+area);
       
    }
    
}
