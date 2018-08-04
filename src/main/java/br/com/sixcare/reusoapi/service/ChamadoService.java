package br.com.sixcare.reusoapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sixcare.reusoapi.model.Chamado;
import br.com.sixcare.reusoapi.repository.ChamadoRepository;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository chamadoRepository;

	public List<Chamado> listar() {
		return chamadoRepository.findAll();
	}

	public Optional<Chamado> buscar(Long codChamado) {
		return chamadoRepository.findById(codChamado);
	}

	public Chamado salvar(Chamado chamado) {
		chamado.setCodigo(null);
		return chamadoRepository.save(chamado);
	}

	public void deletar(Long codChamado) {
		chamadoRepository.deleteById(codChamado);
	}

	public void atualizar(Chamado chamado) {
		chamadoRepository.save(chamado);
	}

}
