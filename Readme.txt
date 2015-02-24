Transposition: "In music transposition refers to the process, or operation, of moving a collection of notes (pitches or pitch classes) up or down in pitch by a constant interval."

The aim of this kata is to create a simple program that can transpose a song up or down by any amount of semitones.

Test 1:
	The program should be able to create a Note object (A, A#, B, C, C#, D, D#, E, F, F#, G, G#)
	
Test 2:
	The program should be able to transpose a single Note upwards.
	e.g. 'A' should transpose up 2 semitones to 'B'
	
Test 3:
	The program should be able to transpose a single Note downwards.
	e.g. 'A' should transpose down 2 semitones to 'G'
	
Test 4:
	The program should be able to create a Chord object (group of notes) containing 1 or more notes.
	
Test 5:
	The program should be able to transpose a single chord upwards.
	e.g 'C,G' should transpose up 1 semitone to 'C#,G#'
	
Test 6:
	The program should be able to transpose a single chord downwards.
	e.g. 'C,G' should transpose down 1 semitone to 'B,F#'
	
Test 7:
	The program should be able to store a sequence of notes in a Song object.

Test 8:
	The program should be able to store a pause within the sequence of notes.

Test 9:
	The program should be able to transpose a Song. Note transposing a pause does nothing.
	e.g. 'A, B, pause, C' should transpose up by 2 semitones to: 'B, C#, pause, D'



