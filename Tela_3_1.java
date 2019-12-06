package atividadeiii;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;


public class Tela_3_1 extends JFrame{
    
    public static boolean mTextField = false;
    public static String tipe = "";
    
    public Tela_3_1(){
        AtividadeTela_3_0 m = new AtividadeTela_3_0();
        add(m);
        setSize(400,350);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent event){
                if(mTextField == true){
                    tipe +=event.getKeyChar();
                    repaint();
                }
            }
        });
    }
        
}
