package atividadeiii;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.EventQueue;
import javax.swing.JPanel;

public class AtividadeTela_3_0 extends JPanel {

    public int box = 0;
    
    public AtividadeTela_3_0(){
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evento){
                if((evento.getX()> 40 && evento.getX()< 340)&&(evento.getY()> 30 && evento.getY()<60)){
                    Tela_3_1.mTextField = true; 
                }
                else{
                    Tela_3_1.mTextField = false;
                }
                if((evento.getX()> 40 && evento.getX()< 80)&&(evento.getY()> 80 && evento.getY()<110)){
                    box++;
                }
            }
        });
    }
    
 
    @Override
    public void paint(Graphics graph){
        graph.drawRect(40,30,300,30);
        graph.drawString(Tela_3_1.tipe, 50, 48);
        graph.drawRect(40,80,30,30);
        graph.drawString("CheckBox",80,100);
        if(box%2==1){
            graph.drawString("☑",50,100);
            repaint();
        }
        else{
            graph.drawString(" ",50,100);
            repaint();
        }
        graph.drawRect(180,200,80,30);
        graph.drawString("Submit", 200,220);
    }

    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Tela_3_1().setVisible(true);
            }
        });
    }
    
}
