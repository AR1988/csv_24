package account.model.bank;

import java.util.List;
import java.util.Map;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class BankDB {
    //https://www.bundesbank.de/dynamic/action/de/startseite/suche/bankleitzahlen-suche/747634/bankleitzahlen
    public static List<Bank> bankDB = List.of(
            new Bank(36010424L, "Aareal Bank", "Essen", "AARBDE5W360"),
            new Bank(10010500L, "Noelse Pay", "Berlin", "AFOPDEB2XXX"),
            new Bank(10010010L, "Postbank Ndl der Deutsche Bank", "Berlin", "PBNKDEFFXXX"),
            new Bank(10000000L, "Bundesbank", "Berlin", "MARKDEF1100"),
            new Bank(14051000L, "Sparkasse Mecklenburg-Nordwest", "Wismar", "NOLADE21WIS"),
            new Bank(10050000L, "Landesbank Berlin - Berliner Sparkasse", "Berlin", "BELADEBEXXX"),
            new Bank(10011001L, "N26 Bank", "Berlin", "NTSBDEB1XXX")
    );

    public static Map<Long, Bank> bankDBById = Map.of(
            36010424L, new Bank(36010424L, "Aareal Bank", "Essen", "AARBDE5W360"),
            10010500L, new Bank(10010500L, "Noelse Pay", "Berlin", "AFOPDEB2XXX"),
            10010010L, new Bank(10010010L, "Postbank Ndl der Deutsche Bank", "Berlin", "PBNKDEFFXXX"),
            10000000L, new Bank(10000000L, "Bundesbank", "Berlin", "MARKDEF1100"),
            14051000L, new Bank(14051000L, "Sparkasse Mecklenburg-Nordwest", "Wismar", "NOLADE21WIS"),
            10050000L, new Bank(10050000L, "Landesbank Berlin - Berliner Sparkasse", "Berlin", "BELADEBEXXX"),
            10011001L, new Bank(10011001L, "N26 Bank", "Berlin", "NTSBDEB1XXX")

    );
}
