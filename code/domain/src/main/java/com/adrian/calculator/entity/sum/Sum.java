package com.adrian.calculator.entity.sum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Getter
@RequiredArgsConstructor
public class Sum implements Serializable {

    private final Long result;
}
