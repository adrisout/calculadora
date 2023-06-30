package com.adrian.calculator.usecase.sum;

import com.adrian.calculator.entity.sum.Sum;
import com.adrian.calculator.repository.sum.SumRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetSumUseCaseImpl implements GetSumUseCase {

    private final SumRepository repository;

    @Override
    public Sum sum(final GetSumQuery query) {
        Long result = query.getOperator1() + query.getOperator2();
        log.info("Performing sum operation between numbers: {} and {} with result: {}", query.getOperator1(), query.getOperator2(), result);
        //this.repository.traceSum();
        return new Sum(result);
    }
}
