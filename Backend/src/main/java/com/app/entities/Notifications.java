package com.app.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notifications extends BaseEntity{

	
	private String userName;
    private String message;
    private Boolean isRead = false;
	
}
