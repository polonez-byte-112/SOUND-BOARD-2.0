package Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SoundEffectHandler implements ActionListener {
    MyFrame myFrame;

    public SoundEffectHandler(MyFrame myFrame) {
        this.myFrame = myFrame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "se1":
                myFrame.doSF(".//res/se1.wav");
                break;
            case "se2":
                myFrame.doSF(".//res/se2.wav");
                break;
            case "se3":
                myFrame.doSF(".//res/se3.wav");
                break;
            default:
                break;
        }
    }
}
