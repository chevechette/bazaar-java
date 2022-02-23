package rpgviz;

import java.util.MissingResourceException;

public class InsufficientManaException extends MissingResourceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7686703360424036631L;

	public InsufficientManaException(String s, String className, String key) {
		super(s, className, key);
		// TODO Auto-generated constructor stub
	}
}
