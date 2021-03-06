package factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    private String title;
    private String author;
    private List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output(String filename) {
        try {
            Files.writeString(Path.of(filename), makeHTML(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
            System.out.println(filename + " is created");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public abstract String makeHTML();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<Item> getContent() {
        return content;
    }
}
