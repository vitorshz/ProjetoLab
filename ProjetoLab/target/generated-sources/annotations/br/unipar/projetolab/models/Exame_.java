package br.unipar.projetolab.models;

import br.unipar.projetolab.models.EstruturaExame;
import br.unipar.projetolab.models.ResultadoExame;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-22T17:07:42", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Exame.class)
public class Exame_ { 

    public static volatile SingularAttribute<Exame, Boolean> ativo;
    public static volatile ListAttribute<Exame, ResultadoExame> resultados;
    public static volatile SingularAttribute<Exame, String> abreviacao;
    public static volatile SingularAttribute<Exame, Double> precoPadrao;
    public static volatile SingularAttribute<Exame, String> nome;
    public static volatile SingularAttribute<Exame, Long> id;
    public static volatile SingularAttribute<Exame, String> metodo;
    public static volatile SingularAttribute<Exame, String> tipoMaterial;
    public static volatile ListAttribute<Exame, EstruturaExame> estruturas;
    public static volatile SingularAttribute<Exame, String> amostra;

}