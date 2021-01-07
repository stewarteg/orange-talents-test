package stewart.orangetalentstest.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import stewart.orangetalentstest.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{

    Optional<ClienteModel> findByCpf(Long cpf);
  //  Optional<ClienteModel> findByEmail(String email);

   }

