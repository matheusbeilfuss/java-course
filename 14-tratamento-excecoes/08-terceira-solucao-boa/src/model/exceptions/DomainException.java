package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg); // permite que se instancie a exceção personalizada passando uma mensagem para ela
		// a mensagem vai ficar armazenada na exceção
	}
}
