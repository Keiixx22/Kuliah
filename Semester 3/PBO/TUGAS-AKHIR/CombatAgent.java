public class CombatAgent extends Agent {
    private String combatSpecialty;

    public CombatAgent(String agentId, String name, int exp, String combatSpecialty) {
        super(agentId, name, exp);
        this.combatSpecialty = combatSpecialty;
    }

    public String getCombatSpecialty() { 
        return combatSpecialty; 
    }

    public void setCombatSpecialty(String combatSpecialty) { 
        this.combatSpecialty = combatSpecialty; 
    }

    @Override
    public String getRole() { 
        return "Combat Agent"; 
    }

    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Specialty  : " + combatSpecialty);
    }

    @Override
    public void performMission() {
        System.out.println("[COMBAT] Mengamankan perimeter dan mengevakuasi personel dari zona berbahaya.");
    }
}