package br.com.sixcare.reusoapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sixcare.reusoapi.model.Solicitacao;
import br.com.sixcare.reusoapi.service.SolicitacaoService;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoResource {

	@Autowired
	private SolicitacaoService solicitacaoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Solicitacao>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(solicitacaoService.listar());
	}

}
