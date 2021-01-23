class RaindropConverter {

    String convert(int n) {
		if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0) {
			return String.valueOf(n);
		}
		String res = "";
        if (n % 3 == 0)
            res = res.concat("Pling");
        if (n % 5 == 0)
            res = res.concat("Plang");
        if (n % 7 == 0)
            res = res.concat("Plong");
        return res;
    }

}
