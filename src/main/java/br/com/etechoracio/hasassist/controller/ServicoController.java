package br.com.etechoracio.hasassist.controller;

import br.com.etechoracio.hasassist.entity.Equipamento;
import br.com.etechoracio.hasassist.entity.Servico;
import br.com.etechoracio.hasassist.repository.EquipamentoRepository;
import br.com.etechoracio.hasassist.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")

public class ServicoController {

    @PostMapping
    public Servico inserir(@RequestBody Servico body){
        return repository.save(body);
    }
    @Autowired
    private ServicoRepository repository;
    @GetMapping
    public List<Servico> listarTodos(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Servico buscarPorId(@PathVariable Long id) {
        var existe = repository.findById(id);
        if (existe.isEmpty()) {
            return null;
        }
        return existe.get();
    }
    @PutMapping("/{id}")
    public Servico AtualizarServico(@PathVariable Long id, @RequestBody Servico body){
        var existe = repository.findById(id);
        if(existe.isEmpty()) {
            return null;
        }
        var atualizado = repository.save(body);
        return atualizado;
    }
    @DeleteMapping("/{id}")
    public Servico DeletarPorId(@PathVariable Long id, @RequestBody Servico body){
        var deletar = repository.findById(id);
        if(deletar.isEmpty()){
            return null;
        }
        repository.deleteById(id);
        return deletar.get();
    }
}
