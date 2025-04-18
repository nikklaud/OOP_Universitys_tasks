import java.util.EnumSet;

public class BasicUserRole extends UserRole {
    public BasicUserRole() {
        super("User");
    }

    @Override
    protected void initPermissions() {
        permissions = EnumSet.of(Permission.READ, Permission.WRITE);
    }
}
