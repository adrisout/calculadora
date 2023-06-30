package com.adrian.calculator.persistence.impl;

import com.adrian.calculator.repository.substraction.SubstractionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubstractionRepositoryImpl implements SubstractionRepository {


    @Override
    public void traceSubstraction(Long operator1, Long operator2, Long result) {
        //Empty by now
    }

}
