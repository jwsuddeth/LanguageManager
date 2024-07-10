package edu.kcc;

import edu.kcc.repository.CountryLanguageRepository;
import edu.kcc.repository.CountryRepository;
import edu.kcc.repository.ICountryLanguageRepository;
import edu.kcc.entity.CountryLanguage;
import edu.kcc.repository.ICountryRepository;

import javax.swing.*;
import java.awt.*;

public class LanguageManagerUI extends JFrame {



    public LanguageManagerUI(){
        setSize(600, 500);
        setTitle("Language Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container mainPanel = getContentPane();
        mainPanel.setLayout(new BorderLayout());

        JTextArea txtArea = new JTextArea();
        mainPanel.add(txtArea, BorderLayout.CENTER);

        // create a panel with Label, textbox and button
        JPanel topPanel = new JPanel();
        JLabel label = new JLabel("Country Code:");

        JComboBox<String> cmbCode = new JComboBox<>();
        cmbCode.addItem("-- Select One --");

        // call get the country codes from the repository class and add them to hte combobox

        JButton submit = new JButton("Search");
        submit.addActionListener(evt -> {

            // replace this next line with Java code that gets the country code selected in the combobox
            // and passes it to a repository class to get the list of languages
            var data = new java.util.ArrayList<CountryLanguage>();


            // for each CountryLanguage object in the list
            // add use it's toString() method to add its String representation
            // to the JTextArea. After each is appended then append a \n so that each JSON string
            // appears on a new line.
            data.forEach( d -> {
                String line = String.format("%s\n", d.toString());

                // add that line to the JTextArea
            });

        });


        topPanel.add(label);
        topPanel.add(cmbCode);
        topPanel.add(submit);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        setVisible(true);
    }


    public static void main(String [] args){
        SwingUtilities.invokeLater( () ->
                new LanguageManagerUI() );
    }
}
