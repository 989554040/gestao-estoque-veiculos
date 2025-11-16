package br.com.gestaoestoqueveiculos.service;

import br.com.gestaoestoqueveiculos.model.Marca;
import br.com.gestaoestoqueveiculos.repository.MarcaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

    private final MarcaRepository repository;

    public MarcaService(MarcaRepository repository) { this.repository = repository; }

    public Marca salvar(Marca marca) { return repository.save(marca); }
    public List<Marca> listar() { return repository.findAll(); }
    public Marca buscarPorId(Long id) { return repository.findById(id).orElse(null); }
    public void deletar(Long id) { repository.deleteById(id); }
}

