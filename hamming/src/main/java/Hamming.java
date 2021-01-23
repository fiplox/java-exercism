public class Hamming {
	String firstStrand;
	String secondStrand;
	int distance = 0;

	public Hamming(String leftStrand, String rightStrand) {
		if (leftStrand.length() != rightStrand.length()) {
			if (leftStrand.isEmpty())
				throw new IllegalArgumentException("left strand must not be empty.");
			if (rightStrand.isEmpty())
				throw new IllegalArgumentException("right strand must not be empty.");
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}

		firstStrand = leftStrand;
		secondStrand = rightStrand;
		for (int i = 0; i < firstStrand.length(); i++) {
			if (firstStrand.charAt(i) != secondStrand.charAt(i)) distance++;
		}
	}

	public int getHammingDistance() throws IllegalArgumentException {
		return distance;
	}
}

