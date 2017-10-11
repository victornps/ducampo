package ducampo.controller;

import ducampo.dao.ClienteDAO;
import ducampo.model.Cliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "clienteBean")
public class ClienteBean {

    private Cliente cliente = new Cliente();

    public void salvar() {
        ClienteDAO dao = new ClienteDAO();
        if (this.cliente.getId() == 0) {
            dao.insert(this.cliente);
        } else {
            dao.update(this.cliente);
        }
        this.cliente = new Cliente();
    }
    
    public void editar(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void remover(Cliente cliente) {
        ClienteDAO dao = new ClienteDAO();
        dao.delete(cliente);
    }
    
    public List<Cliente> getClientes() {
        ClienteDAO dao = new ClienteDAO();
        return dao.selectAll();
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
