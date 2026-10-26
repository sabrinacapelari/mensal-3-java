/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author sabri
 */
public class telaClientesBase extends javax.swing.JFrame {

    /**
     * Creates new form telaSexualidade
     */
public telaClientesBase() {

    initComponents();
    
    
    jScrollPane2.setBorder(
    javax.swing.BorderFactory.createMatteBorder(
        0, 1, 0, 0,
        new java.awt.Color(220, 200, 190)
    )
);
    cmbPais.setSelectedIndex(0);
    txtNome.setEnabled(false);
    cmbPais.requestFocusInWindow();
    
    java.util.Set<java.awt.AWTKeyStroke> teclas =
    new java.util.HashSet<>(
        txtNome.getFocusTraversalKeys(
            java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS
        )
    );

    teclas.add(java.awt.AWTKeyStroke.getAWTKeyStroke(
    java.awt.event.KeyEvent.VK_ENTER, 0
    ));

    txtNome.setFocusTraversalKeys(
    java.awt.KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
    teclas
    );
    
    carregarGeneros();
    
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


private void atualizaTabela() {

    javax.swing.table.DefaultTableModel modelo =
        (javax.swing.table.DefaultTableModel) tblDados.getModel();

    modelo.setColumnIdentifiers(new Object[]{
        "Código", "Nome", "CPF",
        "Telefone", "Email"
    });

    modelo.setRowCount(0);

    String sql =
        "SELECT codigo, nome, cpf, telefone, email " +
        "FROM clientes ORDER BY codigo";

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
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("telefone"),
                    rs.getString("email")
                });
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Erro ao carregar clientes: " + e.getMessage()
        );
    }

}


