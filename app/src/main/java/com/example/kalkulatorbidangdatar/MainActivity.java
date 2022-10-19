package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtlebar_tinggi, edtalas_diameter;
    Button htPersegi, htLingkaran, htSegitiga;
    TextView txtluas, txtKeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicomponen();
    }
    private void inicomponen(){
        edtalas_diameter = (EditText) findViewById(R.id.edt_alas);
        edtlebar_tinggi = (EditText) findViewById(R.id.edt_panjang);
        htLingkaran = (Button) findViewById(R.id.btn_htlingkaran);
        htPersegi = (Button) findViewById(R.id.btn_htpersegi);
        htSegitiga =(Button) findViewById(R.id.btn_htpersegi);
        txtluas = (TextView) findViewById(R.id.txtLuas);
        txtKeliling = (TextView) findViewById(R.id.txtKeliling);
    }
    public void HitungPersegi(View v){
        float panjang = Integer.parseInt(edtalas_diameter.getText().toString());
        float lebar = Integer.parseInt(edtlebar_tinggi.getText().toString());
        float luas = panjang * lebar;
        float keliling = (2*panjang) + (2*lebar);
        txtluas.setText(" Luas : "+String.valueOf(luas)+" cm2");
        txtKeliling.setText((" Keliling : "+String.valueOf(keliling)+" cm2"));
    }
    public void HitungSegitiga(View v){
        float alas = Integer.parseInt(edtalas_diameter.getText().toString());
        float tinggi = Integer.parseInt(edtlebar_tinggi.getText().toString());
        float luas = (alas * tinggi) / 2;
        float keliling = 3 * alas;
        txtluas.setText(" Luas : "+String.valueOf(luas)+" cm2");
        txtKeliling.setText((" Keliling : "+String.valueOf(keliling)+" cm2"));
    }
    public void HitungLingkaran(View v){
        float diameter = Integer.parseInt(edtalas_diameter.getText().toString());
        float luas = (float) (Math.PI * Math.pow(diameter / 2, 2));
        float keliling = (float) (Math.PI * diameter);
        txtluas.setText(" Luas : "+String.valueOf(luas)+" cm2");
        txtKeliling.setText((" Keliling : "+String.valueOf(keliling)+" cm2"));
    }
}