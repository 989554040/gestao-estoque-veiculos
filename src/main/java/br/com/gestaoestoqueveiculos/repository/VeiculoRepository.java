package br.com.gestaoestoqueveiculos.repository;

import br.com.gestaoestoqueveiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByModeloNome(String nomeModelo);
    List<Veiculo> findByModeloMarcaNome(String nomeMarca);
    List<Veiculo> findByStatus(Veiculo.Status status);
    List<Veiculo> findByValorBetween(Double min, Double max);
    List<Veiculo> findByAno(Integer ano);
}
