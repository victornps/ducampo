package ducampo.dao;

import ducampo.model.Produto;
import ducampo.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

public class ProdutoDAO extends GenericDAO<Produto> {

    @Override
    public Class<Produto> getClassType() {
        return Produto.class;
    }

    public List<Produto> buscarPorNome(String nome) {
        String jpql = "select p from Produto p where p.nome like :nome";
        TypedQuery<Produto> query = getEm().createQuery(jpql, Produto.class).setMaxResults(10);
        query.setParameter("nome", "%"+ nome + "%");
        return query.getResultList();
    }

}
