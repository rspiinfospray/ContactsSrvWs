package org.infospray.rest;

import java.util.List;

public class Reponse<T> {

	private boolean error = false;

	private String 	errorLibelle = "";

	private int 	errorCode = 0;

	private int 	nbResult = 0;

	private List<T> body;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getErrorLibelle() {
		return errorLibelle;
	}

	public void setErrorLibelle(String errorLibelle) {
		this.errorLibelle = errorLibelle;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public int getNbResult() {
		return nbResult;
	}

	public void setNbResult(int nbResult) {
		this.nbResult = nbResult;
	}

	public List<T> getBody() {
		return body;
	}

	public void setBody(List<T> body) {
		this.body = body;
	}

	
	
}
