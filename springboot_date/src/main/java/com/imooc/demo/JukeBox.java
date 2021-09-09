package com.imooc.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox {
	ArrayList<Song> songList;   	//歌曲列表中，应加入Song对象
	
	
	JukeBox(){
		songList = new ArrayList<>();   
	}
	public static void main(String[] args) {		
		new  JukeBox().go();
	}
	
	public void go() {
		getSongs();						//获取歌曲信息
		System.out.println(songList);	//输出所有歌曲信息
		sort(4);			//对歌曲按照歌名进行排序
		System.out.println(songList);	//输出所有歌曲信息
		
	}
	
	private void sort(int i) {
		switch(i) {
		case 1:
			Collections.sort(songList, new Comparator<Song>() {

				@Override
				public int compare(Song o1, Song o2) {
					// TODO Auto-generated method stub
					return o1.title.compareTo(o2.title);
				}
				
			});			//按照歌名进行排序
			break;
		case 2:
			Collections.sort(songList, new Comparator<Song>() {

				@Override
				public int compare(Song o1, Song o2) {
					// TODO Auto-generated method stub
					return o1.artist.compareTo(o2.artist);
				}
				
			});	
			//按照歌星进行排序
			break;
		case 3:
			Collections.sort(songList, new Comparator<Song>() {

				@Override
				public int compare(Song o1, Song o2) {
					// TODO Auto-generated method stub
					return o1.rating.compareTo(o2.rating);
				}
				
			});
			//按照等级进行排序
			break;
		case 4:
			Collections.sort(songList, new Comparator<Song>() {

				@Override
				public int compare(Song o1, Song o2) {
					// TODO Auto-generated method stub
					return o1.bpm.compareTo(o2.bpm);
				}
				
			});
			//按照节拍进行排序
			break;

		}
	}

	private  void getSongs() {
		File file = new File("SongList.txt");
		FileReader fr = null;
		BufferedReader bfr  = null;
		
		try {
			fr = new FileReader(file);
			bfr = new BufferedReader(fr);
			String line;
			while( (line = bfr.readLine()) != null) {
				String[] tokens = line.split("/");
				Song song = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);				
				songList.add(song);
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
