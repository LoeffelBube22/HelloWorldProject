package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyFirstGuiWindow {

	protected Shell hausnummerL;
	private Text vornameTF;
	private Text nachnameTF;
	private Text strasseTF;
	private Text hausnummerTF;
	private Text plzTF;
	private Text ortTF;
	private Button btnAbbrechen;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstGuiWindow window = new MyFirstGuiWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		hausnummerL.open();
		hausnummerL.layout();
		while (!hausnummerL.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		hausnummerL = new Shell();
		hausnummerL.setText("Dies ist eine Website von Paul Kreuls online Shop");
		hausnummerL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		hausnummerL.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		hausnummerL.setSize(499, 446);
		
		Button btnMyBotton = new Button(hausnummerL, SWT.NONE);
		btnMyBotton.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnMyBotton.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		btnMyBotton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Persönliche Daten:");
				System.out.println(vornameTF.getText());
				System.out.println(nachnameTF.getText());
				System.out.println(strasseTF.getText());
				System.out.println(hausnummerTF.getText());
				System.out.println(plzTF.getText());
				System.out.println(ortTF.getText());
			}
		});
		btnMyBotton.setBounds(398, 10, 75, 25);
		btnMyBotton.setText("Suchen");
		
		Label vornameL = new Label(hausnummerL, SWT.NONE);
		vornameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		vornameL.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		vornameL.setBounds(27, 46, 55, 15);
		vornameL.setText("Vorname");
		
		vornameTF = new Text(hausnummerL, SWT.BORDER);
		vornameTF.setBounds(115, 43, 164, 21);
		
		Label nachnameL = new Label(hausnummerL, SWT.NONE);
		nachnameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		nachnameL.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		nachnameL.setBounds(27, 79, 66, 15);
		nachnameL.setText("Nachname");
		
		nachnameTF = new Text(hausnummerL, SWT.BORDER);
		nachnameTF.setBounds(115, 76, 164, 21);
		
		Label strasseL = new Label(hausnummerL, SWT.NONE);
		strasseL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		strasseL.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		strasseL.setBounds(27, 115, 55, 15);
		strasseL.setText("Stra\u00DFe");
		
		strasseTF = new Text(hausnummerL, SWT.BORDER);
		strasseTF.setText("");
		strasseTF.setBounds(115, 112, 164, 21);
		
		Label lblHausnummer = new Label(hausnummerL, SWT.NONE);
		lblHausnummer.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblHausnummer.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		lblHausnummer.setBounds(27, 150, 75, 15);
		lblHausnummer.setText("Hausnummer");
		
		hausnummerTF = new Text(hausnummerL, SWT.BORDER);
		hausnummerTF.setText("");
		hausnummerTF.setBounds(115, 147, 163, 21);
		
		plzTF = new Text(hausnummerL, SWT.BORDER);
		plzTF.setBounds(115, 184, 164, 21);
		
		Label plzL = new Label(hausnummerL, SWT.NONE);
		plzL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		plzL.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		plzL.setBounds(27, 190, 55, 15);
		plzL.setText("PLZ");
		
		Label ortL = new Label(hausnummerL, SWT.NONE);
		ortL.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		ortL.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		ortL.setBounds(27, 223, 55, 15);
		ortL.setText("Ort");
		
		ortTF = new Text(hausnummerL, SWT.BORDER);
		ortTF.setBounds(115, 217, 164, 21);
		
		btnAbbrechen = new Button(hausnummerL, SWT.NONE);
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnAbbrechen.setBounds(398, 41, 75, 25);
		btnAbbrechen.setText("Abbrechen");
		
		Composite composite = new Composite(hausnummerL, SWT.NONE);
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent arg0) {
				System.out.println(arg0.x + " / " + arg0.y);
			}
		});
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setBounds(115, 294, 164, 64);
		hausnummerL.setTabList(new Control[]{vornameTF, nachnameTF, strasseTF, hausnummerTF, plzTF, ortTF, btnMyBotton});

	}
}