private void carregarGeneros() {

    cmbGenero.removeAllItems();
    cmbGenero.addItem("Selecione...");

    dao.ConexaoBanco banco = new dao.ConexaoBanco();

    try {
        banco.conectar();

        String sql = "SELECT codigo, descricao FROM sexualidade "
                   + "WHERE status = 'Ativo' ORDER BY descricao";

        try (java.sql.Connection conexao = banco.getConnection();
             java.sql.PreparedStatement stmt =
                 conexao.prepareStatement(sql);
             java.sql.ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                cmbGenero.addItem(
                    rs.getInt("codigo") + " - " +
                    rs.getString("descricao")
                );
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Erro ao carregar gêneros: " + e.getMessage()
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
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDocumento = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDatanacimento = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        lblTelefone1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        lblCep = new javax.swing.JLabel();
        lblLogradouro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUf = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtDatanascimento = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblPais = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        lblTipoDocumento = new javax.swing.JLabel();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        txtDocumento = new javax.swing.JFormattedTextField();
        cmbUf = new javax.swing.JComboBox<>();
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
        setPreferredSize(new java.awt.Dimension(1200, 700));

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

        btnClientes.setBackground(new java.awt.Color(244, 222, 213));
        btnClientes.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(128, 70, 55));
        btnClientes.setText("Clientes");
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnServicos.setBackground(new java.awt.Color(255, 248, 245));
        btnServicos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnServicos.setForeground(new java.awt.Color(128, 70, 55));
        btnServicos.setText("Serviços");
        btnServicos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosActionPerformed(evt);
            }
        });

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
        jLabel1.setText("DADOS DO CLIENTE");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setText("Código");

        txtCodigo.setBackground(new java.awt.Color(255, 248, 245));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Nome");

        txtNome.setBackground(new java.awt.Color(255, 248, 245));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDocumento.setText("Documento");

        txtEmail.setBackground(new java.awt.Color(255, 248, 245));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("exemplo@gmail.com");

        lblDatanacimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatanacimento.setText("Data de nascimento");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGenero.setText("Gênero");

        cmbGenero.setBackground(new java.awt.Color(255, 248, 245));
        cmbGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTelefone1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefone1.setText("Telefone");

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

        lblCep.setText("CEP");

        lblLogradouro.setText("Logradouro");

        txtLogradouro.setBackground(new java.awt.Color(255, 248, 245));

        lblBairro.setText("Bairro");

        txtBairro.setBackground(new java.awt.Color(255, 248, 245));

        lblCidade.setText("Cidade");

        txtCidade.setBackground(new java.awt.Color(255, 248, 245));
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        lblUf.setText("UF");

        lblNumero.setText("Número");

        txtNumero.setBackground(new java.awt.Color(255, 248, 245));

        lblComplemento.setText("Complemento");

        txtComplemento.setBackground(new java.awt.Color(255, 248, 245));

        txtCep.setBackground(new java.awt.Color(255, 248, 245));
        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });

        txtDatanascimento.setBackground(new java.awt.Color(255, 248, 245));
        txtDatanascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("##/##/####"))));
        txtDatanascimento.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        txtTelefone.setBackground(new java.awt.Color(255, 248, 245));
        txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        lblPais.setText("País");

        cmbPais.setBackground(new java.awt.Color(255, 248, 245));
        cmbPais.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Brasil", "Argentina", "Paraguai" }));
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        lblTipoDocumento.setText("Tipo de Documento");

        cmbTipoDocumento.setBackground(new java.awt.Color(255, 248, 245));
        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "CPF", "DNI", "Cédula de Identidade", "Passaporte" }));
        cmbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDocumentoActionPerformed(evt);
            }
        });

        txtDocumento.setBackground(new java.awt.Color(255, 248, 245));

        cmbUf.setBackground(new java.awt.Color(255, 248, 245));
        cmbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(611, 611, 611)
                                .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipoDocumento))
                                .addGap(38, 38, 38)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDocumento)
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(357, 357, 357)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLogradouro))
                                .addGap(58, 58, 58)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                                .addComponent(btnInserir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(115, 115, 115)
                                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(115, 115, 115)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(504, 504, 504)
                                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefone1)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(352, 352, 352)
                                        .addComponent(cmbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatanacimento))
                        .addContainerGap(8, Short.MAX_VALUE))))
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
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCodigo)
                                .addComponent(lblNome)
                                .addComponent(lblTelefone1)
                                .addComponent(lblDatanacimento))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTipoDocumento)
                                .addComponent(lblDocumento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDatanascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(lblEmail)
                            .addComponent(lblCep)
                            .addComponent(lblPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBairro)
                                .addComponent(lblLogradouro)
                                .addComponent(lblCidade)
                                .addComponent(lblNumero)
                                .addComponent(lblComplemento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
        lblTitulo.setText("CLIENTES");
        lblTitulo.setPreferredSize(new java.awt.Dimension(350, 25));

        lblDescricao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(140, 120, 115));
        lblDescricao.setText("Cadastre e gerencie os clientes do salão.");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 200, 190)));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(880, 180));

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone", "Email", "Gênero"
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
                .addGap(0, 0, 0)
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelFormulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                    .addComponent(panelCabecalho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        panelConteudoLayout.setVerticalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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
                .addComponent(panelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
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
    if (fila < 0) {
    return;
}

    int filaModelo = tblDados.convertRowIndexToModel(fila);

    int codigoCliente = Integer.parseInt(
        tblDados.getModel().getValueAt(filaModelo, 0).toString()
);

    String sql = "SELECT * FROM clientes WHERE codigo = ?";
    
    
try {
    dao.ConexaoBanco banco = new dao.ConexaoBanco();
    banco.conectar();

    try (java.sql.Connection conexao = banco.getConnection();
         java.sql.PreparedStatement stmt =
             conexao.prepareStatement(sql)) {

        stmt.setInt(1, codigoCliente);

        try (java.sql.ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                txtCodigo.setText(String.valueOf(rs.getInt("codigo")));
                txtNome.setText(rs.getString("nome"));
               
                
    
                txtEmail.setText(rs.getString("email"));
                
String pais = rs.getString("pais");

if (pais != null) {
    cmbPais.setSelectedItem(pais);
}

String tipoDocumento = rs.getString("tipo_documento");

if (tipoDocumento != null) {
    cmbTipoDocumento.setSelectedItem(tipoDocumento);
}
// Carregar CPF, DNI ou Cédula após selecionar o país
String documento = rs.getString("cpf");

if (documento != null) {
    txtDocumento.setText(documento);
} else {
    txtDocumento.setText("");
}

int codigoGenero = rs.getInt("codigo_genero");
boolean generoExiste = !rs.wasNull();

cmbGenero.setSelectedIndex(0);

if (generoExiste) {
    for (int i = 0; i < cmbGenero.getItemCount(); i++) {
        String item = cmbGenero.getItemAt(i).toString();

        if (item.startsWith(codigoGenero + " - ")) {
            cmbGenero.setSelectedIndex(i);
            break;
        }
    }
}


java.sql.Date dataNascimento = rs.getDate("data_nascimento");

if (dataNascimento != null) {
    java.time.format.DateTimeFormatter formato =
        java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

    txtDatanascimento.setText(
        dataNascimento.toLocalDate().format(formato)
    );
} else {
    txtDatanascimento.setText("");
}
    
txtCep.setText(rs.getString("cep"));
txtLogradouro.setText(rs.getString("logradouro"));
txtBairro.setText(rs.getString("bairro"));
txtCidade.setText(rs.getString("cidade"));
txtNumero.setText(rs.getString("numero"));
txtComplemento.setText(rs.getString("complemento"));

carregarEstados();

String uf = rs.getString("uf");

if (uf != null && !uf.isEmpty()) {
    cmbUf.setSelectedItem(uf);
} else {
    cmbUf.setSelectedIndex(0);
}

// Carregar telefone
String telefone = rs.getString("telefone");

if (telefone != null && !telefone.trim().isEmpty()) {
    String numeros = telefone.replaceAll("\\D", "");

    if (numeros.startsWith("549")) {
        numeros = numeros.substring(3);
    }

    txtTelefone.setText(numeros);
} else {
    txtTelefone.setValue(null);
}



            }
        }
    }

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Erro ao carregar cliente: " + e.getMessage()
    );
}


        // TODO add your handling code here:
    }//GEN-LAST:event_tblDadosMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
    limparCampos();
}

    private void limparCampos() {
    txtCodigo.setText("");
    txtNome.setText("");
    txtDocumento.setValue(null);
    txtTelefone.setValue(null);
    txtDatanascimento.setText("");
    txtEmail.setText("");

    txtCep.setText("");
    txtLogradouro.setText("");
    txtBairro.setText("");
    txtCidade.setText("");
    txtNumero.setText("");
    txtComplemento.setText("");

    cmbGenero.setSelectedIndex(0);
    cmbPais.setSelectedIndex(0);
    cmbTipoDocumento.setSelectedIndex(0);
    cmbUf.setSelectedIndex(0);

    tblDados.clearSelection();

    cmbPais.requestFocusInWindow();    
   
    }//GEN-LAST:event_btnLimparActionPerformed
    
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
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    
    private void carregarEstados() {

    cmbUf.removeAllItems();
    cmbUf.addItem("Selecione...");

    if (cmbPais.getSelectedItem() == null) {
        return;
    }

    String pais = cmbPais.getSelectedItem().toString();

    String[] estados = {};

    switch (pais) {

        case "Brasil":
            estados = new String[]{
                "AC", "AL", "AP", "AM", "BA", "CE", "DF",
                "ES", "GO", "MA", "MT", "MS", "MG", "PA",
                "PB", "PR", "PE", "PI", "RJ", "RN", "RS",
                "RO", "RR", "SC", "SP", "SE", "TO"
            };
            break;

        case "Argentina":
            estados = new String[]{
                "Buenos Aires", "Catamarca", "Chaco",
                "Chubut", "Córdoba", "Corrientes",
                "Entre Ríos", "Formosa", "Jujuy",
                "La Pampa", "La Rioja", "Mendoza",
                "Misiones", "Neuquén", "Río Negro",
                "Salta", "San Juan", "San Luis",
                "Santa Cruz", "Santa Fe",
                "Santiago del Estero", "Tierra del Fuego",
                "Tucumán", "Ciudad Autónoma de Buenos Aires"
            };
            break;

        case "Paraguai":
            estados = new String[]{
                "Alto Paraguay", "Alto Paraná", "Amambay",
                "Boquerón", "Caaguazú", "Caazapá",
                "Canindeyú", "Central", "Concepción",
                "Cordillera", "Guairá", "Itapúa",
                "Misiones", "Ñeembucú", "Paraguarí",
                "Presidente Hayes", "San Pedro",
                "Asunción"
            };
            break;
    }

    for (String estado : estados) {
        cmbUf.addItem(estado);
    }
}
    private void btnInserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir1ActionPerformed
        if (!txtCodigo.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Para modificar um cliente, utilize o botão Alterar!"
            );
            return;
        }

        String nome = txtNome.getText().trim();
        String cpf = txtDocumento.getText().trim();
        if ("CPF".equals(cmbTipoDocumento.getSelectedItem())
        && !validarCPF(cpf)) {

        javax.swing.JOptionPane.showMessageDialog(
        this,
        "CPF inválido! Verifique os números informados."
        );
        txtDocumento.requestFocusInWindow();
        return;
    }
        String telefone = txtTelefone.getText().trim();
        if (telefone.contains("_") || telefone.replaceAll("\\D", "").isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
        this,
        "Preencha corretamente o telefone do cliente!"
        );
        txtTelefone.requestFocusInWindow();
        return;
}
        String email = txtEmail.getText().trim();
        
