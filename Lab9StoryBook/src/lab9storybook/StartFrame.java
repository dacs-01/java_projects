/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package lab9storybook;

/**
 * This is the StartFrame file for the GUI
 * @author dacs0
 */
public class StartFrame extends javax.swing.JFrame {

	// private variables for JFrame.java
	private boolean enteredName = false;
	private boolean enteredCrime = false;
	private StorybookModel myModel;
	/**
	 * Creates new form StartFrame
	 */
	public StartFrame() {
		initComponents();
	}

	StartFrame(StorybookModel myModel) {
		this.myModel = myModel;
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      nameLabel = new javax.swing.JLabel();
      nameField = new javax.swing.JTextField();
      okayButton = new javax.swing.JButton();
      crimeComboBox = new javax.swing.JComboBox<>();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      nameLabel.setText("Name:");

      nameField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            nameFieldActionPerformed(evt);
         }
      });
      nameField.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent evt) {
            nameFieldKeyTyped(evt);
         }
      });

      okayButton.setText("OK");
      okayButton.setEnabled(false);
      okayButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            okayButtonActionPerformed(evt);
         }
      });

      crimeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Adultery", "Treason", "Idolatry", "Witchcraft", "Theft" }));
      crimeComboBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            crimeComboBoxActionPerformed(evt);
         }
      });

      jLabel1.setText("Crime:");

      jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
      jLabel2.setText("Medieval Justice Tribunal");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(okayButton))
               .addGroup(layout.createSequentialGroup()
                  .addGap(22, 22, 22)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(nameLabel)
                     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(crimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
         .addGroup(layout.createSequentialGroup()
            .addGap(130, 130, 130)
            .addComponent(jLabel2)
            .addContainerGap(105, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(nameLabel)
               .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(crimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
            .addComponent(okayButton)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_nameFieldActionPerformed

   private void okayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okayButtonActionPerformed
      // sets names for the nameField and crimeBox, as well as switching to the end frame.
		myModel.setUserName(nameField.getText());
		myModel.setCrime(crimeComboBox.getSelectedItem().toString());
		EndFrame myEndFrame = new EndFrame(myModel);
		myEndFrame.setVisible(true);
		this.dispose();
   }//GEN-LAST:event_okayButtonActionPerformed

   private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
      // Sets entered name to true and shows okay button if name and crime are the same
		enteredName = true;
		if (enteredName && enteredCrime) {
			okayButton.setEnabled(true);
		}
   }//GEN-LAST:event_nameFieldKeyTyped

   private void crimeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeComboBoxActionPerformed
      // Sets entered name to true and shows okay button if name and crime are the same
		enteredCrime = true;
		if (enteredName && enteredCrime) {
			okayButton.setEnabled(true);
		}
   }//GEN-LAST:event_crimeComboBoxActionPerformed

	/**
	 * @param args the command line arguments
	 */

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox<String> crimeComboBox;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JTextField nameField;
   private javax.swing.JLabel nameLabel;
   private javax.swing.JButton okayButton;
   // End of variables declaration//GEN-END:variables
}
