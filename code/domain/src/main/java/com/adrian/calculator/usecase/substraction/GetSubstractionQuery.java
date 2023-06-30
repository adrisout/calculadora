package com.adrian.calculator.usecase.substraction;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class GetSubstractionQuery implements Serializable {

    private Long operator1;

    private Long operator2;

}
