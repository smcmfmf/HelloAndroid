package kr.ac.kopo.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher); // 앱 내부의 아이콘
        Button btn1 = (Button) findViewById(R.id.btn1); // setContentView(R.layout.activity_main); 먼저 선언되지 않으면 작동하지 않음
        TextView text1 = (TextView) findViewById(R.id.tView);
        EditText edit1 = (EditText) findViewById(R.id.editName);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Toast toast = Toast.makeText(MainActivity.this);
                //Toast toast = Toast.makeText(getApplicationContext(), "버튼을 클릭하셨네요!", Toast.LENGTH_LONG); // 애니메이션이 길이가 길다.
                Toast toast = Toast.makeText(getApplicationContext(), "버튼을 클릭하셨네요!", Toast.LENGTH_SHORT); // 애니메이션이 길이가 짧다.
                text1.setText("??? 입니다.");
                String name = edit1.getText().toString();
                text1.setText(name + "입니다.");
                toast.show();
            }
        });
    }
}