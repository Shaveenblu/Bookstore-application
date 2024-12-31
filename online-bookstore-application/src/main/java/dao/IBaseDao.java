package dao;

public interface IBaseDao {
	   void save(T entity);

	    void update(T entity);

	    void delete(int id);

	    T findById(int id);

	    List<T> findAll();

}
