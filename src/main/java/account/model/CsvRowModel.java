package account.model;

import model.OperationType;
import model.TableName;
import model.TransactionType;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class CsvRowModel {
    private static final int NUMBER_OF_COLUMNS = 18;
    private int rowNumber;
    private List<String> columns;
    private final List<String> errors;
    private final List<String> columnNames;


    private TableName table;
    private TransactionType transaktionTyp;
    private OperationType operationTyp;
    private String transactionsCode;
    private Integer transaktionNummer;
    private String additionalTransaktionNumber;
    private String betrag;
    private String currency;
    private String kontonr;
    private Long blz;
    private String transDatum;
    private String valuta;
    private Long mandateferenz;
    private String kundeId;
    private String vw1;
    private String vw2;
    private String bemerkung1;
    private String bemerkung2;
    private String bemerkung3;

    public CsvRowModel(List<String> columns, int rowNumber, List<String> errors) {
        this.columns = columns;
        this.rowNumber = rowNumber;
        this.errors = errors;
        this.columnNames = getColumnNames();
        init();
    }

    private void init() {
        this.table = CsvParser.toTableEnum(columns.get(0), errors, columnNames.get(0));
        this.transaktionTyp = CsvParser.toTransactionTypeEnum(columns.get(1), errors, columnNames.get(1));
        this.operationTyp = CsvParser.toOperationTypeEnum(columns.get(2), errors, columnNames.get(2));
        this.transactionsCode = columns.get(3);
        this.transaktionNummer = CsvParser.toInt(columns.get(4), errors, columnNames.get(4));
        this.additionalTransaktionNumber = columns.get(5);
        this.betrag = columns.get(6);
        this.currency = columns.get(7);
        this.kontonr = columns.get(8);
        this.blz = CsvParser.toLong(columns.get(9), errors, columnNames.get(9));
        this.transDatum = columns.get(10);
        this.valuta = columns.get(11);
        this.mandateferenz = CsvParser.toLong(columns.get(12), errors, columnNames.get(12));
        this.kundeId = columns.get(13);
        this.vw1 = columns.get(14);
        this.vw2 = columns.get(15);
        this.bemerkung1 = columns.get(16);
        this.bemerkung2 = columns.get(17);
        this.bemerkung3 = columns.get(18);
    }

    private static List<String> getColumnNames() {
        return List.of(
                "TABLE",
                "TRANSAKTION_TYP",
                "OPERATION_TYP",
                "TRANSACTIONS_CODE",
                "TRANSAKTION_NUMMER",
                "ADDITIONAL_TRANSAKTION_NUMBER",
                "BETRAG",
                "CURRENCY",
                "KONTONR",
                "BLZ",
                "TRANS_DATUM",
                "VALUTA",
                "MANDATEFERENZ",
                "KUNDE_ID",
                "VW1",
                "VW2",
                "BEMERKUNG_1",
                "BEMERKUNG_2",
                "BEMERKUNG_3"
        );
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public List<String> getColumns() {
        return columns;
    }

    public TableName getTable() {
        return table;
    }

    public TransactionType getTransaktionTyp() {
        return transaktionTyp;
    }

    public OperationType getOperationTyp() {
        return operationTyp;
    }

    public String getTransactionsCode() {
        return transactionsCode;
    }

    public Integer getTransaktionNummer() {
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

    public Long getBlz() {
        return blz;
    }

    public String getTransDatum() {
        return transDatum;
    }

    public String getValuta() {
        return valuta;
    }

    public Long getMandateferenz() {
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
