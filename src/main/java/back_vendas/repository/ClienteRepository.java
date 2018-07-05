package back_vendas.repository;

import back_vendas.model.Cliente;
import org.springframework.stereotype.Repository;

/**
 * Created by Leonardo Candido on 04/07/2018.
 */
@Repository
public interface ClienteRepository extends GenericRepository<Cliente, Long> {
}