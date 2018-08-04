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

import br.com.sixcare.reusoapi.model.Vistoria;
import br.com.sixcare.reusoapi.service.SolicitacaoService;

@RestController
@RequestMapping("/vistorias")
public class VistoriaResource {
	
	@Autowired
	private SolicitacaoService solicitacaoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Vistoria>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(solicitacaoService.listarVistorias());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Vistoria> salvar(@Valid @RequestBody Vistoria vistoria, HttpServletResponse response) {
		vistoria = solicitacaoService.salvarVistoria(vistoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(vistoria);
	}
	

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Vistoria> atualizar(@Valid @RequestBody Vistoria vistoria, @PathVariable("id") Long codigo,
			HttpServletResponse response) {
		vistoria.setCodigo(codigo);
		solicitacaoService.atualizarVistoria(vistoria);
		return ResponseEntity.status(HttpStatus.OK).body(vistoria);
	}


}
