package exceptions;

public class AlreadyInDataBaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -895962947166099703L;

	public AlreadyInDataBaseException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlreadyInDataBaseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AlreadyInDataBaseException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AlreadyInDataBaseException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AlreadyInDataBaseException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
