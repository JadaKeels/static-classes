package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
    }

    public static String format(String firstName,
                                String lastName) {

        return lastName + ", " + firstName;
    }

    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) {

        StringBuilder formattedName = new StringBuilder();

        formattedName.append(lastName).append(", ");

        if (prefix != null && !prefix.isBlank()) {
            formattedName.append(prefix).append(" ");
        }

        formattedName.append(firstName);

        if (middleName != null && !middleName.isBlank()) {
            formattedName.append(" ").append(middleName);
        }

        if (suffix != null && !suffix.isBlank()) {
            formattedName.append(", ").append(suffix);
        }

        return formattedName.toString();
    }

    public static String format(String fullName) {

        String prefix = "";
        String firstName;
        String middleName = "";
        String lastName;
        String suffix = "";

        if (fullName.contains(",")) {
            String[] commaParts = fullName.split(",");
            fullName = commaParts[0].trim();
            suffix = commaParts[1].trim();
        }

        String[] parts = fullName.split(" ");

        if (parts[0].endsWith(".")) {

            prefix = parts[0];
            firstName = parts[1];

            if (parts.length == 4) {
                middleName = parts[2];
                lastName = parts[3];
            } else {
                lastName = parts[2];
            }

        } else {

            firstName = parts[0];

            if (parts.length == 3) {
                middleName = parts[1];
                lastName = parts[2];
            } else {
                lastName = parts[1];
            }
        }

        return format(
                prefix,
                firstName,
                middleName,
                lastName,
                suffix);
    }
}