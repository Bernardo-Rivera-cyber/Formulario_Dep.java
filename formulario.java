
package formulario_dep;
import java.util.List;

public class formulario extends javax.swing.JFrame {

    String Calculo, Redes, Programacion, Taller, Desarrollo, Ingenieria;
    String Lectura, Basketball, Fut, Danza, Juegos, Fotografia;

    public formulario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Redes1 = new javax.swing.JCheckBox();
        Calculo1 = new javax.swing.JCheckBox();
        Programacion2 = new javax.swing.JCheckBox();
        Taller2 = new javax.swing.JCheckBox();
        desarrolloS = new javax.swing.JCheckBox();
        Ingenieria2 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        Basketball2 = new javax.swing.JCheckBox();
        Lectura2 = new javax.swing.JCheckBox();
        Fut2 = new javax.swing.JCheckBox();
        Danza2 = new javax.swing.JCheckBox();
        Juegos2 = new javax.swing.JCheckBox();
        Foto2 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        materiaE = new javax.swing.JLabel();
        tallerE = new javax.swing.JLabel();
        Iblresafi = new javax.swing.JLabel();
        Iblreshob = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("materias y talleres.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        Redes1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Redes1.setForeground(new java.awt.Color(0, 0, 0));
        Redes1.setText("Redes.");
        Redes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Redes1MouseClicked(evt);
            }
        });
        Redes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Redes1ActionPerformed(evt);
            }
        });

        Calculo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Calculo1.setForeground(new java.awt.Color(0, 0, 0));
        Calculo1.setText("Calculo Dif. ");
        Calculo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Calculo1MouseClicked(evt);
            }
        });
        Calculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculo1ActionPerformed(evt);
            }
        });

        Programacion2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Programacion2.setForeground(new java.awt.Color(0, 0, 0));
        Programacion2.setText("Programacion II");
        Programacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Programacion2MouseClicked(evt);
            }
        });
        Programacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Programacion2ActionPerformed(evt);
            }
        });

        Taller2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Taller2.setForeground(new java.awt.Color(0, 0, 0));
        Taller2.setText("Taller BD");
        Taller2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Taller2MouseClicked(evt);
            }
        });

        desarrolloS.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        desarrolloS.setForeground(new java.awt.Color(0, 0, 0));
        desarrolloS.setText("Desarrollo S.");
        desarrolloS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desarrolloSMouseClicked(evt);
            }
        });
        desarrolloS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desarrolloSActionPerformed(evt);
            }
        });

        Ingenieria2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Ingenieria2.setForeground(new java.awt.Color(0, 0, 0));
        Ingenieria2.setText("Ingenieria S.");
        Ingenieria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingenieria2MouseClicked(evt);
            }
        });
        Ingenieria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingenieria2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Calculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Redes1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Programacion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Taller2)
                .addGap(40, 40, 40)
                .addComponent(desarrolloS)
                .addGap(37, 37, 37)
                .addComponent(Ingenieria2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Redes1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Programacion2)
                    .addComponent(Taller2)
                    .addComponent(desarrolloS)
                    .addComponent(Ingenieria2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 158, 158));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Talleres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Castellar", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        Basketball2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Basketball2.setForeground(new java.awt.Color(0, 0, 0));
        Basketball2.setText("Basketball");
        Basketball2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Basketball2MouseClicked(evt);
            }
        });
        Basketball2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Basketball2ActionPerformed(evt);
            }
        });

        Lectura2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Lectura2.setForeground(new java.awt.Color(0, 0, 0));
        Lectura2.setText("Lectura.");
        Lectura2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lectura2MouseClicked(evt);
            }
        });
        Lectura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lectura2ActionPerformed(evt);
            }
        });

        Fut2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Fut2.setForeground(new java.awt.Color(0, 0, 0));
        Fut2.setText("Fut-Bol");
        Fut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fut2MouseClicked(evt);
            }
        });
        Fut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fut2ActionPerformed(evt);
            }
        });

        Danza2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Danza2.setForeground(new java.awt.Color(0, 0, 0));
        Danza2.setText("Danza");
        Danza2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Danza2MouseClicked(evt);
            }
        });
        Danza2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Danza2ActionPerformed(evt);
            }
        });

        Juegos2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Juegos2.setForeground(new java.awt.Color(0, 0, 0));
        Juegos2.setText("Juegos De Mesa");
        Juegos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Juegos2MouseClicked(evt);
            }
        });
        Juegos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Juegos2ActionPerformed(evt);
            }
        });

        Foto2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        Foto2.setForeground(new java.awt.Color(0, 0, 0));
        Foto2.setText("Fotografia");
        Foto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Foto2MouseClicked(evt);
            }
        });
        Foto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Foto2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Lectura2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Basketball2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Fut2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Danza2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Juegos2)
                .addGap(44, 44, 44)
                .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Basketball2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lectura2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fut2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Danza2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Juegos2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        materiaE.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        materiaE.setForeground(new java.awt.Color(0, 0, 0));
        materiaE.setText("Materia Elegidas");
        materiaE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materiaEMouseClicked(evt);
            }
        });

        tallerE.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        tallerE.setForeground(new java.awt.Color(0, 0, 0));
        tallerE.setText("Taller Elejido.");
        tallerE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tallerEMouseClicked(evt);
            }
        });

        Iblresafi.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Iblresafi.setForeground(new java.awt.Color(0, 0, 0));
        Iblresafi.setText("Materias Selec.");

        Iblreshob.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Iblreshob.setForeground(new java.awt.Color(0, 0, 0));
        Iblreshob.setText("Taller Selec.");

        jButton1.setText("Evaluar Resultados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materiaE)
                    .addComponent(tallerE, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Iblreshob, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Iblresafi, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materiaE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Iblresafi))
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tallerE)
                    .addComponent(Iblreshob))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void Redes1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void Calculo1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void Programacion2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void desarrolloSActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void Basketball2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void Lectura2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void Fut2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void Danza2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void Juegos2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void Foto2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void Ingenieria2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void Calculo1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if (Calculo1.isSelected()){
    
            Calculo="Calculo Dif., ";
            
        }
        else{
            Calculo=", ";
        }
    
    }                                     

    private void Redes1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        if (Redes1.isSelected()){
    
            Redes="Redes., ";
            
        }
        else{
            Redes=", ";
        }
        
    }                                   

    private void Programacion2MouseClicked(java.awt.event.MouseEvent evt) {                                           
        if (Programacion2.isSelected()){
    
            Programacion="Programacion II., ";
            
        }
        else{
            Programacion=", ";
        }
        
    }                                          

    private void Taller2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        if (Taller2.isSelected()){
    
            Taller="Taller BD., ";
            
        }
        else{
            Taller=", ";
        }
        
    }                                    

    private void desarrolloSMouseClicked(java.awt.event.MouseEvent evt) {                                         
        if (desarrolloS.isSelected()){
    
            Desarrollo="Desarrolo S., ";
            
        }
        else{
            Desarrollo=", ";
        }
       
    }                                        

    private void Ingenieria2MouseClicked(java.awt.event.MouseEvent evt) {                                         
        if (Ingenieria2.isSelected()){
    
            Ingenieria="Ingenieria S., ";
            
        }
        else{
            Ingenieria=", ";
        }
        
    }                                        

    private void Lectura2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        if (Lectura2.isSelected()){
    
            Lectura="Lectura., ";
            
        }
        else{
            Lectura=", ";
        }
        
    }                                     

    private void Basketball2MouseClicked(java.awt.event.MouseEvent evt) {                                         
        if (Basketball2.isSelected()){
    
            Basketball="Basketball., ";
            
        }
        else{
            Basketball=", ";
        }
        
    }                                        

    private void Fut2MouseClicked(java.awt.event.MouseEvent evt) {                                  
        if (Fut2.isSelected()){
    
            Fut="Fut-Bol., ";
            
        }
        else{
            Fut=", ";
        }
         
    }                                 

    private void Danza2MouseClicked(java.awt.event.MouseEvent evt) {                                    
        if (Danza2.isSelected()){
    
            Juegos="Juegos De Mesa., ";
            
        }
        else{
            Juegos=", ";
        }
         
    }                                   

    private void Juegos2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        if (Juegos2.isSelected()){
    
            Danza="Danza., ";
            
        }
        else{
            Danza=", ";
        }
         
    }                                    

    private void Foto2MouseClicked(java.awt.event.MouseEvent evt) {                                   
        if (Foto2.isSelected()){
    
            Fotografia="Fotografia., ";
            
        }
        else{
            Fotografia=", ";
        } 
        
    }                                  

    private void materiaEMouseClicked(java.awt.event.MouseEvent evt) {                                      
           
    }                                     

    private void tallerEMouseClicked(java.awt.event.MouseEvent evt) {                                     
            
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Iblresafi.setText(Calculo+" "+Redes+" "+Programacion+" "+Taller+" "+Desarrollo+" "+Ingenieria);
        Iblreshob.setText(Lectura+" "+Basketball+" "+Fut+" "+Danza+" "+Juegos+" "+Fotografia);
        
    }                                        

    
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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox Basketball2;
    private javax.swing.JCheckBox Calculo1;
    private javax.swing.JCheckBox Danza2;
    private javax.swing.JCheckBox Foto2;
    private javax.swing.JCheckBox Fut2;
    private javax.swing.JLabel Iblresafi;
    private javax.swing.JLabel Iblreshob;
    private javax.swing.JCheckBox Ingenieria2;
    private javax.swing.JCheckBox Juegos2;
    private javax.swing.JCheckBox Lectura2;
    private javax.swing.JCheckBox Programacion2;
    private javax.swing.JCheckBox Redes1;
    private javax.swing.JCheckBox Taller2;
    private javax.swing.JCheckBox desarrolloS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel materiaE;
    private javax.swing.JLabel tallerE;
    // End of variables declaration                   
}
