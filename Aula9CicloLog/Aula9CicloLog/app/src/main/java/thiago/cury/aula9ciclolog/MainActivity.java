package thiago.cury.aula9ciclolog;

import android.icu.text.LocaleDisplayNames;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //Atributo para LOGS
    private static String TAG_LOG = "meusLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG_LOG, "entrou no onCreate");

    }//fecha onCreate

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG_LOG, "Entrou no onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG_LOG, "Entrou no onResume");
        Log.d(TAG_LOG, "LIGANDO NOVAMENTE BLUETOOTH");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_LOG, "Entrou no onPause");
        Log.d(TAG_LOG, "DESLIGAR BLUETOOTH");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG_LOG, "Entrou no onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG_LOG, "Entrou no onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG_LOG, "Entrou no onRestart");
    }
}//fecha MainActivity
