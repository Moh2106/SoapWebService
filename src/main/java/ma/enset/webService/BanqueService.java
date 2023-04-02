package ma.enset.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName ="BanqueWS")
public class BanqueService {

    public BanqueService() {
    }

    @WebMethod
    public double conversion(double somme){
        return somme*11;
    }

    @WebMethod
    public Compte getCompte(){
        return new Compte(1, 17000);
    }

    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 17000));
        comptes.add(new Compte(2, 14000));
        comptes.add(new Compte(3, 20000));

        return comptes;
    }
}
