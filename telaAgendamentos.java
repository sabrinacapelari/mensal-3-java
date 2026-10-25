/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author sabri
 */
public class telaAgendamentos extends javax.swing.JFrame {
    private int codigoServicoSelecionado = 0;
    
    /**
     * Creates new form telaSexualidade
     */
public telaAgendamentos() {

    initComponents();
    carregarClientes();
    carregarCategorias();
    cmbCategoria.addActionListener(e -> carregarTiposServico());
    carregarTiposServico();
    cmbTipoServico.addActionListener(e -> carregarDadosServico());
    // Calendário AURA - idioma português
    dateData.setLocale(
        new java.util.Locale("pt", "BR")
    );

    dateData.setDateFormatString("dd/MM/yyyy");

    // Cores do calendário
    com.toedter.calendar.JCalendar calendario =
        dateData.getJCalendar();

    calendario.setBackground(
        new java.awt.Color(245, 214, 223)
    );

    calendario.setDecorationBackgroundColor(
        new java.awt.Color(245, 214, 223)
    );

    calendario.setSundayForeground(
        new java.awt.Color(166, 93, 114)
    );

    calendario.setWeekdayForeground(
        new java.awt.Color(128, 70, 55)
    );

    // Seletor de horário
    spnHorario.setModel(
        new javax.swing.SpinnerDateModel()
    );

    spnHorario.setEditor(
        new javax.swing.JSpinner.DateEditor(
            spnHorario, "HH:mm"
        )
    );

    
    jScrollPane2.setBorder(
    javax.swing.BorderFactory.createMatteBorder(
        0, 1, 0, 0,
        new java.awt.Color(220, 200, 190)
    )
);
    //cmbCategoria.addActionListener(e -> atualizarTiposServico());
    //cmbCategoria.setSelectedIndex(0);
    //cmbTipoServico.setSelectedIndex(0);
    //cmbCategoria.requestFocusInWindow();
    
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

private static class ClienteItem {

    private final int codigo;
    private final String nome;

    public ClienteItem(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return nome;
    }
}


private void carregarClientes() {

   
    cmbCliente.removeAllItems();
    cmbCliente.addItem("Selecione...");

    String sql = "SELECT codigo, nome FROM clientes ORDER BY nome";

    try {
        dao.ConexaoBanco banco = new dao.ConexaoBanco();
        banco.conectar();

        try (java.sql.Connection conexao = banco.getConnection();
             java.sql.PreparedStatement stmt =
                 conexao.prepareStatement(sql);
             java.sql.ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");

                cmbCliente.addItem(
                    new ClienteItem(codigo, nome)
                );
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Erro ao carregar clientes: " + e.getMessage()
        );
    }
}

private void carregarCategorias() {

    cmbCategoria.removeAllItems();
    cmbCategoria.addItem("Selecione...");

    String sql = "SELECT DISTINCT categoria FROM servicos "
               + "WHERE categoria IS NOT NULL "
               + "ORDER BY categoria";

    try {
        dao.ConexaoBanco banco = new dao.ConexaoBanco();
        banco.conectar();

        try (java.sql.Connection conexao = banco.getConnection();
             java.sql.PreparedStatement stmt =
                 conexao.prepareStatement(sql);
             java.sql.ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                cmbCategoria.addItem(rs.getString("categoria"));
            }

        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Erro ao carregar categorias: " + e.getMessage()
        );
    }
}

private void carregarTiposServico() {

    cmbTipoServico.removeAllItems();
    cmbTipoServico.addItem("Selecione...");

    Object selecionada = cmbCategoria.getSelectedItem();

    if (selecionada == null ||
        selecionada.toString().equals("Selecione...")) {
        return;
    }

    String sql = "SELECT DISTINCT tipo_servico FROM servicos "
               + "WHERE categoria = ? "
               + "ORDER BY tipo_servico";

    try {
        dao.ConexaoBanco banco = new dao.ConexaoBanco();
        banco.conectar();

        try (java.sql.Connection conexao = banco.getConnection();
             java.sql.PreparedStatement stmt =
                 conexao.prepareStatement(sql)) {

            stmt.setString(1, selecionada.toString());

            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    cmbTipoServico.addItem(
                        rs.getString("tipo_servico")
                    );
                }
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Erro ao carregar serviços: " + e.getMessage()
        );
    }
}

