package basic.core.product;

import java.util.HashMap;
import java.util.Map;

public class MemoryProductRepository implements ProductRepository{
    private static Map<Long, Product> store = new HashMap<>();

    @Override
    public void create(Product product) {
        store.put(product.getId(),product);

    }

    @Override
    public Product findById(Long productId) {
        return store.get(productId);
    }
}
