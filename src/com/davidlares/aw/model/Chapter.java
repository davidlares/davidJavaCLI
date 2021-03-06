package com.davidlares.aw.model;

import java.util.ArrayList;

public class Chapter extends Movie {
	
	private int id;
	private int seasonNumber;

	public Chapter(String title, String genre, String creator, int duration, short year, int seasonNumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSeasonNumber(seasonNumber);
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}
	
	public static ArrayList<Chapter> makeChaptersList(){
		ArrayList<Chapter> chapters = new ArrayList();
		for(int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Cap " + i, "genre " + i, "creator " + i, 45, (short)(2017+i),i));
		}
		return chapters;
	}
}
