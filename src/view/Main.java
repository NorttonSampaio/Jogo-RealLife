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
import controller.Necessidades;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Nortton
 */
public class Main extends javax.swing.JFrame {
    
    Jogador jogador;
    int sorte=0;
    
    Comodo[] vetorComodo;
    Catalogo[] vetorCatalogo;
    ItemPodeFazer[] vetorItemPodeFazer;
    CidadePodeFazer[] vetorCidadePodeFazer;
    
    Comodo co;
    Catalogo ca;
    ItemPodeFazer it;
    CidadePodeFazer ci;
    
    TelaCidade telaCidade;
    TelaComodo telaComodo;
    TelaCatalogo telaCatalogo;

    public Main(Jogador j) {
        jogador = j;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        initDefault();
    }
    
    public void initDefault(){
        loadProgresso();
        alterarHUB();
        randomizarSorte();
    }
    
    public void alterarHUB(){
        lblDinheiro.setText("Dinheiro: R$"+jogador.getDinheiro());
        lblDiversão.setText("Diversão: "+jogador.getNecessidades().getDiversao()+ "%");
        lblFome.setText("Fome: "+jogador.getNecessidades().getFome()+ "%");
        lblHigiene.setText("Higiene: "+jogador.getNecessidades().getHigiene()+ "%");
        lblInteligencia.setText("Inteligência: "+jogador.getNecessidades().getInteligencia());
        lblNecessidades.setText("Necessidades: "+jogador.getNecessidades().getNecessidades()+ "%");
        lblNome.setText("Nome: "+jogador.getNome());
        lblSocial.setText("Social: "+jogador.getNecessidades().getSocial()+ "%");
        lblSono.setText("Sono: "+jogador.getNecessidades().getSono()+ "%");
        lblDia.setText("Dias passados: "+jogador.getDia());
        lblHorario.setText("Horário: "+jogador.getHorario());
    }
    
    public void randomizarSorte(){
        Random rand = new Random();
        sorte = rand.nextInt(101);
        lblSorte.setText(String.valueOf("Sorte: "+sorte));
    }
    
    public void novoJogador(){
        String nomeJogador = JOptionPane.showInputDialog(Main.this, "Informe o nome do Jogador", "Nenhum Jogador Encontrado", JOptionPane.WARNING_MESSAGE);
        if(nomeJogador==null)System.exit(0);
        Necessidades nec = new Necessidades(Byte.valueOf("5"), Byte.valueOf("80"), Byte.valueOf("70"), Byte.valueOf("75"), Byte.valueOf("80"), Byte.valueOf("60"), Byte.valueOf("50"));
        jogador = new Jogador(nec, nomeJogador, 200, 1, "12:00");
    }

