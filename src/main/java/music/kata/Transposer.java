package music.kata;

import java.util.ArrayList;
import java.util.List;

public class Transposer {

	public Note transpose(Note a, int i) {
		int noOfNotes = Note.values().length; 
		int newPosition = a.ordinal() + i;
		newPosition %= noOfNotes;
		if (newPosition < 0) {
			newPosition = newPosition + noOfNotes;
		}

		return Note.values()[newPosition];
	}

	public List<Note> transpose(int i, Note... notes) {
		List<Note> noteList = new ArrayList<Note>();
		for (Note note : notes) {
			noteList.add(transpose(note, i));
		}

		return noteList;
	}

}
