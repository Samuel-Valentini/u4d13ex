package samuelvalentini.exceptions;

import samuelvalentini.entities.Evento;

public class NotSavedException extends RuntimeException {
    public NotSavedException(Evento newEvento) {
        super("L'evento " + newEvento + " non è stato salvato.");
    }
}
