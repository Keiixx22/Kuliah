public class ScientistAgent extends Agent {
    private String researchField;

    public ScientistAgent(String agentId, String name, int exp, String researchField) {
        super(agentId, name, exp);
        this.researchField = researchField;
    }

    public String getResearchField() { 
        return researchField; 
    }

    public void setResearchField(String researchField) { 
        this.researchField = researchField; 
    }

    @Override
    public String getRole() { 
        return "Scientist Agent"; 
    }

    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Field      : " + researchField);
    }

    @Override
    public void performMission() {
        System.out.println("[SCIENTIST] Mengumpulkan sampel dan menganalisis karakteristik anomali.");
    }
}