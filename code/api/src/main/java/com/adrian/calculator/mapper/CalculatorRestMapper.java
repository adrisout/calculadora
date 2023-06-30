package com.adrian.calculator.mapper;

import com.adrian.calculator.entity.substraction.Substraction;
import com.adrian.calculator.entity.sum.Sum;
import org.mapstruct.Mapper;
import org.openapitools.model.ResultDTO;

@Mapper
public interface CalculatorRestMapper {

    ResultDTO toDto(Sum domain);

    ResultDTO toDto(Substraction domain);
}
