package org.plansafety.dialogueeditor;

import org.plansafety.lib.dialogue.DialogueTree;

public class TreeManager {

	private static TreeManager INSTANCE;

	private DialogueTree tree;

	private TreeManager() {

	}

	public static TreeManager getInstance() {
		if (INSTANCE == null)
			INSTANCE = new TreeManager();

		return INSTANCE;
	}

	public DialogueTree getTree() {
		return tree;
	}

	public void setTree(DialogueTree tree) {
		this.tree = tree;
	}

}
