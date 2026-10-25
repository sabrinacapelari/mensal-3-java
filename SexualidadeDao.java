
package dao;
import modelo.Sexualidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SexualidadeDao {

    public void inserir(String descricao, String sigla, String status) {

        ConexaoBanco banco = new ConexaoBanco();

        String sql = "INSERT INTO sexualidade "
                   + "(descricao, sigla, status) "
                   + "VALUES (?, ?, ?)";

        try {
            banco.conectar();

            Connection conexao = banco.getConnection();

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

                stmt.setString(1, descricao);
                stmt.setString(2, sigla);
                stmt.setString(3, status);

                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir: " + e.getMessage(), e);
        } finally {
            try {
                if (banco.getConnection() != null) {
                    banco.getConnection().close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }        
    public void inserir(Sexualidade sexualidade) {

    inserir(
        sexualidade.getDescricao(),
        sexualidade.getSigla(),
        sexualidade.getStatus()
    );


    }

public java.sql.ResultSet consultar() throws java.sql.SQLException {

    ConexaoBanco banco = new ConexaoBanco();
    banco.conectar();

    java.sql.Connection conexao = banco.getConnection();

    java.sql.Statement stmt = conexao.createStatement();

    return stmt.executeQuery(
        "SELECT codigo, descricao, sigla, status FROM sexualidade ORDER BY codigo"
    );
}

public void alterar(Sexualidade sexualidade) {

    alterar(
        sexualidade.getCodigo(),
        sexualidade.getDescricao(),
        sexualidade.getSigla(),
        sexualidade.getStatus()
    );

}


public void alterar(int codigo, String descricao, String sigla, String status) {

    ConexaoBanco banco = new ConexaoBanco();

    String sql = "UPDATE sexualidade "
               + "SET descricao = ?, sigla = ?, status = ? "
               + "WHERE codigo = ?";

    try {
        banco.conectar();

        try (java.sql.Connection conexao = banco.getConnection();
             java.sql.PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, descricao);
            stmt.setString(2, sigla);
            stmt.setString(3, status);
            stmt.setInt(4, codigo);

            stmt.executeUpdate();
        }

    } catch (java.sql.SQLException e) {
        throw new RuntimeException("Erro ao alterar: " + e.getMessage(), e);
    }
}

}

