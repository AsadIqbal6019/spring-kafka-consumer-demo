package com.cloudflash.kafkadatabasedemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "kafka_event_data")
//@Getter
//@Setter
public class User {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long	 id;

	    
//	  @Lob
	  private String eventData;


	public String getEventData() {
		return eventData;
	}


	public void setEventData(String eventData) {
		this.eventData = eventData;
	}
	  
	  


}
