package factory;

public abstract class Link extends Item {
    private String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
