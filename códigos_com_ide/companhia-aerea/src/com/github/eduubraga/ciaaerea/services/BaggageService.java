package com.github.eduubraga.ciaaerea.services;

import com.github.eduubraga.ciaaerea.Reserve;
import com.github.eduubraga.ciaaerea.ReserveNotFoundException;

import java.util.Objects;
import java.util.Optional;

public class BaggageService {
    private final ReserveService reserveService;

    public BaggageService(ReserveService reserveService) {
        Objects.requireNonNull(reserveService);
        this.reserveService = reserveService;
    }

    public void contract(String reserveCode, int qtyBaggage) {
        if (qtyBaggage < 1) {
            throw new RuntimeException("Quantidade de bagagens inválido.");
        }

        Optional<Reserve> reserve = reserveService.search(reserveCode);

        if (reserve.isPresent()) {
            reserve.get().addBaggage(qtyBaggage);
        } else {
            throw new ReserveNotFoundException("Reserva não existe");
        }
    }
}
