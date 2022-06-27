package factory;

public abstract class Item {
    private String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();

    public String getCaption() {
        return caption;
    }
}
