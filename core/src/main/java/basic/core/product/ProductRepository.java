package basic.core.product;

import java.util.HashMap;
import java.util.Map;

public interface ProductRepository {

    void create(Product product);
    Product findById(Long productId);
}
