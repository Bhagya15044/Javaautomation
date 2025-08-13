package com.project.java_hands_on_interview_chatgpt;

import java.util.Objects;

public class Question14_overriding_Equals_hashcode {
    public static void main(String[] args) {
        Engineer e1 = new Engineer(1, "Jhon");
        Engineer e2 = new Engineer(1, "Jhon");

        // Calling equals() method to compare objects
        System.out.println("Are both objects equal? " + e1.equals(e2));

        // Calling hashCode() method
        System.out.println("HashCode of e1: " + e1.hashCode());
        System.out.println("HashCode of e2: " + e2.hashCode());
    }
}

class Engineer {
    private int id;
    private String name;

    // Parameterized constructor
    public Engineer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Overriding the equals() method to compare objects based on their data (id and name).
     */
    @Override
    public boolean equals(Object o) {
        // Check if the current object and the passed object refer to the same memory location.
        // If yes, return true.
        if (this == o) return true;

        // If the passed object is null or from a different class, return false.
        if (o == null || getClass() != o.getClass()) return false;

        // Typecast the object from Object to Engineer to access its fields.
        Engineer engineer = (Engineer) o;

        // Compare the actual content (id and name) of both Engineer objects.
        return id == engineer.id && Objects.equals(name, engineer.name);
    }

    /**
     * Overriding the hashCode() method to ensure consistent behavior with equals().
     * If two objects are "equal" according to equals(), they must return the same hashCode.
     */
    @Override
    public int hashCode() {
        // Generate hashCode based on id and name values.
        // This ensures equal objects will have the same hash code.
        return Objects.hash(id, name);
    }
}
