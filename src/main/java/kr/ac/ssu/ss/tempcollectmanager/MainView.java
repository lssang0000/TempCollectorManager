/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kr.ac.ssu.ss.tempcollectmanager;

import javax.swing.ListSelectionModel;
import kr.ac.ssu.ss.collectors.Collector;
import kr.ac.ssu.ss.collectors.CollectorBio;
import kr.ac.ssu.ss.collectors.CollectorVision;
import kr.ac.ssu.ss.collectors.CollectorVoice;

/**
 *
 * @author lssang
 */
public class MainView extends javax.swing.JFrame {
    
    private UserManager um;
    String currnt_id;                                   //current id
    String currnt_name;                                 //current name
    
    /**
     * Creates new form MainView
     */
    public MainView() {
        um = new UserManager();
        
        initComponents();
        initUserList();
    }

    /**
     * lssang write
     */
    private void initUserList(){        
        String listData[] = um.getUserList();
        jList_users.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList_users.setListData(listData);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabelTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_searchUserId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_searchUserName = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deviceId_vision = new javax.swing.JLabel();
        status_vision = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_on_vision = new javax.swing.JButton();
        jButton_off_vision = new javax.swing.JButton();
        deviceId_bio = new javax.swing.JLabel();
        status_bio = new javax.swing.JLabel();
        jButton_on_bio = new javax.swing.JButton();
        jButton_off_bio = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        deviceId_voice = new javax.swing.JLabel();
        jButton_on_voice = new javax.swing.JButton();
        jButton_off_voice = new javax.swing.JButton();
        status_voice = new javax.swing.JLabel();
        jLabe_searchResult = new javax.swing.JLabel();
        jPanelSystem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanelUser = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_addUserId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField_addUserName = new javax.swing.JTextField();
        jButton_addUser = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList_users = new javax.swing.JList();
        jLabe_addResult = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setText("Data Collect Manager");

        jLabel1.setText("UserNo");

        jTextField_searchUserId.setText("jTextField1");

        jLabel2.setText("Name");

        jTextField_searchUserName.setText("jTextField2");

        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jLabel3.setText("Type");

        jLabel4.setText("DeviceId");

        jLabel5.setText("Control");

        jLabel6.setText("Status");

        jLabel7.setText("Vision");

        deviceId_vision.setText("jLabel8");

        status_vision.setText("jLabel9");

        jLabel10.setText("Bio");

        jButton_on_vision.setText("ON");
        jButton_on_vision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_on_visionActionPerformed(evt);
            }
        });

        jButton_off_vision.setText("OFF");
        jButton_off_vision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_off_visionActionPerformed(evt);
            }
        });

        deviceId_bio.setText("jLabel11");

        status_bio.setText("jLabel12");

        jButton_on_bio.setText("ON");
        jButton_on_bio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_on_bioActionPerformed(evt);
            }
        });

        jButton_off_bio.setText("OFF");
        jButton_off_bio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_off_bioActionPerformed(evt);
            }
        });

        jLabel13.setText("Voice");

        deviceId_voice.setText("jLabel14");

        jButton_on_voice.setText("ON");
        jButton_on_voice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_on_voiceActionPerformed(evt);
            }
        });

        jButton_off_voice.setText("OFF");
        jButton_off_voice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_off_voiceActionPerformed(evt);
            }
        });

        status_voice.setText("jLabel15");

        jLabe_searchResult.setText("jLabel17");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4))
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deviceId_vision)
                                    .addComponent(deviceId_bio)))
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(deviceId_voice)))
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                                        .addComponent(jButton_on_voice)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_off_voice))
                                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                                        .addComponent(jButton_on_bio)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_off_bio))
                                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                                        .addComponent(jButton_on_vision)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_off_vision)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status_vision)
                                    .addComponent(status_voice)
                                    .addComponent(status_bio))
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_searchUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_searchUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_search))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabe_searchResult)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_searchUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_searchUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_search))
                .addGap(3, 3, 3)
                .addComponent(jLabe_searchResult)
                .addGap(18, 18, 18)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(deviceId_vision)
                    .addComponent(status_vision)
                    .addComponent(jButton_on_vision)
                    .addComponent(jButton_off_vision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(deviceId_bio)
                    .addComponent(status_bio)
                    .addComponent(jButton_on_bio)
                    .addComponent(jButton_off_bio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(deviceId_voice)
                    .addComponent(jButton_on_voice)
                    .addComponent(jButton_off_voice)
                    .addComponent(status_voice))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", jPanelHome);

        jLabel8.setText("Vision");

        jLabel9.setText("Bio");

        jLabel11.setText("Voice");

        javax.swing.GroupLayout jPanelSystemLayout = new javax.swing.GroupLayout(jPanelSystem);
        jPanelSystem.setLayout(jPanelSystemLayout);
        jPanelSystemLayout.setHorizontalGroup(
            jPanelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addGroup(jPanelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelSystemLayout.setVerticalGroup(
            jPanelSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("System", jPanelSystem);

        jLabel14.setText("UserNo");

        jTextField_addUserId.setText("jTextField3");
        jTextField_addUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_addUserIdActionPerformed(evt);
            }
        });

        jLabel15.setText("Name");

        jTextField_addUserName.setText("jTextField4");

        jButton_addUser.setText("ADD");
        jButton_addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addUserActionPerformed(evt);
            }
        });

        jLabel16.setText("User List");

        jList_users.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList_users);

        jLabe_addResult.setText("jLabel17");

        javax.swing.GroupLayout jPanelUserLayout = new javax.swing.GroupLayout(jPanelUser);
        jPanelUser.setLayout(jPanelUserLayout);
        jPanelUserLayout.setHorizontalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUserLayout.createSequentialGroup()
                        .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelUserLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_addUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_addUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addComponent(jButton_addUser)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addComponent(jLabe_addResult)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelUserLayout.setVerticalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField_addUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField_addUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_addUser))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabe_addResult)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("User", jPanelUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_on_bioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_on_bioActionPerformed
        // TODO add your handling code here:
        String deviceId = deviceId_bio.getText();
        Collector c = new CollectorBio();
        
        if(c.getStatus(currnt_id, deviceId) == Constants.RUNNING){
            status_bio.setText("Running");
        }else if(c.getStatus(currnt_id, deviceId) == Constants.STOPPED){
            status_bio.setText("Stopeed");
        }        
    }//GEN-LAST:event_jButton_on_bioActionPerformed

    private void jButton_on_visionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_on_visionActionPerformed
        // TODO add your handling code here:
        String deviceId = deviceId_vision.getText();
        Collector c = new CollectorVision();
        
        if(c.getStatus(currnt_id, deviceId) == Constants.RUNNING){
            status_vision.setText("Running");
        }else if(c.getStatus(currnt_id, deviceId) == Constants.STOPPED){
            status_vision.setText("Stopeed");
        }   
    }//GEN-LAST:event_jButton_on_visionActionPerformed

    private void jButton_addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addUserActionPerformed
        // TODO add your handling code here:
        String id = jTextField_addUserId.getText();
        String name = jTextField_addUserName.getText();
                
        int res = um.addUser(id, name);
        if(res == Constants.DONE){
            jLabe_addResult.setText("DONE");
            initUserList();
        }else if(res == Constants.ALREADY_EXIST){
            jLabe_addResult.setText("This id aleady exists.");
        }
    }//GEN-LAST:event_jButton_addUserActionPerformed

    private void jTextField_addUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_addUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_addUserIdActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        // TODO add your handling code here:
        String id = jTextField_searchUserId.getText();      //input id
        String name = jTextField_searchUserName.getText();  //input name
        
            
        if(um.containId(id)){
            currnt_id = id;                                  
            currnt_name = um.getNameById(id);                 
            jTextField_searchUserName.setText(currnt_name);
            jLabe_searchResult.setText("Search by id... currunt user : "+currnt_name+"("+currnt_id+")");
            setHomeInfo(id);            
        }else if(um.containName(name)){
            currnt_name = name;
            currnt_id = um.getIdByName(name);
            jTextField_searchUserId.setText(currnt_name);
            jLabe_searchResult.setText("Search by name...currunt user : "+currnt_name+"("+currnt_id+")");
            setHomeInfo(id);
        }else{
            jLabe_searchResult.setText("User not found.");
        }
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_on_voiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_on_voiceActionPerformed
        // TODO add your handling code here:
        String deviceId = deviceId_voice.getText();
        Collector c = new CollectorVoice();
        
        if(c.getStatus(currnt_id, deviceId) == Constants.RUNNING){
            status_voice.setText("Running");
        }else if(c.getStatus(currnt_id, deviceId) == Constants.STOPPED){
            status_voice.setText("Stopeed");
        }   
    }//GEN-LAST:event_jButton_on_voiceActionPerformed

    private void jButton_off_visionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_off_visionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_off_visionActionPerformed

    private void jButton_off_bioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_off_bioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_off_bioActionPerformed

    private void jButton_off_voiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_off_voiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_off_voiceActionPerformed
    
    
    private void setHomeInfo(String userId){
       deviceId_vision.setText(um.getUser(userId).getVision_d_id());
       deviceId_bio.setText(um.getUser(userId).getBio_d_id());
       deviceId_voice.setText(um.getUser(userId).getVoice_d_id());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deviceId_bio;
    private javax.swing.JLabel deviceId_vision;
    private javax.swing.JLabel deviceId_voice;
    private javax.swing.JButton jButton_addUser;
    private javax.swing.JButton jButton_off_bio;
    private javax.swing.JButton jButton_off_vision;
    private javax.swing.JButton jButton_off_voice;
    private javax.swing.JButton jButton_on_bio;
    private javax.swing.JButton jButton_on_vision;
    private javax.swing.JButton jButton_on_voice;
    private javax.swing.JButton jButton_search;
    private javax.swing.JLabel jLabe_addResult;
    private javax.swing.JLabel jLabe_searchResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JList jList_users;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelSystem;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_addUserId;
    private javax.swing.JTextField jTextField_addUserName;
    private javax.swing.JTextField jTextField_searchUserId;
    private javax.swing.JTextField jTextField_searchUserName;
    private javax.swing.JLabel status_bio;
    private javax.swing.JLabel status_vision;
    private javax.swing.JLabel status_voice;
    // End of variables declaration//GEN-END:variables
}
