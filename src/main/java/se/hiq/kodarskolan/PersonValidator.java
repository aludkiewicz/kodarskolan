package se.hiq.kodarskolan;


public class PersonValidator {
    
    public void validatePerson(Person person) {
        // validate "personnummer"
        String id = person.getId();
        if (id.length() != 10) {
            throw new IllegalArgumentException("Invalid personal ID");
        }
        for (int i = 0; i < id.length(); i++) {
            if (!isDigit(id.charAt(i))) {
                throw new IllegalArgumentException("Invalid personal ID");
            }
        }
        // validate first name
        String firstName = person.getFirstName();
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid first name");
        }
        for (int i = 0; i < firstName.length(); i++) {
            if (isDigit(firstName.charAt(i))) {
                throw new IllegalArgumentException("Invalid first name");
            }
        }
        // validate last name
        String lastName = person.getLastName();
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid last name");
        }
        for (int i = 0; i < lastName.length(); i++) {
            if (isDigit(lastName.charAt(i))) {
                throw new IllegalArgumentException("Invalid last name");
            }
        }
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

}
