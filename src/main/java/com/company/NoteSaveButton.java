package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NoteSaveButton extends JButton {
    private final NoteTextArea noteTextArea;

    public NoteSaveButton(NoteTextArea noteTextArea) {
        super("Save");
        this.noteTextArea = noteTextArea;
        addActionListener(this::saveAction);
    }

    private void saveAction(ActionEvent e) {
        try {
            PrintWriter writer = new PrintWriter("src/main/java/com/company/files/notes.txt");
            writer.println(noteTextArea.getText());
            writer.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}