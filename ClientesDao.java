
package dao;
import modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientesDao {

    public void inserir(String nome, String cpf,
                    String telefone, String email,
                    Integer codigoGenero,
                    String pais, String tipoDocumento,
                    java.sql.Date dataNascimento,
                    String cep, String logradouro,
                    String bairro, String cidade,
                    String uf, String numero,
                    String complemento) {

        String sql = "INSERT INTO clientes "
            + "(nome, cpf, telefone, email, codigo_genero, "
            + "pais, tipo_documento, data_nascimento, cep, "
            + "logradouro, bairro, cidade, uf, numero, complemento) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        ConexaoBanco banco = new ConexaoBanco();

        try {
            banco.conectar();

            try (Connection conexao = banco.getConnection();
                 PreparedStatement stmt = conexao.prepareStatement(sql)) {

                stmt.setString(1, nome);
                stmt.setString(2, cpf);
                stmt.setString(3, telefone);
                stmt.setString(4, email);

                if (codigoGenero == null) {
                    stmt.setNull(5, java.sql.Types.INTEGER);
                } else {
                    stmt.setInt(5, codigoGenero);
                }
            stmt.setString(6, pais);
            stmt.setString(7, tipoDocumento);

            if (dataNascimento == null) {
            stmt.setNull(8, java.sql.Types.DATE);
            } else {
            stmt.setDate(8, dataNascimento);
            }

            stmt.setString(9, cep);
            stmt.setString(10, logradouro);
            stmt.setString(11, bairro);
            stmt.setString(12, cidade);
            stmt.setString(13, uf);
            stmt.setString(14, numero);
            stmt.setString(15, complemento);
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(
                "Erro ao cadastrar cliente: " + e.getMessage(), e
            );
        }
    }
public void inserir(Cliente cliente) {

    java.sql.Date dataNascimento = null;

    if (cliente.getDataNascimento() != null) {
        dataNascimento = java.sql.Date.valueOf(
            cliente.getDataNascimento()
        );
    }

    inserir(
        cliente.getNome(),
        cliente.getCpf(),
        cliente.getTelefone(),
        cliente.getEmail(),
        cliente.getCodigoGenero(),
        cliente.getPais(),
        cliente.getTipoDocumento(),
        dataNascimento,
        cliente.getCep(),
        cliente.getLogradouro(),
        cliente.getBairro(),
        cliente.getCidade(),
        cliente.getUf(),
        cliente.getNumero(),
        cliente.getComplemento()
    );

    }
    
public void alterar(int codigo, String nome, String cpf,
                    String telefone, String email,
                    Integer codigoGenero,
                    String pais, String tipoDocumento,
                    java.sql.Date dataNascimento,
                    String cep, String logradouro,
                    String bairro, String cidade,
                    String uf, String numero,
                    String complemento) throws Exception {

    String sql = "UPDATE clientes SET "
        + "nome = ?, cpf = ?, telefone = ?, email = ?, "
        + "codigo_genero = ?, pais = ?, tipo_documento = ?, "
        + "data_nascimento = ?, cep = ?, logradouro = ?, "
        + "bairro = ?, cidade = ?, uf = ?, numero = ?, "
        + "complemento = ? "
        + "WHERE codigo = ?";

    ConexaoBanco banco = new ConexaoBanco();
    banco.conectar();

    try (java.sql.Connection conexao = banco.getConnection();
         java.sql.PreparedStatement stmt =
             conexao.prepareStatement(sql)) {

        stmt.setString(1, nome);
        stmt.setString(2, cpf);
        stmt.setString(3, telefone);
        stmt.setString(4, email);

        if (codigoGenero == null) {
            stmt.setNull(5, java.sql.Types.INTEGER);
        } else {
            stmt.setInt(5, codigoGenero);
        }

        stmt.setString(6, pais);
        stmt.setString(7, tipoDocumento);

        if (dataNascimento == null) {
        stmt.setNull(8, java.sql.Types.DATE);
        } else {
        stmt.setDate(8, dataNascimento);
        }

        stmt.setString(9, cep);
        stmt.setString(10, logradouro);
        stmt.setString(11, bairro);
        stmt.setString(12, cidade);
        stmt.setString(13, uf);
        stmt.setString(14, numero);
        stmt.setString(15, complemento);

        stmt.setInt(16, codigo);

        stmt.executeUpdate();
    }
}

public void alterar(Cliente cliente) throws Exception {

    alterar(
        cliente.getCodigo(),
        cliente.getNome(),
        cliente.getCpf(),
        cliente.getTelefone(),
        cliente.getEmail(),
        cliente.getCodigoGenero(),
        cliente.getPais(),
        cliente.getTipoDocumento(),
        cliente.getDataNascimento() == null
            ? null
            : java.sql.Date.valueOf(cliente.getDataNascimento()),
        cliente.getCep(),
        cliente.getLogradouro(),
        cliente.getBairro(),
        cliente.getCidade(),
        cliente.getUf(),
        cliente.getNumero(),
        cliente.getComplemento()
    );

}

}
