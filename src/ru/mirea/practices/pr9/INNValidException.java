package ru.mirea.practices.pr9;

public class INNNotFoundException extends RuntimeException {
    INNNotFoundException(String msg, Throwable err) {
        super(msg, err);
    }
}
