package com.javasession.ems.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DepartmentModel {
	private long id;
	private String name;
	private String description;
	private long totalNumberOfMembers;

}
