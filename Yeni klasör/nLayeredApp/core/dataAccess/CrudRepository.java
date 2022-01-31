package nLayeredApp.core.dataAccess;

import java.util.ArrayList;

import nLayeredApp.core.entities.Entity;

// Repository pattern deseni denir.
public interface CrudRepository <T extends Entity> {
	// burada t veri tipidir bu �ekilde generic yaz�labilir
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	ArrayList<T> getAll(); 
}
