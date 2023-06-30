package com.adrian.calculator.controller;

import com.adrian.calculator.mapper.CalculatorRestMapper;
import com.adrian.calculator.usecase.substraction.GetSubstractionQuery;
import com.adrian.calculator.usecase.substraction.GetSubstractionUseCase;
import com.adrian.calculator.usecase.sum.GetSumQuery;
import com.adrian.calculator.usecase.sum.GetSumUseCase;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.CalculatorApi;
import org.openapitools.model.ResultDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController implements CalculatorApi {

    private final CalculatorRestMapper calculatorRestMapper;

    private final GetSumUseCase getSumUseCase;

    private final GetSubstractionUseCase getSubstractionUseCase;

    @Override
    public ResponseEntity<ResultDTO> getCalculatorSum(final Long operator1, final Long operator2) {
        final GetSumQuery query = new GetSumQuery(operator1, operator2);
        return ResponseEntity.ok().body(calculatorRestMapper.toDto(getSumUseCase.sum(query)));
    }

    @Override
    public ResponseEntity<ResultDTO> getCalculatorSubstraction(final Long operator1, final Long operator2) {
        final GetSubstractionQuery query = new GetSubstractionQuery(operator1, operator2);
        return ResponseEntity.ok().body(calculatorRestMapper.toDto(getSubstractionUseCase.substract(query)));
    }

}
