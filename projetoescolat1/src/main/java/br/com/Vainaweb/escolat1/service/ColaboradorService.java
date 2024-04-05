package br.com.Vainaweb.escolat1.service;

import java.util.Optional;
import java.util.concurrent.CompletionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Vainaweb.escolat1.model.Colaborador;
import br.com.Vainaweb.escolat1.repository.ColaboradorRepository;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    public Colaborador criarColaborador(Colaborador colaborador) {
        return colaboradorRepository.save(colaborador);
    }

    public Iterable<Colaborador> buscarTodosColaboradores() {
        return colaboradorRepository.findAll();
    }
    
    @SuppressWarnings({ "rawtypes", "unused" })
	@Autowired
    private CompletionService tokenValidationService;

    public Optional<Colaborador> buscarColaboradorPorId(Long id) {
        return colaboradorRepository.findById(id);
    }
    
    @GetMapping 

    public Colaborador atualizarColaborador(Long id, Colaborador colaboradorAtualizado) throws Exception {
        Optional<Colaborador> optionalColaborador = colaboradorRepository.findById(id);
        if (optionalColaborador.isPresent()) {
            Colaborador colaborador = optionalColaborador.get();
            colaborador.setNome(colaboradorAtualizado.getNome());
            colaborador.setEmail(colaboradorAtualizado.getEmail());
            return colaboradorRepository.save(colaborador);
        } else {
            throw new Exception("Colaborador não encontrado com o ID: " + id);
        }
    }

    public void excluirColaborador(Long id) throws Exception {
        if (colaboradorRepository.existsById(id)) {
            colaboradorRepository.deleteById(id);
        } else {
            throw new Exception("Colaborador não encontrado com o ID: " + id);
        }
    }
}