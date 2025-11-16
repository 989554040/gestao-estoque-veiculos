package br.com.gestaoestoqueveiculos.Controller;

import br.com.gestaoestoqueveiculos.model.Modelo;
import br.com.gestaoestoqueveiculos.service.ModeloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/modelos")
public class ModeloController {

    private final ModeloService service;
    public ModeloController(ModeloService service) { this.service = service; }

    @GetMapping
    public List<Modelo> listar() { return service.listar(); }

    @PostMapping
    public Modelo salvar(@RequestBody Modelo modelo) { return service.salvar(modelo); }

    @GetMapping("/{id}")
    public Modelo buscar(@PathVariable Long id) { return service.buscarPorId(id); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}
