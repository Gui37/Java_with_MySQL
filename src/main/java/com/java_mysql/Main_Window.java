/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.java_mysql;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Main_Window extends javax.swing.JFrame {

    /**
     * Creates new form Main_Window
     */
    public Main_Window() {
        initComponents();
        show_products_JTable();
      
    }
    String ImgPath = null; 
        int pos =0;

    public Connection getConnection (){
        Connection con = null;
       
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/java_test","root","1234568");
        return con;
        }
        catch (SQLException ex){
            Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE,null,ex); 
         JOptionPane.showMessageDialog(null,"Not Connected");
        return null;}
    }
    public boolean checkInputs(){
        if(txt_name.getText()==null|| null==txt_price.getText() || jDateAdd.getDate()== null){
            return false;
        } else{
            try {
                Float.parseFloat(txt_price.getText());
                return true;
            } catch (Exception e) {
                return false;
            }
            }
    }
    
    public ImageIcon ResizeImage(String ImagePath, byte[] pic){
        ImageIcon myImage = null;
        if(ImagePath != null){
            myImage = new ImageIcon(ImagePath);
        } else{
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img2 =img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Products = new javax.swing.JTable();
        Btn_Choose_Image = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_Insert = new javax.swing.JButton();
        btn_First = new javax.swing.JButton();
        btn_Next = new javax.swing.JButton();
        btn_Last = new javax.swing.JButton();
        btn_Prev = new javax.swing.JButton();
        lbl_image = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateAdd = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(142, 138, 147));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Image:");

        txt_price.setPreferredSize(new java.awt.Dimension(64, 42));

        txt_name.setPreferredSize(new java.awt.Dimension(64, 42));

        txt_id.setEnabled(false);
        txt_id.setPreferredSize(new java.awt.Dimension(64, 42));

        jTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Products.getTableHeader().setReorderingAllowed(false);
        jTable_Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Products);
        if (jTable_Products.getColumnModel().getColumnCount() > 0) {
            jTable_Products.getColumnModel().getColumn(0).setResizable(false);
            jTable_Products.getColumnModel().getColumn(1).setResizable(false);
            jTable_Products.getColumnModel().getColumn(2).setResizable(false);
            jTable_Products.getColumnModel().getColumn(3).setResizable(false);
        }

        Btn_Choose_Image.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Choose_Image.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Choose_Image.setText("Choose Image");
        Btn_Choose_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Choose_ImageActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_Insert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Insert.setForeground(new java.awt.Color(0, 0, 0));
        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });

        btn_First.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_First.setForeground(new java.awt.Color(0, 0, 0));
        btn_First.setText("|<-First");
        btn_First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FirstActionPerformed(evt);
            }
        });

        btn_Next.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Next.setForeground(new java.awt.Color(0, 0, 0));
        btn_Next.setText("Next ->");
        btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextActionPerformed(evt);
            }
        });

        btn_Last.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Last.setForeground(new java.awt.Color(0, 0, 0));
        btn_Last.setText("Last ->|");
        btn_Last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LastActionPerformed(evt);
            }
        });

        btn_Prev.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Prev.setForeground(new java.awt.Color(0, 0, 0));
        btn_Prev.setText("<- Previous");
        btn_Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrevActionPerformed(evt);
            }
        });

        lbl_image.setBackground(new java.awt.Color(153, 153, 153));
        lbl_image.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date:");

        jDateAdd.setDateFormatString("dd/MM/yyyy");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(75, 88, 92));
        jLabel6.setText("Test App");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_First)
                .addGap(18, 18, 18)
                .addComponent(btn_Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Last)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(138, 138, 138))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Choose_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Choose_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Last, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_First, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Choose_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Choose_ImageActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_image.setIcon(ResizeImage(path, null));
            ImgPath = path;
        } else{
            System.out.println("No file selected");
        }
        
    }//GEN-LAST:event_Btn_Choose_ImageActionPerformed

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        if(checkInputs() && ImgPath != null){
            try {
                  
                Connection con =  getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO product(name,price,add_date,image) VALUES(?,?,?,?);");
                ps.setString(1,txt_name.getText());
                ps.setString(2,txt_price.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String addDate = dateFormat.format(jDateAdd.getDate());
                ps.setString(3,addDate);
                InputStream img = new FileInputStream(new File(ImgPath));
                ps.setBlob(4,img);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Inserted");
                txt_id.setText("");
                txt_price.setText("");
                txt_name.setText("");
                jDateAdd.setDate(null);
                lbl_image.setIcon(null);
                show_products_JTable();
            } catch (Exception e) {
                Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE,null,e); 

            }
        }else{
            JOptionPane.showMessageDialog(null,"One or more fields are Empty. Please Verify");
        }
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (checkInputs() && txt_id.getText() != null) {
            String UpdateQuery=null;
            PreparedStatement ps= null;
            Connection con = getConnection();
            
            //update without image
            if(ImgPath == null){
                try {
                    UpdateQuery= "UPDATE product SET name = ?, price = ?, add_date = ? WHERE id=?";
                    ps = con.prepareStatement(UpdateQuery);
                    ps.setString(1,txt_name.getText());
                    ps.setString(2,txt_price.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    String addDate = dateFormat.format(jDateAdd.getDate());
                    ps.setString(3,addDate);
                    ps.setInt(4, Integer.parseInt(txt_id.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Updated");
                    txt_id.setText("");
                    txt_price.setText("");
                    txt_name.setText("");
                    jDateAdd.setDate(null);
                    lbl_image.setIcon(null);
                    show_products_JTable();
                } catch (SQLException ex) {
                    Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else{
                try {
                    UpdateQuery = "UPDATE product SET name = ?, price = ?, add_date = ?, image = ? WHERE id=?";
                    ps = con.prepareStatement(UpdateQuery);
                    ps.setString(1, txt_name.getText());
                    ps.setString(2, txt_price.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    String addDate = dateFormat.format(jDateAdd.getDate());
                    ps.setString(3,addDate);
                    InputStream img = new FileInputStream(new File(ImgPath));
                    ps.setBlob(4, img);
                    ps.setInt(5, Integer.parseInt(txt_id.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Updated");
                    txt_id.setText("");
                    txt_price.setText("");
                    txt_name.setText("");
                    jDateAdd.setDate(null);
                    lbl_image.setIcon(null);
                    show_products_JTable();
                } catch (Exception sQLException) {
                }
            }
        } else{
            JOptionPane.showMessageDialog(null, "One or more fields are empty. Please verify");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String DeleteQuery = "DELETE FROM product WHERE id=?";
        if (!txt_id.getText().equals("")) {
            try {
                Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement(DeleteQuery);
                int id = Integer.parseInt(txt_id.getText());
                ps.setInt(1,id);
                ps.executeUpdate();
                show_products_JTable();
                JOptionPane.showMessageDialog(null, "Deleted");
                txt_id.setText("");
                txt_price.setText("");
                txt_name.setText("");
                jDateAdd.setDate(null);
                lbl_image.setIcon(null);
                show_products_JTable();
            } catch (SQLException ex) {
                Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Not Deleted");
            }
         } else{
            JOptionPane.showMessageDialog(null, "ID field is empty. Please verify");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProductsMouseClicked
        int index= jTable_Products.getSelectedRow();
        showIndex(index);
    }//GEN-LAST:event_jTable_ProductsMouseClicked

    private void btn_FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FirstActionPerformed
        pos =0;
        showIndex(pos);
    }//GEN-LAST:event_btn_FirstActionPerformed

    private void btn_LastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LastActionPerformed
        pos = getProductList().size()-1;
        showIndex(pos);
    }//GEN-LAST:event_btn_LastActionPerformed

    private void btn_PrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrevActionPerformed
        pos--;
        if (pos < 0) {
            pos = getProductList().size()-1;
        }
        showIndex(pos);
    }//GEN-LAST:event_btn_PrevActionPerformed

    private void btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextActionPerformed
        pos++;
        if (pos >= getProductList().size()) {
            pos = getProductList().size()-1;
        }
        showIndex(pos);
    }//GEN-LAST:event_btn_NextActionPerformed

    public ArrayList<Product> getProductList(){
        ArrayList<Product> productList = new ArrayList<Product>();
            Connection con = getConnection();
            String query = "SELECT * FROM product";
            
            Statement st;
            ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Product product;
            
            while(rs.next()){
                product = new Product(rs.getInt("id"), rs.getString("name"), Float.parseFloat(rs.getString("price")),rs.getString("add_date"), rs.getBytes("image"));
                productList.add(product);
            }
        } catch (Exception exception) {
        }
        return productList;
    }
    
    public void show_products_JTable(){
        ArrayList<Product> list = getProductList();
        DefaultTableModel model = (DefaultTableModel)jTable_Products.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getNome();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getAdd_date();
            
            model.addRow(row);
        }
    }
    
    public void showIndex(int index){
        txt_id.setText(Integer.toString(getProductList().get(index).getId()));
        txt_name.setText(getProductList().get(index).getNome());
        txt_price.setText(Float.toString(getProductList().get(index).getPrice()));
        Date addDate = null;
        try {
            addDate = null;            
            addDate = new SimpleDateFormat("dd-MM-yyyy").parse(getProductList().get(index).getAdd_date());
            jDateAdd.setDate(addDate);
        } catch (ParseException parseException) {
        }
        lbl_image.setIcon(ResizeImage(null,getProductList().get(index).getImage()));
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
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Choose_Image;
    private javax.swing.JButton btn_First;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Last;
    private javax.swing.JButton btn_Next;
    private javax.swing.JButton btn_Prev;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Products;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
