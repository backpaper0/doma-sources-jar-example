package com.example;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class GradleDemo {
    @Id
    public Long id;
    public String value;
}
