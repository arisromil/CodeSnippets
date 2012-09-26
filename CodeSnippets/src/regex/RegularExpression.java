package regex;

public class RegularExpression {

	// All ECCNs will have 5 characters, for example, 1A001, 4B994, or 8D001
	// http://www.bis.doc.gov/licensing/do_i_needaneccn.html
	public static final String ECCN_PATTERN_STR = "^[0-9]{1}[a-zA-Z]{1}[0-9]{3}$";
}
