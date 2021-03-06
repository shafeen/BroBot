package Away.Vision.RingDetection;


import javax.swing.*;
import java.awt.*;

import april.util.JImage;

public class RingDetectionFrame extends JFrame {
    
    // args
    private JButton         chooseCameraSourceButton;
    private JButton         chooseImageButton;
    private JImage          centerImage;
    private JSlider         whiteThresholdSlider;
	private JLabel			sliderLabel;
	private JLabel			whiteThresholdLabel;
    
    
    // CONSTRUCTOR METHOD
    public RingDetectionFrame() {
        super("Ring Shape Detection");
        this.setLayout(new BorderLayout());
        
        // add center image from JCam
        centerImage = new JImage();
        this.add(centerImage, BorderLayout.CENTER);
        
        // add camera source button
        // add image source button
        // add slider
        chooseCameraSourceButton = new JButton("Camera Source");
		chooseImageButton = new JButton("Choose Image");
        whiteThresholdSlider = new JSlider(0,255,230);  //range = 0-255
		whiteThresholdLabel = new JLabel("230");

		sliderLabel = new JLabel("White Threshold: ");
        
        // build GUI
        buildGUI();
        
    }
    
    // BUILD GUI
    private void buildGUI() {
        // build panel
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        this.add(northPanel, BorderLayout.NORTH);
        northPanel.add(chooseCameraSourceButton);
        northPanel.add(chooseImageButton);
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        this.add(southPanel, BorderLayout.SOUTH);
		southPanel.add(sliderLabel);
        southPanel.add(whiteThresholdSlider);
		southPanel.add(whiteThresholdLabel);
        
    }
    
    // PUBLIC CLASS METHODS
    public JButton getChooseCameraSourceButton() {
        return chooseCameraSourceButton;
    }
    
    
    public JImage getCenterImage() {
        return centerImage;
    }
    
    public JSlider getSlider() {
        return whiteThresholdSlider;
    }

	public JLabel getThresholdLabel() {
		return whiteThresholdLabel;
	}

    public synchronized JButton getChooseImageButton() {
        return chooseImageButton;
    }
    
    
}
