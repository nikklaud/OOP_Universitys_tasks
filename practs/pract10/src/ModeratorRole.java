import java.util.EnumSet;

public class ModeratorRole extends UserRole {
    public ModeratorRole() {
        super("Moderator");
    }

    @Override
    protected void initPermissions() {
        permissions = EnumSet.of(Permission.READ, Permission.WRITE, Permission.BAN);
    }
}
