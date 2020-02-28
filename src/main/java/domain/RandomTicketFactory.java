package domain;

import domain.numberscontainer.LottoNumber;
import domain.numberscontainer.Ticket;

import java.util.*;

public class RandomTicketFactory {
    private static final int FIRST_INDEX = 0;
    private static final int SIXTH_INDEX = 6;

    public static Ticket createTicket() {
        return new Ticket(getShuffledLottoNumbers());
    }

    private static Set<LottoNumber> getShuffledLottoNumbers() {
        List<LottoNumber> lottoNumbers = Arrays.asList(LottoNumber.values());
        Collections.shuffle(lottoNumbers);

        return new LinkedHashSet<>(lottoNumbers.subList(FIRST_INDEX, SIXTH_INDEX));
    }

}