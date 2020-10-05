package id.co.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etfirst, etsecond;
    Button btnKali, btnbagi, btnTambah, btnKurang, btnBersihkan;
    TextView tvHasil;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst = findViewById(R.id.et_first);
        etsecond = findViewById(R.id.et_second);
        tvHasil = findViewById(R.id.tv_hasil);
        btnKali = findViewById(R.id.btn_dot);
        btnbagi = findViewById(R.id.btn_divide);
        btnTambah = findViewById(R.id.btn_plus);
        btnKurang = findViewById(R.id.btn_minus);
        btnBersihkan = findViewById(R.id.btn_clear);
    }

    private boolean Check(){
        if (etfirst.getText().length() > 0 && etsecond.getText().length() > 0){
            return true;
        } else {
            Toast.makeText(this, "Mohon Masukkan kedua angka", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void plus(View view){
        if (Check()){
            double dFirst = Double.parseDouble(etfirst.getText().toString());
            double dSecond = Double.parseDouble(etsecond.getText().toString());
            double result = dFirst + dSecond;
            tvHasil.setText(Double.toString(result));
        }
    }

    public void minus(View view) {
        if (Check()){
            double dFirst = Double.parseDouble(etfirst.getText().toString());
            double dSecond = Double.parseDouble(etsecond.getText().toString());
            double result = dFirst - dSecond;
            tvHasil.setText(Double.toString(result));
        }
    }
    public void kali(View view) {
        if (Check()){
            double dFirst = Double.parseDouble(etfirst.getText().toString());
            double dSecond = Double.parseDouble(etsecond.getText().toString());
            double result = dFirst * dSecond;
            tvHasil.setText(Double.toString(result));
        }
    }

    public void bagi(View view) {
        if (Check()){
            double dFirst = Double.parseDouble(etfirst.getText().toString());
            double dSecond = Double.parseDouble(etsecond.getText().toString());
            double result = dFirst / dSecond;
            tvHasil.setText(Double.toString(result));
        }
    }

    public void bersihkan(View view) {
        etfirst.setText("");
        etsecond.setText("");
        tvHasil.setText("");
        etfirst.requestFocus();
    }
}