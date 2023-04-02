package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoteOpenButton extends JButton {
    private final NoteTextArea noteTextArea;

    public NoteOpenButton(NoteTextArea noteTextArea) {
        super("Open");
        this.noteTextArea = noteTextArea;
        addActionListener(this::openAction);
    }

    private void openAction(ActionEvent e) {
        try {
            noteTextArea.setText(new Scanner(new File("src/main/java/com/company/files/notes.txt")).useDelimiter("\\Z").next());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}