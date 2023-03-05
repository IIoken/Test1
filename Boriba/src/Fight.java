
public class Fight {
    public static void main(String[] args) {
        Orc orc = new Orc();
        Elf elf = new Elf();
        fight(orc, elf);
    }

    public static void fight(Orc orc, Elf elf) {
        while (true) {
            if (orc.hiealth < 0) {
                orc.state = false;
            } else {
                orc.hiealth -= elf.impactForce;
            }
            if (elf.hiealth < 0) {
                elf.state = false;
            } else {
                elf.hiealth -= orc.impactForce;
            }

            if (!orc.state && elf.state) {
                System.out.println("Орк победил Эльфа");
                break;
            } else if (orc.state && !elf.state) {
                System.out.println("Эльф победил орка");
                break;
            } else if (!orc.state && !elf.state) {
                System.out.println("Всё мертвы...");
                break;
            }
        }
    }
}
