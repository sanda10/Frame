
package frame12;
import javax.swing.*;
import java.awt.*;



public class Frame12 extends JFrame{

    private JRadioButton b1,b2, b3, b4;
    private JTextField t;
    public Frame12(){
        super("Frame12");
        t=new JTextField("Modificarea stilului unui font");
        ButtonGroup bg=new ButtonGroup();
        b1=new JRadioButton ("Normal",true);bg.add(b1);
        b2=new JRadioButton ("Italic",false);bg.add(b2);
        b3=new JRadioButton ("Bold",false);bg.add(b3);
        b4=new JRadioButton("Bold/italic",false);bg.add(b4);
        b1.addItemListener(e->{
t.setFont(t.getFont().deriveFont(Font.PLAIN,t.getFont().getSize()));
        });
    b2.addItemListener(e->{
t.setFont(getFont().deriveFont(Font.ITALIC,t.getFont().getSize()));
    });
b3.addItemListener(e->{
t.setFont(t.getFont().deriveFont(Font.BOLD,t.getFont().getSize()));
});
b4.addItemListener(e->{
t.setFont(getFont().deriveFont(Font.BOLD+Font.ITALIC,t.getFont().getSize()));
});
add(t);
JPanel p=new JPanel();
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
add(p,BorderLayout.SOUTH);
    }

            
        
        
    
    public static void main(String[] args) {
    JFrame f=new Frame12();
    f.setSize(300,100);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
