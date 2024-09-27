package br.unipar.projetolab.models;

import br.unipar.projetolab.enums.TipoPessoa;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-27T16:56:17", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Convenio.class)
public class Convenio_ { 

    public static volatile SingularAttribute<Convenio, String> observacoes;
    public static volatile SingularAttribute<Convenio, String> telefone;
    public static volatile SingularAttribute<Convenio, Boolean> ativo;
    public static volatile SingularAttribute<Convenio, String> fantasia;
    public static volatile SingularAttribute<Convenio, TipoPessoa> tipoPessoa;
    public static volatile SingularAttribute<Convenio, String> endereco;
    public static volatile SingularAttribute<Convenio, String> cei;
    public static volatile SingularAttribute<Convenio, String> nome;
    public static volatile SingularAttribute<Convenio, Long> id;
    public static volatile SingularAttribute<Convenio, String> cnpj;
    public static volatile SingularAttribute<Convenio, String> razaoSocial;
    public static volatile SingularAttribute<Convenio, String> cep;

}