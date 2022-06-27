package divfactory;

import factory.Item;
import factory.Page;

public class DivPage extends Page {
    public DivPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html><head><title>");
        sb.append(getTitle());
        sb.append("</title><style>\n");
        sb.append("div.TRAY { padding:0.5em; margin-left:5em; border:1px solid black; }\n");
        sb.append("div.LINK { padding:0.5em; background-color: lightgray; }\n");
        sb.append("</style></head><body>\n");
        sb.append("<h1>");
        sb.append(getTitle());
        sb.append("</h1>\n");
        for (Item item: getContent()) {
            sb.append(item.makeHTML());
        }
        sb.append("<hr><address>");
        sb.append(getAuthor());
        sb.append("</address>\n");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
