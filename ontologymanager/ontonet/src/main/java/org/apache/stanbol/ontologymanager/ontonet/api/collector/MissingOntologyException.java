/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.stanbol.ontologymanager.ontonet.api.collector;

import org.semanticweb.owlapi.model.IRI;

/**
 * Thrown whenever an attempt to modify an ontology within an ontology space that does not contain it is
 * detected.
 * 
 * @author alexdma
 * 
 */
public class MissingOntologyException extends OntologyCollectorModificationException {

    public MissingOntologyException(OntologyCollector collector, IRI ontologyId) {
        super(collector);
        this.ontologyId = ontologyId;
    }

    /**
     * Returns the unique identifier of the ontology whose removal was denied.
     * 
     * @return the ID of the ontology that was not removed.
     */
    public IRI getOntologyId() {
        return ontologyId;
    }

    protected IRI ontologyId;

    /**
	 * 
	 */
    private static final long serialVersionUID = -3449667155191079302L;

}
