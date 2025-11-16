package br.com.gestaoestoqueveiculos.Controller;

import br.com.gestaoestoqueveiculos.model.Veiculo;
import br.com.gestaoestoqueveiculos.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    private final VeiculoService service;
    public VeiculoController(VeiculoService service) { this.service = service; }

    @GetMapping
    public List<Veiculo> listar() { return service.listar(); }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) { return service.salvar(veiculo); }

    @GetMapping("/{id}")
    public Veiculo buscar(@PathVariable Long id) { return service.buscarPorId(id); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }

    // filtros
    @GetMapping("/buscar/por-marca")
    public List<Veiculo> porMarca(@RequestParam String nomeMarca) { return service.porMarca(nomeMarca); }

    @GetMapping("/buscar/por-modelo")
    public List<Veiculo> porModelo(@RequestParam String nomeModelo) { return service.porModelo(nomeModelo); }

    @GetMapping("/buscar/por-status")
    public List<Veiculo> porStatus(@RequestParam Veiculo.Status status) { return service.porStatus(status); }

    @GetMapping("/buscar/por-preco")
    public List<Veiculo> porPreco(@RequestParam Double min, @RequestParam Double max) { return service.porPreco(min, max); }

    @GetMapping("/buscar/por-ano")
    public List<Veiculo> porAno(@RequestParam Integer ano) { return service.porAno(ano); }
}
