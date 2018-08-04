package br.com.sixcare.reusoapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sixcare.reusoapi.model.Lona;
import br.com.sixcare.reusoapi.model.Solicitacao;
import br.com.sixcare.reusoapi.model.Vistoria;
import br.com.sixcare.reusoapi.repository.LonaRepository;
import br.com.sixcare.reusoapi.repository.SolicitacaoRepository;
import br.com.sixcare.reusoapi.repository.VistoriaRepository;

@Service
public class SolicitacaoService {

	@Autowired
	private SolicitacaoRepository solicitacaoRepository;

	@Autowired
	private VistoriaRepository vistoriaRepository;

	@Autowired
	private LonaRepository lonaRepository;

	public List<Solicitacao> listar() {
		return solicitacaoRepository.findAll();
	}

	public List<Lona> listarLonas() {
		return lonaRepository.findAll();
	}

	public List<Vistoria> listarVistorias() {
		return vistoriaRepository.findAll();
	}

	public Optional<Solicitacao> buscar(Long codSolicitacao) {
		return solicitacaoRepository.findById(codSolicitacao);
	}

	public Solicitacao salvar(Solicitacao solicitacao) {
		solicitacao.setCodigo(null);
		return solicitacaoRepository.save(solicitacao);
	}

	public void deletar(Long codSolicitacao) {
		solicitacaoRepository.deleteById(codSolicitacao);
	}

	public void atualizar(Solicitacao solicitacao) {
		solicitacaoRepository.save(solicitacao);
	}
	
	public void atualizarLona(Lona lona) {
		lonaRepository.save(lona);
	}
	
	public void atualizarVistoria(Vistoria vistoria) {
		vistoriaRepository.save(vistoria);
	}
	
	public Vistoria salvarVistoria(Vistoria vistoria) {
		return vistoriaRepository.save(vistoria);
	}

	public Lona salvarLona(Lona lona) {
		return lonaRepository.save(lona);
	}

}
