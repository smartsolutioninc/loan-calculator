package ca.zdata.devtest.exception;

public class ValidationException extends Exception{
	
	String code;
	String message;
	
	public ValidationException() {
		super();
	}
	
	public ValidationException(Throwable exThrowable) {
		super(exThrowable);
	}
	
	public ValidationException(String code, String message) {
		super();
		
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
