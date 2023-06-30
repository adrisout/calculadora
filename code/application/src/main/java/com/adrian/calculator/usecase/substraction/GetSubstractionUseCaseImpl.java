package com.adrian.calculator.usecase.substraction;

import com.adrian.calculator.entity.substraction.Substraction;
import com.adrian.calculator.repository.substraction.SubstractionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.logging.LoggingPermission;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetSubstractionUseCaseImpl implements GetSubstractionUseCase {

    private final SubstractionRepository repository;

    @Override
    public Substraction substract(final GetSubstractionQuery query) {
        Long result = query.getOperator1() - query.getOperator2();
        log.info("Performing substraction operation between numbers: {} and {} with result:  {}", query.getOperator1(), query.getOperator2(), result);
        //this.repository.traceSubstraction();
        return new Substraction(result);
    }

}
