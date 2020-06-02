package data;

public enum Season {
    SPRING("wiosna",    new String[]{"marzec",      "kwiecień",     "maj"}),
    SUMMER("lato",      new String[]{"czerwiec",    "lipiec",       "sierpień"}),
    AUTUMN("jesień",    new String[]{"wrzesień",    "październik",  "listopad"}),
    WINTER("zima",      new String[]{"grudzień",    "styczeń",      "luty"});

    private final String    description;
    private final String[]  months;

    private Season(String description, String[] months) {
        this.description = description;
        this.months = months;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMonths() {
        return months;
    }

    public static Season fromDescription(String description) {
        Season[] values = values();
        description = description.toLowerCase(); // bez CaseSensitive
        for (Season size : values) {
            if (size.getDescription().equals(description))
                return size;
        }
        return null;
    }
}
