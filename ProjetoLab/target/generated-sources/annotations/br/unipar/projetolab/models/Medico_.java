package br.unipar.projetolab.models;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-22T02:21:50", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile SingularAttribute<Medico, String> observacoes;
    public static volatile SingularAttribute<Medico, String> tipo;
    public static volatile SingularAttribute<Medico, Boolean> ativo;
    public static volatile SingularAttribute<Medico, String> especialidade;
    public static volatile SingularAttribute<Medico, String> endereco;
    public static volatile SingularAttribute<Medico, String> cpf;
    public static volatile SingularAttribute<Medico, String> celular;
    public static volatile SingularAttribute<Medico, String> nome;
    public static volatile SingularAttribute<Medico, String> conselhoCrm;
    public static volatile SingularAttribute<Medico, Long> id;
    public static volatile SingularAttribute<Medico, LocalDate> dataNascimento;
    public static volatile SingularAttribute<Medico, String> email;

}