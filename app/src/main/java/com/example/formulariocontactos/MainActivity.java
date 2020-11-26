package com.example.formulariocontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText eFecha;
    private int dia,mes,año;
    EditText mNombre,mTelefono,mEmail,mDescripcion;
    String nombre,email,descripcion,telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eFecha=(EditText) findViewById(R.id.mFecha);
        mNombre=(EditText)findViewById(R.id.mNombre);
        mTelefono=(EditText) findViewById(R.id.mTelefono);
        mEmail=(EditText)findViewById(R.id.mEmail);

        nombre=mNombre.getText().toString();
        email=mEmail.getText().toString();
        descripcion=mDescripcion.getText().toString();

        telefono=mTelefono.getText().toString();
    }

    public void clickFecha(View view) {
        final Calendar c=Calendar.getInstance();
        dia=c.get(Calendar.DAY_OF_MONTH);
        mes=c.get(Calendar.MONTH);
        año=c.get(Calendar.YEAR);

        DatePickerDialog datePicker=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                eFecha.setText(dayOfMonth+"/"+(month+1)+"/"+year);
            }
        },dia,mes,año);
        datePicker.show();
    }

    /*public void Siguiente(View view) {
        Intent i=new Intent(this,ConfDatos.class);
        i.putExtra("Nombre",nombre);
        i.putExtra("Email",email);
        i.putExtra("Telefono",telefono);
        i.putExtra("Dsecripcion",descripcion);
        i.putExtra("Fecha",eFecha.getText().toString());
        startActivity(i);
        finish();
    }*/
}