package ejemplo.proyecto.miapp3.christopher.calculadora;

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
                calculo.setText("0");
                numero = 0;
                break;
            case R.id.uno:
                calculo.setText("1");
                numero = 1;
                break;
            case R.id.dos:
                calculo.setText("2");
                numero = 2;
                break;
            case R.id.tres:
                calculo.setText("3");
                numero = 3;
                break;
            case R.id.cuatro:
                calculo.setText("4");
                numero = 4;
                break;
            case R.id.cinco:
                calculo.setText("5");
                numero = 5;
                break;
            case R.id.seis:
                calculo.setText("6");
                numero = 6;
                break;
            case R.id.siete:
                calculo.setText("7");
                numero = 7;
                break;
            case R.id.ocho:
                calculo.setText("8");
                numero = 8;
                break;
            case R.id.nueve:
                calculo.setText("9");
                numero = 9;
                break;
            case R.id.suma:
                resultado.setText(numero+ " + ");
                numero1 = numero;
                numero = 0;
                operador = "+";
                break;
            case R.id.resta:
                resultado.setText(numero+ " - ");
                numero1 = numero;
                numero = 0;
                operador = "-";
                break;
            case R.id.multiplicacion:
                resultado.setText(numero+ " x ");
                numero1 = numero;
                numero = 0;
                operador = "x";
                break;
            case R.id.division:
                resultado.setText(numero+ " / ");
                numero1 = numero;
                numero = 0;
                operador = "/";
                break;
            case R.id.igual:
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
