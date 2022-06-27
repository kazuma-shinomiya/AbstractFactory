package listfactory;

import factory.Item;
import factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(getCaption());
        sb.append("\n<ul>\n");
        for (Item item: getTray()) {
            item.makeHTML();
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
