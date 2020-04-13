import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jontron{

    public static void main(String[] args) {

        String storeDerived[] = {
        "      D E R I V E D",  
       "   /  E         / E  ",
     " /    R       /   R  ",
    "D E R I V E D     I  ",
    "E     V     E     V  ",
    "R     E     R     E  ",
    "I     D E R I V E D  ",
    "V   /       V   /    ",
    "E /         E /      ",
    "D E R I V E D     "}; 

            for (int i = 0; i < storeDerived.length; i++){
                System.out.println(storeDerived[i]);

            }

            System.out.println("\n Jontron has been derived");

            ImageIcon JonImage = new ImageIcon("jon.jpg");
            JOptionPane.showMessageDialog(null, JonImage, null, 0);
            JOptionPane.showMessageDialog(null, "Jon remembers Jaque. ");     


    }


}