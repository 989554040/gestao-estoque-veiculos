package br.com.gestaoestoqueveiculos;

import br.com.gestaoestoqueveiculos.model.Marca;
import br.com.gestaoestoqueveiculos.model.Modelo;
import br.com.gestaoestoqueveiculos.model.Veiculo;
import br.com.gestaoestoqueveiculos.service.MarcaService;
import br.com.gestaoestoqueveiculos.service.ModeloService;
import br.com.gestaoestoqueveiculos.service.VeiculoService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    private final MarcaService marcaService;
    private final ModeloService modeloService;
    private final VeiculoService veiculoService;

    public App(
            MarcaService marcaService,
            ModeloService modeloService,
            VeiculoService veiculoService
    ) {
        this.marcaService = marcaService;
        this.modeloService = modeloService;
        this.veiculoService = veiculoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {


        // INSERIR MARCAS

        Marca toyota = marcaService.salvar(new Marca(null, "Toyota"));
        Marca honda = marcaService.salvar(new Marca(null, "Honda"));


        // INSERIR MODELOS

        Modelo corolla = modeloService.salvar(
                new Modelo(null, "Corolla", toyota)
        );

        Modelo civic = modeloService.salvar(
                new Modelo(null, "Civic", honda)
        );


        // INSERIR VEICULO

        veiculoService.salvar(new Veiculo(
                null,
                corolla,
                2020,
                "ABC-1234",
                "Preto",
                100000.0,
                0,                     // quilometragem
                Veiculo.Status.DISPONIVEL
        ));

        System.out.println("Dados inseridos com sucesso!");
    }
}
