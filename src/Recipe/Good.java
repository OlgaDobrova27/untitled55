package Recipe;

public enum Good {
    BANANA("Banana"),
    APPLE("Apple"),
    WATERMELON("Watermelon");

    private final String name;

    Good(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
