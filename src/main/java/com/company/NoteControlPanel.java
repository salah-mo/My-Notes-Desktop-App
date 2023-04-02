package com.company;

import javax.swing.*;
import java.awt.*;

public class NoteControlPanel extends JPanel {

    public NoteControlPanel(NoteTextArea noteTextArea) {
        setLayout(new FlowLayout());

        JButton saveButton = new NoteSaveButton(noteTextArea);
        add(saveButton);

        JButton clearButton = new NoteClearButton(noteTextArea);
        add(clearButton);

        JButton openButton = new NoteOpenButton(noteTextArea);
        add(openButton);

        JButton toggleButton = new NoteToggleButton(noteTextArea);
        add(toggleButton);
    }
}