package account.model;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class CsvRowModel {
    private static final int NUMBER_OF_COLUMNS = 18;
    private int rowNumber;
    private List<String> columns;

    private String table;
    private String transaktionTyp;
    private String operationTyp;
    private String transactionsCode;
    private String transaktionNummer;
    private String additionalTransaktionNumber;
    private String betrag;
    private String currency;
    private String kontonr;
    private String blz;
    private String transDatum;
    private String valuta;
    private String mandateferenz;
    private String kundeId;
    private String vw1;
    private String vw2;
    private String bemerkung1;
    private String bemerkung2;
    private String bemerkung3;

    public CsvRowModel(List<String> columns, int rowNumber) {
        this.columns = columns;
        this.rowNumber = rowNumber;
        init();
    }

    private void init() {
        this.table = columns.get(0);
        this.transaktionTyp = columns.get(1);
        this.operationTyp = columns.get(2);
        this.transactionsCode = columns.get(3);
        this.transaktionNummer = columns.get(4);
        this.additionalTransaktionNumber = columns.get(5);
        this.betrag = columns.get(6);
        this.currency = columns.get(7);
        this.kontonr = columns.get(8);
        this.blz = columns.get(9);
        this.transDatum = columns.get(10);
        this.valuta = columns.get(11);
        this.mandateferenz = columns.get(12);
        this.kundeId = columns.get(13);
        this.vw1 = columns.get(14);
        this.vw2 = columns.get(15);
        this.bemerkung1 = columns.get(16);
        this.bemerkung2 = columns.get(17);
        this.bemerkung3 = columns.get(18);
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public List<String> getColumns() {
        return columns;
    }

    public String getTable() {
        return table;
    }

    public String getTransaktionTyp() {
        return transaktionTyp;
    }

    public String getOperationTyp() {
        return operationTyp;
    }

    public String getTransactionsCode() {
        return transactionsCode;
    }

    public String getTransaktionNummer() {
        return transaktionNummer;
    }

    public String getAdditionalTransaktionNumber() {
        return additionalTransaktionNumber;
    }

    public String getBetrag() {
        return betrag;
    }

    public String getCurrency() {
        return currency;
    }

    public String getKontonr() {
        return kontonr;
    }

    public String getBlz() {
        return blz;
    }

    public String getTransDatum() {
        return transDatum;
    }

    public String getValuta() {
        return valuta;
    }

    public String getMandateferenz() {
        return mandateferenz;
    }

    public String getKundeId() {
        return kundeId;
    }

    public String getVw1() {
        return vw1;
    }

    public String getVw2() {
        return vw2;
    }

    public String getBemerkung1() {
        return bemerkung1;
    }

    public String getBemerkung2() {
        return bemerkung2;
    }

    public String getBemerkung3() {
        return bemerkung3;
    }

    @Override
    public String toString() {
        return "CsvRowModel{" +
                "rowNumber=" + rowNumber +
                ", columns=" + columns +
                ", table='" + table + '\'' +
                ", transaktionTyp='" + transaktionTyp + '\'' +
                ", operationTyp='" + operationTyp + '\'' +
                ", transactionsCode='" + transactionsCode + '\'' +
                ", transaktionNummer='" + transaktionNummer + '\'' +
                ", additionalTransaktionNumber='" + additionalTransaktionNumber + '\'' +
                ", betrag='" + betrag + '\'' +
                ", currency='" + currency + '\'' +
                ", kontonr='" + kontonr + '\'' +
                ", blz='" + blz + '\'' +
                ", transDatum='" + transDatum + '\'' +
                ", valuta='" + valuta + '\'' +
                ", mandateferenz='" + mandateferenz + '\'' +
                ", kundeId='" + kundeId + '\'' +
                ", vw1='" + vw1 + '\'' +
                ", vw2='" + vw2 + '\'' +
                ", bemerkung1='" + bemerkung1 + '\'' +
                ", bemerkung2='" + bemerkung2 + '\'' +
                ", bemerkung3='" + bemerkung3 + '\'' +
                '}';
    }
}
