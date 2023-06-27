package br.com.coffeandit.transactionbff.api;

import br.com.coffeandit.transactionbff.dto.RequestTransactionDTO;
import br.com.coffeandit.transactionbff.dto.TransactionDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDTO> enviarTransacao(@RequestBody final RequestTransactionDTO requestTransactionDTO) {

        return Mono.empty();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDTO> buscarTransacao(@PathVariable final String uuid) {
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDTO> removerTransacao(@PathVariable String uuid) {
        return Mono.empty();
    }

    @PatchMapping(value = "/{id}/confirmar")
    public Mono<TransactionDTO> confirmarTransacao(@PathVariable final String uuid) {

        return Mono.empty();
    }

}
