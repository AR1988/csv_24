package account.model;

import model.OperationType;
import model.TableName;
import model.TransactionType;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 25.03.2023
 */
public class CsvRowModel {
    private static final int NUMBER_OF_COLUMNS = 18;
    private static final List<String> columnNames = getColumnNames();

    private final int rowNumber;
    private final List<String> columns;
    private final List<String> errors;


    private TableName table;
    private TransactionType transaktionTyp;
    private OperationType operationTyp;
    private Integer transactionsCode;
    private Integer transaktionNummer;
    private Integer additionalTransaktionNumber;
    private Double betrag;
    private Integer currency;
    private Long kontonr;
    private Long blz;
    private LocalDate transDatum;
    private LocalDate valuta;
    private Long mandateferenz;
    private Long kundeId;
    private String vw1;
    private String vw2;
    private String bemerkung1;
    private String bemerkung2;
    private String bemerkung3;

    public CsvRowModel(List<String> columns, int rowNumber, List<String> errors) {
        this.columns = columns;
        this.rowNumber = rowNumber;
        this.errors = errors;
        init();
    }

    private void init() {
        this.table = CsvParser.toTableEnum(columns.get(0), errors, columnNames.get(0), true);
        this.transaktionTyp = CsvParser.toTransactionTypeEnum(columns.get(1), errors, columnNames.get(1), true);
        this.operationTyp = CsvParser.toOperationTypeEnum(columns.get(2), errors, columnNames.get(2), true);
        this.transactionsCode = CsvParser.toInt(columns.get(3), errors, columnNames.get(3), true);
        this.transaktionNummer = CsvParser.toInt(columns.get(4), errors, columnNames.get(4), true);
        this.additionalTransaktionNumber = CsvParser.toInt(columns.get(5), errors, columnNames.get(5), true);
        this.betrag = CsvParser.toDouble(columns.get(6), errors, columnNames.get(6), true);
        this.currency = CsvParser.toInt(columns.get(7), errors, columnNames.get(7), true);
        this.kontonr = CsvParser.toLong(columns.get(8), errors, columnNames.get(8), true);
        this.blz = CsvParser.toLong(columns.get(9), errors, columnNames.get(9), true);
        this.transDatum = CsvParser.toDate(columns.get(10), errors, columnNames.get(10), true);
        this.valuta = CsvParser.toDate(columns.get(11), errors, columnNames.get(11), true);
        this.mandateferenz = CsvParser.toLong(columns.get(12), errors, columnNames.get(12), TransactionType.SEPA.equals(transaktionTyp));
        this.kundeId = CsvParser.toLong(columns.get(13), errors, columnNames.get(13), true);
        this.vw1 = CsvParser.toString(columns.get(14), errors, columnNames.get(14), true);
        this.vw2 = CsvParser.toString(columns.get(15), errors, columnNames.get(15), false);
        this.bemerkung1 = CsvParser.toString(columns.get(16), errors, columnNames.get(16), false);
        this.bemerkung2 = CsvParser.toString(columns.get(17), errors, columnNames.get(17), false);
        this.bemerkung3 = CsvParser.toString(columns.get(18), errors, columnNames.get(18), false);
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

    public Integer getTransactionsCode() {
        return transactionsCode;
    }

    public Integer getTransaktionNummer() {
        return transaktionNummer;
    }

    public Integer getAdditionalTransaktionNumber() {
        return additionalTransaktionNumber;
    }

    public Double getBetrag() {
        return betrag;
    }

    public Integer getCurrency() {
        return currency;
    }

    public Long getKontonr() {
        return kontonr;
    }

    public Long getBlz() {
        return blz;
    }

    public LocalDate getTransDatum() {
        return transDatum;
    }

    public LocalDate getValuta() {
        return valuta;
    }

    public Long getMandateferenz() {
        return mandateferenz;
    }

    public Long getKundeId() {
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
