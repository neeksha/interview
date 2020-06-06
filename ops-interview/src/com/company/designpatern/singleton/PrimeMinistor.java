package com.company.designpatern.singleton;

public class PrimeMinistor {

    static PrimeMinistor primeMinistor = null;

    private PrimeMinistor() {

    }

    static synchronized public PrimeMinistor getPrimeMinistor() {
        synchronized (PrimeMinistor.class) {
            if (primeMinistor == null)
                primeMinistor = new PrimeMinistor();
        }
        return primeMinistor;
    }
}
