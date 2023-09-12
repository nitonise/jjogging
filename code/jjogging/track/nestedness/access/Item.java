package code.jjogging.track.nestedness.access;

public class Item implements Metadata {
    private Content content;

    public Item() {
        this.content = new Content();
    }

    public Content getContent() {
        return content;
    }

    @Override
    public void print() {
        System.out.println(getClass());
    }

    private static class Content implements Metadata {
        @Override
        public void print() {
            System.out.println(getClass());
        }
    }
}
