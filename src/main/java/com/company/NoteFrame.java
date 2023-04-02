package com.company;

import javax.swing.*;
import java.awt.*;

public class NoteFrame extends JFrame {
    public NoteFrame() {
        setTitle("My Notepad");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/main/java/com/company/images/img.png").getImage());
        setLocationRelativeTo(null);
        setResizable(true);

        NoteTextArea noteTextArea = new NoteTextArea();
        add(new JScrollPane(noteTextArea));

        NoteControlPanel controlPanel = new NoteControlPanel(noteTextArea);
        add(controlPanel, BorderLayout.SOUTH);

        pack();
    }
}