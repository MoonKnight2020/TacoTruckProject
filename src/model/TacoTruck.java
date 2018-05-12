package model;

import view.TacoTruckWelcomePanel;

import javax.swing.*;

public class TacoTruck extends JFrame {

    public TacoTruck() {

        this.setName("TacoTruckFrame");
        this.setTitle("Rolling Taco");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 200);
        this.setContentPane(new TacoTruckWelcomePanel());
        this.setVisible(true);

    }

}
