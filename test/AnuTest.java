import org.junit.Test;
import static org.junit.Assert.*;

public class AnuTest {

	@Test
	public void byteCount_gives_the_number_of_bytes_in_the_content_given(){
		String testSample = "Hooooo... &^*%$#@!! It's all bad words)";
		Anu sample = new Anu(testSample);
		assertEquals(sample.byteCount(),39);		
	}

	@Test
	public void byteCount_gives_zero_for_empty_content_given(){
		String testSample = "";
		Anu sample = new Anu(testSample);
		assertEquals(sample.byteCount(),0);		
	}

	@Test
	public void byteCount_takes_end_of_line_slash_n_as_a_single_byte(){
		String testSample = "\n";
		Anu sample = new Anu(testSample);
		assertEquals(sample.byteCount(),1);		
	}
}