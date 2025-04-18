import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== ЗАДАНИЕ 10.1: Роли пользователей =====\n");

        UserRole admin = new AdminRole();
        UserRole moderator = new ModeratorRole();
        UserRole user = new BasicUserRole();

        admin.printPermissions();
        System.out.println();
        moderator.printPermissions();
        System.out.println();
        user.printPermissions();
        System.out.println();

        System.out.println("Does moderator have DELETE permission? " +
                moderator.hasPermission(Permission.DELETE));

        System.out.println("\n===== ЗАДАНИЕ 10.2: Боевая симуляция =====\n");

        EnumMap<UnitType, Unit> unitMap = new EnumMap<>(UnitType.class);
        unitMap.put(UnitType.WARRIOR, new Warrior("Thorin"));
        unitMap.put(UnitType.MAGE, new Mage("Gandalf"));
        unitMap.put(UnitType.ARCHER, new Archer("Legolas"));

        for (UnitType type : UnitType.values()) {
            Unit unit = unitMap.get(type);
            unit.report();
            unit.attack();
            unit.defend();
            System.out.println();
        }
    }
}
