 
package umletplugin.handlers.edit;

import org.eclipse.e4.core.di.annotations.Execute;

import com.baselet.gui.MenuFactory;
import com.baselet.gui.eclipse.MenuFactoryEclipse;

public class DeleteHandler {
	@Execute
	public void execute() {
		MenuFactoryEclipse.getInstance().doAction(MenuFactory.DELETE, null);
	}
}