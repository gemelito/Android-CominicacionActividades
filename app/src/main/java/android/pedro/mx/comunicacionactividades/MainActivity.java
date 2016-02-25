package android.pedro.mx.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtname;


    private TextView salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        salir = (TextView) findViewById(R.id.resultado);
        txtname = (EditText) findViewById(R.id.txtName);


    }

    public void enviar(View view){



        String s =  txtname.getText().toString();

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("usuario", s);
        startActivityForResult(intent, 1234);
    }

    @Override
    protected void onActivityResult(int requesCode, int resultCode, Intent data){
        if (resultCode== RESULT_OK){
            String res = data.getExtras().getString("ok");
            salir.setText(res);
        }else{
            String cal = data.getExtras().getString("Cancelado");
            salir.setText(cal);
        }
    }


}
