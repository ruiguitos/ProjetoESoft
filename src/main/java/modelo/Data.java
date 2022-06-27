package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    private Calendar calendar;
    int ano;
    int dia;
    int mes;

    public Data(Calendar calendar) {

        this.calendar = new GregorianCalendar(ano,mes-1,dia);
    }

    public void parseData(String data){
        //return data;
    }
}
