package com.adrian.calculator.entity.substraction;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Getter
@RequiredArgsConstructor
public class Substraction implements Serializable {

    private final Long result;
}
