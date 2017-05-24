package org.miglecz;

/**
 * Data transfer object representing records selected from a specific database table
 */
public class SomethingDto {
    private final String value;

    public SomethingDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
