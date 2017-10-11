package ducampo.controller;

import ducampo.dao.EstadoDAO;
import ducampo.model.Estado;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "estadoBean")
public class EstadoBean {

    private Estado estado = new Estado();

    public void salvar() {
        EstadoDAO dao = new EstadoDAO();
        if (this.estado.getId() == 0) {
            dao.insert(this.estado);
        } else {
            dao.update(this.estado);
        }
        this.estado = new Estado();
    }
    
    public void editar(Estado estado) {
        this.estado = estado;
    }
    
    public void remover(Estado estado) {
        EstadoDAO dao = new EstadoDAO();
        dao.delete(estado);
    }
    
    public List<Estado> getEstados() {
        EstadoDAO dao = new EstadoDAO();
        return dao.selectAll();
    }
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
