/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author sabri
 */
public class telaSexualidade extends javax.swing.JFrame {

    /**
     * Creates new form telaSexualidade
     */
public telaSexualidade() {

    initComponents();
    
atualizaTabela();
    
    
    // Diseño de la tabla
tblSexualidade.setRowHeight(32);

tblSexualidade.setBackground(
    new java.awt.Color(255, 253, 252)
);

tblSexualidade.setForeground(
    new java.awt.Color(128, 70, 55)
);

tblSexualidade.setGridColor(
    new java.awt.Color(230, 200, 190)
);

tblSexualidade.setShowVerticalLines(false);

tblSexualidade.setSelectionBackground(
    new java.awt.Color(244, 222, 213)
);

tblSexualidade.setSelectionForeground(
    new java.awt.Color(128, 70, 55)
);

// Encabezado
tblSexualidade.getTableHeader().setBackground(
    new java.awt.Color(244, 222, 213)
);

tblSexualidade.getTableHeader().setForeground(
    new java.awt.Color(128, 70, 55)
);

tblSexualidade.getTableHeader().setFont(
    new java.awt.Font("SansSerif", java.awt.Font.BOLD, 13)
);
// Líneas finitas entre filas y columnas
tblSexualidade.setShowHorizontalLines(true);
tblSexualidade.setShowVerticalLines(true);

tblSexualidade.setGridColor(
    new java.awt.Color(238, 226, 221)
);

tblSexualidade.setIntercellSpacing(
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
        (javax.swing.table.DefaultTableModel) tblSexualidade.getModel();

    modelo.setRowCount(0);

    try {
        dao.SexualidadeDao dao = new dao.SexualidadeDao();

        try (java.sql.ResultSet rs = dao.consultar()) {

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("codigo"),
                    rs.getString("descricao"),
                    rs.getString("sigla"),
                    rs.getString("status")
                });
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Erro ao consultar: " + e.getMessage()
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
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        lblDescricaoForm = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblSigla = new javax.swing.JLabel();
        txtSigla = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnInserir1 = new javax.swing.JButton();
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
        lblImagemLateral = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSexualidade = new javax.swing.JTable();

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

        btnGenero.setBackground(new java.awt.Color(244, 222, 213));
        btnGenero.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnGenero.setForeground(new java.awt.Color(128, 70, 55));
        btnGenero.setText("Gênero/Sexualidade");
        btnGenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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

        lblCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(70, 50, 45));
        lblCodigo.setText("Código:");

        txtCodigo.setBackground(new java.awt.Color(255, 248, 245));
        txtCodigo.setPreferredSize(new java.awt.Dimension(150, 35));

        lblStatus.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(70, 50, 45));
        lblStatus.setText("Status:");

        cmbStatus.setBackground(new java.awt.Color(255, 204, 204));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        cmbStatus.setPreferredSize(new java.awt.Dimension(150, 35));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        lblDescricaoForm.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDescricaoForm.setForeground(new java.awt.Color(70, 50, 45));
        lblDescricaoForm.setText("Descrição:");

        txtDescricao.setBackground(new java.awt.Color(255, 248, 245));
        txtDescricao.setPreferredSize(new java.awt.Dimension(430, 35));

        lblSigla.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSigla.setForeground(new java.awt.Color(70, 50, 45));
        lblSigla.setText("Sigla:");

