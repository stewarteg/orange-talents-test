package stewart.orangetalentstest.controllers;
import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import stewart.orangetalentstest.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import stewart.orangetalentstest.model.ClienteModel;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class ClienteController {

    @Autowired
    private ClienteRepository ClienteRepository;

    @PostMapping("/")
    public ClienteModel criarCliente (@RequestBody  ClienteModel  user) {
        //o parametro vai ser associado ao corpo da solicitação http
        return this.ClienteRepository.save(user);
        //Retorna salvando um user/cliente no repository~~BD.

    }
    @GetMapping("/list")
    public List<ClienteModel> list() {
        //cria um array list
        return this.ClienteRepository.findAll();
        //retorna uma lista completa dos clientes armazenados no BD
    }

    @GetMapping("/{id}")
    public ClienteModel listarId(@PathVariable Long id) {

        Optional<ClienteModel> userFind = this.ClienteRepository.findById(id);

        return ClienteRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID nao encontrado."));
        //if (userFind.isPresent()) {
        //return userFind.get();

        // }
        //return null;

    }
    @GetMapping("/cpf/{cpf}")
    public ClienteModel listarCPF(@PathVariable Long cpf) {

        Optional<ClienteModel> userFind = this.ClienteRepository.findByCpf(cpf);

        return ClienteRepository.findByCpf(cpf)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CPF nao encontrado."));


    }


    }





