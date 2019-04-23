package xyz.walun.exception;

/**
 * 自定义的异常类，用于存储异常信息，提示异常信息
 */
public class MyException extends  Exception {

	private String message;


	public MyException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
