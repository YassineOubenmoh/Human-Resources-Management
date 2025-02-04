/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeSpace;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeSelector extends AddNewAttendance {
    private JComboBox<Integer> hourComboBox;
    private JComboBox<Integer> minuteComboBox;
    private JComboBox<Integer> secondComboBox;

    public TimeSelector() {
        setTitle("Time Selector");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));

        mainPanel.add(new JLabel("Hour:"));
        hourComboBox = new JComboBox<>(generateRange(0, 23));
        mainPanel.add(hourComboBox);

        mainPanel.add(new JLabel("Minute:"));
        minuteComboBox = new JComboBox<>(generateRange(0, 59));
        mainPanel.add(minuteComboBox);

        mainPanel.add(new JLabel("Second:"));
        secondComboBox = new JComboBox<>(generateRange(0, 59));
        mainPanel.add(secondComboBox);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hour = (int) hourComboBox.getSelectedItem();
                int minute = (int) minuteComboBox.getSelectedItem();
                int second = (int) secondComboBox.getSelectedItem();
                System.out.println("Selected time: " + hour + ":" + minute + ":" + second);
            }
        });
        mainPanel.add(submitButton);

        add(mainPanel);
    }

    private Integer[] generateRange(int start, int end) {
        Integer[] range = new Integer[end - start + 1];
        for (int i = start; i <= end; i++) {
            range[i - start] = i;
        }
        return range;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TimeSelector().setVisible(true);
            }
        });
    }
}
