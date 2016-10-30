package com.smdev.exc;

/**
 * Exception thrown while reading a source file
 * 
 * @author Ireth
 */
public class ReadFileException extends ApplicationException {

	/** */
	private static final long serialVersionUID = 2374605431666532027L;

	/**
	 * @param throwable
	 */
	public ReadFileException(Throwable throwable) {
		super(throwable);
	}

}
