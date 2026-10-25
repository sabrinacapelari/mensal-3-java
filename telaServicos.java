/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author sabri
 */
public class telaServicos extends javax.swing.JFrame {

    /**
     * Creates new form telaSexualidade
     */
public telaServicos() {

    initComponents();
    
    jScrollPane2.setBorder(
    javax.swing.BorderFactory.createMatteBorder(
        0, 1, 0, 0,
        new java.awt.Color(220, 200, 190)
    )
);
    cmbCategoria.addActionListener(e -> atualizarTiposServico());
    cmbCategoria.setSelectedIndex(0);
    cmbTipoServico.setSelectedIndex(0);
    cmbCategoria.requestFocusInWindow();
    
    java.util.Set<java.awt.AWTKeyStroke> teclas =
    new java.util.HashSet<>(
        txtDescricao.getFocusTraversalKeys(
            java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS
        )
    );

    teclas.add(java.awt.AWTKeyStroke.getAWTKeyStroke(
    java.awt.event.KeyEvent.VK_ENTER, 0
    ));

    txtDescricao.setFocusTraversalKeys(
    java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
    teclas
    );
    
    atualizaTabela();
    
    txtCodigo.setEditable(false);
    jScrollPane2.setVerticalScrollBarPolicy(
    javax.swing.JScrollPane.VERTICAL_SCROLLBAR_NEVER
);
    
    tblDados.setAutoResizeMode(
    javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS
);
    
jScrollPane2.setVerticalScrollBarPolicy(
    javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
);

jScrollPane2.setHorizontalScrollBarPolicy(
    javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
);

jScrollPane2.setViewportBorder(null);

    
    
    // Diseño de la tabla
tblDados.setRowHeight(32);

tblDados.setBackground(
    new java.awt.Color(255, 253, 252)
);

tblDados.setForeground(
    new java.awt.Color(128, 70, 55)
);

tblDados.setGridColor(
    new java.awt.Color(230, 200, 190)
);

tblDados.setShowVerticalLines(false);

tblDados.setSelectionBackground(
    new java.awt.Color(244, 222, 213)
);

tblDados.setSelectionForeground(
    new java.awt.Color(128, 70, 55)
);

// Encabezado
tblDados.getTableHeader().setBackground(
    new java.awt.Color(244, 222, 213)
);

tblDados.getTableHeader().setForeground(
    new java.awt.Color(128, 70, 55)
);

tblDados.getTableHeader().setFont(
    new java.awt.Font("SansSerif", java.awt.Font.BOLD, 13)
);
// Líneas finitas entre filas y columnas
tblDados.setShowHorizontalLines(true);
tblDados.setShowVerticalLines(true);

tblDados.setGridColor(
    new java.awt.Color(238, 226, 221)
);

tblDados.setIntercellSpacing(
    new java.awt.Dimension(1, 1)
);
    btnInserir1.setBorder(
    new javax.swing.border.LineBorder(
        new java.awt.Color(185, 120, 104), 1, true
    )
);
    btnAlterar.setBorder(
    new javax.swing.border.LineBorder(
        new java.awt.Color(185, 120, 104), 1, true
    )
);
    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

    getContentPane().setBackground(
        new java.awt.Color(255, 253, 252)
    );
    
 
    // IMAGEN LATERAL
javax.swing.ImageIcon lateral = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/lateral.png")
);

java.awt.Image imgLateral = lateral.getImage().getScaledInstance(
    lblImagemLateral.getWidth(),
    lblImagemLateral.getHeight(),
    java.awt.Image.SCALE_SMOOTH
);

lblImagemLateral.setIcon(
    new javax.swing.ImageIcon(imgLateral)
);
// ==========================================
// PEINE
// ==========================================
javax.swing.ImageIcon peine = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/peine2.png")
);

lblPeine.setIcon(peine);
lblPeine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblPeine.setVerticalAlignment(javax.swing.SwingConstants.CENTER);


// ==========================================
// TIJERA
// ==========================================
javax.swing.ImageIcon tijera = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/tijera2.png")
);

lblTijera.setIcon(tijera);
lblTijera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblTijera.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    
// ==========================================
// SECADOR
// ==========================================
javax.swing.ImageIcon secador = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/secador.png")
);

