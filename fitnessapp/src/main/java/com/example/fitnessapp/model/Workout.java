package com.example.fitnessapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties; // Have to add this in your pom.xml

@Entity
@Table(name = "Workout")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)

public class Workout implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String description;

	private String videoLink;

	// You need an empty constructor
	public Workout() {

	}

	public Workout(String name, String description, String videoLink) {
		this.name = name;
		this.description = description;
		this.videoLink = videoLink;
	}

	// Getter Setter - Name
	public String GetName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	// Getter Setter - Description
	public String GetDescription() {
		return description;
	}

	public void SetDescription(String description) {
		this.description = description;
	}

	// Getter Setter - Video Link
	public String GetVideoLink() {
		return videoLink;
	}

	public void SetVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

}
