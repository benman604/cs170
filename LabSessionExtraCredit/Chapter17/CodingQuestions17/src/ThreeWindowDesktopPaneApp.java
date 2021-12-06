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

    
    private JDesktopPane jd = new JDesktopPane();
            
    ThreeWindowDesktopPaneApp()
    {
        setTitle("JInternalFrame");
        setJInternalFrame(jd,"Text Color Chooser",30,30, 1);
        setJInternalFrame(jd,"Word Counter",60,60, 2);
        setJDesktopPane();
        setSize(700,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void setJDesktopPane()
    {
        add(jd);
    }
    
    void setJInternalFrame(JDesktopPane jd,String name,int loc1,int loc2, int which)
    {
        JInternalFrame jn = new JInternalFrame(name,true,true,true,true);
        jn.setLayout(new FlowLayout());
        jn.setSize(300, 300);
        if(which == 1) {
        	TextColorChooserApp a1 = new TextColorChooserApp();
        	jn.add(a1.getContents());
        } else {
        	TextFileWordCounterApp a1 = new TextFileWordCounterApp();
        	jn.add(a1.getContents());
        }
        jn.setLocation(loc2, loc2);
        jn.setVisible(true);
        jd.add(jn);
    }
}
