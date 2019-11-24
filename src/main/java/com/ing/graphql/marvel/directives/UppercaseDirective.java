package com.ing.graphql.marvel.directives;

import graphql.schema.*;
import graphql.schema.idl.SchemaDirectiveWiring;
import graphql.schema.idl.SchemaDirectiveWiringEnvironment;

public class UppercaseDirective implements SchemaDirectiveWiring {

    @Override
    public GraphQLFieldDefinition onField(SchemaDirectiveWiringEnvironment<GraphQLFieldDefinition> environment) {
        GraphQLFieldDefinition field = environment.getElement();
        GraphQLFieldsContainer parentType = environment.getFieldsContainer();

        DataFetcher originalFetcher = environment.getCodeRegistry().getDataFetcher(parentType, field);
        DataFetcher dataFetcher = DataFetcherFactories.wrapDataFetcher(originalFetcher, ((dataFetchingEnvironment, value) -> {
            if (value == null) {
                return null;
            }
            return ((String) value).toUpperCase();
        }));

        environment.getCodeRegistry().dataFetcher(parentType, field, dataFetcher);
        return field;
    }

}