private void carregarDadosServico() {

    txtDescricao.setText("");
    txtValor.setText("");
    txtDuracao.setText("");
    codigoServicoSelecionado = 0;

    Object categoria = cmbCategoria.getSelectedItem();
    Object tipo = cmbTipoServico.getSelectedItem();

    if (categoria == null || tipo == null ||
        categoria.toString().equals("Selecione...") ||
        tipo.toString().equals("Selecione...")) {
        return;
    }

    String sql = "SELECT codigo, descricao, valor, duracao "
           + "FROM servicos "
           + "WHERE categoria = ? AND tipo_servico = ? "
           + "ORDER BY codigo LIMIT 1";

    try {
        dao.ConexaoBanco banco = new dao.ConexaoBanco();
        banco.conectar();

        try (java.sql.Connection conexao = banco.getConnection();
             java.sql.PreparedStatement stmt =
                 conexao.prepareStatement(sql)) {

            stmt.setString(1, categoria.toString());
            stmt.setString(2, tipo.toString());

            try (java.sql.ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    codigoServicoSelecionado = rs.getInt("codigo");
                    txtDescricao.setText(
                        rs.getString("descricao")
                    );

                    txtValor.setText(
                        rs.getBigDecimal("valor").toString()
                    );

                    txtDuracao.setText(
                        String.valueOf(rs.getInt("duracao"))
                    );
                }
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Erro ao carregar dados do serviço: "
            + e.getMessage()
        );
    }
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
        "Código", "Cliente", "Categoria",
        "Tipo de Serviço", "Data", "Horário",
        "Profissional", "Valor (R$)", "Status"
    });

    modelo.setRowCount(0);

    String sql =
        "SELECT a.codigo, a.cliente_codigo, c.nome AS cliente, " +
        "s.categoria, s.tipo_servico, " +
        "a.data_agendamento, a.horario, " +
        "a.profissional, s.valor, a.status " +
        "FROM agendamentos a " +
        "INNER JOIN clientes c ON a.cliente_codigo = c.codigo " +
        "INNER JOIN servicos s ON a.servico_codigo = s.codigo " +
        "ORDER BY a.data_agendamento, a.horario";

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
                    rs.getString("cliente"),
                    rs.getString("categoria"),
                    rs.getString("tipo_servico"),
                    rs.getDate("data_agendamento").toLocalDate()
                    .format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")),

                    rs.getTime("horario").toLocalTime()
                    .format(java.time.format.DateTimeFormatter.ofPattern("HH:mm")),
                    rs.getString("profissional"),
                    rs.getBigDecimal("valor"),
                    rs.getString("status")
                });
            }
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Erro ao carregar agendamentos: " + e.getMessage()
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
        lblNome = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        lblData = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblObservacoes = new javax.swing.JLabel();
        lblProfissional = new javax.swing.JLabel();
        cmbProfissional = new javax.swing.JComboBox<>();
        dateData = new com.toedter.calendar.JDateChooser();
        spnHorario = new javax.swing.JSpinner();
        scrollObservacoes = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
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

        btnAgendamentos.setBackground(new java.awt.Color(244, 222, 213));
        btnAgendamentos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAgendamentos.setForeground(new java.awt.Color(128, 70, 55));
        btnAgendamentos.setText("Agendamentos");
        btnAgendamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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
        jLabel1.setText("DADOS DO AGENDAMENTO");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setText("Código");

        txtCodigo.setBackground(new java.awt.Color(255, 248, 245));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        lblDecricaoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDecricaoServico.setText("Descrição do Serviço");

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

        lblTipoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Agendado", "Confirmado", "Concluído", "Cancelado" }));

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setText("Cliente");

        cmbCliente.setBackground(new java.awt.Color(255, 248, 245));
        cmbCliente.setForeground(new java.awt.Color(128, 70, 55));
        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cabelo", "Unhas", "Sobrancelhas e Cílios", "Maquiagem", "Estética Facial", "Estética Corporal", "Depilação" }));

        lblData.setText("Data");

        lblHorario.setText("Horario");

        lblObservacoes.setText("Observações");

        lblProfissional.setText("Profissional");

        cmbProfissional.setBackground(new java.awt.Color(255, 248, 245));
        cmbProfissional.setForeground(new java.awt.Color(128, 70, 55));
        cmbProfissional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Mariana Oliveira", "Camila Santos", "Juliana Ferreira", "Beatriz Costa", "Rafael Almeida", "Fernanda Ribeiro", "Larissa Martins", "Patrícia Souza", "Gabriel Rodrigues" }));

        dateData.setBackground(new java.awt.Color(245, 214, 223));
        dateData.setForeground(new java.awt.Color(255, 248, 245));
        dateData.setDateFormatString("dd/MM/yyyy");

        txtObservacoes.setBackground(new java.awt.Color(255, 248, 245));
        txtObservacoes.setColumns(20);
        txtObservacoes.setLineWrap(true);
        txtObservacoes.setRows(5);
        txtObservacoes.setWrapStyleWord(true);
        txtObservacoes.setPreferredSize(new java.awt.Dimension(232, 35));
        scrollObservacoes.setViewportView(txtObservacoes);

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoria)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addComponent(lblTipoServico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDecricaoServico)
                                        .addGap(115, 115, 115))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addComponent(cmbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDuracao)
                                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateData, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(125, 125, 125)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnInserir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(308, 308, 308)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatus))
                        .addGap(53, 53, 53)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(lblProfissional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(lblObservacoes)
                                .addGap(95, 95, 95))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(cmbProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(scrollObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
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
                    .addComponent(lblNome)
                    .addComponent(lblDecricaoServico)
                    .addComponent(lblTipoServico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(lblDuracao)
                            .addComponent(lblData)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                        .addComponent(cmbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblObservacoes)
                            .addComponent(lblProfissional)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHorario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollObservacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInserir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(dateData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelCabecalho.setBackground(new java.awt.Color(244, 222, 213));
        panelCabecalho.setPreferredSize(new java.awt.Dimension(1090, 200));

        lblCadastroDe.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lblCadastroDe.setForeground(new java.awt.Color(145, 91, 75));
        lblCadastroDe.setText("C A D A S T R O  D E \n");
        lblCadastroDe.setPreferredSize(new java.awt.Dimension(200, 20));

        lblTitulo.setBackground(new java.awt.Color(128, 70, 55));
        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblTitulo.setText("AGENDAMENTOS");
        lblTitulo.setPreferredSize(new java.awt.Dimension(350, 25));

        lblDescricao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(140, 120, 115));
        lblDescricao.setText("Cadastre e gerencie os agendamentos do salão.");
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
                        .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCabecalhoLayout.createSequentialGroup()
                            .addComponent(lblPlanchita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblDosificador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCabecalhoLayout.createSequentialGroup()
                        .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCabecalhoLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblCadastroDe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTijera, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCepillo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBowl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSecador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRociador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPinza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblSecador.getAccessibleContext().setAccessibleDescription("");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(880, 180));

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Categoria", "Tipo de Serviço", "Data", "Horario", "Profissional", "Valor (R$)", "Status"
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
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                    .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelConteudoLayout.setVerticalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteudoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

        int filaModelo = tblDados.convertRowIndexToModel(fila);

        txtCodigo.setText(
            tblDados.getModel().getValueAt(filaModelo, 0).toString()
        );
        
try {
    int codigoAgendamento = Integer.parseInt(txtCodigo.getText());

    dao.ConexaoBanco banco = new dao.ConexaoBanco();
    banco.conectar();

    String sql = "SELECT observacoes FROM agendamentos WHERE codigo = ?";

    try (java.sql.Connection conexao = banco.getConnection();
         java.sql.PreparedStatement stmt = conexao.prepareStatement(sql)) {

        stmt.setInt(1, codigoAgendamento);

        try (java.sql.ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                txtObservacoes.setText(rs.getString("observacoes"));
            } else {
                txtObservacoes.setText("");
            }
        }
    }

        } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao carregar observações: " + e.getMessage()
    );
}

        
try {
    int codigoAgendamento =
        Integer.parseInt(txtCodigo.getText());

    dao.ConexaoBanco banco = new dao.ConexaoBanco();
    banco.conectar();

    String sql =
        "SELECT cliente_codigo FROM agendamentos WHERE codigo = ?";

    try (java.sql.Connection conexao = banco.getConnection();
         java.sql.PreparedStatement stmt =
             conexao.prepareStatement(sql)) {

        stmt.setInt(1, codigoAgendamento);

        try (java.sql.ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {

                int codigoCliente = rs.getInt("cliente_codigo");

                for (int i = 0; i < cmbCliente.getItemCount(); i++) {

                    Object item = cmbCliente.getItemAt(i);

                    if (item instanceof ClienteItem) {

                        ClienteItem cliente = (ClienteItem) item;

                        if (cliente.getCodigo() == codigoCliente) {
                            cmbCliente.setSelectedIndex(i);
                            break;
                        }
                    }
                }
            }
        }
    }

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao carregar cliente: " + e.getMessage()
    );

}

        
try {
    String textoData = tblDados.getModel()
        .getValueAt(filaModelo, 4).toString();

    java.text.SimpleDateFormat formatoData =
        new java.text.SimpleDateFormat("dd/MM/yyyy");

    formatoData.setLenient(false);
    dateData.setDate(formatoData.parse(textoData));

    String textoHorario = tblDados.getModel()
        .getValueAt(filaModelo, 5).toString();

    java.time.LocalTime hora =
        java.time.LocalTime.parse(textoHorario);

    java.util.Calendar calendario =
        java.util.Calendar.getInstance();

    calendario.set(java.util.Calendar.HOUR_OF_DAY, hora.getHour());
    calendario.set(java.util.Calendar.MINUTE, hora.getMinute());
    calendario.set(java.util.Calendar.SECOND, 0);
    calendario.set(java.util.Calendar.MILLISECOND, 0);

    spnHorario.setValue(calendario.getTime());

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao carregar data e horário: " + e.getMessage()
    );
}


        cmbProfissional.setSelectedItem(
            tblDados.getModel().getValueAt(filaModelo, 6).toString()
        );

        cmbStatus.setSelectedItem(
            tblDados.getModel().getValueAt(filaModelo, 8).toString()
        );
        String categoria = tblDados.getModel()
        .getValueAt(filaModelo, 2).toString();

    String tipoServico = tblDados.getModel()
        .getValueAt(filaModelo, 3).toString();

    cmbCategoria.setSelectedItem(categoria);

    carregarTiposServico();

    cmbTipoServico.setSelectedItem(tipoServico);

    carregarDadosServico();
    
