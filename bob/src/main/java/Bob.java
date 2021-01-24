import java.util.Locale;

public class Bob {
	private boolean hasLetter(String s) {
		for (char c: s.toCharArray()) {
			if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z'))
				return true;
		}
		return false;
	}

	public String hey(String s) {
		s = s.trim();
		if (s.isEmpty())
			return "Fine. Be that way!";

		if (s.charAt(s.length()-1) == '?') {
			if (s.equals(s.toUpperCase())) {
				if (!hasLetter(s))
					return "Sure.";
				return "Calm down, I know what I'm doing!";
			}
			return "Sure.";
		}

		if (s.equals(s.toUpperCase())) {
			if (!hasLetter(s))
				return "Whatever.";
			return "Whoa, chill out!";
		}
		return "Whatever.";
	}
}