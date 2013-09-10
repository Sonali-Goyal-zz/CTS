import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CTSCreditPanel extends JPanel implements ActionListener {
        private ImageIcon            scrollText, scrollTr;
        private int                  x,y, trDir;
        private Timer                timer;
        private GridBagConstraints   ctsCons;

	/**
	 * Constructor of this class.
	 */

        public CTSCreditPanel() {
		x=10;
		y=400;
		trDir=1;
		timer = new Timer(20,this);
		ctsCons = new GridBagConstraints();
		scrollText = new ImageIcon(getClass().getResource("images/scroll_text.gif"));
		scrollTr = new ImageIcon(getClass().getResource("images/scroll_train.gif"));
		initComponents();
		timer.start();
	} //end of constructor

    
        public void initComponents() {

                setLayout(new BorderLayout());
		setBackground(CTSDefParameters.BACK_COLOR);
		// setup the logo label
		JLabel ctsLogo = new JLabel();
		ctsLogo.setMinimumSize(new Dimension(700, 500));
		ctsLogo.setIcon(new ImageIcon(getClass().getResource("images/ctsLogo.gif")));
		add(ctsLogo, BorderLayout.NORTH);
	} //end of method

    /**
     *  Paints the components on the panel.
     *
     *  A Graphics object
     **/

        public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(scrollText.getImage(),250,y,null);
		g.drawImage(scrollTr.getImage(),x,120,null);
		if(x<-110) { x=700; }
		if(y<-600) { y=550; }
	} //end of method

    /**
     *  Hadles the actionEvents.
     *
     *  The action event.
     **/

        public void actionPerformed(ActionEvent evt) {
		//for the scrolling text-animation
		y-=2;
		//for the scrolling train animation
		x-=2;
		repaint();
	}
}//end of class

