public class OfflineCourse extends AbstractCourse {
    private String location;

    public OfflineCourse(String name, int duration, String location) {
        super(name, duration);
        this.location = location;
    }

    @Override
    public void startCourse() {
        System.out.println("Офлайн курс \"" + name + "\" начался в аудитории " + location);
    }

    @Override
    public void endCourse() {
        System.out.println("Офлайн курс \"" + name + "\" завершён.");
    }
}
