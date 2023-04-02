package com.company;

import javax.swing.*;
import java.awt.*;

public class NoteTextArea extends JTextArea {
    public NoteTextArea() {
        setLineWrap(true);
        setTabSize(4);
        setFont(new Font("Segoe Script", Font.ITALIC, 22));
        setForeground(Color.WHITE);
        setBackground(Color.BLACK);
        setCaretColor(Color.WHITE);
    }
}