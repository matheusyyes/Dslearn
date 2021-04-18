package com.devsuperior.dslearnbds.DTO;

import java.io.Serializable;

import com.devsuperior.dslearnbds.entities.enums.DelverStatus;

public class DeliverRevisionDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private DelverStatus status;
	private String feedback;
	private Integer correctCount;

	public DeliverRevisionDTO() {
		
	}

	public DeliverRevisionDTO(DelverStatus status, String feedback, Integer correctCount) {
		super();
		this.status = status;
		this.feedback = feedback;
		this.correctCount = correctCount;
	}

	public DelverStatus getStatus() {
		return status;
	}

	public void setStatus(DelverStatus status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getCorrectCount() {
		return correctCount;
	}

	public void setCorrectCount(Integer correctCount) {
		this.correctCount = correctCount;
	}
	
	
	
}
