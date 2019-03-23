
package model;
/**
*
* @author ednilsonrossi
*/
public interface IConjunto<T> {
	
	/**
	* Adiciona o Objeto passado como argumento no Conjunto. Caso o array criado n�o possua mais espa�o
	* deve-se dobrar o tamanho do array para armazenar mais objetos.
	*
	* @param
	* coisa - Coisa que ser� inserida no final (�ltima posi��o) do Conjunto
	*
	* @return
	* true - se inseriu a coisa
	* false - se n�o inseriu a coisa
	*/
	public abstract boolean add(T coisa);
	
	/**
	* Remove todos os elementos do Conjunto, ou seja, o conjunto para a estar vazio.
	*/
	public abstract void clear();
	/**
	* Verifica se uma Coisa est� ou n�o no Conjunto.
	*
	* @param coisa
	* coisa - elemento que ser� procurado no Conjunto
	*
	* @return
	* true se o argumento <code>coisa</code> est� no conjunto
	* false caso n�o esteja no conjunto.
	*/
	public abstract boolean contains(T coisa);
	
	/**
	* Retorna a Coisa de uma posi��o espec�fica
	*
	* @param posicao - posi��o do array cuja Coisa � desejada
	*
	* @return Coisa que est� na posi��o passada como argumentos ou <code>null</code> caso n�o exista a posi��o
	*/
	public abstract T get(int posicao);
	/**
	* Informa se o Conjunto est� vazio (n�o possui Coisas) ou n�o (possui Coisas)
	*
	* @return
	* true se n�o existem Coisas no Conjunto
	* false se exsite alguma Coisa no Conjunto
	*/
	public abstract boolean isEmpty();
	/**
	* Remove a Coisa que est� na posi��o indicada do Conjunto.
	*
	* @param posicao - posi��o desejada
	*
	* @return
	* Coisa removida ou <code>null</code> caso n�o seja poss�vel remover a posi��o indicada
	*/
	public abstract T remove (int posicao);
	
	/**
	* Remove a primeira ocorr�ncia da Coisa do Conjunto. Os elementos posteriores s�o reorganizados para
	* que o array n�o fique com valores nulos no meio dos dados.
	*
	* @param
	* coisa - Coisa que ser� procurada no array e retornada.
	*
	* @return
	* A Coisa que foi removida do Conjunto ou <code>null</code> caso n�o seja poss�vel remover a Coisa
	*/
	public abstract boolean remove(T coisa);
	/**
	* Retorna a quantidade de Coisas armazenadas no Conjunto.
	*
	* @return o n�mero de Coisas do Conjunto
	*/
	public abstract int size();
	
	

}