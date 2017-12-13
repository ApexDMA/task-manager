package Assignments;

import java.util.*;
import javax.swing.JOptionPane;

public class TaskManager extends javax.swing.JFrame {

    ArrayList list;
    ListIterator li;
    int curtask, tottask;
    Task t;

    public TaskManager() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask = 0;
        tottask = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblctask = new javax.swing.JLabel();
        lblttask = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplacecurrenttask = new javax.swing.JMenuItem();
        mnuremovecurrenttask = new javax.swing.JMenuItem();
        mnurestorecurrenttask = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuinsertbefore = new javax.swing.JMenuItem();
        mnuinsertafter = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Current Task");

        lblctask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblctask.setText("0");
        lblctask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblttask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblttask.setText("0");
        lblttask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Total Tasks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblttask, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblttask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lblctask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(btnfirst)
                .addGap(31, 31, 31)
                .addComponent(btnprev)
                .addGap(43, 43, 43)
                .addComponent(btnnext)
                .addGap(45, 45, 45)
                .addComponent(btnlast)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        jMenu1.setText("Program");

        mnushowall.setText("Show All Tasks");
        mnushowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowallActionPerformed(evt);
            }
        });
        jMenu1.add(mnushowall);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplacecurrenttask.setText("Replace this as Current Task");
        mnureplacecurrenttask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplacecurrenttaskActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplacecurrenttask);

        mnuremovecurrenttask.setText("Remove Current Task");
        mnuremovecurrenttask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremovecurrenttaskActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremovecurrenttask);

        mnurestorecurrenttask.setText("Restore Current Task to Screen");
        mnurestorecurrenttask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestorecurrenttaskActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestorecurrenttask);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnuinsertbefore.setText("Before Current Task");
        mnuinsertbefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuinsertbeforeActionPerformed(evt);
            }
        });
        jMenu3.add(mnuinsertbefore);

        mnuinsertafter.setText("After Current Task");
        mnuinsertafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuinsertafterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuinsertafter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        if (curtask == 0) {
            return;//we are already at the beginning
        }
        while (li.hasPrevious())//go to beginning
        {
            li.previous();
        }
        t = (Task) li.next();//get in front of first task
        curtask = 0;//current task is first task
        //update display
        lblctask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnfirstActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            t = (Task) list.get(i);
            result += "TASK " + (i + 1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_mnushowallActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        txtname.setText("");
        txtdescription.setText("");
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuinsertafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuinsertafterActionPerformed
        String nm = txtname.getText();//read in from screen
        String d = txtdescription.getText();
        Task t = new Task(nm, d);// make a task with it
        if (t.validate() == false) {//make sure data is ok
            JOptionPane.showMessageDialog(this, "Error - Must enter all information.");
            return;
        }
        if (tottask > 0) {
            li.next();//go past current task if you have at least 1
        }

        li.add(t);//it always adds to the left of the iterator
        li.previous();//always put the iterator BEFORE current task
        curtask++;//new task is now current and we inserted AFTER, so advance current
        tottask++;//we have one new task
        lblttask.setText("" + tottask);//update counter displays
        lblctask.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task added.");
    }//GEN-LAST:event_mnuinsertafterActionPerformed

    private void mnuinsertbeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuinsertbeforeActionPerformed
        String nm = txtname.getText();//read in from screen
        String d = txtdescription.getText();
        Task t = new Task(nm, d);// make a task with it
        if (t.validate() == false) {//make sure data is ok
            JOptionPane.showMessageDialog(this, "Error - Must enter all information.");
            return;
        }
        if (tottask > 0) {
            li.previous();//go past current task if you have at least 1
        }

        li.add(t);//it always adds to the left of the iterator
        li.previous();//always put the iterator BEFORE current task
        curtask++;//new task is now current and we inserted AFTER, so advance current
        tottask++;//we have one new task
        lblttask.setText("" + tottask);//update counter displays
        lblctask.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task added.");
    }//GEN-LAST:event_mnuinsertbeforeActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        if (curtask == tottask) {
            return;//we are already at the end
        }
        while (li.hasNext())//go to end
        {
            li.next();
        }
        t = (Task) li.previous();//get in front of last task
        curtask = tottask;//current task is last task
        //update display
        lblctask.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if (curtask == tottask) {
            return;
        }
        curtask++;
        lblctask.setText("" + curtask);
        li.next();//passes over current task
        li.next();//passes over next task
        t = (Task) li.previous();//get in front of task
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed

    private void mnureplacecurrenttaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplacecurrenttaskActionPerformed
        if (tottask == 0) {
            JOptionPane.showMessageDialog(this, "No task to replace with, please insert a task first.");
            return;
        }
        //read info from screen and make a Task with it
        String nm = txtname.getText();
        String d = txtdescription.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {//make sure data is ok
            JOptionPane.showMessageDialog(this, "Error - must enter all information.");
            return;
        }
        li.next();//travel over current task
        li.set(t);//replaces last thing tavelled over with t
        li.previous();//travel back over current task to be in front of it
    }//GEN-LAST:event_mnureplacecurrenttaskActionPerformed

    private void mnuremovecurrenttaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremovecurrenttaskActionPerformed
        if (tottask == 0) {
            return;
        }
        //go over current task
        li.next();
        //remove it
        li.remove();
        tottask--;
        lblttask.setText("" + tottask);
        //if we have zero now, blank screen
        if (tottask == 0) {
            txtname.setText("");
            txtdescription.setText("");
            curtask = 0;
            lblctask.setText("n/a");
            return;
        } //or go to previous task to show it if not on the first task
        else if (curtask > 1) {
            t = (Task) li.previous();
            curtask--;
            lblctask.setText("" + curtask);
        } //if on the first task
        else {
            li.next();
            t = (Task) li.previous();
        }

        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_mnuremovecurrenttaskActionPerformed

    private void mnurestorecurrenttaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestorecurrenttaskActionPerformed
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
        lblttask.setText("");
        lblctask.setText("");
    }//GEN-LAST:event_mnurestorecurrenttaskActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        if (curtask == 0) {
            return;
        }
        curtask--;
        lblctask.setText("" + curtask);
        li.previous();//passes over current task
        li.previous();//passes over next task
        t = (Task) li.next();//get in front of task
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnprevActionPerformed

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
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lblttask;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuinsertafter;
    private javax.swing.JMenuItem mnuinsertbefore;
    private javax.swing.JMenuItem mnuremovecurrenttask;
    private javax.swing.JMenuItem mnureplacecurrenttask;
    private javax.swing.JMenuItem mnurestorecurrenttask;
    private javax.swing.JMenuItem mnushowall;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
