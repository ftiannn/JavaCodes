package ValidateString;
class UserMainCode {
    public static int validatestrings(String input){		
		String regex = "^(CTS-[0-9]{3})$";
		if (input.matches(regex)) {
				return 1;
			}
			else {
				return -1;
			}
    }
}

