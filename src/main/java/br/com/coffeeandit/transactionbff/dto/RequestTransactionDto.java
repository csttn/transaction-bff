package br.com.coffeeandit.transactionbff.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema
public class RequestTransactionDto extends TransactionDto {

    @JsonIgnore
    private LocalDateTime data;


}
