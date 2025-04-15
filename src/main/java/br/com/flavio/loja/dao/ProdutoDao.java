package br.com.flavio.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import br.com.flavio.loja.modelo.Categoria;
import br.com.flavio.loja.modelo.Produto;
import jakarta.persistence.EntityManager;

public class ProdutoDao {

	private EntityManager em;

	public ProdutoDao(EntityManager em) {

		this.em = em;
	}

	public void Cadastrar(Produto produto) {

		this.em.persist(produto);
	}

	public Produto buscaPorId(Long id) {
		Produto produto = em.find(Produto.class, id);
		return produto;

	}

	public List<Produto> buscarTodos() {

		String jpql = "SELECT p FROM Produto p";

		return em.createQuery(jpql, Produto.class).getResultList();

	}

	public List<Produto> buscarPorNomeProduto(String nome) {

		String jpql = "SELECT p FROM Produto p WHERE p.nome = :name ";

		return em.createQuery(jpql, Produto.class)
				.setParameter("name", nome)
				.getResultList();

	}
	
	public List<Produto> buscarPorNomeDaCategoria(String nome) {

		String jpql = "SELECT p FROM Produto p  WHERE p.categoria.nome = :nome ";

		return em.createQuery(jpql, Produto.class)
				.setParameter("nome", nome)
				.getResultList();

	}

	public BigDecimal buscarPrecoDoProdutoComNome(String nome) {
		String jpql = "SELECT p.preco FROM Porduto p WHERE p.nome = :nome";
		
		return em.createQuery(jpql , BigDecimal.class)
				.setParameter("nome", nome)
				.getSingleResult();
			   
		
	}
	

	
	
}
