/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;
import modelo.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Time;

public class AgendamentosDao {

    public void inserir(
            int clienteCodigo,
            int servicoCodigo,
            Date data,
            Time horario,
            String profissional,
            String status,
            String observacoes) {

        String sql = "INSERT INTO agendamentos "
                + "(cliente_codigo, servico_codigo, "
                + "data_agendamento, horario, profissional, "
                + "status, observacoes) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        ConexaoBanco banco = new ConexaoBanco();
        banco.conectar();

        try (Connection conexao = banco.getConnection();
             PreparedStatement stmt =
                     conexao.prepareStatement(sql)) {

            stmt.setInt(1, clienteCodigo);
            stmt.setInt(2, servicoCodigo);
            stmt.setDate(3, data);
            stmt.setTime(4, horario);
            stmt.setString(5, profissional);
            stmt.setString(6, status);
            stmt.setString(7, observacoes);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(
                "Erro ao salvar agendamento: "
                + e.getMessage(), e
            );
        }
    }

public void inserir(Agendamento agendamento) {

    inserir(
        agendamento.getClienteCodigo(),
        agendamento.getServicoCodigo(),
        agendamento.getDataAgendamento(),
        agendamento.getHorario(),
        agendamento.getProfissional(),
        agendamento.getStatus(),
        agendamento.getObservacoes()
    );

}

public void alterar(int codigo, int clienteCodigo, int servicoCodigo,
                    Date data, Time horario, String profissional,
                    String status, String observacoes) {

    String sql = "UPDATE agendamentos SET "
            + "cliente_codigo = ?, servico_codigo = ?, "
            + "data_agendamento = ?, horario = ?, "
            + "profissional = ?, status = ?, observacoes = ? "
            + "WHERE codigo = ?";

    ConexaoBanco banco = new ConexaoBanco();
    banco.conectar();

    try (Connection conexao = banco.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        stmt.setInt(1, clienteCodigo);
        stmt.setInt(2, servicoCodigo);
        stmt.setDate(3, data);
        stmt.setTime(4, horario);
        stmt.setString(5, profissional);
        stmt.setString(6, status);
        stmt.setString(7, observacoes);
        stmt.setInt(8, codigo);

        stmt.executeUpdate();

    } catch (SQLException e) {
        throw new RuntimeException(
            "Erro ao alterar agendamento: " + e.getMessage(), e
        );
    }
}

public boolean horarioOcupado(
        
        Date data, Time horario, String profissional,
        int servicoCodigo, int codigoIgnorar) {

    String sql =
        "SELECT COUNT(*) FROM agendamentos a " +
        "INNER JOIN servicos s ON a.servico_codigo = s.codigo " +
        "INNER JOIN servicos novo ON novo.codigo = ? " +
        "WHERE a.data_agendamento = ? " +
        "AND a.profissional = ? " +
        "AND a.status <> 'Cancelado' " +
        "AND a.codigo <> ? " +
        "AND TIME_TO_SEC(a.horario) < " +
        "TIME_TO_SEC(?) + novo.duracao * 60 " +
        "AND TIME_TO_SEC(a.horario) + s.duracao * 60 > " +
        "TIME_TO_SEC(?)";

    ConexaoBanco banco = new ConexaoBanco();
    banco.conectar();

    try (Connection conexao = banco.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql)) {

        stmt.setInt(1, servicoCodigo);
        stmt.setDate(2, data);
        stmt.setString(3, profissional);
        stmt.setInt(4, codigoIgnorar);
        stmt.setTime(5, horario);
        stmt.setTime(6, horario);

        try (java.sql.ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }

    } catch (SQLException e) {
        throw new RuntimeException(
            "Erro ao verificar horário: " + e.getMessage(), e
        );
    }

    return false;
}

public void alterar(Agendamento agendamento) {

    alterar(
        agendamento.getCodigo(),
        agendamento.getClienteCodigo(),
        agendamento.getServicoCodigo(),
        agendamento.getDataAgendamento(),
        agendamento.getHorario(),
        agendamento.getProfissional(),
        agendamento.getStatus(),
        agendamento.getObservacoes()
    );

}


}

