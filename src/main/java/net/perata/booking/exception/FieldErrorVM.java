package net.perata.booking.exception;

import java.io.Serial;
import java.io.Serializable;

public class FieldErrorVM implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String objectName;

    private final String field;

    private final String message;

    public FieldErrorVM(String dto, String field, String message) {

        this.objectName = dto;
        this.field = field;
        this.message = message;
    }

}
