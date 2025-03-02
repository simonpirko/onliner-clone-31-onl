package by.tms.onlinerclone31onl.dao;

import by.tms.onlinerclone31onl.domain.ProductImages;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductImagesDAO implements DataAccessObject<ProductImages> {
    @Override
    public void save(ProductImages entity) {

    }

    @Override
    public void delete(ProductImages entity) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void update(String id, ProductImages entity) {

    }

    @Override
    public List<ProductImages> findAll() {
        return List.of();
    }

    @Override
    public Optional<ProductImages> findByID(String id) {
        return Optional.empty();
    }
}
