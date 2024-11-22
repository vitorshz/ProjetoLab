package br.unipar.projetolab.models;

import br.unipar.projetolab.models.Convenio;
import br.unipar.projetolab.models.GuiaExame;
import br.unipar.projetolab.models.Medico;
import br.unipar.projetolab.models.Paciente;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-22T00:05:27", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Guia.class)
public class Guia_ { 

    public static volatile SingularAttribute<Guia, Paciente> paciente;
    public static volatile SingularAttribute<Guia, Double> valorDevido;
    public static volatile SingularAttribute<Guia, Medico> medico;
    public static volatile SingularAttribute<Guia, Double> valorTotal;
    public static volatile SingularAttribute<Guia, Convenio> convenio;
    public static volatile SingularAttribute<Guia, LocalDateTime> dataConclusao;
    public static volatile SingularAttribute<Guia, Double> valorPago;
    public static volatile SingularAttribute<Guia, Boolean> particular;
    public static volatile SingularAttribute<Guia, Long> id;
    public static volatile SingularAttribute<Guia, LocalDateTime> dataCadastro;
    public static volatile ListAttribute<Guia, GuiaExame> exames;
    public static volatile SingularAttribute<Guia, String> cartaoSUS;

}