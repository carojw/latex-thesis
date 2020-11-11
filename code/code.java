static Exception exceptionOf(Executable exec) throws Throwable {
        try {
            exec.execute(); // Ausführung, die einen Fehler erzeugen sollte.
            return null; // Keine Exception geworfen => Null-Referenz zurückgeben
        } catch (Exception e) { // Exception abfangen.
            return e; // Geworfene Exception.
        }
    }