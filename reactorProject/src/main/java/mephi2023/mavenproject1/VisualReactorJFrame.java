/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mephi2023.mavenproject1;

import java.io.File;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Kseny
 */
public class VisualReactorJFrame extends javax.swing.JFrame {
    DataManipulation dm;
    /**
     * Creates new form VisualReactorJFrame
     */
    public VisualReactorJFrame() {
        super("������ � ���������");
        initComponents();
        setSize(1200, 680);
        reactorTypeFileChooser.setVisible(false);        
        fileLabel.setText("���� �� ������");        
        reactorTypeFileChooser.setCurrentDirectory(new File(".\\resources\\"));
        dm = new DataManipulation(instruction1Label, exceptionLabel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startPanel = new javax.swing.JPanel();
        reactorTypeFileChooser = new javax.swing.JFileChooser();
        mainLabel = new javax.swing.JLabel();
        chooseFileButton = new javax.swing.JButton();
        drawButton = new javax.swing.JButton();
        reactorTreeScrollPane = new javax.swing.JScrollPane();
        reactorTree = new javax.swing.JTree();
        fileLabel = new javax.swing.JLabel();
        createBDButton = new javax.swing.JButton();
        fillBDButton = new javax.swing.JButton();
        deleteBDButton = new javax.swing.JButton();
        countCompanyReactorButton = new javax.swing.JButton();
        countRegionReactorButton = new javax.swing.JButton();
        countCountryReactorButton = new javax.swing.JButton();
        countReactorsButton = new javax.swing.JButton();
        fuelTableScrollPane = new javax.swing.JScrollPane();
        fuelTable = new javax.swing.JTable();
        infoTotalFuelLabel = new javax.swing.JLabel();
        totalFuelLabel = new javax.swing.JLabel();
        instruction1Label = new javax.swing.JLabel();
        instruction3Label = new javax.swing.JLabel();
        instruction5Label = new javax.swing.JLabel();
        instruction2Label = new javax.swing.JLabel();
        instruction4Label = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        exceptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        reactorTypeFileChooser.setApproveButtonMnemonic(1);
        reactorTypeFileChooser.setApproveButtonText("");
        reactorTypeFileChooser.setApproveButtonToolTipText("");
        reactorTypeFileChooser.setCurrentDirectory(new java.io.File("D:\\Users\\Kseny\\OneDrive\\���������\\NetBeansProjects\\mavenproject1\\src\\main\\resources"));
        reactorTypeFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reactorTypeFileChooserActionPerformed(evt);
            }
        });

        mainLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("������ � ���������:");

        chooseFileButton.setText("������� ����");
        chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileButtonActionPerformed(evt);
            }
        });

        drawButton.setText("��������� ������");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("��������");
        reactorTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        reactorTreeScrollPane.setViewportView(reactorTree);

        fileLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        fileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        createBDButton.setText("������� ��");
        createBDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBDButtonActionPerformed(evt);
            }
        });

        fillBDButton.setText("��������� ��");
        fillBDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillBDButtonActionPerformed(evt);
            }
        });

        deleteBDButton.setText("������� ��");
        deleteBDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBDButtonActionPerformed(evt);
            }
        });

        countCompanyReactorButton.setText("������ �� ���������");
        countCompanyReactorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countCompanyReactorButtonActionPerformed(evt);
            }
        });

        countRegionReactorButton.setText("������ �� ��������");
        countRegionReactorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countRegionReactorButtonActionPerformed(evt);
            }
        });

        countCountryReactorButton.setText("������ �� �������");
        countCountryReactorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countCountryReactorButtonActionPerformed(evt);
            }
        });

        countReactorsButton.setText("������ �� ���������");
        countReactorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countReactorsButtonActionPerformed(evt);
            }
        });

        fuelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "�������� �������", "��������� ����������� �������"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fuelTableScrollPane.setViewportView(fuelTable);
        if (fuelTable.getColumnModel().getColumnCount() > 0) {
            fuelTable.getColumnModel().getColumn(0).setResizable(false);
            fuelTable.getColumnModel().getColumn(1).setResizable(false);
        }

        infoTotalFuelLabel.setText("����� ���������� :");

        instruction1Label.setText("1. ���� ������ ������� � ���������. ����� ������� � ���� 5.");

        instruction3Label.setText("3. ����� �������� ���� ��� ���������� �������������� ���������� � ���������, ����� ��������� ������ ���������� � ���� ������.");

        instruction5Label.setText("5. ��������� ������ ������ �������� ������������� ������� �� ��������� ������������ (�� ���������, �������, �������� � ���������).");

        instruction2Label.setText("2. ����� ������� ���� ������ ������� ������ \"������� ��\".");

        instruction4Label.setText("4. ����� �������� ��������� ���� ������.");

        instructionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        instructionLabel.setText("����������");

        exceptionLabel.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, startPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(instruction4Label)
                    .addComponent(instruction2Label)
                    .addComponent(instruction5Label)
                    .addComponent(instruction3Label)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mainLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reactorTreeScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(startPanelLayout.createSequentialGroup()
                                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(startPanelLayout.createSequentialGroup()
                                        .addComponent(chooseFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(startPanelLayout.createSequentialGroup()
                                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(createBDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(countReactorsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fillBDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBDButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(countRegionReactorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                            .addGroup(startPanelLayout.createSequentialGroup()
                                .addComponent(countCountryReactorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addComponent(countCompanyReactorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fuelTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(startPanelLayout.createSequentialGroup()
                                .addComponent(infoTotalFuelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalFuelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(instructionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instruction1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exceptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(startPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(reactorTypeFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(485, Short.MAX_VALUE)))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addComponent(reactorTreeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(drawButton)
                                .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chooseFileButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createBDButton)
                            .addComponent(fillBDButton)
                            .addComponent(deleteBDButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countRegionReactorButton)
                            .addComponent(countReactorsButton)))
                    .addComponent(fuelTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countCompanyReactorButton)
                    .addComponent(countCountryReactorButton)
                    .addComponent(infoTotalFuelLabel)
                    .addComponent(totalFuelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(instructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction3Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction4Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction5Label)
                .addGap(18, 18, 18)
                .addComponent(exceptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(reactorTypeFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(312, 312, 312)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(startPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(startPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reactorTypeFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reactorTypeFileChooserActionPerformed
        System.out.println(evt);
        if (reactorTypeFileChooser.getSelectedFile() != null){
            System.out.println(reactorTypeFileChooser.getSelectedFile());
            String fileName = reactorTypeFileChooser.getSelectedFile().getAbsolutePath();
            dm.readByBuildChain(fileName, fileLabel, exceptionLabel);                       
        } else{
            System.out.println(":(");
            fileLabel.setText("������ ������������ ����");
        }
        reactorTypeFileChooser.setSelectedFile(new File(""));
    }//GEN-LAST:event_reactorTypeFileChooserActionPerformed

    private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed
        String homeDir = System.getProperty("user.dir")+".\\resources\\";
        System.out.println(homeDir +".\\resources\\");
        reactorTypeFileChooser.setCurrentDirectory(new File(homeDir));
        reactorTypeFileChooser.setVisible(true);
        reactorTypeFileChooser.setSize(600, 400);
        reactorTypeFileChooser.showDialog(null, "Open");        
        exceptionLabel.setText("");
    }//GEN-LAST:event_chooseFileButtonActionPerformed

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        reactorTree.setModel(new DefaultTreeModel(dm.getMainNode()));
        exceptionLabel.setText("");
    }//GEN-LAST:event_drawButtonActionPerformed

    private void createBDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBDButtonActionPerformed
        dm.createBD(instruction1Label, exceptionLabel);
    }//GEN-LAST:event_createBDButtonActionPerformed

    private void deleteBDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBDButtonActionPerformed
        dm.deleteBD(instruction1Label, exceptionLabel);
    }//GEN-LAST:event_deleteBDButtonActionPerformed

    private void fillBDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillBDButtonActionPerformed
        dm.fillBD(instruction1Label, exceptionLabel);
    }//GEN-LAST:event_fillBDButtonActionPerformed

    private void countReactorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countReactorsButtonActionPerformed
        dm.countFuelForEachReactor(fuelTable, totalFuelLabel, exceptionLabel);
    }//GEN-LAST:event_countReactorsButtonActionPerformed

    private void countCountryReactorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countCountryReactorButtonActionPerformed
        dm.countFuelForCountryReactor(fuelTable, totalFuelLabel, exceptionLabel);
    }//GEN-LAST:event_countCountryReactorButtonActionPerformed

    private void countRegionReactorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countRegionReactorButtonActionPerformed
        dm.countFuelForRegionReactor(fuelTable, totalFuelLabel, exceptionLabel);
    }//GEN-LAST:event_countRegionReactorButtonActionPerformed

    private void countCompanyReactorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countCompanyReactorButtonActionPerformed
        dm.countFuelForCompanyReactor(fuelTable, totalFuelLabel, exceptionLabel);
    }//GEN-LAST:event_countCompanyReactorButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JButton countCompanyReactorButton;
    private javax.swing.JButton countCountryReactorButton;
    private javax.swing.JButton countReactorsButton;
    private javax.swing.JButton countRegionReactorButton;
    private javax.swing.JButton createBDButton;
    private javax.swing.JButton deleteBDButton;
    private javax.swing.JButton drawButton;
    private javax.swing.JLabel exceptionLabel;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JButton fillBDButton;
    private javax.swing.JTable fuelTable;
    private javax.swing.JScrollPane fuelTableScrollPane;
    private javax.swing.JLabel infoTotalFuelLabel;
    private javax.swing.JLabel instruction1Label;
    private javax.swing.JLabel instruction2Label;
    private javax.swing.JLabel instruction3Label;
    private javax.swing.JLabel instruction4Label;
    private javax.swing.JLabel instruction5Label;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTree reactorTree;
    private javax.swing.JScrollPane reactorTreeScrollPane;
    private javax.swing.JFileChooser reactorTypeFileChooser;
    private javax.swing.JPanel startPanel;
    private javax.swing.JLabel totalFuelLabel;
    // End of variables declaration//GEN-END:variables
}
