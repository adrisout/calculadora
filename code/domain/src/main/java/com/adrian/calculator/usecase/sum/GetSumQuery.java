package com.adrian.calculator.usecase.sum;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class GetSumQuery implements Serializable {

    private Long operator1;

    private Long operator2;

}
