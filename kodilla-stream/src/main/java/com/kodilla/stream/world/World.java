package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> listContinents = new ArrayList<>();

    public void addContinent(Continent continent) {
        listContinents.add(continent);
    }

    boolean removeContinent(Continent continent) {
        listContinents.remove(continent);
        return true;
    }

    public List<Continent> getListContinents() {
        return listContinents;
    }

    //kolekcja kontynentów
    public BigDecimal getPeopleQuantity() {
        return listContinents.stream()
                .flatMap(continent -> continent.getListContryOnContinent().stream())
                        .map(country -> country.getPeopleQuantity())
                        .reduce(BigDecimal.ZERO, (sumPeople, current) -> sumPeople.add(current));
    }
}
    // która używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.
// }
