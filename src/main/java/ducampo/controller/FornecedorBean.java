package ducampo.controller;

import ducampo.dao.FornecedorDAO;
import ducampo.model.Fornecedor;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "fornecedorBean")
public class FornecedorBean {

    private Fornecedor fornecedor = new Fornecedor();

    public void salvar() {
        FornecedorDAO dao = new FornecedorDAO();
        if (this.fornecedor.getId() == 0) {
            dao.insert(this.fornecedor);
        } else {
            dao.update(this.fornecedor);
        }
        this.fornecedor = new Fornecedor();
    }
    
    public void editar(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public void remover(Fornecedor fornecedor) {
        FornecedorDAO dao = new FornecedorDAO();
        dao.delete(fornecedor);
    }
    
    public List<Fornecedor> getFornecedores() {
        FornecedorDAO dao = new FornecedorDAO();
        return dao.selectAll();
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