try {
    int codigoAgendamento =
        Integer.parseInt(txtCodigo.getText());

    dao.ConexaoBanco banco = new dao.ConexaoBanco();
    banco.conectar();

    String sql =
        "SELECT servico_codigo FROM agendamentos WHERE codigo = ?";

    try (java.sql.Connection conexao = banco.getConnection();
         java.sql.PreparedStatement stmt =
             conexao.prepareStatement(sql)) {

        stmt.setInt(1, codigoAgendamento);

        try (java.sql.ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                codigoServicoSelecionado =
                    rs.getInt("servico_codigo");
            }
        }
    }

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Erro ao carregar serviço: " + e.getMessage()
    );
}

    }





        // TODO add your handling code here:
    }//GEN-LAST:event_tblDadosMouseClicked

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

        cmbCliente.setSelectedIndex(0);

        cmbCategoria.setSelectedIndex(0);
        cmbTipoServico.setSelectedIndex(0);

        txtDescricao.setText("");
        txtValor.setText("");
        txtDuracao.setText("");

        codigoServicoSelecionado = 0;

        dateData.setDate(null);

        spnHorario.setValue(new java.util.Date());

        cmbProfissional.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);

        txtObservacoes.setText("");

        tblDados.clearSelection();

        cmbCliente.requestFocusInWindow();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnInserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserir1ActionPerformed

        
   if (!txtCodigo.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Para modificar um agendamento, utilize o botão Alterar!"
        );
        return;
    }

    if (!(cmbCliente.getSelectedItem() instanceof ClienteItem)
            || codigoServicoSelecionado <= 0
            || dateData.getDate() == null
            || cmbProfissional.getSelectedIndex() <= 0
            || cmbStatus.getSelectedIndex() <= 0) {

        javax.swing.JOptionPane.showMessageDialog(
            this, "Preencha os campos obrigatórios do agendamento!"
        );
        return;
    }
    java.time.LocalDate dataSelecionada =
    dateData.getDate().toInstant()
        .atZone(java.time.ZoneId.systemDefault())
        .toLocalDate();

