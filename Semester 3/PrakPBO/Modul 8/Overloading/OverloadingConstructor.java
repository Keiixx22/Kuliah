package Overloading;
import java.util.Date;
public class OverloadingConstructor {
    int idUser;
    String userName;
    int level;
    Date lastLogin;
    
    public OverloadingConstructor() {

    }

    public OverloadingConstructor(int idUser, String userName) {
        this.idUser = idUser;
        this.userName = userName;
    }

    void main() {
        OverloadingConstructor oc = new OverloadingConstructor(20, "Pandu");
        OverloadingConstructor oc2 = new OverloadingConstructor();

    }
}
