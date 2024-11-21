package br.unipar.projetolab.models;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-21T20:33:55", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> telefone;
    public static volatile SingularAttribute<Paciente, Boolean> ativo;
    public static volatile SingularAttribute<Paciente, String> endereco;
    public static volatile SingularAttribute<Paciente, String> tipoSangue;
    public static volatile SingularAttribute<Paciente, String> cpf;
    public static volatile SingularAttribute<Paciente, String> nome;
    public static volatile SingularAttribute<Paciente, String> fatorRh;
    public static volatile SingularAttribute<Paciente, Long> id;
    public static volatile SingularAttribute<Paciente, LocalDate> dataNascimento;
    public static volatile SingularAttribute<Paciente, String> sexo;

}