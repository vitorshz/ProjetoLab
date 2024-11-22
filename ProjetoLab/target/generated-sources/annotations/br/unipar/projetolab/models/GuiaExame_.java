package br.unipar.projetolab.models;

import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-22T17:07:42", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(GuiaExame.class)
public class GuiaExame_ { 

    public static volatile SingularAttribute<GuiaExame, Double> preco;
    public static volatile SingularAttribute<GuiaExame, Exame> exame;
    public static volatile SingularAttribute<GuiaExame, Guia> guia;
    public static volatile SingularAttribute<GuiaExame, Long> id;
    public static volatile SingularAttribute<GuiaExame, String> status;

}