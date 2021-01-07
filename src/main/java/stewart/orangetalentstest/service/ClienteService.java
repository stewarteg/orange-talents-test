package stewart.orangetalentstest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stewart.orangetalentstest.model.ClienteModel;
import stewart.orangetalentstest.repository.ClienteRepository;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    Optional<ClienteModel> findByCpf(long cpf){
        return clienteRepository.findById(cpf);
    }


}
