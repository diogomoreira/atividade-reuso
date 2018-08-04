package br.com.sixcare.reusoapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sixcare.reusoapi.model.Lona;
import br.com.sixcare.reusoapi.service.SolicitacaoService;

@RestController
@RequestMapping("/lonas")
public class LonaResource {
	
	@Autowired
	private SolicitacaoService solicitacaoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Lona>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(solicitacaoService.listarLonas());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Lona> salvar(@Valid @RequestBody Lona lona, HttpServletResponse response) {
		lona = solicitacaoService.salvarLona(lona);
		return ResponseEntity.status(HttpStatus.CREATED).body(lona);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Lona> atualizar(@Valid @RequestBody Lona lona, @PathVariable("id") Long codigo,
			HttpServletResponse response) {
		lona.setCodigo(codigo);
		solicitacaoService.atualizarLona(lona);
		return ResponseEntity.status(HttpStatus.OK).body(lona);
	}

}
