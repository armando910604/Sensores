package com.example.marc.sensores;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;
import android.hardware.Sensor;
import java.util.List;



public class MainActivity extends ActionBarActivity implements SensorEventListener {
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salida = (TextView) findViewById(R.id.salida);
//aqui se carga la lista de sensores que tiene el dispositivo movil
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for (Sensor sensor: listaSensores) {
            log(sensor.getName());
        }
    }
// aqui se inicia los sensores los se almacenan en el textview
    public  void iniciarSensorAproximacion(){
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);
// aqui se hace la lista
        if (!listaSensores.isEmpty()) {
            Sensor proximitySensor = listaSensores.get(0);
            sensorManager.registerListener(this, proximitySensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
    }
    public void acelerometro(){
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);

        if (!listaSensores.isEmpty()) {
            Sensor acelerometerSensor = listaSensores.get(0);
            sensorManager.registerListener(this, acelerometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
    }
    //Metodo para iniciar la escucha de los eventos de los sensores

    public void iniciarSensores(){

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);

        if (!listaSensores.isEmpty()) {
            Sensor orientationSensor = listaSensores.get(0);
            sensorManager.registerListener(this, orientationSensor,
                    SensorManager.SENSOR_DELAY_UI);}

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);

        if (!listaSensores.isEmpty()) {
            Sensor acelerometerSensor = listaSensores.get(0);
            sensorManager.registerListener(this, acelerometerSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);

        if (!listaSensores.isEmpty()) {
            Sensor giroscopioSensor = listaSensores.get(0);
            sensorManager.registerListener(this, giroscopioSensor,
                    SensorManager.SENSOR_DELAY_UI);}

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);

        if (!listaSensores.isEmpty()) {
            Sensor magneticSensor = listaSensores.get(0);
            sensorManager.registerListener(this, magneticSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);

        if (!listaSensores.isEmpty()) {
            Sensor temperatureSensor = listaSensores.get(0);
            sensorManager.registerListener(this, temperatureSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);

        if (!listaSensores.isEmpty()) {
            Sensor proximitySensor = listaSensores.get(0);
            sensorManager.registerListener(this, proximitySensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);

        if (!listaSensores.isEmpty()) {
            Sensor gravedadSensor = listaSensores.get(0);
            sensorManager.registerListener(this, gravedadSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}


        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);

        if (!listaSensores.isEmpty()) {
            Sensor luzSensor = listaSensores.get(0);
            sensorManager.registerListener(this, luzSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}


    }
// metodo para detener los sensores
    public void detenerSensores(){
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);

        if (!listaSensores.isEmpty()) {
            Sensor acelerometerSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(acelerometerSensor.TYPE_ACCELEROMETER));
        }

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);

        if (!listaSensores.isEmpty()) {
            Sensor giroscopioSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(giroscopioSensor.TYPE_GYROSCOPE));
        }

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);

        if (!listaSensores.isEmpty()) {
            Sensor magneticSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(magneticSensor.TYPE_MAGNETIC_FIELD));
        }

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);
        if (!listaSensores.isEmpty()) {
            Sensor temperatureSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(temperatureSensor.TYPE_TEMPERATURE));
        }

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);
        if (!listaSensores.isEmpty()) {
            Sensor proximitySensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(proximitySensor.TYPE_PROXIMITY));
        }

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);
        if (!listaSensores.isEmpty()) {
            Sensor gravedadSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(gravedadSensor.TYPE_GRAVITY));
        }

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);
        if (!listaSensores.isEmpty()) {
            Sensor luzSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(luzSensor.TYPE_LIGHT));
        }

    }
// muestra los vlores que los sensores estan mandando
    @Override
    public void onSensorChanged(SensorEvent event) {
        synchronized (this) {
            switch(event.sensor.getType()) {
                case Sensor.TYPE_ORIENTATION:

                    break;
                case Sensor.TYPE_ACCELEROMETER:
                    log("Acelerómetro X: "+event.values[0]);
                    log("Acelerómetro Y: "+event.values[1]);
                    log("Acelerómetro Z: "+event.values[2]);
                    break;
                case Sensor.TYPE_GYROSCOPE:
                    log("Eje X: "+event.values[0]);
                   log("Eje Y: "+event.values[1]);
                    log("Eje Z: "+event.values[2]);
                    break;
                case Sensor.TYPE_MAGNETIC_FIELD:
                    log("Eje X: "+event.values[0]);
                    log("Eje Y: "+event.values[1]);
                    log("Eje Z: "+event.values[2]);
                    break;
                case Sensor.TYPE_PROXIMITY:
                    log("Proximidad: "+event.values[0]);
                    break;
                case Sensor.TYPE_LIGHT:

                    break;
                case Sensor.TYPE_GRAVITY:

                    break;
                default:
                    for (int i=0 ; i<event.values.length ; i++) {
                        log("Temperatura "+i+": "+event.values[i]);
                    }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


    private void log (String string) {
        salida.append(string + "\n");
    }

    private void limpiar(){
        salida.setText("");
    }


    @Override
    public void onPause()
    { super.onPause();
     //Nuestro código a ejecutar en este momento
     detenerSensores();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
//metodo que ejecuta los metodos de las opione del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.iniciar:
                iniciarSensores();
                return true;
            case R.id.detener:
                detenerSensores();
                return true;
            case R.id.limpiar:
                limpiar();
                return true;
            default:
                }

        return super.onOptionsItemSelected(item);
    }
}
