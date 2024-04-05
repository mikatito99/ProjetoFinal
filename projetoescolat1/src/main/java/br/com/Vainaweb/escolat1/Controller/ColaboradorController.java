package br.com.Vainaweb.escolat1.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.Vainaweb.escolat1.model.Colaborador;
import br.com.Vainaweb.escolat1.repository.ColaboradorRepository;


@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    private final ColaboradorRepository colaboradorRepository;

    @Autowired
    public ColaboradorController(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    @GetMapping("/listar/{id}")
    @CrossOrigin(origins = "http://seu-site.com", allowCredentials = "true")
    public Colaborador listarUmColaborador(@PathVariable Long id) {
        return colaboradorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
    }
    
    @PostMapping("/cadastrar")
    @CrossOrigin(origins = "http://seu-site.com", allowCredentials = "true")
    public Colaborador cadastrarColaborador(@RequestBody Colaborador colaborador) {
        try {
            return colaboradorRepository.save(colaborador);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao cadastrar colaborador");
        }
    }
}