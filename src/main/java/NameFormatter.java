package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
    }
}

public static String format(String firstName,
                            String lastName)

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