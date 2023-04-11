import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        ArrayList<BorderLayout> blArray = new ArrayList<>();
        ArrayList<JLabel> jlArray = new ArrayList<>();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension frameD = new Dimension(200, 200);
        frame.setMinimumSize(frameD);

        JPanel panel = new JPanel();
        //BoxLayout blayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        GridLayout glayout = new GridLayout(2,2);
        panel.setLayout(glayout);

        for (int i = 0; i < 5; i++){
            blArray.add(new BorderLayout());
        }

        JPanel p0_0 = new JPanel();
        p0_0.setLayout(blArray.get(0));
        JPanel p0_1 = new JPanel();
        p0_1.setLayout(blArray.get(1));
        JPanel p1_0 = new JPanel();
        p1_0.setLayout(blArray.get(2));
        JPanel p1_1 = new JPanel();
        p1_1.setLayout(blArray.get(3));



        for (int i = 0; i < 16; i++){
            JLabel temp = new JLabel("Sides");
            jlArray.add(temp);
        }

        jlArray.get(0).setAlignmentX(JComponent.CENTER_ALIGNMENT);
        p0_0.add(Box.createVerticalGlue());
        p0_0.add(jlArray.get(0), BorderLayout.LINE_START);
        p0_0.add(Box.createVerticalGlue());
        p0_0.add(jlArray.get(1), BorderLayout.PAGE_START);
        p0_0.add(jlArray.get(2), BorderLayout.LINE_END);
        p0_0.add(jlArray.get(3), BorderLayout.PAGE_END);
        p0_0.add(new JLabel("Center p0_0"), BorderLayout.CENTER);

        p0_1.add(jlArray.get(4), BorderLayout.LINE_START);
        p0_1.add(jlArray.get(5), BorderLayout.PAGE_START);
        p0_1.add(jlArray.get(6), BorderLayout.LINE_END);
        p0_1.add(jlArray.get(7), BorderLayout.PAGE_END);
        p0_1.add(new JLabel("Center p0_1"), BorderLayout.CENTER);

        p1_0.add(jlArray.get(8), BorderLayout.LINE_START);
        p1_0.add(jlArray.get(9), BorderLayout.PAGE_START);
        p1_0.add(jlArray.get(10), BorderLayout.LINE_END);
        p1_0.add(jlArray.get(11), BorderLayout.PAGE_END);
        p1_0.add(new JLabel("Center p1_0"), BorderLayout.CENTER);

        p1_1.add(jlArray.get(12), BorderLayout.LINE_START);
        p1_1.add(jlArray.get(13), BorderLayout.PAGE_START);
        p1_1.add(jlArray.get(14), BorderLayout.LINE_END);
        p1_1.add(jlArray.get(15), BorderLayout.PAGE_END);
        p1_1.add(new JLabel("Center p1_1"), BorderLayout.CENTER);

        panel.add(p0_0);
        panel.add(p0_1);
        panel.add(p1_0);
        panel.add(p1_1);

        /*
        JLabel label = new JLabel("Hello, World!");
        label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        label.setAlignmentY((float) 0.5);
        //panel.add(Box.createVerticalGlue());
        panel.add(label);
        //panel.add(Box.createVerticalGlue());
        */

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
