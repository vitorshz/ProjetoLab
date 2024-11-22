package br.unipar.projetolab.models;

import br.unipar.projetolab.models.EstruturaExame;
import br.unipar.projetolab.models.ResultadoExame;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-22T17:07:42", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(CampoResultadoExame.class)
public class CampoResultadoExame_ { 

    public static volatile SingularAttribute<CampoResultadoExame, ResultadoExame> resultadoExame;
    public static volatile SingularAttribute<CampoResultadoExame, String> valor;
    public static volatile SingularAttribute<CampoResultadoExame, Long> id;
    public static volatile SingularAttribute<CampoResultadoExame, EstruturaExame> estruturaExame;

}