if (!email.isEmpty() &&
    !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {

    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Digite um e-mail válido."
    );

    txtEmail.requestFocus();
    return;
}

        java.sql.Date dataNascimento = null;

        String dataTexto = txtDatanascimento.getText().trim();

        if (!dataTexto.isEmpty()) {
        try {
        java.time.format.DateTimeFormatter formato =
            java.time.format.DateTimeFormatter.ofPattern("dd/MM/uuuu")
                .withResolverStyle(java.time.format.ResolverStyle.STRICT);

        java.time.LocalDate data =
            java.time.LocalDate.parse(dataTexto, formato);

        dataNascimento = java.sql.Date.valueOf(data);

        } catch (java.time.format.DateTimeParseException e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Data de nascimento inválida! Use DD/MM/AAAA."
        );
        return;
    }
}
        String pais = cmbPais.getSelectedItem().toString();
        String tipoDocumento = cmbTipoDocumento.getSelectedItem().toString();

        String cep = txtCep.getText().trim();
        String logradouro = txtLogradouro.getText().trim();
        String bairro = txtBairro.getText().trim();
        String cidade = txtCidade.getText().trim();
        String uf = cmbUf.getSelectedItem().toString();
        String numero = txtNumero.getText().trim();
        String complemento = txtComplemento.getText().trim();

        if (nome.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Preencha o nome do cliente!"
            );
            return;
        }

        Integer codigoGenero = null;

        if (cmbGenero.getSelectedIndex() > 0) {
            String genero = cmbGenero.getSelectedItem().toString();
            codigoGenero = Integer.parseInt(genero.split(" - ")[0]);
        }

        try {
            dao.ClientesDao clientesDao = new dao.ClientesDao();

            
modelo.Cliente cliente = new modelo.Cliente();

cliente.setNome(nome);
cliente.setCpf(cpf);
cliente.setTelefone(telefone);
cliente.setEmail(email);
cliente.setCodigoGenero(codigoGenero);
cliente.setPais(pais);
cliente.setTipoDocumento(tipoDocumento);

if (dataNascimento != null) {
    cliente.setDataNascimento(dataNascimento.toLocalDate());
}

cliente.setCep(cep);
cliente.setLogradouro(logradouro);
cliente.setBairro(bairro);
cliente.setCidade(cidade);
cliente.setUf(uf);
cliente.setNumero(numero);
cliente.setComplemento(complemento);

clientesDao.inserir(cliente);


            javax.swing.JOptionPane.showMessageDialog(
                this, "Cliente cadastrado com sucesso!"
            );

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Erro ao cadastrar cliente: " + e.getMessage()
            );
        }  atualizaTabela();
        limparCampos();
    }//GEN-LAST:event_btnInserir1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if (txtCodigo.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Selecione um cliente na tabela!"
            );
            return;
        }

        int codigo = Integer.parseInt(txtCodigo.getText().trim());
        String nome = txtNome.getText().trim();
        String cpf = txtDocumento.getText().trim();
        if ("CPF".equals(cmbTipoDocumento.getSelectedItem())
        && !validarCPF(cpf)) {

        javax.swing.JOptionPane.showMessageDialog(
        this,
        "CPF inválido! Verifique os números informados."
        );

        txtDocumento.requestFocusInWindow();
        return;
}
        String telefone = txtTelefone.getText().trim();
        if (telefone.contains("_") || telefone.replaceAll("\\D", "").isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
        this,
        "Preencha corretamente o telefone do cliente!"
        );
        txtTelefone.requestFocusInWindow();
        return;
        }
        String email = txtEmail.getText().trim();
        
