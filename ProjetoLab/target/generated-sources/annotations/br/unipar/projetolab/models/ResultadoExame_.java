package br.unipar.projetolab.models;

import br.unipar.projetolab.models.CampoResultadoExame;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-20T20:21:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(ResultadoExame.class)
public class ResultadoExame_ { 

    public static volatile ListAttribute<ResultadoExame, CampoResultadoExame> camposResultado;
    public static volatile SingularAttribute<ResultadoExame, Exame> exame;
    public static volatile SingularAttribute<ResultadoExame, Guia> guia;
    public static volatile SingularAttribute<ResultadoExame, Long> id;

}