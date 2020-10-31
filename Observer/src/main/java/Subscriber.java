public class Subscriber implements Observer {
    private String name;
    private Subject channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println("Hey ".concat(name).concat(" , New Video Uploaded titled: ").concat(title));
    }

    @Override
    public void subscribeChannel(Subject ch) {
        channel = ch;
    }

}
