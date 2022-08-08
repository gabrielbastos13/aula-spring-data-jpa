package com.aula.model;

public class Quotes {

	private String quote;

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public Quotes(String quote) {
		super();
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Quotes [quote=" + quote + "]";
	}
	

	
}