    private void salvarProgresso(){
        ca = new Catalogo();
        ca.atualizar(null, vetorCatalogo);
        
        co = new Comodo();
        co.atualizar(null, vetorComodo);
        
        jogador.atualizar();
        
        JOptionPane.showMessageDialog(Main.this, "Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void loadProgresso(){
        ca = new Catalogo();
        vetorCatalogo = ca.buscarCatalagos();
        
        co = new Comodo();
        vetorComodo = co.buscarComodos();
        
        it = new ItemPodeFazer();
        vetorItemPodeFazer = it.buscarItemPodeFazer();
        
        ci = new CidadePodeFazer();
        vetorCidadePodeFazer = ci.buscarCidadePodeFazer();
    }
    
    public void atualizarVetores(Jogador j, int sor, Comodo[] vetcom, Catalogo[] vetCat, ItemPodeFazer[] vetIte, CidadePodeFazer[] vetCid){
        if(j!=null)jogador = j;
        if(sor!=-1)sorte=sor;
        if(vetcom!=null)vetorComodo = vetcom;
        if(vetCat!=null)vetorCatalogo = vetCat;
        if(vetIte!=null)vetorItemPodeFazer = vetIte;
        if(vetCid!=null)vetorCidadePodeFazer = vetCid;
    }
    
    public void telaComodo(){
        telaComodo = new TelaComodo(Main.this, jogador, sorte, vetorCatalogo, vetorCidadePodeFazer, vetorComodo, vetorItemPodeFazer);
    }
    
    public void telaCidade(){
        telaCidade = new TelaCidade(Main.this, jogador, sorte, vetorCidadePodeFazer);
    }
    
    public void telaCatalogo(){
        telaCatalogo = new TelaCatalogo(Main.this, jogador, sorte, vetorCatalogo, vetorCidadePodeFazer, vetorComodo, vetorItemPodeFazer);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNecessidades = new javax.swing.JPanel();
        tblTituloNecessidade = new javax.swing.JLabel();
        lblFome = new javax.swing.JLabel();
        lblSono = new javax.swing.JLabel();
        lblNecessidades = new javax.swing.JLabel();
        lblHigiene = new javax.swing.JLabel();
        lblSocial = new javax.swing.JLabel();
        lblDiversão = new javax.swing.JLabel();
        jpHud = new javax.swing.JPanel();
        lblTituloHUD = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDinheiro = new javax.swing.JLabel();
        lblInteligencia = new javax.swing.JLabel();
        lblSorte = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        btnComodos = new javax.swing.JButton();
        btnIrCidade = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Real Life Game v. 0.1");

        jpNecessidades.setBackground(new java.awt.Color(255, 255, 204));

        tblTituloNecessidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblTituloNecessidade.setText("Necessidades");

        lblFome.setText("Fome: 100%");

        lblSono.setText("Sono: 100%");

        lblNecessidades.setText("Necessidades: 100%");

        lblHigiene.setText("Higiene: 100%");

        lblSocial.setText("Social: 100%");

        lblDiversão.setText("Diversão: 100%");

        javax.swing.GroupLayout jpNecessidadesLayout = new javax.swing.GroupLayout(jpNecessidades);
        jpNecessidades.setLayout(jpNecessidadesLayout);
        jpNecessidadesLayout.setHorizontalGroup(
            jpNecessidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNecessidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNecessidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNecessidadesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNecessidades))
                    .addGroup(jpNecessidadesLayout.createSequentialGroup()
                        .addGroup(jpNecessidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFome)
                            .addComponent(lblSono)
                            .addComponent(lblHigiene)
                            .addComponent(lblSocial)
                            .addComponent(lblDiversão)
                            .addComponent(tblTituloNecessidade))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpNecessidadesLayout.setVerticalGroup(
            jpNecessidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNecessidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblTituloNecessidade)
                .addGap(18, 18, Short.MAX_VALUE)
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
                .addGap(37, 37, 37))
        );

        jpHud.setBackground(new java.awt.Color(204, 255, 204));

        lblTituloHUD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTituloHUD.setText("HUD");

        lblNome.setText("Nome: Fulano");

        lblDinheiro.setText("Dinheiro: R$ 200,00");

        lblInteligencia.setText("Inteligência: 0");

        lblSorte.setText("Sorte: 0");

        lblDia.setText("Dia: 0");

        lblHorario.setText("Horário: 12:30");

        javax.swing.GroupLayout jpHudLayout = new javax.swing.GroupLayout(jpHud);
        jpHud.setLayout(jpHudLayout);
        jpHudLayout.setHorizontalGroup(
            jpHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDinheiro)
                    .addComponent(lblNome)
                    .addComponent(lblInteligencia)
                    .addComponent(lblSorte)
                    .addComponent(lblDia)
                    .addComponent(lblHorario)
                    .addGroup(jpHudLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTituloHUD)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpHudLayout.setVerticalGroup(
            jpHudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHudLayout.createSequentialGroup()
                .addComponent(lblTituloHUD)
                .addGap(17, 17, 17)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInteligencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnComodos.setBackground(new java.awt.Color(102, 102, 0));
        btnComodos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnComodos.setForeground(new java.awt.Color(255, 255, 255));
        btnComodos.setText("COMODOS");
        btnComodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComodosActionPerformed(evt);
            }
        });

        btnIrCidade.setBackground(new java.awt.Color(102, 102, 0));
        btnIrCidade.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnIrCidade.setForeground(new java.awt.Color(255, 255, 255));
        btnIrCidade.setText("IR PARA CIDADE");
        btnIrCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrCidadeActionPerformed(evt);
            }
        });

        btnCatalogo.setBackground(new java.awt.Color(102, 102, 0));
        btnCatalogo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalogo.setText("CATÁLOGO");
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar32.png"))); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit32.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpNecessidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnIrCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComodos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jpHud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpNecessidades, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpHud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnComodos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIrCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        telaCatalogo();
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if(JOptionPane.showConfirmDialog(Main.this, "Deseja Salvar antes de sair?", "Atenção!", JOptionPane.YES_NO_OPTION)==0){
            salvarProgresso();
        }
        TelaLogin telaLogin = new TelaLogin();
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarProgresso();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnComodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComodosActionPerformed
        telaComodo();
    }//GEN-LAST:event_btnComodosActionPerformed

    private void btnIrCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrCidadeActionPerformed
        telaCidade();
    }//GEN-LAST:event_btnIrCidadeActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnComodos;
    private javax.swing.JButton btnIrCidade;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jpHud;
    private javax.swing.JPanel jpNecessidades;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDinheiro;
    private javax.swing.JLabel lblDiversão;
    private javax.swing.JLabel lblFome;
    private javax.swing.JLabel lblHigiene;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblInteligencia;
    private javax.swing.JLabel lblNecessidades;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSocial;
    private javax.swing.JLabel lblSono;
    private javax.swing.JLabel lblSorte;
    private javax.swing.JLabel lblTituloHUD;
    private javax.swing.JLabel tblTituloNecessidade;
    // End of variables declaration//GEN-END:variables
}
