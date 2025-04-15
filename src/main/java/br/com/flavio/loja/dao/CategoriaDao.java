package br.com.flavio.loja.dao;

import java.util.List;

import br.com.flavio.loja.modelo.Categoria;
import br.com.flavio.loja.modelo.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class CategoriaDao {

	private EntityManager em;

	public CategoriaDao(EntityManager em) {

		this.em = em;
	}

	public void Cadastrar(Categoria categoria) {

		this.em.persist(categoria);
	}

	public void atualizar(Categoria categoria) {
		em.merge(categoria);

	}

	public void listar(Categoria categoria) {
		em.find(Categoria.class, categoria.getId());

	}

	public void deletar(Categoria categoria) {
		categoria = em.merge(categoria);
		em.remove(categoria);

	}

	public void procurarPorNome(String nome) {

		String sql = "SELECT c FROM Categoria c WHERE c.nome = :nome";
		TypedQuery query = em.createQuery(sql, Categoria.class);
		query.setParameter("nome", nome);
		List<Categoria> resultList = query.getResultList();

		for (Categoria c : resultList) {
			System.out.println("Categoria " + c.getNome());
		}

	}

}
