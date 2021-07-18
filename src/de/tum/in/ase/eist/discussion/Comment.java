package de.tum.in.ase.eist.discussion;

import de.tum.in.ase.eist.university.Person;

public abstract class Comment<T> {
	private Person author;

	public abstract boolean save();

	public abstract T getContent();

	public abstract void setContent(T content);

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}
}

