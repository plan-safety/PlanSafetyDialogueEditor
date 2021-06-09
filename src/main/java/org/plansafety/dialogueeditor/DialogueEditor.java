package org.plansafety.dialogueeditor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class DialogueEditor {

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Dialogue Editor");
		mainFrame.setSize(1280, 720);
		

		TreeViewerPane treeViewerPanel = new TreeViewerPane();
		JPanel optionsPanel = new JPanel();

		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, treeViewerPanel, optionsPanel);

		splitPane.setDividerLocation(500);

		mainFrame.add(splitPane);

		mainFrame.setVisible(true);

	}

}
