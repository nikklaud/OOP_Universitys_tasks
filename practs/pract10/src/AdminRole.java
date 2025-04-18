import java.util.EnumSet;

public class AdminRole extends UserRole {
    public AdminRole() {
        super("Admin");
    }

    @Override
    protected void initPermissions() {
        permissions = EnumSet.allOf(Permission.class);
    }
}
