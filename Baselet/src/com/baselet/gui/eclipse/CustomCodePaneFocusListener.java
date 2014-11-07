package com.baselet.gui.eclipse;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import com.baselet.control.Program;
import com.baselet.control.SharedConstants.RuntimeType;
import com.baselet.gui.CurrentGui;
import com.baselet.gui.eclipse.EclipseGUI.Pane;

public class CustomCodePaneFocusListener implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		if (Program.RUNTIME_TYPE == RuntimeType.ECLIPSE_PLUGIN) {
			((EclipseGUI) CurrentGui.getInstance().getGui()).setPaneFocused(Pane.CUSTOMCODE);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (Program.RUNTIME_TYPE == RuntimeType.ECLIPSE_PLUGIN) {
			((EclipseGUI) CurrentGui.getInstance().getGui()).setPaneFocused(Pane.DIAGRAM);
		}
	}

}
