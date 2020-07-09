package de.github.sebyplays.commandapi.utils;

public class DoubleEntryException extends RuntimeException {
    /**
     *
     */
    public DoubleEntryException(){
        super();
    }

    public DoubleEntryException(String message){
        super(message);
    }

    public DoubleEntryException(String message, Throwable cause){
        super(message, cause);
    }

    public DoubleEntryException(Throwable cause){
        super(cause);
    }

}
