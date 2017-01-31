package com.andreiolar.designpatterns.additional.dto;

/**
 * @author Andrei Olar
 **/
public class DomainService {

	public DomainObjectDTO getData() {
		// Assume backend service
		DomainObject domainObject = getObject();

		DomainObjectDTO domainObjectDTO = new DomainObjectDTO();
		domainObjectDTO.setaProperty(domainObject.getaProperty());

		return domainObjectDTO;
	}

	private DomainObject getObject() {
		return new DomainObject();
	}
}
