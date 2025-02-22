package by.tms.onlinerclone31onl.dao;

import java.util.List;
import java.util.Optional;

public interface DataAccessObject<T> {
    void save (T entity);

    void delete(T entity);

    void deleteById(String id);

    void update(String id, T entity);

    List<T> findAll();

    Optional<T> findByID(String id);
    Optional<T> findByPhone(String phone);
}
