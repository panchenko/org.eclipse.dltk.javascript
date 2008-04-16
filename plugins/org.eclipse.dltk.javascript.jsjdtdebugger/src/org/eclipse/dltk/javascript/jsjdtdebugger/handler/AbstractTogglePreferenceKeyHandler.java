package org.eclipse.dltk.javascript.jsjdtdebugger.handler;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.menus.UIElement;

public abstract class AbstractTogglePreferenceKeyHandler extends
		AbstractHandler implements IElementUpdater {

	public AbstractTogglePreferenceKeyHandler() {
		super();
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		boolean value = getValue();
		setValue(!value);
		
		// refresh the ui elements
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		ICommandService service = (ICommandService) window
				.getService(ICommandService.class);
		service.refreshElements(event.getCommand().getId(), null);
		return null;
	}

	private void setValue(boolean value) {
		Preferences prefs = getPreferences();
		prefs.setValue(getKey(), value);
	}

	private boolean getValue() {
		Preferences prefs = getPreferences();
		return prefs.getBoolean(getKey());
	}

	protected abstract Preferences getPreferences();

	protected abstract String getKey();

	public void updateElement(UIElement element, Map parameters) {
		element.setChecked(getValue());
	}

}