if (!email.isEmpty() &&
    !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {

    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Digite um e-mail válido."
    );

    txtEmail.requestFocus();
    return;
}

        String pais = cmbPais.getSelectedItem().toString();
        String tipoDocumento = cmbTipoDocumento.getSelectedItem().toString();

        String cep = txtCep.getText().trim();
        String logradouro = txtLogradouro.getText().trim();
        String bairro = txtBairro.getText().trim();
        String cidade = txtCidade.getText().trim();
        String uf = cmbUf.getSelectedItem().toString();
        String numero = txtNumero.getText().trim();
        String complemento = txtComplemento.getText().trim();

        java.sql.Date dataNascimento = null;
        String dataTexto = txtDatanascimento.getText().trim();

        if (!dataTexto.isEmpty()) {
        try {
        java.time.format.DateTimeFormatter formato =
            java.time.format.DateTimeFormatter.ofPattern("dd/MM/uuuu")
                .withResolverStyle(java.time.format.ResolverStyle.STRICT);

        java.time.LocalDate data =
            java.time.LocalDate.parse(dataTexto, formato);

        dataNascimento = java.sql.Date.valueOf(data);

    } catch (java.time.format.DateTimeParseException e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Data de nascimento inválida! Use DD/MM/AAAA."
        );
        return;
    }
}

        if (nome.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Preencha o nome do cliente!"
            );
            return;
        }

        Integer codigoGenero = null;

        if (cmbGenero.getSelectedIndex() > 0) {
            String genero = cmbGenero.getSelectedItem().toString();
            codigoGenero = Integer.parseInt(genero.split(" - ")[0]);
        }

        try {
            dao.ClientesDao clientesDao = new dao.ClientesDao();

            
modelo.Cliente cliente = new modelo.Cliente();

cliente.setCodigo(codigo);
cliente.setNome(nome);
cliente.setCpf(cpf);
cliente.setTelefone(telefone);
cliente.setEmail(email);
cliente.setCodigoGenero(codigoGenero);
cliente.setPais(pais);
cliente.setTipoDocumento(tipoDocumento);
cliente.setDataNascimento(
    dataNascimento == null
        ? null
        : dataNascimento.toLocalDate()
);
cliente.setCep(cep);
cliente.setLogradouro(logradouro);
cliente.setBairro(bairro);
cliente.setCidade(cidade);
cliente.setUf(uf);
cliente.setNumero(numero);
cliente.setComplemento(complemento);

clientesDao.alterar(cliente);


            javax.swing.JOptionPane.showMessageDialog(
                this, "Cliente alterado com sucesso!"
            );

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Erro ao alterar cliente: " + e.getMessage()
            );
        }atualizaTabela();
        limparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed

    if (cmbPais.getSelectedItem() == null) {
    return;
    }

    String pais = cmbPais.getSelectedItem().toString();
    carregarEstados();
    if (cmbPais.getSelectedIndex() > 0) {
    txtNome.setEnabled(true);
    txtNome.requestFocusInWindow();
    } else {
    txtNome.setEnabled(false);
    }

    try {
    javax.swing.text.MaskFormatter mascara = null;

    if (pais.equals("Brasil")) {
        mascara = new javax.swing.text.MaskFormatter("(##) #####-####");

    } else if (pais.equals("Argentina")) {
        mascara = new javax.swing.text.MaskFormatter("+54 9 #### ######");

    } else if (pais.equals("Paraguai")) {
        mascara = new javax.swing.text.MaskFormatter("+595 ### ######");
    }

    if (mascara != null) {
        mascara.setPlaceholderCharacter('_');

        txtTelefone.setFormatterFactory(
            new javax.swing.text.DefaultFormatterFactory(mascara)
        );

        txtTelefone.setValue(null);
    }

} catch (java.text.ParseException e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao configurar telefone: " + e.getMessage()
    );
}
if (cmbPais.getSelectedItem() != null) {
    String paisDocumento = cmbPais.getSelectedItem().toString();

    switch (paisDocumento) {
        case "Brasil":
            cmbTipoDocumento.setSelectedItem("CPF");
            break;

        case "Argentina":
            cmbTipoDocumento.setSelectedItem("DNI");
            break;

        case "Paraguai":
            cmbTipoDocumento.setSelectedItem("Cédula de Identidade");
            break;

        default:
            cmbTipoDocumento.setSelectedItem("Selecione...");
            break;
    }
}
   
