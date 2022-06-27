package listfactory;

import factory.Item;
import factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html><head><title>");
        sb.append(getTitle());
        sb.append("</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>");
        sb.append(getTitle());
        sb.append("</h1>\n");
        sb.append("<ul>\n");
        for (Item item: getContent()) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>");
        sb.append(getAuthor());
        sb.append("</address>\n");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
