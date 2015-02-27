Transposition: "In music transposition refers to the process, or operation, of moving a collection of notes up or down in pitch by a constant interval."

The aim of this kata is to create a simple program that can transpose a song up or down by any amount of semitones (1 key on a piano).

The following equation may be useful:
frequency (Hz) = 440 * 2 ^ (n / 12) where n = number of notes away from middle C

Step 1:
	The program should be able to create a Note object e.g. (A, A#, B, C, C#, D, D#, E, F, F#, G, G#)
	
Step 2:
	The program should be able to transpose a single Note upwards.
	e.g. 'A' should transpose up 2 semitones to 'B'
	
Step 3:
	The program should be able to transpose a single Note downwards.
	e.g. 'A' should transpose down 2 semitones to 'G'
	
Step 4:
	The note C and C + 12 semitones should not be the same
	
Step 5:
	The program should be able to create a group of notes (chord) containing 1 or more notes.
	
Step 6:
	The program should be able to transpose a group of notes upwards.
	e.g 'C,G' should transpose up 1 semitone to 'C#,G#'
	
Step 7:
	The program should be able to transpose a group of notes downwards.
	e.g. 'C,G' should transpose down 1 semitone to 'B,F#'
	
Step 8:
	The program should be able to store a sequence of note groups in a Song object.

Step 9:
	The program should be able to store a pause within the sequence of note groups.

Step 10:
	The program should be able to transpose a Song. Note transposing a pause does nothing.
	e.g. 'A, B, pause, C' should transpose up by 2 semitones to: 'B, C#, pause, D'



