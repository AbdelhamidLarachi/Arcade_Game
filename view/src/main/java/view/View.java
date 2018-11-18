package view;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Hashtable;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 */
public class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * @return height of window
	 */
	public int getHeight()
	{
		return this.viewFrame.getHeight();
	}

	/**
	 * @return width of window
	 */
	public int getWidth()
	{
		return this.viewFrame.getWidth();
	}

    /**
	 * CrystalBall code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_NUMPAD1:
				return ControllerOrder.MAP1;
			case KeyEvent.VK_NUMPAD2:
				return ControllerOrder.MAP2;
			case KeyEvent.VK_NUMPAD3:
				return ControllerOrder.MAP3;
			case KeyEvent.VK_NUMPAD4:
				return ControllerOrder.MAP4;
            case KeyEvent.VK_NUMPAD5:
                return ControllerOrder.MAP5;
			case KeyEvent.VK_NUMPAD6:
				return ControllerOrder.MAP6;
			case KeyEvent.VK_NUMPAD7:
				return ControllerOrder.MAP7;
			case KeyEvent.VK_NUMPAD8:
				return ControllerOrder.MAP8;
			case KeyEvent.VK_NUMPAD9:
				return ControllerOrder.MAP9;
			case KeyEvent.VK_NUMPAD0:
				return ControllerOrder.TEST;
            case KeyEvent.VK_M:
                return ControllerOrder.MENU;
            case KeyEvent.VK_W:
                return ControllerOrder.WORKSHOP;
			case KeyEvent.VK_LEFT:
				return ControllerOrder.MOVELEFT;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.MOVERIGHT;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.MOVEDOWN;
			case KeyEvent.VK_UP:
				return ControllerOrder.MOVEUP;
            case KeyEvent.VK_SPACE:
                return ControllerOrder.FIRE;
			default:
				return null;
		}
	}

	/**
	 * Print a message via popup
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	public String getPseudo() {
		return this.viewFrame.pseudo();
	}

	/**
	 * Enable application
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Update information and refresh
	 *
	 * @see view.ViewPanel#paintComponents(Graphics)
	 */
	public void repaint(){
		this.viewFrame.update();
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 *
	 * @see contract.IController
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
