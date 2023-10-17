package br.com.etechoracio.hasassist.controller;

import br.com.etechoracio.hasassist.entity.Equipamento;
import br.com.etechoracio.hasassist.repository.EquipamentoRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")

public class EquipamentoController {
    @Autowired
    private EquipamentoRepository repository;

    @GetMapping
    public List<Equipamento> listarTodos(){
        return repository.findAll();
    }
    @PostMapping
    public Equipamento inserir(@RequestBody Equipamento body){
        return repository.save(body);
    }

    @GetMapping
    public List<Equipamento> listar(@RequestBody Equipamento id){
        return repository.findById(id);
    }
}
