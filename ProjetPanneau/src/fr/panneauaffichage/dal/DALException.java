package fr.panneauaffichage.dal;

/**
 * @author Suzanne volé à Kévin Le Devéhat
 */
public class DALException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DALException() {
        super();
    }

    public DALException(String message) {
        super(message);
    }

    public DALException(String message, Throwable exception) {
        super(message, exception);
    }

    @Override
    public String getMessage() {
        return "DAL - " + super.getMessage() ;
    }
}
