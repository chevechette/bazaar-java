package karina.jdbc;

import java.util.List;

public interface Dao<K, T> {
	public List<T>		getAll();
	public void			add(T obj);
	public void			delete(K key);
	public void			update(T obj);
	public T			findByPK(K key);
}
