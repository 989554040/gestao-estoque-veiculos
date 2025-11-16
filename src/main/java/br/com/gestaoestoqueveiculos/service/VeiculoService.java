package br.com.gestaoestoqueveiculos.service;

import br.com.gestaoestoqueveiculos.model.Veiculo;
import br.com.gestaoestoqueveiculos.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository) { this.repository = repository; }

    public Veiculo salvar(Veiculo veiculo) { return repository.save(veiculo); }
    public List<Veiculo> listar() { return repository.findAll(); }
    public Veiculo buscarPorId(Long id) { return repository.findById(id).orElse(null); }
    public void deletar(Long id) { repository.deleteById(id); }

    // filtros úteis
    public List<Veiculo> porMarca(String nomeMarca) { return repository.findByModeloMarcaNome(nomeMarca); }
    public List<Veiculo> porModelo(String nomeModelo) { return repository.findByModeloNome(nomeModelo); }
    public List<Veiculo> porStatus(Veiculo.Status status) { return repository.findByStatus(status); }
    public List<Veiculo> porPreco(Double min, Double max) { return repository.findByValorBetween(min, max); }
    public List<Veiculo> porAno(Integer ano) { return repository.findByAno(ano); }
}
