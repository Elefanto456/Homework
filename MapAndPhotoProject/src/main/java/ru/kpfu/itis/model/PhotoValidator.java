package ru.kpfu.itis.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.net.MalformedURLException;
import java.net.URL;

public class PhotoValidator implements Validator {
    @Override
    public boolean supports(Class s) {
        return Photo.class.equals(s);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "path", "field.required", "Error with path!");
        Photo a = (Photo) obj;
        try {
            new URL(a.getPath());
        } catch (MalformedURLException ex) {
            e.rejectValue("path", "URL.incorrect", "Error with uri!");
        }
    }
}