package br.com.sixcare.reusoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sixcare.reusoapi.model.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Long>{

}
