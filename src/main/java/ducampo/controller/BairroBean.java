package ducampo.controller;

import ducampo.dao.BairroDAO;
import ducampo.dao.CidadeDAO;
import ducampo.model.Bairro;
import ducampo.model.Cidade;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "bairroBean")
public class BairroBean {

    private Bairro bairro = new Bairro();

    public void salvar() {
        BairroDAO dao = new BairroDAO();
        if (this.bairro.getId() == 0) {
            dao.insert(this.bairro);
        } else {
            dao.update(this.bairro);
        }
        this.bairro = new Bairro();
    }
    
    public void editar(Bairro bairro) {
        this.bairro = bairro;
    }
    
    public void remover(Bairro bairro) {
        BairroDAO dao = new BairroDAO();
        dao.delete(bairro);
    }
    
    public List<Bairro> getBairros() {
        BairroDAO dao = new BairroDAO();
        return dao.selectAll();
    }
    
    public List<Cidade> getCidades() {
        CidadeDAO dao = new CidadeDAO();
        return dao.selectAll();
    }
    
    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
}
