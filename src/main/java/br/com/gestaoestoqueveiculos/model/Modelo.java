package br.com.gestaoestoqueveiculos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "modelo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;
}
