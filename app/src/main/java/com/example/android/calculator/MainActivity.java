package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String d;
    double h,equal;
    int calculation;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void zeroclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        //Editable f=k.getText();

        k.setText(g+"0");
        //EditText c=findViewById(R.id.edittext2);
        Editable f=c.getText();
        c.setText(f+"0");
    }
    public void sixclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        //EditText c=findViewById(R.id.edittext2);
        Editable f=c.getText();
        k.setText(g+"6");
        //Editable f=k.getText();
        c.setText(f+"6");
    }

    public void oneclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        //EditText c=findViewById(R.id.edittext2);
        k.setText(g+"1");
        Editable f=c.getText();
        c.setText(f+"1");
    }
    public void twoclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        k.setText(g+"2");
        Editable f=c.getText();
        c.setText(f+"2");
    }
    @SuppressLint("SetTextI18n")
    public void threeclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        k.setText(g+"3");
        Editable f=c.getText();
        c.setText(f+"3");
    }
    public void fourclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        k.setText(g+"4");
        Editable f=c.getText();
        c.setText(f+"4");
    }
    public void fiveclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        k.setText(g+"5");
        Editable f=c.getText();
        c.setText(f+"5");
    }
    public void sevenclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        k.setText(g+"7");
        Editable f=c.getText();
        c.setText(f+"7");
    }
    public void eightclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        k.setText(g+"8");
        Editable f=c.getText();
        c.setText(f+"8");
    }
    public void nineclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable g=k.getText();
        k.setText(g+"9");
        Editable f=c.getText();
        c.setText(f+"9");
    }
    public void Cclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        k.setText("");
        c.setText("");
    }

    public void addclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        String s=k.getText().toString();
        //Editable g=c.getText();

        calculation=1;
        h=Double.parseDouble(c.getText().toString());
        k.setText(s+"+");
        c.setText("");
    }
    public void subclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        String s=k.getText().toString();
        calculation=2;
        h=Double.parseDouble(c.getText().toString());
        k.setText(s+"-");
        c.setText("");
    }
    public void multiplyclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        String s=k.getText().toString();
        calculation=3;
        h=Double.parseDouble(s.toString());
        k.setText(s+"*");
        c.setText("");
    }
    public void divideclick(View view){
        EditText k=(EditText)findViewById(R.id.edittext1);
        EditText c=(EditText)findViewById(R.id.edittext2);
        Editable s=k.getText();
        calculation=4;
        h=Double.parseDouble(k.getText().toString());
        k.setText(s+"/");
        c.setText("");
    }

public void equalclick(View view){
    EditText k=findViewById(R.id.edittext1);
    EditText c=findViewById(R.id.edittext2);
            switch(calculation){
                case 1:
                    //Editable k=findViewById(R.id.edittext1);
                     equal = h + Double.parseDouble(c.getText().toString());
                     d=Double.toString(equal);
                    c.setText(d);
                    break;
                case 2:
                    //Editable k=findViewById(R.id.edittext1);
                    equal = h - Double.parseDouble(c.getText().toString());
                    d=Double.toString(equal);

                    c.setText(d);
                    break;
                case 3:
                    //Editable k=findViewById(R.id.edittext1);
                    equal = h * Double.parseDouble(c.getText().toString());
                    d=Double.toString(equal);
                    c.setText(d);
                    break;
                case 4:
                    //Editable k=findViewById(R.id.edittext1);
                    equal = h / Double.parseDouble(c.getText().toString());
                    d=Double.toString(equal);
                    c.setText(d);
                    break;
                case 5:
                    equal=Math.pow(h,Double.parseDouble(c.getText().toString()));
                    d=Double.toString(equal);
                    c.setText(d);
                    break;


                default:
                    k.setText("");



            }

}
public void decimalclick(View view){
            EditText k= findViewById(R.id.edittext1);
            EditText g=findViewById(R.id.edittext2);
            k.setText(k.getText()+".");
            g.setText(g.getText()+".");
}
public void exponentclick(View view){
    EditText k=(EditText)findViewById(R.id.edittext1);
    EditText c=(EditText)findViewById(R.id.edittext2);
    Editable s=k.getText();
    calculation=5;
    h=Double.parseDouble(k.getText().toString());
    k.setText(s+"^");
    c.setText("");

}
//   public void logclick(View view){
//            EditText k=findViewById(R.id.edittext1);
//       EditText c=findViewById(R.id.edittext1);
//       Editable s=k.getText();
//
//       h=Double.parseDouble(k.getText().toString());
//       equal=Math.log(h);
//       k.setText(s+"log");
//       d=Double.toString(equal);
//       c.setText(d);
//   }


}




