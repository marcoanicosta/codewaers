package testing;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
        @Test
        public void PeopleThatPlayBanjo() {
            assertEquals( "Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
            assertEquals( "Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
        }
}

