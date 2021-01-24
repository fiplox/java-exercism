import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

	public boolean isPangram(String input) {
		Set<Character> letter_set = new HashSet<>();
		for (char c : input.toCharArray()) {
			c = Character.toLowerCase(c);
			if (Character.isLowerCase(c))
				letter_set.add(c);
		}
		return letter_set.size() == 26;
	}

}
