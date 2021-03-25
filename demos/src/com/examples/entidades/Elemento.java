package com.examples.entidades;

public class Elemento<T> {
	T key;
	String text;
	
	public Elemento(T key, String text) {
		super();
		this.key = key;
		this.text = text;
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}

/*
public class Elemento {
	Object key;
	String text;
	
	public Elemento(Object key, String text) {
		super();
		this.key = key;
		this.text = text;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}

public class ElementoString {
	String key;
//...
}

public class ElementoInt {
	int key;
	String text;
	
	public ElementoInt(int key, String text) {
		super();
		this.key = key;
		this.text = text;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
public class ElementoChar {
	char key;
	String text;
	
	public ElementoChar(char key, String text) {
		super();
		this.key = key;
		this.text = text;
	}
	public char getKey() {
		return key;
	}
	public void setKey(char key) {
		this.key = key;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
*/