package br.com.gestaoestoqueveiculos.Controller;

import br.com.gestaoestoqueveiculos.model.Marca;
import br.com.gestaoestoqueveiculos.service.MarcaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    private final MarcaService service;

    public MarcaController(MarcaService service) {
        this.service = service;
    }

    @PostMapping
    public Marca salvar(@RequestBody Marca marca) {
        return service.salvar(marca);
    }

    @GetMapping
    public List<Marca> listar() {
        return service.listar();
    }
}
