package org.plansafety.dialogueeditor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class DialogueEditor {

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Dialogue Editor");
		mainFrame.setSize(1280, 720);
		

		JTabbedPane tabbedPane = new JTabbedPane();

		JPanel optionsPanel = new JPanel();

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, tabbedPane, optionsPanel);

		splitPane.setDividerLocation(500);

		mainFrame.add(splitPane);

		mainFrame.setVisible(true);

	}

}
