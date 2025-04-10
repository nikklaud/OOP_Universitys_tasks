public class OnlineCourse extends AbstractCourse {
    private String platform;

    public OnlineCourse(String name, int duration, String platform) {
        super(name, duration);
        this.platform = platform;
    }

    @Override
    public void startCourse() {
        System.out.println("Онлайн курс \"" + name + "\" начался на платформе " + platform);
    }

    @Override
    public void endCourse() {
        System.out.println("Онлайн курс \"" + name + "\" завершён.");
    }
}
