package br.com.algoritmos.requisicao;

import java.io.Serializable;
import java.util.Collection;

import br.com.algoritmos.solucao.Arvore;

public class Requisicao <T> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private DadosClient dados;
	private T valor;
	private TipoRequisicao tipoRequisicao;
	private Collection<T> listaValores;
	private Arvore arvore;
	
	//Dados De Recebimento
	private Integer posicao;
	private Object no;

	public Requisicao(DadosClient dados, T valor, TipoRequisicao tipoRequisicao, Collection<T> listaValores,
			Arvore arvore, Integer posicao, Object no) {
		this.dados = dados;
		this.valor = valor;
		this.tipoRequisicao = tipoRequisicao;
		this.listaValores = listaValores;
		this.arvore = arvore;
		this.posicao = posicao;
		this.no = no;
	}
	
	public Requisicao() {
		this(null, null, null, null, null, null, null);
	}
	
	
	//Construtor de Resposta de Ordena��o
	public Requisicao(DadosClient _dados, Collection<T> _listaValores) {
		this(_dados, null, null, _listaValores, null, null, null);
	}
	
	//Construtor de Resposta de Busca
	public Requisicao(DadosClient _dados, Integer _posicao) {
		this(_dados, null, null, null, null, _posicao, null);
	}
	
	//Construtor de Resposta de Arvore ou Grafos
	public Requisicao(DadosClient _dados, Object _no) {
		this(_dados, null, null, null, null, null, _no);
	}
	
	public Requisicao(TipoRequisicao _tipoRequisicao, Arvore _arvore, DadosClient _dados) {
		this(null, null, _tipoRequisicao, null, _arvore, null, null);
	}
	
	//Requisic�o de Ordena��o
	public Requisicao(TipoRequisicao _tipoRequisicao, Collection<T> _listaValores, DadosClient _dados) {
		this(_dados, null, _tipoRequisicao, _listaValores, null, null, null);
	}
	
	public Requisicao(TipoRequisicao _tipoRequisicao, Collection<T> _listaValores, DadosClient _dados, T _valor) {
		this(_dados, _valor, _tipoRequisicao, _listaValores, null, null, null);
	}
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public TipoRequisicao getTipoRequisicao() {
		return tipoRequisicao;
	}
	
	public void setTipoRequisicao(TipoRequisicao tipoRequisicao) {
		this.tipoRequisicao = tipoRequisicao;
	}
	
	public Collection<T> getListaValores() {
		return listaValores;
	}
	public void setListaValores(Collection<T> listaValores) {
		this.listaValores = listaValores;
	}

	public DadosClient getDados() {
		return dados;
	}

	public Arvore getArvore() {
		return arvore;
	}

	public void setArvore(Arvore arvore) {
		this.arvore = arvore;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Object getNo() {
		return no;
	}

	public void setNo(Object no) {
		this.no = no;
	}

	public void setDados(DadosClient dados) {
		this.dados = dados;
	}
	
	
}
