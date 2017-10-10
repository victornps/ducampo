package ducampo.dao;

import ducampo.model.Cliente;
import ducampo.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

public class ClienteDAO extends GenericDAO<Cliente> {

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }
    
    public List<Cliente> buscarPorCpf(String cpf) {
        String jpql = "SELECT c FROM Cliente c WHERE c.cpf like :cpfCliente";
        TypedQuery<Cliente> consulta = getEm().createQuery(jpql, Cliente.class).setMaxResults(3);
        consulta.setParameter("cpfCliente", "%" + cpf + "%");
        return consulta.getResultList();
    }
    
}
