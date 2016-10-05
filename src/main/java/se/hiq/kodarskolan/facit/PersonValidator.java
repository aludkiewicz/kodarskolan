package se.hiq.kodarskolan.facit;


import se.hiq.kodarskolan.Person;

public class PersonValidator {
    
    public void validatePerson(Person person) {
        validatePersonNummer(person.getId());
        validateName(person.getFirstName());
        validateName(person.getLastName());
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid name");
        }
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                throw new IllegalArgumentException("Invalid name");
            }
        }
    }

    private void validatePersonNummer(String id) {
        if (id == null || id.length() != 10) {
            throw new RuntimeException("Invalid personal ID");
        }
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                throw new RuntimeException("Invalid personal ID");
            }
        }
    }
}