try {
    if (pais.equals("Brasil")) {

        javax.swing.text.MaskFormatter mascaraCep =
            new javax.swing.text.MaskFormatter("#####-###");

        mascaraCep.setPlaceholderCharacter('_');

        txtCep.setFormatterFactory(
            new javax.swing.text.DefaultFormatterFactory(mascaraCep)
        );

    } else {

        // Argentina e Paraguai: código postal sem máscara
        txtCep.setFormatterFactory(
            new javax.swing.text.DefaultFormatterFactory()
        );
    }

    txtCep.setValue(null);
    txtCep.setText("");

} catch (java.text.ParseException e) {
    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Erro ao configurar CEP: " + e.getMessage()
    );
}

    }//GEN-LAST:event_cmbPaisActionPerformed

    private void cmbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDocumentoActionPerformed
    if (cmbTipoDocumento.getSelectedItem() == null) {
    return;
}

String tipo = cmbTipoDocumento.getSelectedItem().toString();

try {
    javax.swing.text.MaskFormatter mascara = null;

    switch (tipo) {
        case "CPF":
            mascara = new javax.swing.text.MaskFormatter("###.###.###-##");
            break;

        case "DNI":
            mascara = new javax.swing.text.MaskFormatter("########");
            break;

        case "Cédula de Identidade":
        case "Passaporte":
        default:
            break;
    }

    if (mascara != null) {
        mascara.setPlaceholderCharacter('_');

        txtDocumento.setFormatterFactory(
            new javax.swing.text.DefaultFormatterFactory(mascara)
        );
    } else {
        txtDocumento.setFormatterFactory(
            new javax.swing.text.DefaultFormatterFactory()
        );
    }

    txtDocumento.setValue(null);

} catch (java.text.ParseException e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao configurar documento: " + e.getMessage()
    );

}
    }//GEN-LAST:event_cmbTipoDocumentoActionPerformed

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
    if (!"Brasil".equals(cmbPais.getSelectedItem())) {
    return;
}

