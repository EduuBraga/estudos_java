package com.github.eduubraga.ciaaerea.services;

import com.github.eduubraga.ciaaerea.Reserve;
import com.github.eduubraga.ciaaerea.ReserveNotFoundException;

import java.util.Objects;

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

        Reserve reserve = reserveService.search(reserveCode);

        if (reserve == null) {
            throw new ReserveNotFoundException("Reserva nãoi existe");
        }

        reserve.addBaggage(qtyBaggage);
    }
}
