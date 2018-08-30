/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cityu.ces.gui;

import edu.cityu.ces.domain.Course;
import edu.cityu.ces.manager.CourseEnrollmentManager;

/**
 *
 * @author Timmy
 */
public class Course_Panel extends javax.swing.JPanel {
	
	private CourseEnrollmentManager courseEnrollmentManager;

    /**
     * Creates new form Crouse_Panel
     */
    public Course_Panel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_course_ID = new javax.swing.JLabel();
        txt_ncoruse_id = new javax.swing.JTextField();
        lbl_ncourse_title = new javax.swing.JLabel();
        txt_ncrouse_title = new javax.swing.JTextField();
        lbl_course_lv = new javax.swing.JLabel();
        cbox_nlevel = new javax.swing.JComboBox<>();
        btn_crousecreate = new javax.swing.JButton();
        btn_courseupdate = new javax.swing.JButton();
        btn_coursedelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));
        setName("course_panel"); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Course", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 24), new java.awt.Color(51, 0, 255))); // NOI18N

        lbl_course_ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_course_ID.setText("Course ID:");
        lbl_course_ID.setName("lbl_course_ID"); // NOI18N

        txt_ncoruse_id.setName("txt_ncoruse_id"); // NOI18N

        lbl_ncourse_title.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_ncourse_title.setText("Title:");
        lbl_ncourse_title.setName("lbl_ncourse_title"); // NOI18N

        txt_ncrouse_title.setName("txt_ncrouse_title"); // NOI18N

        lbl_course_lv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_course_lv.setText("Level:");
        lbl_course_lv.setName("lbl_course_lv"); // NOI18N

        cbox_nlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9" }));
        cbox_nlevel.setName("cbox_nlevel"); // NOI18N

        btn_crousecreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_crousecreate.setText("Create");
        btn_crousecreate.setName("btn_crousecreate"); // NOI18N
        btn_crousecreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crousecreateActionPerformed(evt);
            }
        });

        btn_courseupdate.setText("Update");
        btn_courseupdate.setName("btn_courseupdate"); // NOI18N
        btn_courseupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_courseupdateActionPerformed(evt);
            }
        });

        btn_coursedelete.setText("Delete");
        btn_coursedelete.setName("btn_coursedelete"); // NOI18N
        btn_coursedelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coursedeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_course_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ncoruse_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ncourse_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ncrouse_title, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_course_lv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_nlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_crousecreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_courseupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_coursedelete)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_course_ID)
                    .addComponent(txt_ncoruse_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ncourse_title)
                    .addComponent(txt_ncrouse_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_course_lv)
                    .addComponent(cbox_nlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_crousecreate)
                    .addComponent(btn_courseupdate)
                    .addComponent(btn_coursedelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crousecreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crousecreateActionPerformed
        // TODO add your handling code here:
        Course course = new Course();
        course.setCourseID(txt_ncoruse_id.toString());
        course.setTitle(txt_ncrouse_title.toString());
        course.setLevel(cbox_nlevel.toString());
    }//GEN-LAST:event_btn_crousecreateActionPerformed

    private void btn_courseupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_courseupdateActionPerformed
        // TODO add your handling code here:
        Course course = new Course();
        if(course.getCourseID() == txt_ncoruse_id.toString()){
            course.setTitle(txt_ncrouse_title.toString());
            course.setLevel(cbox_nlevel.toString());
        }
    }//GEN-LAST:event_btn_courseupdateActionPerformed

    private void btn_coursedeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coursedeleteActionPerformed
        // TODO add your handling code here:
        Course course = new Course();
        if(course.getCourseID()== txt_ncoruse_id.toString()){
            txt_ncoruse_id.remove(this);
        }
        if(course.getTitle()== txt_ncrouse_title.toString()){
            txt_ncrouse_title.remove(this);
        }
        if(course.getLevel()== cbox_nlevel.toString()){
            cbox_nlevel.remove(this);
        }
    }//GEN-LAST:event_btn_coursedeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_coursedelete;
    private javax.swing.JButton btn_courseupdate;
    private javax.swing.JButton btn_crousecreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbox_nlevel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_course_ID;
    private javax.swing.JLabel lbl_course_lv;
    private javax.swing.JLabel lbl_ncourse_title;
    private javax.swing.JTextField txt_ncoruse_id;
    private javax.swing.JTextField txt_ncrouse_title;
    // End of variables declaration//GEN-END:variables
    
    public CourseEnrollmentManager getCourseEnrollmentManager() {
		return courseEnrollmentManager;
	}

	public void setCourseEnrollmentManager(CourseEnrollmentManager courseEnrollmentManager) {
		this.courseEnrollmentManager = courseEnrollmentManager;
	}
}
