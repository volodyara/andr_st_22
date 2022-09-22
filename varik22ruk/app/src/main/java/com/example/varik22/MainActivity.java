package com.example.varik22;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private EditText editText;
    private ListView lw;
    private Button button1, button2, button3, button4;
    private ArrayAdapter<String> arad;
    View lastItem=null;
    int lastPosition=-1;
    int a = 0;
    String arr = "0 ";

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.EditFirst);
        lw = (ListView) findViewById(R.id.lw);
        button1 = (Button) findViewById(R.id.b1);
        button2 = (Button) findViewById(R.id.b2);
        button3 = (Button) findViewById(R.id.b3);
        button4 = (Button) findViewById(R.id.b4);
        arad= new ArrayAdapter<String>(this, R.layout.le);
        lw.setAdapter(arad);
        arad.add("0 ");
        arad.add("0 1 ");
        lw.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView textView=(TextView)view;
        editText.setText(textView.getText().toString());
        textView.setBackgroundColor(0xffff0000);

        lastItem=view;
        lastPosition=position;

    }

    public void btn1(View view){
        a++;
        if (a == 11){a = 0;}
        switch(a)
        {
        case 10: {arr+= "0 ";break;}
        case 1: {arr+= "1 ";break;}
        case 2: {arr+= "2 ";break;}
        case 3: {arr+= "3 ";break;}
        case 4: {arr+= "4 ";break;}
        case 5: {arr+= "5 ";break;}
        case 6: {arr+= "6 ";break;}
        case 7: {arr+= "7 ";break;}
        case 8: {arr+= "8 ";break;}
        case 9: {arr+= "9 ";break;}
        default: break;
        }


    }
    public void clear(View view){
        arad.clear();

    }
    public void Del(View view){

        arr = "0 ";
        editText.setText(arr);
        }

    public void Edit2(View view){

        String stringValueOf = String.valueOf(arr);
         arad.add(stringValueOf);
         arr = "0 ";
         a = 0;
        }
    }

