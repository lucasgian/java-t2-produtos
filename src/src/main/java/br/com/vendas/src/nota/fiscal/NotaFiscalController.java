package br.com.vendas.src.nota.fiscal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notas-fiscais")
public class NotaFiscalController {
	
	@Autowired
	private NotaFiscalRepository repository;
	
	@GetMapping
	public Page<NotaFiscal> listar(
			@RequestParam(defaultValue = "0") int pagina,
			@RequestParam(defaultValue = "5") int tamanho
	) {
		PageRequest paginaAtual = PageRequest.of(pagina, tamanho);
		return repository.findAll(paginaAtual);
	}

}
