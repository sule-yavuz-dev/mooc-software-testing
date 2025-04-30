package tudelft.discount;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.mockito.Mockito.*;

public class DiscountApplierTest {

    @Test
    public void shouldApplyDiscountForHomeProducts() {
        Product homeProduct = mock(Product.class);
        when(homeProduct.getCategory()).thenReturn("HOME");
        when(homeProduct.getPrice()).thenReturn(100.0);

        ProductDao dao = mock(ProductDao.class);
        when(dao.all()).thenReturn(Arrays.asList(homeProduct));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        verify(homeProduct).setPrice(90.0); // %10 indirim
    }
}
