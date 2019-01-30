package fr.panneauaffichage.dal;

/**
 * @author Suzanne vol� � K�vin Le Dev�hat
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
