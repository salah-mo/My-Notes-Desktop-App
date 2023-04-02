package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NoteToggleButton extends JButton {
    private final NoteTextArea noteTextArea;

    public NoteToggleButton(NoteTextArea noteTextArea) {
        super("Toggle");
        this.noteTextArea = noteTextArea;
        addActionListener(this::toggleAction);
    }

    private void toggleAction(ActionEvent e) {
        if (noteTextArea.getForeground() == Color.WHITE) {
            noteTextArea.setForeground(Color.BLACK);
            noteTextArea.setBackground(Color.WHITE);
            noteTextArea.setCaretColor(Color.BLACK);
        } else {
            noteTextArea.setForeground(Color.WHITE);
            noteTextArea.setBackground(Color.BLACK);
            noteTextArea.setCaretColor(Color.WHITE);
        }
    }
}