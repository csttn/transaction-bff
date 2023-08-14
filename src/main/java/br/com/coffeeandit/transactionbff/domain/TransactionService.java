package br.com.coffeeandit.transactionbff.domain;

import br.com.coffeeandit.transactionbff.redis.TransactionRedisRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private TransactionRedisRepository transactionRedisRepository;

    public TransactionService(TransactionRedisRepository transactionRedisRepository) {
        this.transactionRedisRepository = transactionRedisRepository;
    }

    /// minuto 18 - aula 3


}
