package org.plansafety.dialogueeditor;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TreeViewerPane extends JScrollPane {

	private static final long serialVersionUID = 1L;

	public TreeViewerPane() {
		super();

		JPanel contentPanel = new JPanel();
		setViewportView(contentPanel);

	}
}
