import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gamePlay=new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setResizable(false);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
        obj.add(gamePlay);
    }
}
