package br.com.coffeandit.transactionbff.domain;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.coffeandit.transactionbff.dto.RequestTransactionDTO;
import br.com.coffeandit.transactionbff.dto.TransactionDTO;
import br.com.coffeandit.transactionbff.redis.TransactionRedisRepository;

@Service
public class TransactionService {

    private TransactionRedisRepository transactionRedisRepository;

    public TransactionService(TransactionRedisRepository transactionRedisRepository,
            RedisTemplate<String, String> redisTemplate) {
        this.transactionRedisRepository = transactionRedisRepository;
    }

    @Transactional
    public Optional<TransactionDTO> save(final RequestTransactionDTO requestTransactionDto) {
        requestTransactionDto.setData(LocalDateTime.now());
        return Optional.of(transactionRedisRepository.save(requestTransactionDto));
    }

    public Optional<TransactionDTO> findById(final String id) {
        return transactionRedisRepository.findById(id);
    }


}