        txtSigla.setBackground(new java.awt.Color(255, 248, 245));
        txtSigla.setPreferredSize(new java.awt.Dimension(150, 35));

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

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricaoForm)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInserir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoForm)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSigla)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelCabecalho.setBackground(new java.awt.Color(244, 222, 213));
        panelCabecalho.setPreferredSize(new java.awt.Dimension(1090, 200));

        lblCadastroDe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lblCadastroDe.setForeground(new java.awt.Color(145, 91, 75));
        lblCadastroDe.setText("C A D A S T R O  D E \n");
        lblCadastroDe.setPreferredSize(new java.awt.Dimension(200, 20));

        lblTitulo.setBackground(new java.awt.Color(128, 70, 55));
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblTitulo.setText("Gênero / Sexualidade");
        lblTitulo.setPreferredSize(new java.awt.Dimension(350, 25));

        lblDescricao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(140, 120, 115));
        lblDescricao.setText("<html> Gerencie as opções de gênero/sexualidade para o cadastro de clientes. ");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelConteudoLayout = new javax.swing.GroupLayout(panelConteudo);
        panelConteudo.setLayout(panelConteudoLayout);
        panelConteudoLayout.setHorizontalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelConteudoLayout.setVerticalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        lblImagemLateral.setPreferredSize(new java.awt.Dimension(150, 700));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(880, 180));

        tblSexualidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Sigla", "Status"
            }
        ));
        tblSexualidade.setPreferredSize(new java.awt.Dimension(740, 150));
        tblSexualidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSexualidadeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSexualidade);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addComponent(lblImagemLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnInserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir1ActionPerformed

try {
    String descricao = txtDescricao.getText().trim();
    String sigla = txtSigla.getText().trim();
    String status = cmbStatus.getSelectedItem().toString();

    if (descricao.isEmpty() || sigla.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Preencha todos os campos!"
        );
        return;
    }

    
modelo.Sexualidade sexualidade = new modelo.Sexualidade();

sexualidade.setDescricao(descricao);
sexualidade.setSigla(sigla);
sexualidade.setStatus(status);

dao.SexualidadeDao dao = new dao.SexualidadeDao();
dao.inserir(sexualidade);

atualizaTabela();

    javax.swing.JOptionPane.showMessageDialog(
        this, "Cadastro realizado com sucesso!"
    );

    txtDescricao.setText("");
    txtSigla.setText("");
    cmbStatus.setSelectedIndex(0);

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao cadastrar: " + e.getMessage()
    );
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserir1ActionPerformed

    private void tblSexualidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSexualidadeMouseClicked

int linha = tblSexualidade.getSelectedRow();

if (linha >= 0) {
    txtCodigo.setText(
        tblSexualidade.getValueAt(linha, 0).toString()
    );

    txtDescricao.setText(
        tblSexualidade.getValueAt(linha, 1).toString()
    );

    txtSigla.setText(
        tblSexualidade.getValueAt(linha, 2).toString()
    );

    cmbStatus.setSelectedItem(
        tblSexualidade.getValueAt(linha, 3).toString()
    );
}
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSexualidadeMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    
try {
    if (txtCodigo.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Selecione um registro na tabela!"
        );
        return;
    }

    int codigo = Integer.parseInt(txtCodigo.getText());
    String descricao = txtDescricao.getText().trim();
    String sigla = txtSigla.getText().trim();
    String status = cmbStatus.getSelectedItem().toString();

    if (descricao.isEmpty() || sigla.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Preencha todos os campos!"
        );
        return;
    }

   
modelo.Sexualidade sexualidade = new modelo.Sexualidade();

sexualidade.setCodigo(codigo);
sexualidade.setDescricao(descricao);
sexualidade.setSigla(sigla);
sexualidade.setStatus(status);

dao.SexualidadeDao dao = new dao.SexualidadeDao();
dao.alterar(sexualidade);

atualizaTabela();

    txtCodigo.setText("");
    txtDescricao.setText("");
    txtSigla.setText("");
    cmbStatus.setSelectedIndex(0);

    javax.swing.JOptionPane.showMessageDialog(
        this, "Cadastro alterado com sucesso!"
    );

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao alterar: " + e.getMessage()
    );
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

    telaClientesBase tela = new telaClientesBase();
    tela.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        telaServicos tela = new telaServicos();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnServicosActionPerformed

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
            java.util.logging.Logger.getLogger(telaSexualidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSexualidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSexualidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSexualidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSexualidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendamentos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnGenero;
    private javax.swing.JButton btnInserir1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnServicos;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAura;
    private javax.swing.JLabel lblBowl;
    private javax.swing.JLabel lblCadastroDe;
    private javax.swing.JLabel lblCepillo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricaoForm;
    private javax.swing.JLabel lblDosificador;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JLabel lblImagemLateral;
    private javax.swing.JLabel lblPastito;
    private javax.swing.JLabel lblPeine;
    private javax.swing.JLabel lblPinza;
    private javax.swing.JLabel lblPlanchita;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblRociador;
    private javax.swing.JLabel lblSecador;
    private javax.swing.JLabel lblSigla;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTijera;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelCabecalho;
    private javax.swing.JPanel panelConteudo;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTable tblSexualidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
