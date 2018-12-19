package com.example;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class MavenDemo {
    @Id
    public Long id;
    public String value;
}