lblSecador.setIcon(secador);
lblSecador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblSecador.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// ROCIADOR
// ==========================================
javax.swing.ImageIcon rociador = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/rociador.png")
);

lblRociador.setIcon(rociador);
lblRociador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblRociador.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// CEPILLO
// ==========================================
javax.swing.ImageIcon cepillo = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/cepillo.png")
);

lblCepillo.setIcon(cepillo);
lblCepillo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblCepillo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// PINZA
// ==========================================
javax.swing.ImageIcon pinza = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/pinza.png")
);

lblPinza.setIcon(pinza);
lblPinza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblPinza.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// BOWL
// ==========================================
javax.swing.ImageIcon bowl = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/bowl.png")
);

lblBowl.setIcon(bowl);
lblBowl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblBowl.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// DOSIFICADOR
// ==========================================
javax.swing.ImageIcon dosificador = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/dosificador.png")
);

lblDosificador.setIcon(dosificador);
lblDosificador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblDosificador.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// PLANCHITA
// ==========================================
javax.swing.ImageIcon planchita = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/planchita.png")
);

lblPlanchita.setIcon(planchita);
lblPlanchita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblPlanchita.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// PRODUCTOS
// ==========================================
javax.swing.ImageIcon productos = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/productos.png")
);

lblProductos.setIcon(productos);
lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblProductos.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// FRASE DECORATIVA
// ==========================================
javax.swing.ImageIcon frase = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/frase.png")
);

java.awt.Image imgFrase = frase.getImage().getScaledInstance(
    180,
    150,
    java.awt.Image.SCALE_SMOOTH
);

lblFrase.setIcon(new javax.swing.ImageIcon(imgFrase));
lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblFrase.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
// ==========================================
// PASTITO DECORATIVO
// ==========================================
javax.swing.ImageIcon pastito = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/pastito.png")
);

lblPastito.setIcon(pastito);
lblPastito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblPastito.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

//Boton genero
btnGenero.setIcon(
    new javax.swing.ImageIcon(
        getClass().getResource("/imagens/genero.png")
    )
);

//Boton clientes
btnClientes.setIcon(
    new javax.swing.ImageIcon(
        getClass().getResource("/imagens/clientes.png")
    )
);
//boton servicos
btnServicos.setIcon(
    new javax.swing.ImageIcon(
        getClass().getResource("/imagens/servicos.png")
    )
);
//Boton agendamentos
btnAgendamentos.setIcon(
    new javax.swing.ImageIcon(
        getClass().getResource("/imagens/agendamentos.png")
    )
);
//boton sair
btnSair.setIcon(
    new javax.swing.ImageIcon(
        getClass().getResource("/imagens/sair.png")
    )
);
//logo aura
javax.swing.ImageIcon logoAura = new javax.swing.ImageIcon(
    getClass().getResource("/imagens/logoAura.png")
);

java.awt.Image imagenAura = logoAura.getImage().getScaledInstance(
    200, 140, java.awt.Image.SCALE_SMOOTH
);

lblAura.setIcon(new javax.swing.ImageIcon(imagenAura));

}

