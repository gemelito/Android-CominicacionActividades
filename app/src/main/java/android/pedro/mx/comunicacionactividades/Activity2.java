package android.pedro.mx.comunicacionactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 102A-PedroCanche on 18/02/16.
 */
public class Activity2 extends Activity {

    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        //Se vincula con id del layout activity2
        salida = (TextView) findViewById(R.id.textView2);

        //Para imprimir
        Bundle extras = getIntent().getExtras();
            String s = extras.getString("usuario");

        salida.setText("Hola "+ s + " ¿Aceptas las condiciones?");



    }

    public void Enviar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("ok", "Has aceptado los terminos");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void Cancel(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Cancelado", "Has cancelado los terminos");
        setResult(RESULT_CANCELED, intent);
        finish();
    }

}
