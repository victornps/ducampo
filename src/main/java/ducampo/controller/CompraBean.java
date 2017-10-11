package ducampo.controller;

import ducampo.dao.FornecedorDAO;
import ducampo.dao.ProdutoDAO;
import ducampo.dao.CompraDAO;
import ducampo.model.Fornecedor;
import ducampo.model.Produto;
import ducampo.model.Compra;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "compraBean")
public class CompraBean {

    private Compra compra = new Compra();
    private Fornecedor fornecedor = new Fornecedor();
    private Produto produto = new Produto();
    
    public void salvar() {
        CompraDAO dao = new CompraDAO();
        compra.setFornecedor(fornecedor);
        System.out.println(compra);
        dao.insert(compra);
        limparForm();
    }
    
    private void limparForm() {
        compra = new Compra();
        produto = new Produto();
        fornecedor = new Fornecedor();
    }
    
    public void adicionarProduto() {
        this.compra.adicionarProduto(this.produto);
        System.out.println(this.produto);
        this.produto = new Produto();
    }
    
    public List<Produto> getProdutosPorNome(String nome) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.buscarPorNome(nome);
    }

    public List<Fornecedor> getFornecedoresPorCpf(String cnpj) {
        FornecedorDAO dao = new FornecedorDAO();
        return dao.buscarPorCnpj(cnpj);
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
}
