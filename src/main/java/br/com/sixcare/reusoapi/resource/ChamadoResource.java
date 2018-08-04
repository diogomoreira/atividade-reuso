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

import br.com.sixcare.reusoapi.model.Chamado;
import br.com.sixcare.reusoapi.service.ChamadoService;

@RestController
@RequestMapping("/chamados")
public class ChamadoResource {

	@Autowired
	private ChamadoService chamadoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Chamado>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(chamadoService.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Chamado> salvar(@Valid @RequestBody Chamado chamado, HttpServletResponse response) {
		chamado = chamadoService.salvar(chamado);
		return ResponseEntity.status(HttpStatus.CREATED).body(chamado);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Chamado> buscar(@PathVariable("id") Long codChamado) {
		Chamado chamado = chamadoService.buscar(codChamado).get();
		return ResponseEntity.status(HttpStatus.OK).body(chamado);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long codChamado) {
		chamadoService.deletar(codChamado);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Chamado> atualizar(@Valid @RequestBody Chamado chamado, @PathVariable("id") Long codChamado,
			HttpServletResponse response) {
		chamado.setCodigo(codChamado);
		chamadoService.atualizar(chamado);
		return ResponseEntity.status(HttpStatus.OK).body(chamado);
	}

}
