package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
    
    @RequestMapping("/add")
    public String calculator(Model model, Integer liczba_add1, Integer liczba_add2) {
        model.addAttribute("liczba1", liczba_add1);
        model.addAttribute("liczba2", liczba_add2);
        model.addAttribute("opcja", "+");
        Integer wynik = liczba_add1 + liczba_add2;
        model.addAttribute("wynik", wynik);
        return "calculator";
    }
    
    @RequestMapping("/calculator")
    public String calculator(Model model, CalculatorForm kalkulator) {
        model.addAttribute("liczba1", kalkulator.getLiczba1());
        model.addAttribute("liczba2", kalkulator.getLiczba2());
        model.addAttribute("opcja", kalkulator.getOpcja());
        Integer wynik = kalkulator.ObliczWynik(kalkulator.getLiczba1(), kalkulator.getLiczba2(), kalkulator.getOpcja());
        model.addAttribute("wynik", wynik);
        return "calculator";
    }
    
}
