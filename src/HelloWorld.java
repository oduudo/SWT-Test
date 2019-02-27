/**
 * 
 */

/**
 * @author udojanzen
 *
 */

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	      Display display = new Display();
	      Shell shell = new Shell(display);
	      Label label = new Label(shell, SWT.NONE);
	      label.setText("Hello World");
	      Button button = new Button(shell, SWT.PUSH | SWT.FLAT);
	      button.setLocation(20, 50);
	      button.setText("Ich bin ein Button!");
	      button.pack();
     
	      label.pack();
	      shell.pack();
   
	      shell.open();
	      while (!shell.isDisposed()) 
	      {
	         if (!display.readAndDispatch()) display.sleep();
	      }
	      display.dispose();
	}

}
