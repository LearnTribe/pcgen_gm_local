/*
 * Copyright 2003 (C) Devon Jones
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
 package plugin.pcgtracker.gui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;

import pcgen.system.LanguageBundle;


// TODO Add some gap to buttons. Use icons on buttons?
public class PCGTrackerView extends javax.swing.JPanel
{
	private javax.swing.JButton loadButton;
	private javax.swing.JButton removeButton;
	private javax.swing.JButton saveAsButton;
	private javax.swing.JButton saveButton;
	private javax.swing.JList loadedList;
	private javax.swing.JPanel jPanel2;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JScrollPane jScrollPane1;

	/** Creates new form PCGTrackerView */
	public PCGTrackerView()
	{
		initComponents();
	}

	/**
	 * Gets the <b>Load</b> button.
	 * @return the {@code addExperienceToCharButton}.
	 */
	public JButton getLoadButton()
	{
		return loadButton;
	}

	public JList getLoadedList()
	{
		return loadedList;
	}

	/**
	 * Gets the <b>Remove</b> button.
	 * @return the {@code addExperienceToCharButton}.
	 */
	public JButton getRemoveButton()
	{
		return removeButton;
	}

	/**
	 * Gets the <b>Save As</b> button.
	 * @return the {@code addExperienceToCharButton}.
	 */
	public JButton getSaveAsButton()
	{
		return saveAsButton;
	}

	/**
	 * Gets the <b>Save</b> button.
	 * @return the {@code addExperienceToCharButton}.
	 */
	public JButton getSaveButton()
	{
		return saveButton;
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents()
	{ //GEN-BEGIN:initComponents
		jPanel2 = new javax.swing.JPanel();
		removeButton = new javax.swing.JButton();
		saveButton = new javax.swing.JButton();
		saveAsButton = new javax.swing.JButton();
		loadButton = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		loadedList = new javax.swing.JList();

		setLayout(new java.awt.BorderLayout());

		jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));

		loadButton.setText(LanguageBundle.getString("in_mnuFileOpen")); //$NON-NLS-1$
		jPanel2.add(loadButton);

		saveButton.setText(LanguageBundle.getString("in_mnuSave")); //$NON-NLS-1$
		jPanel2.add(saveButton);

		saveAsButton.setText(LanguageBundle.getString("in_mnuFileSaveAs")); //$NON-NLS-1$
		jPanel2.add(saveAsButton);

		removeButton.setText(LanguageBundle.getString("in_remove")); //$NON-NLS-1$
		jPanel2.add(removeButton);

		add(jPanel2, java.awt.BorderLayout.EAST);

		jScrollPane1.setViewportView(loadedList);

		add(jScrollPane1, java.awt.BorderLayout.CENTER);
	}
	//GEN-END:initComponents

	// End of variables declaration//GEN-END:variables
}
