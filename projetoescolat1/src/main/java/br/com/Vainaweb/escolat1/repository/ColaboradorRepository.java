package br.com.Vainaweb.escolat1.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.Vainaweb.escolat1.model.Colaborador;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

	Optional<Colaborador> findById(Long id);

	List<Colaborador> findAll();

	void deleteById(Long id);

	boolean existsById(Long id);

	@SuppressWarnings("unchecked")
	Colaborador save(Colaborador colaborador);
    
}