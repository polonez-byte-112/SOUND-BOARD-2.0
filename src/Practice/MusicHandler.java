package Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicHandler implements ActionListener {


    MyFrame myFrame;

    public MusicHandler(MyFrame myFrame) {
        this.myFrame = myFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "m1":
                myFrame.doM(".//res/m1.wav");
                break;
            case "m2":
                myFrame.doM(".//res/m2.wav");
                break;
            case "m3":
                myFrame.doM(".//res/m3.wav");
                break;
            default:
                break;
        }
    }
}
