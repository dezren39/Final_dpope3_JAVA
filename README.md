# Final_dpope3_JAVA
Simple Java Final Project, I built to meet requirements precisely.


    package edu.cvtc.java;

    import java.awt.Dimension;
    import java.awt.GridLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.ArrayList;
    import java.util.List;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class CustomerContact extends JFrame
    {
      private static final long serialVersionUID = 1L;

      private List<Contact> contacts = new ArrayList<Contact> ();

      private final int GRID_ROWS = 6;
      private final int GRID_COLS = 1;

      private final int MIN_HEIGHT = 300;
      private final int MIN_WIDTH = 300;

      private JPanel firstNamePanel = new JPanel ();
      private JTextField firstName = new JTextField (10);
      private static final JLabel FIRST_LABEL = new JLabel ("First Name: ");

      private JPanel lastNamePanel = new JPanel ();
      private static final JLabel LAST_LABEL = new JLabel ("Last Name: ");
      private JTextField lastName = new JTextField (10);

      private JPanel birthPanel = new JPanel ();
      private static final JLabel BIRTH_LABEL = new JLabel ("Birth Date: ");
      private JTextField birthDate = new JTextField (10);

      private JPanel emailPanel = new JPanel ();
      private static final JLabel EMAIL_LABEL = new JLabel ("Email Address: ");
      private JTextField emailAddress = new JTextField (10);

      private JPanel phonePanel = new JPanel ();
      private static final JLabel PHONE_LABEL = new JLabel ("Phone Number: ");
      private JTextField phoneNumber = new JTextField (10);

      private JPanel buttonPanel = new JPanel ();
      private JButton addContact = new JButton ("Add Contact");
      private JButton showContacts = new JButton ("Show Contacts");



      public CustomerContact()
      {
        super ("CustomerContact");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new GridLayout (GRID_ROWS, GRID_COLS));
        setMinimumSize (new Dimension (MIN_WIDTH, MIN_HEIGHT));

        firstNamePanel.add (FIRST_LABEL);
        firstNamePanel.add (firstName);

        lastNamePanel.add (LAST_LABEL);
        lastNamePanel.add (lastName);

        birthPanel.add (BIRTH_LABEL);
        birthPanel.add (birthDate);

        emailPanel.add (EMAIL_LABEL);
        emailPanel.add (emailAddress);

        phonePanel.add (PHONE_LABEL);
        phonePanel.add (phoneNumber);

        addContact.addActionListener (new AddContactListener ());
        showContacts.addActionListener (new ShowContactsListener ());

        buttonPanel.add (addContact);
        buttonPanel.add (showContacts);

        add (firstNamePanel);
        add (lastNamePanel);
        add (birthPanel);
        add (emailPanel);
        add (phonePanel);
        add (buttonPanel);

        pack ();

        setVisible (true);
      }

      private class AddContactListener implements ActionListener
      {
        public void actionPerformed (ActionEvent e)
        {
          Contact contact = new Contact (emailAddress.getText (), phoneNumber.getText (),
              firstName.getText (), lastName.getText (), birthDate.getText ());

          contacts.add (contact);

          birthDate.setText ("");
          firstName.setText ("");
          lastName.setText ("");
          emailAddress.setText ("");
          phoneNumber.setText ("");
        }	
      }

      private class ShowContactsListener implements ActionListener
      {
        public void actionPerformed (ActionEvent e)
        {
          System.out.println (contacts);
        }
      }

      public static void main (String[] args)
      {
        new CustomerContact ();
      }
    }
