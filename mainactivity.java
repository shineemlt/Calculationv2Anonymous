package com.example.calculationv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText edtSoa,edtSob;
    TextView txtvKetqua;
    Button btnCong,btnTru,btnNhan,btnChia;
    ListView listviewTinhtoan;
    ArrayList<String> arrayCourse;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSoa=(EditText)findViewById(R.id.editta);
        edtSob=(EditText)findViewById(R.id.edittb);
        txtvKetqua=(TextView)findViewById(R.id.tvketqua);
        btnCong=(Button)findViewById(R.id.btncong);
        btnTru=(Button)findViewById(R.id.btntru);
        btnNhan=(Button)findViewById(R.id.btnnhan);
        btnChia=(Button)findViewById(R.id.btnchia);
        listviewTinhtoan=(ListView)findViewById(R.id.listviewlstt);
        arrayCourse=new ArrayList<>();
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1=edtSoa.getText().toString();
                int soa=Integer.parseInt(chuoi1);
                String chuoi2=edtSob.getText().toString();
                int sob=Integer.parseInt(chuoi2);
                int ketqua=soa+sob;
                txtvKetqua.setText(String.valueOf(soa));
                txtvKetqua.setText(soa+ "+" +sob+"=" +(ketqua));
                arrayCourse.add(soa+ "+" +sob+"=" +(ketqua));
                adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
                listviewTinhtoan.setAdapter(adapter);
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1=edtSoa.getText().toString();
                int soa=Integer.parseInt(chuoi1);
                String chuoi2=edtSob.getText().toString();
                int sob=Integer.parseInt(chuoi2);
                int ketqua=soa-sob;
                txtvKetqua.setText(soa+ "-" +sob+"=" +(ketqua));
                arrayCourse.add(soa+ "-" +sob+"=" +(ketqua));
                adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
                listviewTinhtoan.setAdapter(adapter);
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1=edtSoa.getText().toString();
                int soa=Integer.parseInt(chuoi1);
                String chuoi2=edtSob.getText().toString();
                int sob=Integer.parseInt(chuoi2);
                int ketqua=soa*sob;
                txtvKetqua.setText(soa+ "x" +sob+"=" +(ketqua));
                arrayCourse.add(soa+ "x" +sob+"=" +(ketqua));
                adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
                listviewTinhtoan.setAdapter(adapter);
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1=edtSoa.getText().toString();
                float soa=Float.parseFloat(chuoi1);
                String chuoi2=edtSob.getText().toString();
                float sob=Float.parseFloat(chuoi2);
                float ketqua=soa/sob;
                txtvKetqua.setText(soa+ "/"+sob+"=" +(ketqua));
                arrayCourse.add(soa+ "/"+sob+"=" +(ketqua));
                adapter =new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayCourse);
                listviewTinhtoan.setAdapter(adapter);

            }
        });





    }
}