private void atualizarTiposServico() {
    
    cmbTipoServico.removeAllItems();
    cmbTipoServico.addItem("Selecione...");

    if (cmbCategoria.getSelectedItem() == null) {
        return;
    }

    String categoria = cmbCategoria.getSelectedItem().toString();

    switch (categoria) {
        case "Cabelo":
            cmbTipoServico.addItem("Corte feminino");
            cmbTipoServico.addItem("Corte masculino");
            cmbTipoServico.addItem("Corte infantil");
            cmbTipoServico.addItem("Escova");
            cmbTipoServico.addItem("Escova modeladora");
            cmbTipoServico.addItem("Coloração");
            cmbTipoServico.addItem("Retoque de raiz");
            cmbTipoServico.addItem("Mechas");
            cmbTipoServico.addItem("Luzes");
            cmbTipoServico.addItem("Balayage");
            cmbTipoServico.addItem("Progressiva");
            cmbTipoServico.addItem("Botox capilar");
            cmbTipoServico.addItem("Alisamento");
            cmbTipoServico.addItem("Hidratação");
            cmbTipoServico.addItem("Reconstrução capilar");
            cmbTipoServico.addItem("Nutrição capilar");
            cmbTipoServico.addItem("Alongamento de cabelo");
            cmbTipoServico.addItem("Penteado");
            break;

        case "Unhas":
            cmbTipoServico.addItem("Manicure");
            cmbTipoServico.addItem("Pedicure");
            cmbTipoServico.addItem("Manicure e pedicure");
            cmbTipoServico.addItem("Esmaltação em gel");
            cmbTipoServico.addItem("Alongamento em gel");
            cmbTipoServico.addItem("Alongamento em fibra de vidro");
            cmbTipoServico.addItem("Banho de gel");
            cmbTipoServico.addItem("Blindagem de unhas");
            cmbTipoServico.addItem("Manutenção de alongamento");
            cmbTipoServico.addItem("Nail art");
            cmbTipoServico.addItem("Spa dos pés");
            break;

        case "Sobrancelhas e Cílios":
            cmbTipoServico.addItem("Design de sobrancelhas");
            cmbTipoServico.addItem("Design com henna");
            cmbTipoServico.addItem("Brow lamination");
            cmbTipoServico.addItem("Microblading");
            cmbTipoServico.addItem("Micropigmentação");
            cmbTipoServico.addItem("Extensão de cílios");
            cmbTipoServico.addItem("Volume brasileiro");
            cmbTipoServico.addItem("Volume russo");
            cmbTipoServico.addItem("Lash lifting");
            cmbTipoServico.addItem("Tintura de cílios");
            cmbTipoServico.addItem("Manutenção de cílios");
            break;

        case "Maquiagem":
            cmbTipoServico.addItem("Maquiagem social");
            cmbTipoServico.addItem("Maquiagem para festas");
            cmbTipoServico.addItem("Maquiagem para noivas");
            cmbTipoServico.addItem("Maquiagem para formandas");
            cmbTipoServico.addItem("Maquiagem artística");
            cmbTipoServico.addItem("Maquiagem e penteado");
            break;

        case "Estética Facial":
            cmbTipoServico.addItem("Limpeza de pele");
            cmbTipoServico.addItem("Limpeza de pele profunda");
            cmbTipoServico.addItem("Hidratação facial");
            cmbTipoServico.addItem("Peeling facial");
            cmbTipoServico.addItem("Máscara facial");
            cmbTipoServico.addItem("Revitalização facial");
            cmbTipoServico.addItem("Massagem facial");
            break;

        case "Estética Corporal":
            cmbTipoServico.addItem("Massagem relaxante");
            cmbTipoServico.addItem("Massagem modeladora");
            cmbTipoServico.addItem("Drenagem linfática");
            cmbTipoServico.addItem("Esfoliação corporal");
            cmbTipoServico.addItem("Hidratação corporal");
            cmbTipoServico.addItem("Tratamento corporal");
            break;

        case "Depilação":
            cmbTipoServico.addItem("Depilação facial");
            cmbTipoServico.addItem("Depilação de buço");
            cmbTipoServico.addItem("Depilação de sobrancelhas");
            cmbTipoServico.addItem("Depilação de axilas");
            cmbTipoServico.addItem("Depilação de braços");
            cmbTipoServico.addItem("Depilação de meia perna");
            cmbTipoServico.addItem("Depilação de pernas completas");
            cmbTipoServico.addItem("Depilação de virilha");
            cmbTipoServico.addItem("Depilação de corpo inteiro");
            break;
    }

}
private void atualizaTabela() {

   
    javax.swing.table.DefaultTableModel modelo =
        (javax.swing.table.DefaultTableModel) tblDados.getModel();

    modelo.setColumnIdentifiers(new Object[]{
        "Código", "Categoria", "Tipo de Serviço",
        "Descrição", "Valor (R$)", "Duração (min)", "Status"
    });

    modelo.setRowCount(0);

    String sql = "SELECT codigo, categoria, tipo_servico, "
            + "descricao, valor, duracao, status "
            + "FROM servicos ORDER BY codigo";

    try {
        dao.ConexaoBanco banco = new dao.ConexaoBanco();
        banco.conectar();

        try (java.sql.Connection conexao = banco.getConnection();
             java.sql.PreparedStatement stmt =
                 conexao.prepareStatement(sql);
             java.sql.ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("codigo"),
                    rs.getString("categoria"),
                    rs.getString("tipo_servico"),
                    rs.getString("descricao"),
                    rs.getBigDecimal("valor"),
                    rs.getInt("duracao"),
                    rs.getString("status")
                });
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Erro ao carregar serviços: " + e.getMessage()
        );
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblAura = new javax.swing.JLabel();
        btnGenero = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnServicos = new javax.swing.JButton();
        btnAgendamentos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblFrase = new javax.swing.JLabel();
        lblPastito = new javax.swing.JLabel();
        panelConteudo = new javax.swing.JPanel();
        panelFormulario = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnInserir1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        lblDecricaoServico = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        lblDuracao = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JFormattedTextField();
        lblTipoServico = new javax.swing.JLabel();
        cmbTipoServico = new javax.swing.JComboBox<>();
        cmbCategoria = new javax.swing.JComboBox<>();
        cmbStatus = new javax.swing.JComboBox<>();
        panelCabecalho = new javax.swing.JPanel();
        lblCadastroDe = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblTijera = new javax.swing.JLabel();
        lblSecador = new javax.swing.JLabel();
        lblPeine = new javax.swing.JLabel();
        lblRociador = new javax.swing.JLabel();
        lblCepillo = new javax.swing.JLabel();
        lblPinza = new javax.swing.JLabel();
        lblBowl = new javax.swing.JLabel();
        lblDosificador = new javax.swing.JLabel();
        lblPlanchita = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        lblImagemLateral = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aura Salão de Beleza");

        jPanel1.setBackground(new java.awt.Color(255, 250, 248));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 700));

        lblAura.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        lblAura.setForeground(new java.awt.Color(154, 81, 62));
        lblAura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAura.setPreferredSize(new java.awt.Dimension(200, 140));

        btnGenero.setBackground(new java.awt.Color(255, 248, 245));
        btnGenero.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnGenero.setForeground(new java.awt.Color(128, 70, 55));
        btnGenero.setText("Gênero/Sexualidade");
        btnGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneroActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(255, 248, 245));
        btnClientes.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(128, 70, 55));
        btnClientes.setText("Clientes");
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnServicos.setBackground(new java.awt.Color(244, 222, 213));
        btnServicos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnServicos.setForeground(new java.awt.Color(128, 70, 55));
        btnServicos.setText("Serviços");
        btnServicos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAgendamentos.setBackground(new java.awt.Color(255, 248, 245));
        btnAgendamentos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAgendamentos.setForeground(new java.awt.Color(128, 70, 55));
        btnAgendamentos.setText("Agendamentos");
        btnAgendamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentosActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 248, 245));
        btnSair.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(128, 70, 55));
        btnSair.setText("Sair");
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblFrase.setBackground(new java.awt.Color(139, 79, 57));
        lblFrase.setFont(new java.awt.Font("Rage Italic", 0, 28)); // NOI18N
        lblFrase.setForeground(new java.awt.Color(129, 88, 0));
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setToolTipText("");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFrase.setPreferredSize(new java.awt.Dimension(180, 150));

        lblPastito.setPreferredSize(new java.awt.Dimension(180, 90));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblPastito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSair)
                        .addComponent(btnAgendamentos)
                        .addComponent(btnServicos)
                        .addComponent(btnClientes)
                        .addComponent(btnGenero)
                        .addComponent(lblFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblAura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnGenero)
                .addGap(18, 18, 18)
                .addComponent(btnClientes)
                .addGap(18, 18, 18)
                .addComponent(btnServicos)
                .addGap(18, 18, 18)
                .addComponent(btnAgendamentos)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lblFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblPastito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        panelConteudo.setBackground(new java.awt.Color(255, 253, 252));
        panelConteudo.setPreferredSize(new java.awt.Dimension(800, 700));

        panelFormulario.setBackground(new java.awt.Color(238, 224, 213));
        panelFormulario.setPreferredSize(new java.awt.Dimension(740, 190));

        btnAlterar.setBackground(new java.awt.Color(255, 248, 245));
        btnAlterar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(128, 70, 55));
        btnAlterar.setText("Alterar");
        btnAlterar.setPreferredSize(new java.awt.Dimension(130, 40));
        btnAlterar.setRequestFocusEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnInserir1.setBackground(new java.awt.Color(183, 120, 104));
        btnInserir1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInserir1.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir1.setText("Inserir");
        btnInserir1.setFocusPainted(false);
        btnInserir1.setPreferredSize(new java.awt.Dimension(130, 40));
        btnInserir1.setRequestFocusEnabled(false);
        btnInserir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserir1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DADOS DO SERVIÇO");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setText("Código");

        txtCodigo.setBackground(new java.awt.Color(255, 248, 245));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        lblDecricaoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDecricaoServico.setText("Descrição do Servico");

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor.setText("Valor");

        btnLimpar.setBackground(new java.awt.Color(255, 248, 245));
        btnLimpar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(128, 70, 55));
        btnLimpar.setText("Limpar");
        btnLimpar.setPreferredSize(new java.awt.Dimension(130, 40));
        btnLimpar.setRequestFocusEnabled(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblDuracao.setText("Duração (minutos)");

        txtValor.setBackground(new java.awt.Color(255, 248, 245));

        txtDuracao.setBackground(new java.awt.Color(255, 248, 245));
        txtDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracaoActionPerformed(evt);
            }
        });

        lblStatus.setText("Status");

        txtDescricao.setBackground(new java.awt.Color(255, 248, 245));
        txtDescricao.setForeground(new java.awt.Color(128, 70, 55));
        txtDescricao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        lblTipoServico.setText("Tipo de Serviço");

        cmbTipoServico.setBackground(new java.awt.Color(255, 248, 245));
        cmbTipoServico.setForeground(new java.awt.Color(128, 70, 55));
        cmbTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...\t\t\t" }));
        cmbTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoServicoActionPerformed(evt);
            }
        });

        cmbCategoria.setBackground(new java.awt.Color(255, 248, 245));
        cmbCategoria.setForeground(new java.awt.Color(128, 70, 55));
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cabelo", "Unhas", "Sobrancelhas e Cílios", "Maquiagem", "Estética Facial", "Estética Corporal", "Depilação" }));

        cmbStatus.setBackground(new java.awt.Color(255, 248, 245));
        cmbStatus.setForeground(new java.awt.Color(128, 70, 55));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Ativo", "Inativo" }));

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDecricaoServico))
                        .addGap(81, 81, 81))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(btnInserir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(368, 368, 368)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipoServico)))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDuracao))
                                .addGap(138, 138, 138)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStatus))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblCategoria)
                    .addComponent(lblTipoServico)
                    .addComponent(lblDecricaoServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblDuracao)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelCabecalho.setBackground(new java.awt.Color(244, 222, 213));
        panelCabecalho.setPreferredSize(new java.awt.Dimension(1090, 200));

        lblCadastroDe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lblCadastroDe.setForeground(new java.awt.Color(145, 91, 75));
        lblCadastroDe.setText("C A D A S T R O  D E \n");
        lblCadastroDe.setPreferredSize(new java.awt.Dimension(200, 20));

        lblTitulo.setBackground(new java.awt.Color(128, 70, 55));
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblTitulo.setText("SERVIÇOS");
        lblTitulo.setPreferredSize(new java.awt.Dimension(350, 25));

        lblDescricao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(140, 120, 115));
        lblDescricao.setText("Cadastre e gerencie os servicos do salão.");
        lblDescricao.setToolTipText("");
        lblDescricao.setPreferredSize(new java.awt.Dimension(462, 30));

        lblTijera.setPreferredSize(new java.awt.Dimension(80, 80));

        lblSecador.setPreferredSize(new java.awt.Dimension(80, 80));

        lblPeine.setPreferredSize(new java.awt.Dimension(80, 80));

        lblRociador.setPreferredSize(new java.awt.Dimension(80, 80));

        lblCepillo.setPreferredSize(new java.awt.Dimension(80, 80));

        lblPinza.setPreferredSize(new java.awt.Dimension(80, 80));

        lblBowl.setPreferredSize(new java.awt.Dimension(80, 80));

        lblDosificador.setPreferredSize(new java.awt.Dimension(80, 80));

        lblPlanchita.setPreferredSize(new java.awt.Dimension(80, 80));

        lblProductos.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout panelCabecalhoLayout = new javax.swing.GroupLayout(panelCabecalho);
        panelCabecalho.setLayout(panelCabecalhoLayout);
        panelCabecalhoLayout.setHorizontalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabecalhoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabecalhoLayout.createSequentialGroup()
                        .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCadastroDe, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(lblPeine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(lblTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblCepillo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(lblBowl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(panelCabecalhoLayout.createSequentialGroup()
                        .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSecador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblRociador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lblPinza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabecalhoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblPlanchita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCabecalhoLayout.createSequentialGroup()
                        .addComponent(lblDosificador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        panelCabecalhoLayout.setVerticalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabecalhoLayout.createSequentialGroup()
                        .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCabecalhoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblCadastroDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCepillo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBowl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSecador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRociador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPinza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPeine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCabecalhoLayout.createSequentialGroup()
                            .addComponent(lblPlanchita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblDosificador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblSecador.getAccessibleContext().setAccessibleDescription("");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(880, 180));

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Categoria", "Tipo de Serviço", "Descrição", "Valor (R$)", "Duração (min)", "Status"
            }
        ));
        tblDados.setPreferredSize(new java.awt.Dimension(1090, 300));
        tblDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDados);

        javax.swing.GroupLayout panelConteudoLayout = new javax.swing.GroupLayout(panelConteudo);
        panelConteudo.setLayout(panelConteudoLayout);
        panelConteudoLayout.setHorizontalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
                    .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelConteudoLayout.setVerticalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        lblImagemLateral.setPreferredSize(new java.awt.Dimension(150, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagemLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelConteudo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addComponent(lblImagemLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMouseClicked
    int fila = tblDados.getSelectedRow();

if (fila >= 0) {
    txtCodigo.setText(tblDados.getValueAt(fila, 0).toString());

    cmbCategoria.setSelectedItem(tblDados.getValueAt(fila, 1).toString());

    cmbTipoServico.setSelectedItem(tblDados.getValueAt(fila, 2).toString());

    txtDescricao.setText(tblDados.getValueAt(fila, 3).toString());

    txtValor.setText(tblDados.getValueAt(fila, 4).toString());

    txtDuracao.setText(tblDados.getValueAt(fila, 5).toString());

    cmbStatus.setSelectedItem(tblDados.getValueAt(fila, 6).toString());
    }




        // TODO add your handling code here:
    }//GEN-LAST:event_tblDadosMouseClicked

    private void cmbTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoServicoActionPerformed
        
    }//GEN-LAST:event_cmbTipoServicoActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        }

        private void limparCampos() {
            txtCodigo.setText("");
            txtDescricao.setText("");
            cmbCategoria.setSelectedIndex(0);
            cmbTipoServico.setSelectedIndex(0);
            txtValor.setText("");
            txtDuracao.setText("");
            cmbStatus.setSelectedIndex(0);
            tblDados.clearSelection();
            txtDescricao.requestFocusInWindow();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnInserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir1ActionPerformed

    if (!txtCodigo.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Para modificar um serviço, utilize o botão Alterar!"
        );
        return;
    }

    String descricao = txtDescricao.getText().trim();
    String categoria = cmbCategoria.getSelectedItem().toString();
    String tipoServico = cmbTipoServico.getSelectedItem().toString();
    String valorTexto = txtValor.getText().trim();
    String duracaoTexto = txtDuracao.getText().trim();
    String status = cmbStatus.getSelectedItem().toString();

    if (descricao.isEmpty()
            || cmbCategoria.getSelectedIndex() == 0
            || cmbTipoServico.getSelectedIndex() == 0
            || valorTexto.isEmpty()
            || duracaoTexto.isEmpty()
            || cmbStatus.getSelectedIndex() == 0) {

        javax.swing.JOptionPane.showMessageDialog(
            this, "Preencha todos os campos do serviço!"
        );
        return;
    }

    try {
        java.math.BigDecimal valor =
            new java.math.BigDecimal(valorTexto.replace(",", "."));

        int duracao = Integer.parseInt(duracaoTexto);

        if (valor.signum() < 0 || valor.scale() > 2 || duracao <= 0) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Informe um valor válido e uma duração maior que zero!"
            );
            return;
        }

        
modelo.Servico servico = new modelo.Servico();

servico.setDescricao(descricao);
servico.setCategoria(categoria);
servico.setTipoServico(tipoServico);
servico.setValor(valor);
servico.setDuracao(duracao);
servico.setStatus(status);

dao.ServicosDao servicosDao = new dao.ServicosDao();
servicosDao.inserir(servico);


        javax.swing.JOptionPane.showMessageDialog(
            this, "Serviço cadastrado com sucesso!"
        );

        atualizaTabela();
        limparCampos();

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Informe um valor e uma duração válidos!"
        );
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Erro ao cadastrar serviço: " + e.getMessage()
        );
    }
    }//GEN-LAST:event_btnInserir1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    if (txtCodigo.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Selecione um serviço na tabela!"
        );
        return;
    }

    int codigo = Integer.parseInt(txtCodigo.getText().trim());

    String descricao = txtDescricao.getText().trim();
    String categoria = cmbCategoria.getSelectedItem().toString();
    String tipoServico = cmbTipoServico.getSelectedItem().toString();
    String valorTexto = txtValor.getText().trim();
    String duracaoTexto = txtDuracao.getText().trim();
    String status = cmbStatus.getSelectedItem().toString();

    if (descricao.isEmpty()
            || cmbCategoria.getSelectedIndex() == 0
            || cmbTipoServico.getSelectedIndex() == 0
            || valorTexto.isEmpty()
            || duracaoTexto.isEmpty()
            || cmbStatus.getSelectedIndex() == 0) {

        javax.swing.JOptionPane.showMessageDialog(
            this, "Preencha todos os campos do serviço!"
        );
        return;
    }

    try {
        java.math.BigDecimal valor =
            new java.math.BigDecimal(valorTexto.replace(",", "."));

        int duracao = Integer.parseInt(duracaoTexto);

        if (valor.signum() < 0 || valor.scale() > 2 || duracao <= 0) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Informe um valor válido e uma duração maior que zero!"
            );
            return;
        }

        dao.ServicosDao servicosDao = new dao.ServicosDao();

        
