package br.com.etechoracio.hasassist.repository;

import br.com.etechoracio.hasassist.entity.Equipamento;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipamentoRepository extends JpaRepository <Equipamento, Long> {


    List<Equipamento> findById(Equipamento id);
}
