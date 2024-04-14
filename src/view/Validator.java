package view;

import model.Human;

public interface Validator {
    Human validate(String[] rawData) throws Exception;
}