if (dataSelecionada.isBefore(java.time.LocalDate.now())) {
    javax.swing.JOptionPane.showMessageDialog(
        this, "Não é possível agendar em uma data passada!"
    );
    return;
}
    try {
        ClienteItem cliente =
            (ClienteItem) cmbCliente.getSelectedItem();

        int clienteCodigo = cliente.getCodigo();

        java.sql.Date data = new java.sql.Date(
            dateData.getDate().getTime()
        );

        
        java.util.Date horaSelecionada =
        (java.util.Date) spnHorario.getValue();

        java.util.Calendar calendario =
        java.util.Calendar.getInstance();

        calendario.setTime(horaSelecionada);
        calendario.set(java.util.Calendar.SECOND, 0);
        calendario.set(java.util.Calendar.MILLISECOND, 0);

        java.sql.Time horario =
        new java.sql.Time(calendario.getTimeInMillis());

        String profissional =
            cmbProfissional.getSelectedItem().toString();

        String status =
            cmbStatus.getSelectedItem().toString();

        
        String observacoes =
            txtObservacoes.getText().trim();


        dao.AgendamentosDao agendamentosDao =
            new dao.AgendamentosDao();
        
    if (agendamentosDao.horarioOcupado(
        data,
        horario,
        profissional,
        codigoServicoSelecionado,
        0)) {

    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Este profissional já possui um agendamento neste horário!"
    );
    return;
}


        
modelo.Agendamento agendamento = new modelo.Agendamento();

