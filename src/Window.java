import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        setBounds(20,21,800,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("GUI");
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        addVidgets(panel);
    }

    void addVidgets(JPanel panel){

    }
}
