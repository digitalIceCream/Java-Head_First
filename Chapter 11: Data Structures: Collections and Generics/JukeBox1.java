/*
Author:			John-Philipp Vogt
Date:			2024-02-23
Synopsis:		Code to understand collections, generics and lambdas.
Filename:		JukeBox1
*/

import java.util.*;

public class JukeBox1 {
	public static void main(String[] args) {
		new JukeBox1().go();
		}

	public void go() {
		List<String> songList = MockSongs.getSongStrings();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}

	class MockSongs {
		public static List<String> getSongStrings() {
			List<String> songs = new ArrayList<>();
			songs.add("somersault");
			songs.add("cassidy");
			songs.add("$10");
			songs.add("havana");
			songs.add("Cassidy");
			songs.add("50 Ways");
			return songs;
		}
	}
}
