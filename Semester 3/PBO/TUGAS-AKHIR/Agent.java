public class Agent {
    private String agentId;
    private String name;
    private int exp;

    public Agent(String agentId, String name, int exp) {
        this.agentId = agentId;
        this.name = "Unknown";
        this.exp = 1;
        setName(name);
        setExperienceLevel(exp);
    }

    public String getAgentId() { 
        return agentId; 
    }

    public String getName() { 
        return name; 
    }

    public int getExperienceLevel() { 
        return exp; 
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("[ERROR] Nama agen tidak boleh kosong.");
            System.out.println("[INFO] Perubahan ditolak. Nama tetap " + this.name + ".");
            return;
        }
        this.name = name.trim();
    }

    public void setExperienceLevel(int exp) {
        if (exp < 1 || exp > 100) {
            System.out.println("[ERROR] Experience level harus berada pada rentang 1-100.");
            System.out.println("[INFO] Perubahan ditolak. Experience level tetap " + this.exp + ".");
            return;
        }
        this.exp = exp;
    }

    public String getRole() { return "Agent"; }

    public void displayProfile() {
        System.out.println("ID         : " + agentId);
        System.out.println("Name       : " + name);
        System.out.println("Role       : " + getRole());
        System.out.println("Experience : " + exp);
    }

    public void performMission() {
        System.out.println("[AGENT] Menjalankan misi umum.");
    }
}