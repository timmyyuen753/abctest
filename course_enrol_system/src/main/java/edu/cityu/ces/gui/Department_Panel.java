/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cityu.ces.gui;
import edu.cityu.ces.domain.Department;
import edu.cityu.ces.manager.CourseEnrollmentManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Timmy
 */
public class Department_Panel extends javax.swing.JPanel {
	
	private CourseEnrollmentManager courseEnrollmentManager;

    /**
     * Creates new form Department_Panel
     */
    public Department_Panel() {
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

        jPanel1 = new javax.swing.JPanel();
        lbl_ndepartment = new javax.swing.JLabel();
        txt_ndepartment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_ndeptname = new javax.swing.JTextField();
        lbl_deptloc = new javax.swing.JLabel();
        txt_deptloc = new javax.swing.JTextField();
        btn_deptcreate = new javax.swing.JButton();
        btn_deptupdate = new javax.swing.JButton();
        btn_deptdelete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_deptconls = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        setName("department_panel"); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 480));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        lbl_ndepartment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_ndepartment.setText("Department ID:");
        lbl_ndepartment.setName("lbl_ndepartment"); // NOI18N

        txt_ndepartment.setName("txt_ndepartment"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Department Name:");
        jLabel1.setName("lbl_deptname"); // NOI18N

        txt_ndeptname.setName("txt_ndeptname"); // NOI18N

        lbl_deptloc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbl_deptloc.setText("Loccation:");
        lbl_deptloc.setName("lbl_deptloc"); // NOI18N

        txt_deptloc.setName("txt_deptloc"); // NOI18N

        btn_deptcreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_deptcreate.setText("Create");
        btn_deptcreate.setName("btn_deptcreate"); // NOI18N
        btn_deptcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deptcreateActionPerformed(evt);
            }
        });

        btn_deptupdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_deptupdate.setText("Update");
        btn_deptupdate.setName("btn_deptupdate"); // NOI18N
        btn_deptupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deptupdateActionPerformed(evt);
            }
        });

        btn_deptdelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_deptdelete.setText("Delete");
        btn_deptdelete.setName("btn_deptdelete"); // NOI18N
        btn_deptdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deptdeleteActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_edit.setText("Find");
        btn_edit.setActionCommand("Edit");
        btn_edit.setName("btn_edit"); // NOI18N
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_ndepartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ndepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ndeptname, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_deptloc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_deptloc)))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn_deptcreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deptupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_deptdelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_edit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ndepartment)
                    .addComponent(txt_ndepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ndeptname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_deptloc)
                    .addComponent(txt_deptloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_deptcreate)
                    .addComponent(btn_deptupdate)
                    .addComponent(btn_deptdelete)
                    .addComponent(btn_edit)))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Timmy\\Desktop\\新增資料夾 (2)\\course_enrol_system\\src\\main\\java\\edu\\cityu\\ces\\gui\\image\\cityu.png")); // NOI18N

        textarea_deptconls.setColumns(20);
        textarea_deptconls.setRows(5);
        textarea_deptconls.setName("textarea_deptconls"); // NOI18N
        jScrollPane1.setViewportView(textarea_deptconls);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deptcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deptcreateActionPerformed
        // TODO add your handling code here:
        Department department = new Department();
        department.setDeptID(txt_ndepartment.getText());
        department.setDeptName(txt_ndeptname.getText());
        department.setLocation(txt_deptloc.getText());
        courseEnrollmentManager.addDepartment(department);
        String output = "Department has been create.";
        System.out.println(output);
        textarea_deptconls.setText(output);
        
    }//GEN-LAST:event_btn_deptcreateActionPerformed

    private void btn_deptupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deptupdateActionPerformed
        // TODO add your handling code here
        Department oldDept= new Department();
        oldDept = courseEnrollmentManager.findDepartmentByDepartmentID(txt_ndepartment.getText());
        
        Department newDept = new Department();
        newDept.setDeptID(txt_ndepartment.getText());
        newDept.setDeptName(txt_ndeptname.getText());
        newDept.setLocation(txt_deptloc.getText());

        courseEnrollmentManager.updateDepartment(oldDept, newDept);
        
        String output = "Department " + newDept.getDeptName() + " has been updated.";
        System.out.println(output);
        textarea_deptconls.setText(output);
        
        
    }//GEN-LAST:event_btn_deptupdateActionPerformed

    private void btn_deptdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deptdeleteActionPerformed
        // TODO add your handling code here:
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p==0){
        Department department = new Department();
        department = courseEnrollmentManager.findDepartmentByDepartmentID(txt_ndepartment.getText());
        
        courseEnrollmentManager.deleteDepartment(department);
        String output = "Department has been deleted.";
        System.out.println(output);
        textarea_deptconls.setText(output);
        }
        
    }//GEN-LAST:event_btn_deptdeleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        Department department = new Department();
        department = courseEnrollmentManager.findDepartmentByDepartmentID(txt_ndepartment.getText());
        txt_ndeptname.setText(department.getDeptName());
        txt_deptloc.setText(department.getLocation());  
    }//GEN-LAST:event_btn_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deptcreate;
    private javax.swing.JButton btn_deptdelete;
    private javax.swing.JButton btn_deptupdate;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_deptloc;
    private javax.swing.JLabel lbl_ndepartment;
    private javax.swing.JTextArea textarea_deptconls;
    private javax.swing.JTextField txt_deptloc;
    private javax.swing.JTextField txt_ndepartment;
    private javax.swing.JTextField txt_ndeptname;
    // End of variables declaration//GEN-END:variables
    
    public CourseEnrollmentManager getCourseEnrollmentManager() {
		return courseEnrollmentManager;
	}

	public void setCourseEnrollmentManager(CourseEnrollmentManager courseEnrollmentManager) {
		this.courseEnrollmentManager = courseEnrollmentManager;
	}
}