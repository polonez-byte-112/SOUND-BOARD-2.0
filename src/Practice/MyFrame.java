package Practice;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	
	 static final long serialVersionUID = 6L;

    Color coolerDark = new Color(81, 81, 81);
    SoundEffectHandler seh = new SoundEffectHandler(this);
    MusicHandler mh = new MusicHandler(this);
    Music music = new Music();
    JPanel buttonSoundEffectPanel, buttonMusicPanel, photoPanel;
    JButton buttonSoundEffect1, buttonSoundEffect2, buttonSoundEffect3, buttonMusic1, buttonMusic2, buttonMusic3;
    JLabel photoLabel;
    ImageIcon icon;
    String turnOnOff = "off";
    private final SoundEffect soundEffect = new SoundEffect();


    MyFrame() {
        this.setTitle("Sound And Music");
        this.getContentPane().setBackground(Color.darkGray);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);


        makeOwnLayout();
        this.setVisible(true);
        doSF(".//res/wczytuje.wav");

    }

    void doSF(String audioDirect) {

        soundEffect.setEffect(audioDirect);
        soundEffect.play();
    }

    void doM(String audioDirect) {

        if (turnOnOff.equals("off")) {
            music.setEffect(audioDirect);
            music.play();
            turnOnOff = "on";
        } else if (turnOnOff.equals("on")) {
            turnOnOff = "off";
            music.stop();
        } else {
        }

    }


    private void makeOwnLayout() {

        photoPanel = new JPanel();
        photoPanel.setBounds(50, 30, 500, 250);
        photoPanel.setBackground(Color.darkGray);
        this.add(photoPanel);

        photoLabel = new JLabel();
        icon = new ImageIcon(".//res//twierdza.jpg");
        photoLabel.setIcon(icon);
        photoPanel.add(photoLabel);

        buttonSoundEffectPanel = new JPanel();
        buttonSoundEffectPanel.setBounds(50, 300, 500, 100);
        buttonSoundEffectPanel.setLayout(new GridLayout(1, 3, 20, 0));
        buttonSoundEffectPanel.setBackground(Color.darkGray);


        buttonSoundEffect1 = new JButton("Potrzeba Drewna");
        buttonSoundEffect1.setFocusPainted(false);
        buttonSoundEffect1.setBorder(null);
        buttonSoundEffect1.setBackground(coolerDark);
        buttonSoundEffect1.setForeground(Color.white);
        buttonSoundEffect1.addActionListener(seh);
        buttonSoundEffect1.setActionCommand("se1");
        buttonSoundEffectPanel.add(buttonSoundEffect1);


        buttonSoundEffect2 = new JButton("Witaj Panie");
        buttonSoundEffect2.setFocusPainted(false);
        buttonSoundEffect2.setBorder(null);
        buttonSoundEffect2.setBackground(coolerDark);
        buttonSoundEffect2.setForeground(Color.white);
        buttonSoundEffect2.addActionListener(seh);
        buttonSoundEffect2.setActionCommand("se2");
        buttonSoundEffectPanel.add(buttonSoundEffect2);


        buttonSoundEffect3 = new JButton("Jesteśmy Atakowani!");
        buttonSoundEffect3.setFocusPainted(false);
        buttonSoundEffect3.setBorder(null);
        buttonSoundEffect3.setBackground(coolerDark);
        buttonSoundEffect3.setForeground(Color.white);
        buttonSoundEffect3.addActionListener(seh);
        buttonSoundEffect3.setActionCommand("se3");
        buttonSoundEffectPanel.add(buttonSoundEffect3);
        this.add(buttonSoundEffectPanel);


        buttonMusicPanel = new JPanel();
        buttonMusicPanel.setBounds(50, 450, 500, 100);
        buttonMusicPanel.setLayout(new GridLayout(1, 3, 20, 0));
        buttonMusicPanel.setBackground(Color.darkGray);

        buttonMusic1 = new JButton("\"Crusaider\"");
        buttonMusic1.setFocusPainted(false);
        buttonMusic1.setBorder(null);
        buttonMusic1.setBackground(Color.gray);
        buttonMusic1.setForeground(Color.darkGray);
        buttonMusic1.addActionListener(mh);
        buttonMusic1.setActionCommand("m1");
        buttonMusicPanel.add(buttonMusic1);


        buttonMusic2 = new JButton("\"Strong Spice\" ");
        buttonMusic2.setFocusPainted(false);
        buttonMusic2.setBorder(null);
        buttonMusic2.setBackground(Color.gray);
        buttonMusic2.setForeground(Color.darkGray);
        buttonMusic2.addActionListener(mh);
        buttonMusic2.setActionCommand("m2");
        buttonMusicPanel.add(buttonMusic2);


        buttonMusic3 = new JButton("\"Oudunnit\"");
        buttonMusic3.setFocusPainted(false);
        buttonMusic3.setBorder(null);
        buttonMusic3.setBackground(Color.gray);
        buttonMusic3.setForeground(Color.darkGray);
        buttonMusic3.addActionListener(mh);
        buttonMusic3.setActionCommand("m3");
        buttonMusicPanel.add(buttonMusic3);

        this.add(buttonMusicPanel);


    }

}
