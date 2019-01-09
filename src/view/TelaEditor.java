
package view;

import controller.Catalogo;
import controller.Cidade;
import controller.CidadePodeFazer;
import controller.Comodo;
import controller.Item;
import controller.ItemPodeFazer;
import controller.Jogador;
import controller.Necessidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaEditor extends javax.swing.JFrame {

    DefaultTableModel dtmJogadores;
    DefaultTableModel dtmComodos;
    DefaultTableModel dtmCatalogo;
    DefaultTableModel dtmLocais;
    DefaultTableModel dtmLocaisPodemFazer;
    DefaultTableModel dtmItens;
    DefaultTableModel dtmItensPodeFazer;
    
    Comodo comodo = new Comodo();
    Comodo[] vetorComodo;
    
    Jogador jogador = new Jogador();
    Jogador[] vetorJogadores;
    
    Catalogo catalogo = new Catalogo();
    Catalogo[] vetorCatalogo;
    
    Cidade cidade = new Cidade();
    Cidade[] vetorCidade;
    
    CidadePodeFazer cidadePodeFazer = new CidadePodeFazer();
    CidadePodeFazer[] vetorCidadePodeFazer;
    
    Item item = new Item();
    Item[] vetorItem;
    
    ItemPodeFazer itemPodeFazer = new ItemPodeFazer();
    ItemPodeFazer[] vetorItemPodeFazer;
    
    public TelaEditor() {
        initComponents();
        setDtms();
        recarregarComponentes();
        this.setVisible(true);
    }
    
    public void setDtms(){
        dtmJogadores = (DefaultTableModel)tblJogadores.getModel();
        dtmComodos = (DefaultTableModel)tblComodo.getModel();
        dtmCatalogo = (DefaultTableModel)tblCatalogo.getModel();
        dtmLocais = (DefaultTableModel)tblLocais.getModel();
        dtmLocaisPodemFazer = (DefaultTableModel)tblLocaisPodeFazer.getModel();
        dtmItens = (DefaultTableModel)tblItens.getModel();
        dtmItensPodeFazer = (DefaultTableModel)tblItensPodeFazer.getModel();
    }
    
    public void carregarTabelas(){
        carregarTabelaJogadores();
        carregarTabelaComodos();
        carregarTabelaCatalogos();
        carregarTabelaCidade();
        carregarTabelaCidadePodeFazer();
        carregarTabelaItens();
        carregarTabelaItensPodemFazer();
    }
    
    public void carregarCbxs(){
        carregarCbxComodo();
        carregarCbxItem();
        carregarCbxLocais();
    }
    
    public void carregarCbxItem(){
        cbxLocalItem.removeAllItems();
        cbxSelItem.removeAllItems();
        cbxLocalItem.addItem("-SELECIONE-");
        cbxSelItem.addItem("-SELECIONE-");
        int i=0;
        while(i<vetorItem.length){
            cbxLocalItem.addItem(vetorItem[i].getNome());
            cbxSelItem.addItem(vetorItem[i].getNome());
            i++;
        }
    }
    
    public void carregarCbxLocais(){
        cbxLocalLocal.removeAllItems();
        cbxLocalLocal.addItem("-SELECIONE-");
        int i=0;
        while(i<vetorCidade.length){
            cbxLocalLocal.addItem(vetorCidade[i].getNome());
            i++;
        }
    }
    
    public void carregarCbxComodo(){
        cbxSelComodo.removeAllItems();
        cbxSelComodo.addItem("-SELECIONE-");
        int i=0;
        while(i<vetorComodo.length){
            cbxSelComodo.addItem(vetorComodo[i].getNome());
            i++;
        }
    }
    
    public void carregarTabelaJogadores(){
        dtmJogadores.setNumRows(0);
        vetorJogadores = jogador.buscarJogadores();
        for(int i=0; i<vetorJogadores.length; i++){
            dtmJogadores.addRow(vetorJogadores[i].getJogadores());
        }
    }
    
    public void carregarTabelaComodos(){
        dtmComodos.setNumRows(0);
        vetorComodo = comodo.buscarComodos();
        for(int i=0; i<vetorComodo.length; i++){
            dtmComodos.addRow(vetorComodo[i].getComodo());
        }
    }
    
    public void carregarTabelaCatalogos(){
        dtmCatalogo.setNumRows(0);
        vetorCatalogo = catalogo.buscarCatalagos();
        for(int i=0; i<vetorCatalogo.length; i++){
            dtmCatalogo.addRow(vetorCatalogo[i].getCatalogo());
        }
    }
    
    public void carregarTabelaCidade(){
        dtmLocais.setNumRows(0);
        vetorCidade = cidade.buscarCidade();
        for(int i=0; i<vetorCidade.length; i++){
            dtmLocais.addRow(vetorCidade[i].getCidade());
        }
    }
    
    public void carregarTabelaCidadePodeFazer(){
        dtmLocaisPodemFazer.setNumRows(0);
        vetorCidadePodeFazer = cidadePodeFazer.buscarCidadePodeFazer();
        for(int i=0; i<vetorCidadePodeFazer.length; i++){
            dtmLocaisPodemFazer.addRow(vetorCidadePodeFazer[i].getCidadePodeFazer());
        }
    }
    
    public void carregarTabelaItens(){
        dtmItens.setNumRows(0);
        vetorItem = item.buscarItens();
        for(int i=0; i<vetorItem.length; i++){
            dtmItens.addRow(vetorItem[i].getItem());
        }
    }
    
    public void carregarTabelaItensPodemFazer(){
        dtmItensPodeFazer.setNumRows(0);
        vetorItemPodeFazer = itemPodeFazer.buscarItemPodeFazer();
        for(int i=0; i<vetorItemPodeFazer.length; i++){
            dtmItensPodeFazer.addRow(vetorItemPodeFazer[i].getItemPodeFazer());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnPrincipal = new javax.swing.JTabbedPane();
        panelJogadores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeJogador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJogadores = new javax.swing.JTable();
        panelCatalogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbxSelComodo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxSelItem = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCustoItem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCatalogo = new javax.swing.JTable();
        panelComodos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeComodo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblComodo = new javax.swing.JTable();
        panelLocais = new javax.swing.JPanel();
        jpnLocais = new javax.swing.JTabbedPane();
        internalPanelLocais = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeLocal = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLocais = new javax.swing.JTable();
        internalPanelLocaisPodeFazer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtAcaoLocal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxLocalLocal = new javax.swing.JComboBox<>();
        lblFome = new javax.swing.JLabel();
        lblSono = new javax.swing.JLabel();
        lblNecessidades = new javax.swing.JLabel();
        lblHigiene = new javax.swing.JLabel();
        lblSocial = new javax.swing.JLabel();
        lblDiversão = new javax.swing.JLabel();
        lblInteligencia = new javax.swing.JLabel();
        spnFomeLocal = new javax.swing.JSpinner();
        spnSonoLocal = new javax.swing.JSpinner();
        spnNecessidadesLocal = new javax.swing.JSpinner();
        spnHigieneLocal = new javax.swing.JSpinner();
        spnSocialLocal = new javax.swing.JSpinner();
        spnDiversaoLocal = new javax.swing.JSpinner();
        spnInteligenciaLocal = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtCustoLocal = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPagamentoLocal = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTempoLocal = new javax.swing.JTextField();
        spnInteligenciaNecessariaLocal = new javax.swing.JSpinner();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblLocaisPodeFazer = new javax.swing.JTable();
        panelItens = new javax.swing.JPanel();
        jpnItens = new javax.swing.JTabbedPane();
        internalPanelItens = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtNomeItem = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        internalPanelItensPodeFazer = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtAcaoItem = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cbxLocalItem = new javax.swing.JComboBox<>();
        lblFome1 = new javax.swing.JLabel();
        lblSono1 = new javax.swing.JLabel();
        lblNecessidades1 = new javax.swing.JLabel();
        lblHigiene1 = new javax.swing.JLabel();
        lblSocial1 = new javax.swing.JLabel();
        lblDiversão1 = new javax.swing.JLabel();
        lblInteligencia1 = new javax.swing.JLabel();
        spnFomeItem = new javax.swing.JSpinner();
        spnSonoItem = new javax.swing.JSpinner();
        spnNecessidadesItem = new javax.swing.JSpinner();
        spnHigieneItem = new javax.swing.JSpinner();
        spnSocialItem = new javax.swing.JSpinner();
        spnDiversaoItem = new javax.swing.JSpinner();
        spnInteligenciaItem = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        txtTempoItem = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblItensPodeFazer = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editor");

        jLabel1.setText("Nome Jogador:");

        jLabel2.setText("Observação: os outros atributos do jogador são definidos automaticamente.");

        tblJogadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJogadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJogadores);
        if (tblJogadores.getColumnModel().getColumnCount() > 0) {
            tblJogadores.getColumnModel().getColumn(0).setResizable(false);
            tblJogadores.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout panelJogadoresLayout = new javax.swing.GroupLayout(panelJogadores);
        panelJogadores.setLayout(panelJogadoresLayout);
        panelJogadoresLayout.setHorizontalGroup(
            panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelJogadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJogadoresLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomeJogador))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelJogadoresLayout.setVerticalGroup(
            panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJogadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jpnPrincipal.addTab("Jogadores", panelJogadores);

        jLabel3.setText("Presente no comodo:");

        cbxSelComodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECIONE-" }));

        jLabel4.setText("Item:");

        cbxSelItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECIONE-" }));

        jLabel5.setText("Custo do Item:");

        jLabel6.setText("Observação: O item terá seu valor dividido pela metade quando for vendido");

        tblCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Comodo", "Item", "Custo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCatalogoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCatalogo);
        if (tblCatalogo.getColumnModel().getColumnCount() > 0) {
            tblCatalogo.getColumnModel().getColumn(0).setResizable(false);
            tblCatalogo.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblCatalogo.getColumnModel().getColumn(1).setResizable(false);
            tblCatalogo.getColumnModel().getColumn(2).setResizable(false);
            tblCatalogo.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout panelCatalogoLayout = new javax.swing.GroupLayout(panelCatalogo);
        panelCatalogo.setLayout(panelCatalogoLayout);
        panelCatalogoLayout.setHorizontalGroup(
            panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(panelCatalogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustoItem))
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSelItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCatalogoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSelComodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelCatalogoLayout.setVerticalGroup(
            panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCatalogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxSelComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCustoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jpnPrincipal.addTab("Catálogo", panelCatalogo);

        jLabel7.setText("Nome:");

        tblComodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComodoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblComodo);
        if (tblComodo.getColumnModel().getColumnCount() > 0) {
            tblComodo.getColumnModel().getColumn(0).setResizable(false);
            tblComodo.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout panelComodosLayout = new javax.swing.GroupLayout(panelComodos);
        panelComodos.setLayout(panelComodosLayout);
        panelComodosLayout.setHorizontalGroup(
            panelComodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelComodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelComodosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeComodo))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelComodosLayout.setVerticalGroup(
            panelComodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelComodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomeComodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jpnPrincipal.addTab("Comodos", panelComodos);

        jLabel8.setText("Nome:");

        tblLocais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLocais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLocaisMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblLocais);
        if (tblLocais.getColumnModel().getColumnCount() > 0) {
            tblLocais.getColumnModel().getColumn(0).setResizable(false);
            tblLocais.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout internalPanelLocaisLayout = new javax.swing.GroupLayout(internalPanelLocais);
        internalPanelLocais.setLayout(internalPanelLocaisLayout);
        internalPanelLocaisLayout.setHorizontalGroup(
            internalPanelLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLocaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalPanelLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(internalPanelLocaisLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeLocal))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        internalPanelLocaisLayout.setVerticalGroup(
            internalPanelLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLocaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jpnLocais.addTab("Locais", internalPanelLocais);

        jLabel9.setText("Ação/Fazer:");

        txtAcaoLocal.setNextFocusableComponent(cbxLocalLocal);

        jLabel10.setText("Faz Parte do Local:");

        cbxLocalLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECIONE-" }));
        cbxLocalLocal.setNextFocusableComponent(spnFomeLocal);

        lblFome.setText("Fome:");

        lblSono.setText("Sono:");

        lblNecessidades.setText("Necessidades:");

        lblHigiene.setText("Higiene:");

        lblSocial.setText("Social:");

        lblDiversão.setText("Diversão:");

        lblInteligencia.setText("Inteligência:");

        spnFomeLocal.setModel(new javax.swing.SpinnerNumberModel(0, -150, 100, 1));
        spnFomeLocal.setNextFocusableComponent(spnSonoLocal);

        spnSonoLocal.setModel(new javax.swing.SpinnerNumberModel(0, -150, 100, 1));
        spnSonoLocal.setNextFocusableComponent(spnNecessidadesLocal);

        spnNecessidadesLocal.setModel(new javax.swing.SpinnerNumberModel(0, -150, 100, 1));
        spnNecessidadesLocal.setNextFocusableComponent(spnHigieneLocal);

        spnHigieneLocal.setModel(new javax.swing.SpinnerNumberModel(0, -150, 100, 1));
        spnHigieneLocal.setNextFocusableComponent(spnSocialLocal);

        spnSocialLocal.setModel(new javax.swing.SpinnerNumberModel(0, -150, 100, 1));
        spnSocialLocal.setNextFocusableComponent(spnDiversaoLocal);

        spnDiversaoLocal.setModel(new javax.swing.SpinnerNumberModel(0, -150, 100, 1));
        spnDiversaoLocal.setNextFocusableComponent(spnInteligenciaLocal);

        spnInteligenciaLocal.setModel(new javax.swing.SpinnerNumberModel(0, -150, null, 1));
        spnInteligenciaLocal.setNextFocusableComponent(txtCustoLocal);

        jLabel11.setText("Custo:");

        txtCustoLocal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtCustoLocal.setText("0");
        txtCustoLocal.setNextFocusableComponent(txtPagamentoLocal);

        jLabel12.setText("Pagamento:");

        txtPagamentoLocal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtPagamentoLocal.setText("0");
        txtPagamentoLocal.setNextFocusableComponent(txtTempoLocal);

        jLabel13.setText("Tempo em min:");

        jLabel14.setText("inte. necessária:");

        txtTempoLocal.setText("0");
        txtTempoLocal.setNextFocusableComponent(spnInteligenciaNecessariaLocal);

        spnInteligenciaNecessariaLocal.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnInteligenciaNecessariaLocal.setNextFocusableComponent(btnSalvar);

        tblLocaisPodeFazer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ação", "Local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLocaisPodeFazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLocaisPodeFazerMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblLocaisPodeFazer);
        if (tblLocaisPodeFazer.getColumnModel().getColumnCount() > 0) {
            tblLocaisPodeFazer.getColumnModel().getColumn(0).setResizable(false);
            tblLocaisPodeFazer.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblLocaisPodeFazer.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout internalPanelLocaisPodeFazerLayout = new javax.swing.GroupLayout(internalPanelLocaisPodeFazer);
        internalPanelLocaisPodeFazer.setLayout(internalPanelLocaisPodeFazerLayout);
        internalPanelLocaisPodeFazerLayout.setHorizontalGroup(
            internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFome)
                            .addComponent(lblNecessidades)
                            .addComponent(lblSono)
                            .addComponent(lblHigiene)
                            .addComponent(lblSocial)
                            .addComponent(lblDiversão)
                            .addComponent(lblInteligencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnSonoLocal)
                            .addComponent(spnFomeLocal)
                            .addComponent(spnNecessidadesLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnHigieneLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnSocialLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnDiversaoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnInteligenciaLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                                .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnInteligenciaNecessariaLocal)
                                    .addComponent(txtPagamentoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(txtTempoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLocalLocal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAcaoLocal))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        internalPanelLocaisPodeFazerLayout.setVerticalGroup(
            internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAcaoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxLocalLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCustoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPagamentoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtTempoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(spnInteligenciaNecessariaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(internalPanelLocaisPodeFazerLayout.createSequentialGroup()
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFome)
                            .addComponent(spnFomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSono)
                            .addComponent(spnSonoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNecessidades)
                            .addComponent(spnNecessidadesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHigiene)
                            .addComponent(spnHigieneLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnSocialLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnDiversaoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiversão))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelLocaisPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnInteligenciaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInteligencia))))
                .addContainerGap())
        );

        jpnLocais.addTab("Pode Fazer", internalPanelLocaisPodeFazer);

        javax.swing.GroupLayout panelLocaisLayout = new javax.swing.GroupLayout(panelLocais);
        panelLocais.setLayout(panelLocaisLayout);
        panelLocaisLayout.setHorizontalGroup(
            panelLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLocais)
        );
        panelLocaisLayout.setVerticalGroup(
            panelLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLocais)
        );

        jpnPrincipal.addTab("Locais/Cidade", panelLocais);

        jLabel21.setText("Nome:");

        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItensMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblItens);
        if (tblItens.getColumnModel().getColumnCount() > 0) {
            tblItens.getColumnModel().getColumn(0).setResizable(false);
            tblItens.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout internalPanelItensLayout = new javax.swing.GroupLayout(internalPanelItens);
        internalPanelItens.setLayout(internalPanelItensLayout);
        internalPanelItensLayout.setHorizontalGroup(
            internalPanelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelItensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalPanelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(internalPanelItensLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeItem))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        internalPanelItensLayout.setVerticalGroup(
            internalPanelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelItensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jpnItens.addTab("Itens", internalPanelItens);

        jLabel15.setText("Ação/Fazer:");

        jLabel16.setText("Faz Parte do Item:");

        cbxLocalItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECIONE-" }));

        lblFome1.setText("Fome:");

        lblSono1.setText("Sono:");

        lblNecessidades1.setText("Necessidades:");

        lblHigiene1.setText("Higiene:");

        lblSocial1.setText("Social:");

        lblDiversão1.setText("Diversão:");

        lblInteligencia1.setText("Inteligência:");

        spnFomeItem.setModel(new javax.swing.SpinnerNumberModel(0, -100, 100, 1));

        spnSonoItem.setModel(new javax.swing.SpinnerNumberModel(0, -120, 100, 1));

        spnNecessidadesItem.setModel(new javax.swing.SpinnerNumberModel(0, -120, 100, 1));

        spnHigieneItem.setModel(new javax.swing.SpinnerNumberModel(0, -120, 100, 1));

        spnSocialItem.setModel(new javax.swing.SpinnerNumberModel(0, -120, 100, 1));

        spnDiversaoItem.setModel(new javax.swing.SpinnerNumberModel(0, -120, 100, 1));

        spnInteligenciaItem.setModel(new javax.swing.SpinnerNumberModel(0, -120, 100, 1));

        jLabel19.setText("Tempo em min:");

        tblItensPodeFazer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ação", "Item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItensPodeFazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItensPodeFazerMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblItensPodeFazer);
        if (tblItensPodeFazer.getColumnModel().getColumnCount() > 0) {
            tblItensPodeFazer.getColumnModel().getColumn(0).setResizable(false);
            tblItensPodeFazer.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblItensPodeFazer.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout internalPanelItensPodeFazerLayout = new javax.swing.GroupLayout(internalPanelItensPodeFazer);
        internalPanelItensPodeFazer.setLayout(internalPanelItensPodeFazerLayout);
        internalPanelItensPodeFazerLayout.setHorizontalGroup(
            internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalPanelItensPodeFazerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(internalPanelItensPodeFazerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFome1)
                            .addComponent(lblNecessidades1)
                            .addComponent(lblSono1)
                            .addComponent(lblHigiene1)
                            .addComponent(lblSocial1)
                            .addComponent(lblDiversão1)
                            .addComponent(lblInteligencia1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnSonoItem)
                            .addComponent(spnFomeItem)
                            .addComponent(spnNecessidadesItem, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnHigieneItem, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnSocialItem, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnDiversaoItem, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(spnInteligenciaItem, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTempoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(internalPanelItensPodeFazerLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLocalItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(internalPanelItensPodeFazerLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAcaoItem))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        internalPanelItensPodeFazerLayout.setVerticalGroup(
            internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalPanelItensPodeFazerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtAcaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbxLocalItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtTempoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFome1)
                        .addComponent(spnFomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSono1)
                    .addComponent(spnSonoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNecessidades1)
                    .addComponent(spnNecessidadesItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHigiene1)
                    .addComponent(spnHigieneItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSocial1)
                    .addComponent(spnSocialItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiversão1)
                    .addComponent(spnDiversaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalPanelItensPodeFazerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInteligencia1)
                    .addComponent(spnInteligenciaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpnItens.addTab("Pode Fazer", internalPanelItensPodeFazer);

        javax.swing.GroupLayout panelItensLayout = new javax.swing.GroupLayout(panelItens);
        panelItens.setLayout(panelItensLayout);
        panelItensLayout.setHorizontalGroup(
            panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnItens)
        );
        panelItensLayout.setVerticalGroup(
            panelItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnItens)
        );

        jpnPrincipal.addTab("Itens", panelItens);

        btnSalvar.setBackground(new java.awt.Color(153, 255, 102));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addContainerGap())
            .addComponent(jpnPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tblJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJogadoresMouseClicked
        Jogador jogadorSel = jogador.buscarJogador(dtmJogadores.getValueAt(tblJogadores.getSelectedRow(), 0).toString());
        txtNomeJogador.setText(jogadorSel.getNome());
    }//GEN-LAST:event_tblJogadoresMouseClicked

    private void tblCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatalogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCatalogoMouseClicked

    private void tblComodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComodoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblComodoMouseClicked

    private void tblLocaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLocaisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblLocaisMouseClicked

    private void tblLocaisPodeFazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLocaisPodeFazerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblLocaisPodeFazerMouseClicked

    private void tblItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItensMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItensMouseClicked

    private void tblItensPodeFazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItensPodeFazerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblItensPodeFazerMouseClicked

    public void salvar(){
        switch(jpnPrincipal.getSelectedIndex()){
            case 0:
                //Jogador
                formJogador();
                break;
            case 1:
                //Catálogo
                formCatalogo();
                break;
            case 2:
                //Comodo
                formComodo();
                break;
            case 3:
                //Locais
                if(jpnLocais.getSelectedIndex()==0)formLocal();
                else formLocalPodeFazer();
                break;
            case 4://Itens
                if(jpnItens.getSelectedIndex()==0)formItem();
                else formItemPodeFazer();
                break;
        }
    }
    
    public void limparCampos(){
        txtNomeJogador.setText("");
        
        cbxSelComodo.setSelectedIndex(0);
        cbxSelItem.setSelectedIndex(0);
        txtCustoItem.setText("0");
        
        txtNomeComodo.setText("");
        
        txtNomeLocal.setText("");
        txtAcaoLocal.setText("");
        cbxLocalLocal.setSelectedIndex(0);
        spnFomeLocal.setValue(0);
        spnSonoLocal.setValue(0);
        spnNecessidadesLocal.setValue(0);
        spnHigieneLocal.setValue(0);
        spnSocialLocal.setValue(0);
        spnDiversaoLocal.setValue(0);
        spnInteligenciaLocal.setValue(0);
        txtCustoLocal.setText("0");
        txtPagamentoLocal.setText("0");
        txtTempoLocal.setText("0");
        spnInteligenciaNecessariaLocal.setValue(0);
        
        txtNomeItem.setText("");
        txtAcaoItem.setText("");
        cbxLocalItem.setSelectedIndex(0);
        spnFomeItem.setValue(0);
        spnSonoItem.setValue(0);
        spnNecessidadesItem.setValue(0);
        spnHigieneItem.setValue(0);
        spnSocialItem.setValue(0);
        spnDiversaoItem.setValue(0);
        spnInteligenciaLocal.setValue(0);
        txtTempoItem.setText("0");
    }
    
    public void recarregarComponentes(){
        carregarTabelas();
        carregarCbxs();
        limparCampos();
    }
    
    public void formJogador(){
        if(!txtNomeJogador.getText().trim().isEmpty()){
            Necessidades nec = new Necessidades(
                    Integer.valueOf("5"), 
                    Byte.valueOf("80"), 
                    Byte.valueOf("70"), 
                    Byte.valueOf("75"), 
                    Byte.valueOf("80"), 
                    Byte.valueOf("60"), 
                    Byte.valueOf("50"));
            Jogador newJogador = new Jogador(nec, txtNomeJogador.getText(), 200, 1, "12:00");
            recarregarComponentes();
        }else{
            JOptionPane.showMessageDialog(TelaEditor.this, "Existem Campos Vazios ou incorretos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void formCatalogo(){
        if(cbxSelComodo.getSelectedIndex()!=0 && cbxSelItem.getSelectedIndex()!=0){
            Catalogo cat = new Catalogo(
                    vetorComodo[cbxSelComodo.getSelectedIndex()-1], 
                    vetorItem[cbxSelItem.getSelectedIndex()-1], 
                    Double.valueOf(txtCustoItem.getText()), 
                    Byte.valueOf("0"));
            recarregarComponentes();
        }else{
            JOptionPane.showMessageDialog(TelaEditor.this, "Existem Campos Vazios ou incorretos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void formComodo(){
        if(!txtNomeComodo.getText().trim().isEmpty()){
            Comodo com = new Comodo(txtNomeComodo.getText(), Byte.valueOf("0"));
            recarregarComponentes();
        }else{
            JOptionPane.showMessageDialog(TelaEditor.this, "Existem Campos Vazios ou incorretos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void formLocal(){
        if(!txtNomeLocal.getText().trim().isEmpty()){
            Cidade cid = new Cidade(txtNomeLocal.getText());
            recarregarComponentes();
        }else{
            JOptionPane.showMessageDialog(TelaEditor.this, "Existem Campos Vazios ou incorretos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void formLocalPodeFazer(){
        if(cbxLocalLocal.getSelectedIndex()!=0 && 
        !txtAcaoLocal.getText().trim().isEmpty() && 
        !txtCustoLocal.getValue().toString().isEmpty() &&
        !txtPagamentoLocal.getValue().toString().isEmpty() &&
        !txtTempoLocal.getText().isEmpty()){
            
            Necessidades nec = new Necessidades(
                    Integer.valueOf(spnInteligenciaLocal.getValue().toString()), 
                    Byte.valueOf(spnFomeLocal.getValue().toString()), 
                    Byte.valueOf(spnSonoLocal.getValue().toString()),
                    Byte.valueOf(spnNecessidadesLocal.getValue().toString()),
                    Byte.valueOf(spnHigieneLocal.getValue().toString()),
                    Byte.valueOf(spnSocialLocal.getValue().toString()),
                    Byte.valueOf(spnDiversaoLocal.getValue().toString())
            );
            CidadePodeFazer cid = new CidadePodeFazer(
                    vetorCidade[cbxLocalLocal.getSelectedIndex()-1],
                    nec,
                    txtAcaoLocal.getText(),
                    Double.valueOf(txtCustoLocal.getValue().toString()),
                    Double.valueOf(txtPagamentoLocal.getValue().toString()),
                    Integer.valueOf(txtTempoLocal.getText()),
                    Integer.valueOf(spnInteligenciaNecessariaLocal.getValue().toString())
            );
        recarregarComponentes();
        }else{
            JOptionPane.showMessageDialog(TelaEditor.this, "Existem Campos Vazios ou incorretos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void formItem(){
        if(!txtNomeItem.getText().trim().isEmpty()){
            Item ite = new Item(txtNomeItem.getText());
            recarregarComponentes();
        }else{
            JOptionPane.showMessageDialog(TelaEditor.this, "Existem Campos Vazios ou incorretos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void formItemPodeFazer(){
        if(cbxLocalItem.getSelectedIndex()!=0 && 
        !txtAcaoItem.getText().trim().isEmpty() && 
        !txtTempoLocal.getText().isEmpty()){
            
            Necessidades nec = new Necessidades(
                    Integer.valueOf(spnInteligenciaItem.getValue().toString()), 
                    Byte.valueOf(spnFomeLocal.getValue().toString()), 
                    Byte.valueOf(spnSonoLocal.getValue().toString()),
                    Byte.valueOf(spnNecessidadesLocal.getValue().toString()),
                    Byte.valueOf(spnHigieneLocal.getValue().toString()),
                    Byte.valueOf(spnSocialLocal.getValue().toString()),
                    Byte.valueOf(spnDiversaoLocal.getValue().toString())
            );
            
            ItemPodeFazer ite = new ItemPodeFazer(
                    vetorItem[cbxLocalItem.getSelectedIndex()-1], 
                    nec, 
                    txtAcaoItem.getText(), 
                    Integer.valueOf(txtTempoItem.getText()));
        recarregarComponentes();
        }else{
            JOptionPane.showMessageDialog(TelaEditor.this, "Existem Campos Vazios ou incorretos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxLocalItem;
    private javax.swing.JComboBox<String> cbxLocalLocal;
    private javax.swing.JComboBox<String> cbxSelComodo;
    private javax.swing.JComboBox<String> cbxSelItem;
    private javax.swing.JPanel internalPanelItens;
    private javax.swing.JPanel internalPanelItensPodeFazer;
    private javax.swing.JPanel internalPanelLocais;
    private javax.swing.JPanel internalPanelLocaisPodeFazer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jpnItens;
    private javax.swing.JTabbedPane jpnLocais;
    private javax.swing.JTabbedPane jpnPrincipal;
    private javax.swing.JLabel lblDiversão;
    private javax.swing.JLabel lblDiversão1;
    private javax.swing.JLabel lblFome;
    private javax.swing.JLabel lblFome1;
    private javax.swing.JLabel lblHigiene;
    private javax.swing.JLabel lblHigiene1;
    private javax.swing.JLabel lblInteligencia;
    private javax.swing.JLabel lblInteligencia1;
    private javax.swing.JLabel lblNecessidades;
    private javax.swing.JLabel lblNecessidades1;
    private javax.swing.JLabel lblSocial;
    private javax.swing.JLabel lblSocial1;
    private javax.swing.JLabel lblSono;
    private javax.swing.JLabel lblSono1;
    private javax.swing.JPanel panelCatalogo;
    private javax.swing.JPanel panelComodos;
    private javax.swing.JPanel panelItens;
    private javax.swing.JPanel panelJogadores;
    private javax.swing.JPanel panelLocais;
    private javax.swing.JSpinner spnDiversaoItem;
    private javax.swing.JSpinner spnDiversaoLocal;
    private javax.swing.JSpinner spnFomeItem;
    private javax.swing.JSpinner spnFomeLocal;
    private javax.swing.JSpinner spnHigieneItem;
    private javax.swing.JSpinner spnHigieneLocal;
    private javax.swing.JSpinner spnInteligenciaItem;
    private javax.swing.JSpinner spnInteligenciaLocal;
    private javax.swing.JSpinner spnInteligenciaNecessariaLocal;
    private javax.swing.JSpinner spnNecessidadesItem;
    private javax.swing.JSpinner spnNecessidadesLocal;
    private javax.swing.JSpinner spnSocialItem;
    private javax.swing.JSpinner spnSocialLocal;
    private javax.swing.JSpinner spnSonoItem;
    private javax.swing.JSpinner spnSonoLocal;
    private javax.swing.JTable tblCatalogo;
    private javax.swing.JTable tblComodo;
    private javax.swing.JTable tblItens;
    private javax.swing.JTable tblItensPodeFazer;
    private javax.swing.JTable tblJogadores;
    private javax.swing.JTable tblLocais;
    private javax.swing.JTable tblLocaisPodeFazer;
    private javax.swing.JTextField txtAcaoItem;
    private javax.swing.JTextField txtAcaoLocal;
    private javax.swing.JTextField txtCustoItem;
    private javax.swing.JFormattedTextField txtCustoLocal;
    private javax.swing.JTextField txtNomeComodo;
    private javax.swing.JTextField txtNomeItem;
    private javax.swing.JTextField txtNomeJogador;
    private javax.swing.JTextField txtNomeLocal;
    private javax.swing.JFormattedTextField txtPagamentoLocal;
    private javax.swing.JTextField txtTempoItem;
    private javax.swing.JTextField txtTempoLocal;
    // End of variables declaration//GEN-END:variables
}
