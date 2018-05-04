package DEMO.swing;

import DEMO.swing.layout.BorderLayoutDemo;
import DEMO.swing.layout.BoxLayoutDemo;
import DEMO.swing.layout.FlowLayoutDemo;
import DEMO.swing.layout.GridLayoutDemo;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        // Flow layout
//        FlowLayoutDemo flowLayout = new FlowLayoutDemo("Flow layout");
//        flowLayout.setSize(500,200);
//        flowLayout.setVisible(true);
//        flowLayout.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        // Box layout
//        BoxLayoutDemo boxLayoutDemo = new BoxLayoutDemo("Box layout");
//        boxLayoutDemo.setSize(500, 200);
//        boxLayoutDemo.setVisible(true);
//        boxLayoutDemo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Border layout
//        BorderLayoutDemo borderLayoutDemo = new BorderLayoutDemo("Border layout");
//        borderLayoutDemo.setSize(500, 200);
//        borderLayoutDemo.setVisible(true);
//        borderLayoutDemo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Grid layout
        GridLayoutDemo gridLayoutDemo = new GridLayoutDemo("Grid layout");
        gridLayoutDemo.setSize(500, 200);
        gridLayoutDemo.setVisible(true);
        gridLayoutDemo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
