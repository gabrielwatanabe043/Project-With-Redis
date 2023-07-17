package br.com.apiRedis.APIREDIS.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.apiRedis.APIREDIS.models.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, String>{

}
