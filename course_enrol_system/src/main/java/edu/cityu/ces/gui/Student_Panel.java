/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cityu.ces.gui;

import java.util.Date;

import edu.cityu.ces.manager.CourseEnrollmentManager;
import edu.cityu.ces.domain.Student;
import edu.cityu.ces.ContactEditorUI;
import edu.cityu.ces.SpringMongoConfiguration;
import edu.cityu.ces.dao.StudentRepository;
import edu.cityu.ces.domain.Course;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.cityu.ces.domain.Enrolled;
/**
 *
 * @author Timmy
 */
public class Student_Panel extends javax.swing.JPanel {
	
	private CourseEnrollmentManager courseEnrollmentManager;
	
	/**
     * Creates new form Student_Panel
     */
    public Student_Panel() {
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

        newstudent_panel = new javax.swing.JPanel();
        lbl_newstudname = new javax.swing.JLabel();
        txt_newstudname = new javax.swing.JTextField();
        lbl_newstud_DOB = new javax.swing.JLabel();
        btn_addstud = new javax.swing.JButton();
        txt_newstud_DOB = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl_studname = new javax.swing.JLabel();
        lbl_stud_DOB = new javax.swing.JLabel();
        btn_updatstud = new javax.swing.JButton();
        btn_delstud = new javax.swing.JButton();
        txt_studname = new javax.swing.JTextField();
        txt_stud_DOB = new javax.swing.JFormattedTextField();
        lbl_studid = new javax.swing.JLabel();
        txt_studid = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbl_regstudid = new javax.swing.JLabel();
        txt_regstudid = new javax.swing.JTextField();
        lbl_regcourseid = new javax.swing.JLabel();
        cbox_regcourseid = new javax.swing.JComboBox<>();
        lbl_regyear = new javax.swing.JLabel();
        cbox_regyear = new javax.swing.JComboBox<>();
        lbl_regdate = new javax.swing.JLabel();
        btn_addregister = new javax.swing.JButton();
        txt_regdate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        setName("student_panel"); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 480));

        newstudent_panel.setBackground(new java.awt.Color(255, 204, 204));
        newstudent_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 24), new java.awt.Color(255, 0, 51))); // NOI18N
        newstudent_panel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newstudent_panel.setName("newstudent_panel"); // NOI18N

        lbl_newstudname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_newstudname.setText("Name:");
        lbl_newstudname.setName("lbl_newstudname"); // NOI18N

        txt_newstudname.setBackground(new java.awt.Color(204, 255, 204));
        txt_newstudname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_newstudname.setName("txt_newstudname"); // NOI18N

        lbl_newstud_DOB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_newstud_DOB.setText("Date of Birth:");
        lbl_newstud_DOB.setName("lbl_newstud_DOB"); // NOI18N

        btn_addstud.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_addstud.setForeground(new java.awt.Color(0, 204, 204));
        btn_addstud.setText("ADD");
        btn_addstud.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 0), new java.awt.Color(255, 255, 0)));
        btn_addstud.setName("btn_addstud"); // NOI18N
        btn_addstud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addstudActionPerformed(evt);
            }
        });

        txt_newstud_DOB.setBackground(new java.awt.Color(204, 255, 204));
        txt_newstud_DOB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_newstud_DOB.setName("txt_newstud_DOB"); // NOI18N

        javax.swing.GroupLayout newstudent_panelLayout = new javax.swing.GroupLayout(newstudent_panel);
        newstudent_panel.setLayout(newstudent_panelLayout);
        newstudent_panelLayout.setHorizontalGroup(
            newstudent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newstudent_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newstudent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newstudent_panelLayout.createSequentialGroup()
                        .addComponent(lbl_newstudname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_newstudname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lbl_newstud_DOB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_newstud_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_addstud, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        newstudent_panelLayout.setVerticalGroup(
            newstudent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newstudent_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newstudent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_newstudname)
                    .addComponent(txt_newstudname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_newstud_DOB)
                    .addComponent(txt_newstud_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btn_addstud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 24), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel2.setName(""); // NOI18N

        lbl_studname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_studname.setText("Name:");
        lbl_studname.setName("lbl_studname"); // NOI18N

        lbl_stud_DOB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_stud_DOB.setText("Date of Birth:");
        lbl_stud_DOB.setName("lbl_stud_DOB"); // NOI18N

        btn_updatstud.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_updatstud.setForeground(new java.awt.Color(0, 204, 204));
        btn_updatstud.setText("Update");
        btn_updatstud.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, java.awt.Color.yellow));
        btn_updatstud.setName("btn_updatstud"); // NOI18N
        btn_updatstud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updatstudActionPerformed(evt);
            }
        });

        btn_delstud.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_delstud.setForeground(new java.awt.Color(0, 204, 204));
        btn_delstud.setText("Delete");
        btn_delstud.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, java.awt.Color.yellow));
        btn_delstud.setName("btn_delstud"); // NOI18N
        btn_delstud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delstudActionPerformed(evt);
            }
        });

        txt_studname.setBackground(new java.awt.Color(204, 255, 204));
        txt_studname.setName("txt_studname"); // NOI18N

        txt_stud_DOB.setBackground(new java.awt.Color(204, 255, 204));
        txt_stud_DOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd'/'MM'/'yyyy"))));
        txt_stud_DOB.setToolTipText("");
        txt_stud_DOB.setName("txt_stud_DOB"); // NOI18N

        lbl_studid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_studid.setText("Student ID: ");
        lbl_studid.setName("lbl_studid"); // NOI18N

        txt_studid.setBackground(new java.awt.Color(204, 255, 204));
        txt_studid.setName("txt_studid"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_updatstud, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delstud, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_studname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_studname, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_stud_DOB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_stud_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_studid)
                        .addGap(18, 18, 18)
                        .addComponent(txt_studid)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_studname)
                    .addComponent(txt_studname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_studid)
                    .addComponent(txt_studid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_updatstud, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delstud, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stud_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_stud_DOB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 24), new java.awt.Color(255, 0, 51))); // NOI18N

        lbl_regstudid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_regstudid.setText("Student ID:");
        lbl_regstudid.setName("lbl_regstudid"); // NOI18N

        txt_regstudid.setBackground(new java.awt.Color(204, 255, 204));
        txt_regstudid.setName("txt_stu_ID"); // NOI18N

        lbl_regcourseid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_regcourseid.setText("Course ID:");
        lbl_regcourseid.setName("lbl_regcourseid"); // NOI18N

        cbox_regcourseid.setBackground(new java.awt.Color(204, 255, 204));
        cbox_regcourseid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbox_regcourseid.setName("cbox_regcourseid"); // NOI18N
        cbox_regcourseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_regcourseidActionPerformed(evt);
            }
        });

        lbl_regyear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_regyear.setText("Year:");
        lbl_regyear.setName("lbl_regyear"); // NOI18N

        cbox_regyear.setBackground(new java.awt.Color(204, 255, 204));
        cbox_regyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018" }));
        cbox_regyear.setName("cbox_regyear"); // NOI18N

        lbl_regdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_regdate.setText("Date");
        lbl_regdate.setName("lbl_regdate"); // NOI18N

        btn_addregister.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_addregister.setForeground(new java.awt.Color(0, 204, 204));
        btn_addregister.setText("ADD");
        btn_addregister.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 0), new java.awt.Color(255, 255, 0)));
        btn_addregister.setName("btn_addregister"); // NOI18N
        btn_addregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addregisterActionPerformed(evt);
            }
        });

        txt_regdate.setBackground(new java.awt.Color(204, 255, 204));
        txt_regdate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_regdate.setName("txt_regdate"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_regstudid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_regstudid, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_regcourseid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_regcourseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_regyear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_regyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_regdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_regdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_addregister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_regstudid)
                    .addComponent(txt_regstudid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_regcourseid)
                    .addComponent(cbox_regcourseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_regyear)
                    .addComponent(cbox_regyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_regdate)
                    .addComponent(txt_regdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btn_addregister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newstudent_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newstudent_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addstudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addstudActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        student.setStudentID(courseEnrollmentManager.generateNewStudentID());
        student.setStuName(txt_newstudname.getText());
        String dataInString = txt_newstud_DOB.getText();
        System.out.println("DOB string: " + dataInString);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date dob = formatter.parse(dataInString);
            student.setDob(dob);
            
            courseEnrollmentManager.addStudent(student);
        } catch (ParseException ex) {
            Logger.getLogger(Student_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_addstudActionPerformed

    private void btn_updatstudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updatstudActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        if(String.valueOf(student.getStudentID()).equals(txt_studid.toString())) {
                  student.setStuName(txt_newstudname.getText());
        String dataInString = txt_newstud_DOB.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date dob = formatter.parse(dataInString);
            student.setDob(dob);
        } catch (ParseException ex) {
            Logger.getLogger(Student_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btn_updatstudActionPerformed

    private void btn_delstudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delstudActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        if(String.valueOf(student.getStudentID()).equals(txt_studid.getText())) {
            txt_studid.remove(this);
        }
        if(student.getStuName().equalsIgnoreCase(txt_newstudname.getText())){
            txt_newstudname.remove(this);
        }
    }//GEN-LAST:event_btn_delstudActionPerformed

    private void cbox_regcourseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_regcourseidActionPerformed
        // TODO add your handling code here:
        Course course = new Course();
        String cbox_regcourseid = course.getCourseID();
    }//GEN-LAST:event_cbox_regcourseidActionPerformed

    private void btn_addregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addregisterActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        if (String.valueOf(student.getStudentID()).equals(txt_regstudid.getText())) {
        Enrolled enrolled = new Enrolled();
        enrolled.setCourseID(cbox_regcourseid.toString());
        enrolled.setYear(cbox_regyear.toString());
        String dataInString = txt_regdate.getText();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date enrolldate = formatter.parse(dataInString);
            enrolled.setEnrollDate(enrolldate);
        } catch (ParseException ex) {
            Logger.getLogger(Student_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_btn_addregisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addregister;
    private javax.swing.JButton btn_addstud;
    private javax.swing.JButton btn_delstud;
    private javax.swing.JButton btn_updatstud;
    private javax.swing.JComboBox<String> cbox_regcourseid;
    private javax.swing.JComboBox<String> cbox_regyear;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_newstud_DOB;
    private javax.swing.JLabel lbl_newstudname;
    private javax.swing.JLabel lbl_regcourseid;
    private javax.swing.JLabel lbl_regdate;
    private javax.swing.JLabel lbl_regstudid;
    private javax.swing.JLabel lbl_regyear;
    private javax.swing.JLabel lbl_stud_DOB;
    private javax.swing.JLabel lbl_studid;
    private javax.swing.JLabel lbl_studname;
    private javax.swing.JPanel newstudent_panel;
    private javax.swing.JTextField txt_newstud_DOB;
    private javax.swing.JTextField txt_newstudname;
    private javax.swing.JTextField txt_regdate;
    private javax.swing.JTextField txt_regstudid;
    private javax.swing.JFormattedTextField txt_stud_DOB;
    private javax.swing.JTextField txt_studid;
    private javax.swing.JTextField txt_studname;
    // End of variables declaration//GEN-END:variables
    
    public CourseEnrollmentManager getCourseEnrollmentManager() {
		return courseEnrollmentManager;
	}

	public void setCourseEnrollmentManager(CourseEnrollmentManager courseEnrollmentManager) {
		this.courseEnrollmentManager = courseEnrollmentManager;
	}
}