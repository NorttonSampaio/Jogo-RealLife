/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Catalogo;
import controller.CidadePodeFazer;
import controller.Comodo;
import controller.ItemPodeFazer;
import controller.Jogador;

/**
 *
 * @author Nortton
 */
public class TelaCatalogo extends javax.swing.JFrame {

    Main telaAnterior;
    Jogador jogador;
    int sorte;
    
    Catalogo[] vetCatalogo;
    CidadePodeFazer[] vetCidadePodeFazer;
    Comodo[] vetComodo;
    ItemPodeFazer[] vetItemPodeFazer;
    
    public TelaCatalogo(Main telaAnt, Jogador jog, int sor, Catalogo[] vetorCat, CidadePodeFazer[] vetorCid, Comodo[] vetorCom, ItemPodeFazer[] vetorItem) {
        initComponents();
        
        telaAnterior = telaAnt;
        jogador = jog;
        sorte = sor;
        vetCatalogo = vetorCat;
        vetCidadePodeFazer = vetorCid;
        vetComodo = vetorCom;
        vetItemPodeFazer = vetorItem;
        
        TelaCatalogo.this.setLocationRelativeTo(null);
        TelaCatalogo.this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPane = new javax.swing.JTabbedPane();
        tabComprar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblComprar = new javax.swing.JTable();
        tabVender = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblVender = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblAltera = new javax.swing.JLabel();
        lblFome = new javax.swing.JLabel();
        lblSono = new javax.swing.JLabel();
        lblNecessidades = new javax.swing.JLabel();
        lblHigiene = new javax.swing.JLabel();
        lblSocial = new javax.swing.JLabel();
        lblDiversão = new javax.swing.JLabel();
        lblInteligencia = new javax.swing.JLabel();
        btnAgir = new javax.swing.JButton();
        lblCusto = new javax.swing.JLabel();
        lblCustoValor = new javax.swing.JLabel();
        lblLucro = new javax.swing.JLabel();
        lblLucroValor = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblSaldoValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catálogo");

        tblComprar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "P/ Comodo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblComprar);

        javax.swing.GroupLayout tabComprarLayout = new javax.swing.GroupLayout(tabComprar);
        tabComprar.setLayout(tabComprarLayout);
        tabComprarLayout.setHorizontalGroup(
            tabComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabComprarLayout.setVerticalGroup(
            tabComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabComprarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbPane.addTab("Comprar", tabComprar);

        tblVender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "P/ Comodo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblVender);

        javax.swing.GroupLayout tabVenderLayout = new javax.swing.GroupLayout(tabVender);
        tabVender.setLayout(tabVenderLayout);
        tabVenderLayout.setHorizontalGroup(
            tabVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVenderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabVenderLayout.setVerticalGroup(
            tabVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabVenderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbPane.addTab("Vender", tabVender);

        lblAltera.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAltera.setText("Altera:");

        lblFome.setText("Fome: 0%");

        lblSono.setText("Sono: 0%");

        lblNecessidades.setText("Necessidades: 0%");

        lblHigiene.setText("Higiene: 0%");

        lblSocial.setText("Social: 0%");

        lblDiversão.setText("Diversão: 0%");

        lblInteligencia.setText("Inteligência: 0");

        btnAgir.setBackground(new java.awt.Color(204, 255, 204));
        btnAgir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAgir.setText("Prosseguir");

        lblCusto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCusto.setText("Custo:");

        lblCustoValor.setText("Valor: R$ 50,00");

        lblLucro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLucro.setText("Lucro:");

        lblLucroValor.setText("Valor: R$ 50,00");

        lblSaldo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSaldo.setText("Saldo:");

        lblSaldoValor.setText("R$ 50,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbPane, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFome)
                                        .addComponent(lblSono)
                                        .addComponent(lblHigiene)
                                        .addComponent(lblSocial)
                                        .addComponent(lblDiversão))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblNecessidades, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblInteligencia)
                            .addComponent(lblAltera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCusto)
                            .addComponent(lblCustoValor)
                            .addComponent(lblLucro)
                            .addComponent(lblLucroValor)
                            .addComponent(lblSaldo)
                            .addComponent(lblSaldoValor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPane, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAltera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNecessidades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHigiene)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSocial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDiversão)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInteligencia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblCusto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustoValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLucro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLucroValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldoValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgir;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAltera;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblCustoValor;
    private javax.swing.JLabel lblDiversão;
    private javax.swing.JLabel lblFome;
    private javax.swing.JLabel lblHigiene;
    private javax.swing.JLabel lblInteligencia;
    private javax.swing.JLabel lblLucro;
    private javax.swing.JLabel lblLucroValor;
    private javax.swing.JLabel lblNecessidades;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldoValor;
    private javax.swing.JLabel lblSocial;
    private javax.swing.JLabel lblSono;
    private javax.swing.JPanel tabComprar;
    private javax.swing.JPanel tabVender;
    private javax.swing.JTabbedPane tbPane;
    private javax.swing.JTable tblComprar;
    private javax.swing.JTable tblVender;
    // End of variables declaration//GEN-END:variables
}
