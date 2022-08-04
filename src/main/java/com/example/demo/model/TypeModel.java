package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PK_TYPE_MST")
public class TypeModel {
	/** タイプID */
	@Id
	@Column(name="TYPE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String typeId;
	
	/** タイプ名 */
	@Column(name="TYPE_NAME")
    private String typeName;

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
