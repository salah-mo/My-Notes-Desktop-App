package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NoteClearButton extends JButton {
    private final NoteTextArea noteTextArea;

    public NoteClearButton(NoteTextArea noteTextArea) {
        super("Clear");
        this.noteTextArea = noteTextArea;
        addActionListener(this::clearAction);
    }

    private void clearAction(ActionEvent e) {
        noteTextArea.setText("");
    }
}
