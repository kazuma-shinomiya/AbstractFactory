package divfactory;

import factory.Item;
import factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>");
        sb.append(getCaption());
        sb.append("</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for (Item item: getTray()) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}
