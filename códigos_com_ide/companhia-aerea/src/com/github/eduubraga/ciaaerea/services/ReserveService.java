package com.github.eduubraga.ciaaerea.services;

import com.github.eduubraga.ciaaerea.Reserve;

import java.util.*;

public class ReserveService {
    private final Set<Reserve> reserves = new HashSet<>();

    public Set<Reserve> getReserves() {
        return Collections.unmodifiableSet(reserves);
    }

    public void add(Reserve reserve) {
        boolean reserveAdd = reserves.add(reserve);

        if (!reserveAdd) {
            throw new RuntimeException(String.format("reserva %s já existe", reserve.getCode()));
        }
    }

    public Reserve search(String code) {
        Reserve reserveFound = null;

        for (Reserve reserve : reserves) {
            if (reserve.getCode().equals(code)) {
                reserveFound = reserve;
                break;
            }
        }

        return reserveFound;
    }

}
