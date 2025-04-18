public enum Permission {
    READ("Read access"),
    WRITE("Write access"),
    DELETE("Delete access"),
    BAN("Ban users");

    private final String description;

    Permission(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
