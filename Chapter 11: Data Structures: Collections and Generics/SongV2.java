/*
Author:			John-Philipp Vogt
Date:			2024-
Synopsis:		
Filename:		
*/

class SongV2 {
	private String artist;
	private String title;
	private int bpm;

	SongV2(String title, String artist, int bpm) {
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public int getBpm() {
		return bpm;
	}
	public String toString() {
		return title;
	}
}
