package music.kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class TransposeTest {

	private Transposer transposer;

	@Before
	public void setUpTransposer() {
		transposer = new Transposer();
	}

	@Test
	public void testTransposeSingleNoteUp() {
		assertThat(transposer.transpose(Note.A, 2), equalTo(Note.B));
	}

	@Test
	public void testTransposeSingleNoteDown() {
		assertThat(transposer.transpose(Note.A, -2), equalTo(Note.G));
	}

	@Test
	public void testTransposeMoreThanOneOctaveUp() {
		assertThat(transposer.transpose(Note.A, 14), equalTo(Note.B));
	}

	@Test
	public void testTransposeMoreThanOneOctaveDown() {
		assertThat(transposer.transpose(Note.A, -26), equalTo(Note.G));
	}

	@Test
	public void testTransposeChord() {
		assertThat(transposer.transpose(3, Note.A, Note.B), contains(Note.C, Note.D));
	}
}
