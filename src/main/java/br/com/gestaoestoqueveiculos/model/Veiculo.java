package br.com.gestaoestoqueveiculos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "veiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private Modelo modelo;

    @Column(nullable = false)
    private Integer ano;

    @Column(nullable = false, unique = true)
    private String placa;

    private String cor;

    private Double valor;

    private Integer quilometragem;

    @Enumerated(EnumType.STRING)
    private Status status = Status.DISPONIVEL;

    public enum Status {
        DISPONIVEL, VENDIDO, RESERVADO
    }
}
