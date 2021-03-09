package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ShapeEventListener;

public class ShapePanel 
{
    private JFrame window;
    private ShapeCanvas canvas;
    private JButton randomShapeButton;
    private JButton exiButton;
    public ShapePanel(JFrame window)
    {
        this.window = window;
    }

    public void init()
    {
        Container cp = window.getContentPane();
        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        randomShapeButton = new JButton("Random Shapes");
        exiButton = new JButton("Exit");
        southPanel.add(randomShapeButton);
        southPanel.add(exiButton);

        //canvas
        canvas = new ShapeCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);

        //event listener
        ShapeEventListener listener = new ShapeEventListener(this);
        randomShapeButton.addActionListener(listener);
        exiButton.addActionListener(listener);
    }

    public JButton getExitButton()
    {
        return exiButton;
    }

    public JButton getRandomShapeButton() 
    {
        return randomShapeButton;
    }

    public ShapeCanvas getCanvas() 
    {
        return canvas;
    }

    public JFrame getWindow() 
    {
        return window;
    }
}
