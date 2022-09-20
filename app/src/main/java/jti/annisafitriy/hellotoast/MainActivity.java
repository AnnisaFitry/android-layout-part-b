package jti.annisafitriy.hellotoast;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    Button zero, count;
    Context context;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        count = (Button)findViewById(R.id.button_count);
        zero = (Button)findViewById(R.id.zero);
        mShowCount = (TextView)findViewById(R.id.show_count);

        count.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mCount++;
                mShowCount.setText("" + mCount);
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mCount = 0;
                mShowCount.setText("" + mCount);
            }
        });
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }


}