package javaRush.lvl3;

public class StarCraft {
    public static void main(String[] args) {
        Zerg pupa = new Zerg();
        Protoss zalupa = new Protoss();
        Terran biba = new Terran();
        pupa.name = "dalupa";
        zalupa.name = "valentin";
        biba.name = "semen";
        System.out.println(biba.name);
        System.out.println(zalupa.name);
        System.out.println(pupa.name);

    }

    public static class Zerg {
        public String name;

    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
