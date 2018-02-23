package mx.unam.aragon.fes.diplo.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //incremente
    public void incrementa (View vista){
        contador ++;
        muestra();
    }

    //Reduce
    public void quitar (View vista){
        contador --;
        muestra();
    }

    //reset
    public void reset(View vista){
        contador = 0;
        muestra();
    }

    //resultado
    public void muestra(){
        TextView textoResultado = (TextView)findViewById(R.id.contador);
        textoResultado.setText("Contador: "+contador);
    }

}
