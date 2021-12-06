import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ThreeWindowDesktopPaneApp extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreeWindowDesktopPaneApp frame = new ThreeWindowDesktopPaneApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
    private JDesktopPane jd = new JDesktopPane();
    
    ThreeWindowDesktopPaneApp()
    {
    	TextFileWordCounterApp app1 = new TextFileWordCounterApp();
    	TextColorChooserApp app2 = new TextColorChooserApp();
        setTitle("JInternalFrame");
        
        setJInternalFrame(jd,"InternalFrame1",30,30, app1.getContents());
        setJInternalFrame(jd,"InternalFrame2",60,60, app2.getContents());
        setJDesktopPane();
        setSize(700,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void setJDesktopPane()
    {
        add(jd);
    }
    
    void setJInternalFrame(JDesktopPane jd,String name,int loc1,int loc2, JPanel contents)
    {
        JInternalFrame jn = new JInternalFrame(name,true,true,true,true);
        jn.setContentPane(contents);
        jn.setLocation(loc2, loc2);
        jn.setVisible(true);
        jd.add(jn);
    }

}
