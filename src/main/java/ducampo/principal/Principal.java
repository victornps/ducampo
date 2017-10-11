package ducampo.principal;

import ducampo.dao.EstadoDAO;
import ducampo.model.Estado;


public class Principal {
    
    public static void main(String[] args) {
        
        Estado est1 = new Estado();
        est1.setNome("Bahia");
        est1.setSigla("BA");
        
        EstadoDAO dao = new EstadoDAO();
        dao.insert(est1);
    }
}
