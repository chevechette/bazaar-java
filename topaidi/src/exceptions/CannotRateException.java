package exceptions;

public class CannotRateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8322205081613535927L;

	public CannotRateException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CannotRateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CannotRateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CannotRateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CannotRateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
