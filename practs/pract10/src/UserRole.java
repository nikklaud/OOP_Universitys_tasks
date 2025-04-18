import java.util.EnumSet;

public abstract class UserRole implements PermissionChecker {
    protected String roleName;
    protected EnumSet<Permission> permissions;

    public UserRole(String roleName) {
        this.roleName = roleName;
        this.permissions = EnumSet.noneOf(Permission.class);
        initPermissions();
    }

    protected abstract void initPermissions();

    @Override
    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }

    @Override
    public void printPermissions() {
        System.out.println(roleName + " has permissions:");
        for (Permission p : permissions) {
            System.out.println(" - " + p.name() + ": " + p.getDescription());
        }
    }
}
