/**
 * 
 */

/**
 * @author udojanzen
 *
 */

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	      Display display = new Display();
	      Shell shell = new Shell(display);
	      shell.setSize(500, 300);
	      shell.setLayout(new RowLayout());
	      shell.setText("SWT Test");
	      
/*	      Label label = new Label(shell, SWT.SEPARATOR);
	      label.setText("Hello World");
	      label.pack();
*/	      
	      final Button button = new Button(shell, SWT.PUSH | SWT.FLAT);
	      button.setLocation(20, 50);
	      button.setText("Ich bin ein Button!");
	      
	      final Text text = new Text(shell, SWT.SHADOW_IN);
	      
	      button.addSelectionListener(new SelectionListener() {

	          public void widgetSelected(SelectionEvent event) {
	            text.setText("No worries!");
	          }

	          public void widgetDefaultSelected(SelectionEvent event) {
	            text.setText("No worries!");
	          }
	        });
     
	      shell.open();
	      while (!shell.isDisposed()) 
	      {
	         if (!display.readAndDispatch()) display.sleep();
	      }
	      display.dispose();
	}

}
