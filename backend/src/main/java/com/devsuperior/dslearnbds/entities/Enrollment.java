package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

@Entity
@Table(name="tb_enrollment")
public class Enrollment implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EnrollmentPK id =new EnrollmentPK();
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment;
	private boolean avable;
	private boolean onlyUpdate;
	
	public Enrollment () {
		
	}

	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean avable, boolean onlyUpdate) {
		super();
		id.setUser(user);
		id.setOffer(offer);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.avable = avable;
		this.onlyUpdate = onlyUpdate;
	}

	public User getStudent() {
		return id.getUser();
	}
	
	public void setStudent(User user) {
		id.setUser(user);
	}
	
	public Offer getOffer() {
		return id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}

	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public boolean isAvable() {
		return avable;
	}

	public void setAvable(boolean avable) {
		this.avable = avable;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
	
	
}
