public class Main {
    public static void main(String[] args) {
        System.out.println("Tangguh Pandu Prabowo | NIM: L200250025");
        System.out.println();
        System.out.println("========================================");
        System.out.println("     ANOMALY HUNTER MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println();

        ScientistAgent agent1 = new ScientistAgent("L01", "Arep", 75, "Quantum Anomaly");
        CombatAgent agent2 = new CombatAgent("L02", "Egga", 82, "Perimeter Security");
        ScientistAgent agent3 = new ScientistAgent("L03", "Pandu", 100, "Temporal Anomaly");

        System.out.println("[AGENT 01]");
        agent1.displayProfile();
        System.out.println();
        System.out.println("Mission:");
        agent1.performMission();
        System.out.println();

        System.out.println("[AGENT 02]");
        agent2.displayProfile();
        System.out.println();
        System.out.println("Mission:");
        agent2.performMission();
        System.out.println();

        System.out.println("[AGENT 03]");
        agent3.displayProfile();
        System.out.println();
        System.out.println("Mission:");
        agent3.performMission();
        System.out.println();

        System.out.println("========================================");
        System.out.println("        VALIDATION TEST");
        System.out.println("========================================");
        System.out.println();

        Agent target = agent1;
        System.out.println("Current Experience : " + target.getExperienceLevel());
        System.out.println("Attempted Value    : 150");
        System.out.println();
        target.setExperienceLevel(150);
        System.out.println();
        System.out.println("Experience after   : " + target.getExperienceLevel());

        System.out.println();
        System.out.println("========================================");
        System.out.println("Program selesai.");
    }
}