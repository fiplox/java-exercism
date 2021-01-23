class IsbnVerifier {

	boolean isValid(String stringToVerify) {
		if (stringToVerify.length() != 13) {
			if (stringToVerify.length() != 10) return false;
		}
		if (stringToVerify.charAt(stringToVerify.length() - 1) < 48
				&& stringToVerify.charAt(stringToVerify.length() - 1) > 57) {
			if (stringToVerify.charAt(stringToVerify.length() - 1) != 'X') return false;
				}
		int res = 0, j = 10, i;

		for (i = 0; i < stringToVerify.length(); i++) {
			if (stringToVerify.charAt(i) == '-')
				continue;
			if (stringToVerify.charAt(i) == 'X') {
				if (i != stringToVerify.length() - 1)
					return false;
				res += 10;
				break;
			}
			res = ((stringToVerify.charAt(i) - '0') * j) + res;
			j--;
		}
		return res % 11 == 0;
	}
}

