
package com.mycompany.moneda;

import javax.swing.JOptionPane;


public class ConversorDeMonedas extends javax.swing.JFrame {
int con1;
   
    public ConversorDeMonedas() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        label1 = new java.awt.Label();
        lbl1 = new javax.swing.JLabel();
        lblpesos = new javax.swing.JLabel();
        lbldolares = new javax.swing.JLabel();
        lbleuros = new javax.swing.JLabel();
        lbllibras = new javax.swing.JLabel();
        txtconvertir = new javax.swing.JTextField();
        txtpesos = new javax.swing.JTextField();
        txtdolares = new javax.swing.JTextField();
        txteuros = new javax.swing.JTextField();
        txtlibras = new javax.swing.JTextField();
        btnpesos = new javax.swing.JButton();
        btndolares = new javax.swing.JButton();
        btneuros = new javax.swing.JButton();
        btnlibras = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setText("valor a convertir");

        lblpesos.setText("Pesos");

        lbldolares.setText("Dolares");

        lbleuros.setText("Euros");

        lbllibras.setText("Libras");

        txtconvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconvertirActionPerformed(evt);
            }
        });
        txtconvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconvertirKeyTyped(evt);
            }
        });

        txtpesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesosActionPerformed(evt);
            }
        });

        txtdolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdolaresActionPerformed(evt);
            }
        });

        txteuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteurosActionPerformed(evt);
            }
        });

        txtlibras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlibrasActionPerformed(evt);
            }
        });

        btnpesos.setText("Pesos");
        btnpesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesosActionPerformed(evt);
            }
        });

        btndolares.setText("Dolares");
        btndolares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndolaresActionPerformed(evt);
            }
        });

        btneuros.setText("Euros");
        btneuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneurosActionPerformed(evt);
            }
        });

        btnlibras.setText("Libras");
        btnlibras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlibrasActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpesos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesos)
                    .addComponent(txtpesos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtlibras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbldolares, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(lbleuros, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(lbllibras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(txtdolares, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(txteuros, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btndolares)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneuros)))
                        .addGap(98, 98, 98)
                        .addComponent(btnlibras)
                        .addGap(185, 185, 185))))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnsalir)
                .addGap(159, 159, 159)
                .addComponent(btnBorrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtconvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtconvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndolares)
                    .addComponent(btneuros)
                    .addComponent(btnlibras)
                    .addComponent(btnpesos))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpesos)
                    .addComponent(lbllibras)
                    .addComponent(lbleuros)
                    .addComponent(lbldolares))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlibras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txteuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalir)
                    .addComponent(btnBorrar))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>                        





    private void txtconvertirActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
    }                                            

    private void txtpesosActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void txtlibrasActionPerformed(java.awt.event.ActionEvent evt) {                                          
      
    }                                         

    private void txtconvertirKeyTyped(java.awt.event.KeyEvent evt) {                                      
char c=evt.getKeyChar();
boolean existe;
if(!Character.isDigit(c)&&Character.valueOf(c)!=46&&Character.valueOf(c)!=8)
{
    getToolkit().beep();
    evt.consume();
    JOptionPane.showMessageDialog(rootPane,"Ingrese un numero","Error de validacion",JOptionPane.ERROR_MESSAGE);
}
else
{
    if(Character.valueOf(c)==46)
    {
        con1++;
    }
    if(Character.valueOf(c)==8)
    {
        existe=validad1();
        if(!existe){con1=0;}
    }
}
if(con1>1)
{ 
    getToolkit().beep();evt.consume();
    JOptionPane.showMessageDialog(rootPane,"No puede habermas de un punto","Error de validacion",JOptionPane.ERROR_MESSAGE);
    con1=1;
    }

    }                                     

    private void btnpesosActionPerformed(java.awt.event.ActionEvent evt) {                                         
double pesos, pe=0,dol=0,li=0,eu=0;
pesos=Double.parseDouble(txtconvertir.getText());
pe=pesos;
dol=pesos*0.058;
li=pesos*0.055;
eu=pesos*0.047;
txtpesos.setText(String.valueOf(pe));
txtdolares.setText(String.valueOf(dol));
txteuros.setText(String.valueOf(eu));
txtlibras.setText(String.valueOf(li));
txtconvertir.setEnabled(false);
btnBorrar.setEnabled(true);
    }                                        

    private void btndolaresActionPerformed(java.awt.event.ActionEvent evt) {                                           
     double dolares, pe=0,dol=0,li=0,eu=0;
dolares=Double.parseDouble(txtconvertir.getText());
pe=dolares*17.22;
dol=dolares;
li=dolares*0.81;
eu=dolares*0.94;
txtpesos.setText(String.valueOf(pe));
txtdolares.setText(String.valueOf(dol));
txteuros.setText(String.valueOf(eu));
txtlibras.setText(String.valueOf(li));
txtconvertir.setEnabled(false);
btnBorrar.setEnabled(true);
    }                                          

    private void btneurosActionPerformed(java.awt.event.ActionEvent evt) {                                         
    double euros, pe=0,dol=0,li=0,eu=0;
euros=Double.parseDouble(txtconvertir.getText());
pe=euros*18.36;
dol=euros*1.07;
li=euros*0.86;
eu=euros;
txtpesos.setText(String.valueOf(pe));
txtdolares.setText(String.valueOf(dol));
txteuros.setText(String.valueOf(eu));
txtlibras.setText(String.valueOf(li));
txtconvertir.setEnabled(false);
btnBorrar.setEnabled(true);
    }                                        

    private void btnlibrasActionPerformed(java.awt.event.ActionEvent evt) {                                          
          double libras, pe=0,dol=0,li=0,eu=0;
libras=Double.parseDouble(txtconvertir.getText());
pe=libras*21.37;
dol=libras*1.24;
li=libras;
eu=libras*1.16;
txtpesos.setText(String.valueOf(pe));
txtdolares.setText(String.valueOf(dol));
txteuros.setText(String.valueOf(eu));
txtlibras.setText(String.valueOf(li));
txtconvertir.setEnabled(false);
btnBorrar.setEnabled(true);
    }                                         

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txtpesos.setText("");
        txtdolares.setText("");
        txteuros.setText("");
        txtlibras.setText("");
        txtconvertir.setText("");
        txtconvertir.setEnabled(true);
        btnpesos.setEnabled(true);
        btndolares.setEnabled(true);
        btneuros.setEnabled(true);
        btnlibras.setEnabled(true);
        
    }                                         

    private void txteurosActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txtdolaresActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConversorDeMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorDeMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorDeMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorDeMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorDeMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btndolares;
    private javax.swing.JButton btneuros;
    private javax.swing.JButton btnlibras;
    private javax.swing.JButton btnpesos;
    private javax.swing.JButton btnsalir;
    private java.awt.Label label1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbldolares;
    private javax.swing.JLabel lbleuros;
    private javax.swing.JLabel lbllibras;
    private javax.swing.JLabel lblpesos;
    private javax.swing.JTextField txtconvertir;
    private javax.swing.JTextField txtdolares;
    private javax.swing.JTextField txteuros;
    private javax.swing.JTextField txtlibras;
    private javax.swing.JTextField txtpesos;
    // End of variables declaration                   

    private boolean validad1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
