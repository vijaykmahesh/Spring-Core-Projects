package com.seleniumexpress.fistspringapp;

public class Film {

	private Actor actor;
	
	

	public Film(Actor actor) {
		this.actor = actor;
	}



	public void startFilm() {

		actor.act();
	}

}
