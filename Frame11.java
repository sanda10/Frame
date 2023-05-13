
package frame11;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Frame11 extends JFrame {
    private JLabel l1,l2;private int nr;
    private JTextField t;
    public Frame11(){
        super("Frame11");
        l1=new JLabel ("Ghiceste un numar intre 1 si 1000");
        t=new JTextField(5);
        l2=new JLabel("");
        JPanel p1=new JPanel();
        p1.add(l1);p1.add(t);
        t.addActionListener(new AscultatorButon());
        this.add(p1);
        this.add(l2,BorderLayout.SOUTH);
        nr=(int)(Math.random()*1000+1);
    }
    private class AscultatorButon implements ActionListener {
        private int nrIncercari, n;private StringBuffer sb;
        AscultatorButon(){
            sb=new StringBuffer();
        }
        
        public void actionPerformed(ActionEvent e){
            nrIncercari++;sb.delete(0,sb.length());
            try{
                n=Integer.parseInt(t.getText());
                if(n==nr){
                    sb.append("Bravo!Ai ghicit numarul\n");
                    if(nrIncercari <10){
                        sb.append("ori stii secretul, ori esti norocos");
                    }
                    else if(nrIncercari==10){
                        sb.append("Stii secretul");
                    }
                    else{
                        sb.append("Cam tarziu");
                    }
                    nr=(int)(Math.random()*1000+1);
                }
                else{
                    if(n>nr){
                        sb.append("Nr. e prea mare.Mai incearca!");
                    }    else {
                                sb.append("Numarul e prea mic.Mai incearca!");
                                }
                    }
                    l2.setText(sb.toString());
                }catch(NumberFormatException ex){
                        ex.printStackTrace();
                        }
                t.setText("");
                
                                }
                    }
                        
                        
                
            
        
    

  
    public static void main(String[] args) {
        JFrame f=new Frame11();
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       
}

