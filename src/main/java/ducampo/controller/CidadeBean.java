package ducampo.controller;

import ducampo.dao.CidadeDAO;
import ducampo.model.Cidade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "cidadeBean")
public class CidadeBean {

    private Cidade cidade = new Cidade();

    public void salvar() {
        CidadeDAO dao = new CidadeDAO();
        if (this.cidade.getId() == 0) {
            dao.insert(this.cidade);
        } else {
            dao.update(this.cidade);
        }
        this.cidade = new Cidade();
    }
    
    public void editar(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public void remover(Cidade cidade) {
        CidadeDAO dao = new CidadeDAO();
        dao.delete(cidade);
    }
    
    public List<Cidade> getCidades() {
        CidadeDAO dao = new CidadeDAO();
        return dao.selectAll();
    }
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
