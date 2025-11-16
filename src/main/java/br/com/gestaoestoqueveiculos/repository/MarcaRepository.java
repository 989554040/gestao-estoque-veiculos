package br.com.gestaoestoqueveiculos.repository;

import br.com.gestaoestoqueveiculos.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
