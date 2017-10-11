package ducampo.dao;

import ducampo.model.Fornecedor;
import ducampo.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;


public class FornecedorDAO extends GenericDAO<Fornecedor>{
    
    @Override
    public Class<Fornecedor> getClassType() {
        return Fornecedor.class;
    }
    
    public List<Fornecedor> buscarPorCnpj(String cnpj) {
        String jpql = "SELECT f FROM Fornecedor f WHERE f.cnpj like :cnpjFornecedor";
        TypedQuery<Fornecedor> consulta = getEm().createQuery(jpql, Fornecedor.class).setMaxResults(3);
        consulta.setParameter("cnpjFornecedor", "%" + cnpj + "%");
        return consulta.getResultList();
    }
}
