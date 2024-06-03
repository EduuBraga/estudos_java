package com.github.eduubraga.bank.business;

import java.util.Objects;
import java.util.logging.Logger;

public class Holder {
    private static final Logger logger = Logger.getLogger(Holder.class.getName());

    private final String name;
    private final String cpf;

    public Holder(String name, String cpf) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(cpf);

        this.name = name;
        this.cpf = cpf;

        if (name.length() <= 10) {
            logger.warning(String.format("O nome %s é muito curto, é recomendado no mínimo 10 letras", name));
        }
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Holder[" +
                "name:'" + name + '\'' +
                ", cpf:'" + cpf + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Holder holder = (Holder) o;
        return cpf.equals(holder.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
