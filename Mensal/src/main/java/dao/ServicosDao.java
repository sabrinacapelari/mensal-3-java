
package dao;
import modelo.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;

public class ServicosDao {

    public void inserir(String descricao, String categoria,
                    String tipoServico, BigDecimal valor,
                    int duracao, String status) {

        String sql = "INSERT INTO servicos "
            + "(descricao, categoria, tipo_servico, valor, duracao, status) "
            + "VALUES (?, ?, ?, ?, ?, ?)";

        ConexaoBanco banco = new ConexaoBanco();

        try {
            banco.conectar();

            try (Connection conexao = banco.getConnection();
                 PreparedStatement stmt = conexao.prepareStatement(sql)) {

                stmt.setString(1, descricao);
                stmt.setString(2, categoria);
                stmt.setString(3, tipoServico);
                stmt.setBigDecimal(4, valor);
                stmt.setInt(5, duracao);
                stmt.setString(6, status);

                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(
                "Erro ao cadastrar serviço: " + e.getMessage(), e
            );
        }
    }
    
public void inserir(Servico servico) {

    inserir(
        servico.getDescricao(),
        servico.getCategoria(),
        servico.getTipoServico(),
        servico.getValor(),
        servico.getDuracao(),
        servico.getStatus()
    );

}

    public void alterar(int codigo, String descricao, String categoria,
                    String tipoServico, java.math.BigDecimal valor,
                    int duracao, String status) {

    String sql = "UPDATE servicos SET "
           + "descricao = ?, categoria = ?, tipo_servico = ?, "
           + "valor = ?, duracao = ?, status = ? "
           + "WHERE codigo = ?";

    ConexaoBanco banco = new ConexaoBanco();

    try {
        banco.conectar();

        try (Connection conexao = banco.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, descricao);
            stmt.setString(2, categoria);
            stmt.setString(3, tipoServico);
            stmt.setBigDecimal(4, valor);
            stmt.setInt(5, duracao);
            stmt.setString(6, status);
            stmt.setInt(7, codigo);

            stmt.executeUpdate();
        }

    } catch (SQLException e) {
        throw new RuntimeException(
            "Erro ao alterar serviço: " + e.getMessage(), e
        );
    }
}
    
public void alterar(Servico servico) {

    alterar(
        servico.getCodigo(),
        servico.getDescricao(),
        servico.getCategoria(),
        servico.getTipoServico(),
        servico.getValor(),
        servico.getDuracao(),
        servico.getStatus()
    );

}

}