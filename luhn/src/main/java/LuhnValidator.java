class LuhnValidator {

    boolean isValid(String candidate) {
    	candidate = candidate.replaceAll(" ", "");

    	if (candidate.length() <= 1)
    		return false;

    	int sum = 0, digit;
    	boolean dbl = candidate.length() % 2 == 0;

    	for (char c: candidate.toCharArray()) {
    		digit = c-'0';
    		if (digit < 0 || digit > 9)
    			return false;
    		if (dbl) {
    			digit *= 2;
    			if (digit > 9)
    				sum -= 9;
		    }
    		sum += digit;
    		dbl = !dbl;
	    }
	    return (sum%10) == 0;
    }
}
