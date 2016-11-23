package com.fafidev.jpaapp.util;

/**
 *
 * @author fernando
 */
public class JpaAppException extends RuntimeException {

    public JpaAppException(String message) {
        super(message);
    }

    public JpaAppException(String message, Throwable cause) {
        super(message, cause);
    }

}