String cep = txtCep.getText().replaceAll("\\D", "");

if (cep.length() != 8) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "O CEP deve conter 8 números!"
    );
    return;
}

try {
    java.net.URL url = new java.net.URL(
        "https://viacep.com.br/ws/" + cep + "/json/"
    );

    java.net.HttpURLConnection conexao =
        (java.net.HttpURLConnection) url.openConnection();

    conexao.setRequestMethod("GET");
    conexao.setConnectTimeout(5000);
    conexao.setReadTimeout(5000);

    try (java.io.InputStream entrada = conexao.getInputStream();
         java.util.Scanner scanner =
             new java.util.Scanner(entrada, "UTF-8")
                 .useDelimiter("\\A")) {

        String resposta = scanner.hasNext()
            ? scanner.next() : "";

        if (resposta.contains("\"erro\": true")
                || resposta.contains("\"erro\":true")) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "CEP não encontrado!"
            );
            return;
        }

        java.util.regex.Matcher matcher =
            java.util.regex.Pattern.compile(
                "\"(logradouro|bairro|localidade|uf)\"\\s*:\\s*\"([^\"]*)\""
            ).matcher(resposta);

        while (matcher.find()) {
            String campo = matcher.group(1);
            String valor = matcher.group(2);

            switch (campo) {
                case "logradouro":
                    txtLogradouro.setText(valor);
                    break;
                case "bairro":
                    txtBairro.setText(valor);
                    break;
                case "localidade":
                    txtCidade.setText(valor);
                    break;
                case "uf":
                    cmbUf.setSelectedItem(valor);
                    break;
            }
        }
    } finally {
        conexao.disconnect();
    }

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao consultar CEP: " + e.getMessage()
    );
}
    }//GEN-LAST:event_txtCepFocusLost

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        telaServicos tela = new telaServicos();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnServicosActionPerformed

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
            java.util.logging.Logger.getLogger(telaClientesBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaClientesBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaClientesBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaClientesBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaClientesBase().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JComboBox<String> cmbUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAura;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBowl;
    private javax.swing.JLabel lblCadastroDe;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCepillo;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDatanacimento;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblDosificador;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblImagemLateral;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPastito;
    private javax.swing.JLabel lblPeine;
    private javax.swing.JLabel lblPinza;
    private javax.swing.JLabel lblPlanchita;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblRociador;
    private javax.swing.JLabel lblSecador;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTijera;
    private javax.swing.JLabel lblTipoDocumento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUf;
    private javax.swing.JPanel panelCabecalho;
    private javax.swing.JPanel panelConteudo;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDatanascimento;
    private javax.swing.JFormattedTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
