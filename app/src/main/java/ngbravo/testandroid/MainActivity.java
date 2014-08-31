package ngbravo.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    int CONTACT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStop(){
        //Hacer cosas cuando se hace stop a la aplicación
        //EJ: si es un juego, queremos guardar el estado del juego cuando se minimiza o cierra la app
        super.onStop();
    }

    @Override
    protected void onResume(){
        //Volver a cargar el estado del juego cuando vuelve la app.
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view){

        Intent i = new Intent(this, SecondActivity.class);
        startActivityForResult(i, CONTACT);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        if(requestCode == CONTACT){

            if(resultCode == RESULT_OK){
                //Apretó el botón
            }

            else if(resultCode == RESULT_CANCELED){
                //Si es que apretó back
            }

            else if(resultCode == 25){
                //Codigo cualquiera
            }

        }


    }


}
