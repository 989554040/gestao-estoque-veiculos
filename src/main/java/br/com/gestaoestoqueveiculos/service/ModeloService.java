package br.com.gestaoestoqueveiculos.service;

import br.com.gestaoestoqueveiculos.model.Modelo;
import br.com.gestaoestoqueveiculos.repository.ModeloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {

    private final ModeloRepository repository;

    public ModeloService(ModeloRepository repository) { this.repository = repository; }

    public Modelo salvar(Modelo modelo) { return repository.save(modelo); }
    public List<Modelo> listar() { return repository.findAll(); }
    public Modelo buscarPorId(Long id) { return repository.findById(id).orElse(null); }
    public void deletar(Long id) { repository.deleteById(id); }
}