agendamento.setClienteCodigo(clienteCodigo);
agendamento.setServicoCodigo(codigoServicoSelecionado);
agendamento.setDataAgendamento(data);
agendamento.setHorario(horario);
agendamento.setProfissional(profissional);
agendamento.setStatus(status);
agendamento.setObservacoes(observacoes);

agendamentosDao.inserir(agendamento);


        javax.swing.JOptionPane.showMessageDialog(
            this, "Agendamento cadastrado com sucesso!"
        );
        atualizaTabela();
        limparCampos();

        // A atualização da tabela será conectada no próximo passo.

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Erro ao cadastrar agendamento: " + e.getMessage()
        );
    }

    }//GEN-LAST:event_btnInserir1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        

    if (txtCodigo.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Selecione um agendamento na tabela!"
        );
        return;
    }

    if (!(cmbCliente.getSelectedItem() instanceof ClienteItem)
            || codigoServicoSelecionado <= 0
            || dateData.getDate() == null
            || cmbProfissional.getSelectedIndex() <= 0
            || cmbStatus.getSelectedIndex() <= 0) {

        javax.swing.JOptionPane.showMessageDialog(
            this, "Preencha os campos obrigatórios do agendamento!"
        );
        return;
    }

    try {
        int codigo = Integer.parseInt(txtCodigo.getText().trim());

        ClienteItem cliente =
            (ClienteItem) cmbCliente.getSelectedItem();

        int clienteCodigo = cliente.getCodigo();

        java.sql.Date data =
            new java.sql.Date(dateData.getDate().getTime());
        
java.time.LocalDate dataSelecionada =
    data.toLocalDate();

if (dataSelecionada.isBefore(java.time.LocalDate.now())
        && !cmbStatus.getSelectedItem().toString().equals("Cancelado")) {

    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Não é possível alterar um agendamento para uma data passada!"
    );
    return;
}


        java.util.Date horaSelecionada =
            (java.util.Date) spnHorario.getValue();

        java.sql.Time horario =
            new java.sql.Time(horaSelecionada.getTime());

        String profissional =
            cmbProfissional.getSelectedItem().toString();

        String status =
            cmbStatus.getSelectedItem().toString();

        String observacoes =
            txtObservacoes.getText().trim();

        dao.AgendamentosDao agendamentosDao =
            new dao.AgendamentosDao();
        
if (!status.equals("Cancelado") &&
        agendamentosDao.horarioOcupado(
            data,
            horario,
            profissional,
            codigoServicoSelecionado,
            codigo)) {

    javax.swing.JOptionPane.showMessageDialog(
        this,
        "Este profissional já possui um agendamento neste horário!"
    );
    return;
}

        
modelo.Agendamento agendamento = new modelo.Agendamento();

agendamento.setCodigo(codigo);
agendamento.setClienteCodigo(clienteCodigo);
agendamento.setServicoCodigo(codigoServicoSelecionado);
agendamento.setDataAgendamento(data);
agendamento.setHorario(horario);
agendamento.setProfissional(profissional);
agendamento.setStatus(status);
agendamento.setObservacoes(observacoes);

agendamentosDao.alterar(agendamento);

        javax.swing.JOptionPane.showMessageDialog(
            this, "Agendamento alterado com sucesso!"
        );

        atualizaTabela();
        limparCampos();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(
            this, "Erro ao alterar agendamento: " + e.getMessage()
        );
    }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        telaServicos tela = new telaServicos();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnServicosActionPerformed

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
            java.util.logging.Logger.getLogger(telaAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAgendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAgendamentos().setVisible(true);
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
    private javax.swing.JComboBox<Object> cmbCliente;
    private javax.swing.JComboBox<String> cmbProfissional;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbTipoServico;
    private com.toedter.calendar.JDateChooser dateData;
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
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDecricaoServico;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDosificador;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblImagemLateral;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblPastito;
    private javax.swing.JLabel lblPeine;
    private javax.swing.JLabel lblPinza;
    private javax.swing.JLabel lblPlanchita;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProfissional;
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
    private javax.swing.JScrollPane scrollObservacoes;
    private javax.swing.JSpinner spnHorario;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDescricao;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
