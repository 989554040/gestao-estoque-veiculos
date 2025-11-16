package br.com.gestaoestoqueveiculos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "marca")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
}
