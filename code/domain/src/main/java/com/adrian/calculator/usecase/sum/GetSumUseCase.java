package com.adrian.calculator.usecase.sum;

import com.adrian.calculator.entity.sum.Sum;

public interface GetSumUseCase {

    Sum sum(GetSumQuery query);
}
