package principal.mysql.hibernate.Views;

import principal.mysql.hibernate.Controllers.MainController;

public class MainFrame extends javax.swing.JFrame {

    private static MainController mainController;
    
    public MainFrame() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_base = new javax.swing.JPanel();
        jTextField_name = new javax.swing.JTextField();
        jLabel_name = new javax.swing.JLabel();
        jLabel_surname = new javax.swing.JLabel();
        jTextField_surname = new javax.swing.JTextField();
        jLabel_age = new javax.swing.JLabel();
        jSpinner_age = new javax.swing.JSpinner();
        btn_save_to_db = new javax.swing.JButton();
        btn_connect = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jScrollPane_allData = new javax.swing.JScrollPane();
        jTable_users = new javax.swing.JTable();
        jTextField_job = new javax.swing.JTextField();
        jLabel_trabajo = new javax.swing.JLabel();
        jLabel_cargaEmpleado = new javax.swing.JLabel();
        jLabel_tipoEmpleado = new javax.swing.JLabel();
        jTextField_tipoEmpleado = new javax.swing.JTextField();
        jLabel_cargaCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HIBERNATE TEST");
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jLabel_name.setText("NOMBRE");

        jLabel_surname.setText("APELLIDO");

        jLabel_age.setText("EDAD");

        btn_save_to_db.setText("CARGAR AL SISTEMA");
        btn_save_to_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save_to_dbActionPerformed(evt);
            }
        });

        btn_connect.setText("CONECTAR A LA BASE DE DATOS");
        btn_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_connectActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("USUARIOS CARGADOS EN EL SISTEMA");

        jTable_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "EDAD", "TIPO EMP", "TRABAJO"
            }
        ));
        jScrollPane_allData.setViewportView(jTable_users);

        jLabel_trabajo.setText("TRABAJO");

        jLabel_cargaEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_cargaEmpleado.setText("CARGA EMPLEADO");

        jLabel_tipoEmpleado.setText("TIPO EMPLEADO");

        jLabel_cargaCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_cargaCliente.setText("CARGA CLIENTE");

        javax.swing.GroupLayout jPanel_baseLayout = new javax.swing.GroupLayout(jPanel_base);
        jPanel_base.setLayout(jPanel_baseLayout);
        jPanel_baseLayout.setHorizontalGroup(
            jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_baseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_save_to_db, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_connect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane_allData, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addGroup(jPanel_baseLayout.createSequentialGroup()
                        .addGroup(jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_surname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_surname)
                            .addComponent(jTextField_name))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_age)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner_age, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_cargaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_baseLayout.createSequentialGroup()
                            .addComponent(jLabel_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_job))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_baseLayout.createSequentialGroup()
                            .addComponent(jLabel_tipoEmpleado)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_tipoEmpleado)))
                    .addComponent(jLabel_cargaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_baseLayout.setVerticalGroup(
            jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_baseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_connect)
                .addGap(18, 18, 18)
                .addGroup(jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_name)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_age)
                    .addComponent(jSpinner_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_surname)
                    .addComponent(jTextField_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_cargaEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tipoEmpleado)
                    .addComponent(jTextField_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_cargaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_save_to_db)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_allData, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_save_to_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save_to_dbActionPerformed
        if(mainController == null){
            javax.swing.JOptionPane.showMessageDialog(null, "DEBE CONECTARSE A LA BASE DE DATOS");
        }else{
            mainController.Add(this.jTable_users,
                    this.jTextField_name.getText(), 
                    this.jTextField_surname.getText(), 
                    Integer.parseInt(this.jSpinner_age.getValue().toString()),
                    this.jTextField_job.getText(),
                    this.jTextField_tipoEmpleado.getText()
            );    
        }
        
    }//GEN-LAST:event_btn_save_to_dbActionPerformed

    private void btn_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_connectActionPerformed
        mainController = new MainController(this.jTable_users);
    }//GEN-LAST:event_btn_connectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_connect;
    private javax.swing.JButton btn_save_to_db;
    private javax.swing.JLabel jLabel_age;
    private javax.swing.JLabel jLabel_cargaCliente;
    private javax.swing.JLabel jLabel_cargaEmpleado;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_surname;
    private javax.swing.JLabel jLabel_tipoEmpleado;
    private javax.swing.JLabel jLabel_trabajo;
    private javax.swing.JPanel jPanel_base;
    private javax.swing.JScrollPane jScrollPane_allData;
    private javax.swing.JSpinner jSpinner_age;
    private javax.swing.JTable jTable_users;
    private javax.swing.JTextField jTextField_job;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_surname;
    private javax.swing.JTextField jTextField_tipoEmpleado;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
