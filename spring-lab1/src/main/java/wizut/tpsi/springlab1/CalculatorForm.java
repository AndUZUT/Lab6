package wizut.tpsi.springlab1;

public class CalculatorForm {
    private Integer liczba1;
    private Integer liczba2;
    private String opcja;
    
    public Integer getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(Integer liczba1) {
        this.liczba1 = liczba1;
    }

    public Integer getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(Integer liczba2) {
        this.liczba2 = liczba2;
    }

    public String getOpcja() {
        return opcja;
    }

    public void setOpcja(String opcja) {
        this.opcja = opcja;
    }
    
    public Integer ObliczWynik(Integer liczba1, Integer liczba2, String opcja) {
        Integer wynik;
        switch (opcja) {
            case "+":
                {
                    wynik = liczba1 + liczba2;
                    break;
                }
            case "-":
                {
                    wynik = liczba1 - liczba2;
                    break;
                }
            case "*":
                {
                    wynik = liczba1 * liczba2;
                    break;
                }
            default:
                {
                    wynik = liczba1 + liczba2;
                    break;
                }
        }
        return wynik;
    }
    
}
