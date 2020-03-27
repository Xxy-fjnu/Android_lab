package cn.edu.fjnu.cl.lab2_uicomponents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_simpleadapter = (Button)findViewById(R.id.sabtn);
        Button btn_dialog=(Button)findViewById(R.id.dgbtn);
        Button btn_xml=(Button)findViewById(R.id.xmlbtn);
        Button btn_Am=(Button)findViewById(R.id.ambtn);

        btn_simpleadapter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleAdapter_Activity.class);
                startActivity(intent);
            }
        });
        btn_dialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Alertdialog_Activity.class);
                startActivity(intent);
            }
        });
        btn_xml.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,xml_Activity.class);
                startActivity(intent);
            }
        });
        btn_Am.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ActionMode_Activity.class);
                startActivity(intent);
            }
        });
    }
}
