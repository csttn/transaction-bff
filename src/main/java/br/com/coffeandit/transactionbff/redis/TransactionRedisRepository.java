package br.com.coffeandit.transactionbff.redis;


import org.springframework.data.repository.CrudRepository;

import br.com.coffeandit.transactionbff.dto.TransactionDTO;

public interface TransactionRedisRepository extends CrudRepository<TransactionDTO, String> {
}
