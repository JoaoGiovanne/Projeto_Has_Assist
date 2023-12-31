package br.com.etechoracio.hasassist.entity;

import br.com.etechoracio.hasassist.enums.TipoDocumentoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TBL_CLIENTE")
public class Cliente extends Pessoa {

    @Id
    @Column(name = "ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_DOCUMENTO")
    private String documento;

    @Column(name = "TX_TIPO_DOCUMENTO")
    @Enumerated(EnumType.STRING)
    private TipoDocumentoEnum tipoDocumento;

}
