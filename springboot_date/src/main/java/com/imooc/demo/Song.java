package com.imooc.demo;

public class Song{
	
	String title;//歌名
	String artist;//歌星
	String rating;  //等级
	String bpm; //节拍数
	
	public Song(String title, String artist, String rating, String bpm) {
		super();
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.bpm = bpm;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getBpm() {
		return bpm;
	}

	public void setBpm(String bpm) {
		this.bpm = bpm;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", rating=" + rating + ", bpm=" + bpm + "]";
	}



	
	
	
}
