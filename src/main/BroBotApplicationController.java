package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BroBotApplicationController implements BroBotControllerDelegate {

    // const
    // args
    protected BroBotFrame         frame;
    protected Thread              mainThread;
    protected BroBotController    botController;
    
    
    
    // CONSTRUCTOR METHOD
    public BroBotApplicationController(BroBotFrame frame) {
        
        this.frame = frame;
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        // action event listeners
        // START GAME BUTTON LISTENER
        frame.getStartGameButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // initialize game
                System.out.println("Start Game Button Pressed");
                startGame();
            }
        });
        
        // END GAME BUTTON LISTENER
        frame.getEndGameButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // end game
                System.out.println("End Game Button Pressed");
                endGame();
            }
        });
    }
    
    
    
    // PROTECTED METHODS
    protected void startGame() {
        if (this.mainThread != null) {
            System.out.println("Game Already Running!");
            return;
        }
        this.botController = new BroBotController(this);
        this.mainThread = new Thread(this.botController);
        this.mainThread.start();
    }
    
    protected void endGame() {
        if (this.mainThread == null) {
            System.out.println("Game has already stopped");
            return;
        }
        
        
    }
    
    




}