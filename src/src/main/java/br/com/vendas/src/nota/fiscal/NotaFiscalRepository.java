package br.com.vendas.src.nota.fiscal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, String> {
	Page<NotaFiscal> findAll(Pageable pageable);
}