modelo.Servico servico = new modelo.Servico();

servico.setCodigo(codigo);
servico.setDescricao(descricao);
servico.setCategoria(categoria);
servico.setTipoServico(tipoServico);
servico.setValor(valor);
servico.setDuracao(duracao);
servico.setStatus(status);

servicosDao.alterar(servico);


        javax.swing.JOptionPane.showMessageDialog(
            this, "Serviço alterado com sucesso!"
        );

        atualizaTabela();
        limparCampos();

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Informe um valor e uma duração válidos!"
        );
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Erro ao alterar serviço: " + e.getMessage()
        );
    }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       telaClientesBase tela = new telaClientesBase();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneroActionPerformed
        telaSexualidade tela = new telaSexualidade();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGeneroActionPerformed

    private void btnAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentosActionPerformed
        telaAgendamentos tela = new telaAgendamentos();
        tela.setLocationRelativeTo(null);
           tela.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnAgendamentosActionPerformed

    private boolean validarCPF(String cpf) {
    cpf = cpf.replaceAll("\\D", "");

    if (!cpf.matches("\\d{11}") ||
        cpf.matches("(\\d)\\1{10}")) {
        return false;
    }

    for (int digito = 9; digito < 11; digito++) {
        int suma = 0;

        for (int i = 0; i < digito; i++) {
            suma += (cpf.charAt(i) - '0') * (digito + 1 - i);
        }

        int resto = (suma * 10) % 11;
        if (resto == 10) {
            resto = 0;
        }

        if (resto != cpf.charAt(digito) - '0') {
            return false;
        }
    }

    return true;
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendamentos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGenero;
    private javax.swing.JButton btnInserir1;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnServicos;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbTipoServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAura;
    private javax.swing.JLabel lblBowl;
    private javax.swing.JLabel lblCadastroDe;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCepillo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDecricaoServico;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDosificador;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JLabel lblImagemLateral;
    private javax.swing.JLabel lblPastito;
    private javax.swing.JLabel lblPeine;
    private javax.swing.JLabel lblPinza;
    private javax.swing.JLabel lblPlanchita;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblRociador;
    private javax.swing.JLabel lblSecador;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTijera;
    private javax.swing.JLabel lblTipoServico;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panelCabecalho;
    private javax.swing.JPanel panelConteudo;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDescricao;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
