import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;
public class GameFrame extends JFrame
{
    GamePanel panel;
    GameFrame()throws  UnsupportedAudioFileException,IOException ,LineUnavailableException
    {
     panel=new GamePanel();
     this.add(panel);
     this.setTitle("Ping Pong");
     this.setResizable(false);
     this.setBackground(Color.blue);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.pack();
     this.setVisible(true);
     this.setLocationRelativeTo(null);
    }
}
