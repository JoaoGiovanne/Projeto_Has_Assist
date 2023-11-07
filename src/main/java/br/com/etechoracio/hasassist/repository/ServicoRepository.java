package br.com.etechoracio.hasassist.repository;
import br.com.etechoracio.hasassist.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    List<Servico> findById(Servico id);
}
