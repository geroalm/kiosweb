import com.ga.kiosguay.principal.data.entity.Producto;
import com.ga.kiosguay.principal.service.interfaces.ProductoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
@Sql({"/test-schema.sql", "/test-data.sql"})
public class ProductoTest {
    @Autowired
    ProductoService service;



        private Producto prod = new Producto();



}