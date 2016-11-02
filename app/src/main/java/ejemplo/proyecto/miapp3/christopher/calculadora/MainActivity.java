package ejemplo.proyecto.miapp3.christopher.calculadora;

import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, suma, resta, multi, divi, igual,reiniciar;
    TextView resultado, calculo;
    private int numero1 = 0, numero2 = 0, numero = 0;
    private double res;
    private String operador = "";
    private String acumulador = "";

    //Probando commit


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = (Button) findViewById(R.id.nueve);
        cero = (Button) findViewById(R.id.cero);
        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        multi = (Button) findViewById(R.id.multiplicacion);
        divi = (Button) findViewById(R.id.division);
        igual = (Button) findViewById(R.id.igual);
        reiniciar = (Button) findViewById(R.id.button);

        calculo = (TextView) findViewById(R.id.txtCalculos);
        resultado = (TextView) findViewById(R.id.txtResultado);

        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        cero.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
        igual.setOnClickListener(this);
        reiniciar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.cero:
                numero = 0;
                acumulador += "0";
                calculo.setText(acumulador);
                break;
            case R.id.uno:
                acumulador += "1";
                calculo.setText(acumulador);
                break;
            case R.id.dos:
                acumulador += "2";
                calculo.setText(acumulador);
                break;
            case R.id.tres:
                acumulador += "3";
                calculo.setText(acumulador);
                break;
            case R.id.cuatro:
                acumulador += "4";
                calculo.setText(acumulador);
                break;
            case R.id.cinco:
                acumulador += "5";
                calculo.setText(acumulador);
                break;
            case R.id.seis:
                acumulador += "6";
                calculo.setText(acumulador);
                break;
            case R.id.siete:
                acumulador += "7";
                calculo.setText(acumulador);
                break;
            case R.id.ocho:
                acumulador += "8";
                calculo.setText(acumulador);
                break;
            case R.id.nueve:
                acumulador += "9";
                calculo.setText(acumulador);
                break;
            case R.id.suma:
                numero = Integer.parseInt(acumulador);
                resultado.setText(numero+ " + ");
                numero1 = numero;
                numero = 0;
                acumulador = "";
                operador = "+";
                break;
            case R.id.resta:
                numero = Integer.parseInt(acumulador);
                resultado.setText(numero+ " - ");
                numero1 = numero;
                numero = 0;
                acumulador = "";
                operador = "-";
                break;
            case R.id.multiplicacion:
                numero = Integer.parseInt(acumulador);
                resultado.setText(numero+ " x ");
                numero1 = numero;
                numero = 0;
                acumulador = "";
                operador = "x";
                break;
            case R.id.division:
                numero = Integer.parseInt(acumulador);
                resultado.setText(numero+ " / ");
                numero1 = numero;
                numero = 0;
                acumulador = "";
                operador = "/";
                break;
            case R.id.igual:
                numero = Integer.parseInt(acumulador);
                numero2 = numero;
                resultado.setText(numero1+" "+operador+" "+numero2);
                calculo.setText(""+calculado(numero1,numero2,operador));
                break;
            case R.id.button:
                resultado.setText("resultado");
                calculo.setText("Ingrese numeros");
                numero2 = 0;
                numero1 = 0;
                operador = "";
                acumulador = "";
                break;
        }
    }

    public double calculado(int numero1, int numero2 , String operador){

        double resultado = 0;

        switch (operador)
        {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "x":
                resultado = numero1 * numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;

        }
        return resultado;
    }
}
