package com.adrian.calculator.persistence.impl;

import com.adrian.calculator.repository.sum.SumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SumRepositoryImpl implements SumRepository {


    @Override
    public void traceSum(Long operator1, Long operator2, Long result) {
        //Empty by now
    }

}
