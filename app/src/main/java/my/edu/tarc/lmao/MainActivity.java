package my.edu.tarc.lmao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg; //a module level module

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        //super = calling the super class
        super.onCreate(savedInstanceState);

        //setContentView = display UI
        //R = resources class (R stands for res)
        //layout = folder
        setContentView(R.layout.activity_main);

        //linking UI to program
        textViewMsg = findViewById(R.id.textViewMessage); //purple word = the ID
    }

    //View = class
    //v = an instant
    public void showMessage(View v)
    {
        textViewMsg.setText("Hello, Zibi Leow");
    }

    public void clearScreen(View v)
    {
        textViewMsg.setText("");
    }
}

