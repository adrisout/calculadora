package com.adrian.calculator.usecase.substraction;

import com.adrian.calculator.entity.substraction.Substraction;

public interface GetSubstractionUseCase {

    Substraction substract(GetSubstractionQuery query);
}
