package br.unipar.projetolab.models;

import br.unipar.projetolab.models.Exame;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-22T02:21:50", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(EstruturaExame.class)
public class EstruturaExame_ { 

    public static volatile SingularAttribute<EstruturaExame, Exame> exame;
    public static volatile SingularAttribute<EstruturaExame, String> tipo;
    public static volatile SingularAttribute<EstruturaExame, Boolean> obrigatorio;
    public static volatile SingularAttribute<EstruturaExame, String> maximo;
    public static volatile SingularAttribute<EstruturaExame, String> grupo;
    public static volatile SingularAttribute<EstruturaExame, String> referencias;
    public static volatile SingularAttribute<EstruturaExame, String> unidade;
    public static volatile SingularAttribute<EstruturaExame, String> calculo;
    public static volatile SingularAttribute<EstruturaExame, String> texto;
    public static volatile SingularAttribute<EstruturaExame, Integer> ordem;
    public static volatile SingularAttribute<EstruturaExame, Long> id;
    public static volatile SingularAttribute<EstruturaExame, String> variavel;
    public static volatile SingularAttribute<EstruturaExame, String> valorPadrao;

}