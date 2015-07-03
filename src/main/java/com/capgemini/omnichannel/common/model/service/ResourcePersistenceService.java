package com.capgemini.omnichannel.common.model.service;

import com.capgemini.omnichannel.common.integration.rest.BaseResourceRestController;

/**
 * <p>Interface used by {@link BaseResourceRestController} to retrieve/store resources.
 * @author cverdesm
 *
 * @param <Resource>
 * @param <String>
 */
public interface ResourcePersistenceService<Resource> {

	Resource getResourceById(String id);

	<S extends Resource> S updateResource(String id, S value);

	<S extends Resource> S insertResource(String id, S value);

}