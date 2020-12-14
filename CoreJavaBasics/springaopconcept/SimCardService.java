package com.thirdware.springaopconcept;

import org.springframework.stereotype.Component;

@Component
public class SimCardService {

	private PostPaid postpaid;

	public SimCardService( PostPaid postpaid) {
		super();
		this.postpaid = postpaid;
	}


	public PostPaid getPostpaid() {
		return postpaid;
	}

	public void setPostpaid(PostPaid postpaid) {
		this.postpaid = postpaid;
	}

	@Override
	public String toString() {
		return "SimCardService ["+"postpaid=" + postpaid + "]";
	}

}
