/*
Author:			John-Philipp Vogt
Date:			2024-02-23
Synopsis:		Code to understand collections, generics and lambdas.
Filename:		JukeBox1
*/

import java.util.*;

public class JukeBox2 {
	public static void main(String[] args) {
		new JukeBox2().go();
		}

	public void go() {
		List<SongV2> songList = MockSongs.getSongsV2();
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
		public static List<SongV2> getSongsV2() {
			List<SongV2> songs = new ArrayList<>();
			songs.add(new SongV2("somersault", "zero", 147));
			songs.add(new SongV2("cassidy", "grateful dead", 158));
			songs.add(new SongV2("$10", "hitchhiker", 140));
			songs.add(new SongV2("havanna", "cabello", 105));
			songs.add(new SongV2("Cassidy", "grateful dead", 158));
			songs.add(new SongV2("50 ways", "simon", 102));
			return songs;
		}
	}
}
