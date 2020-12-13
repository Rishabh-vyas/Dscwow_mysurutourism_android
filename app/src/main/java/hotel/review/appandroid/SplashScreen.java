package hotel.review.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private static final int TIME_OUT=2200;
    ImageView imageView;
    TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView=findViewById(R.id.logo);
        text1=findViewById(R.id.mysorText);
        text2=findViewById(R.id.text2);
        imageView.setX(1000);


        imageView.animate().translationXBy(-1000).setDuration(2000);
        imageView.animate().rotation(360).setDuration(2000);
        text1.animate().alpha(1).setDuration(3000);
        text2.animate().alpha(1).setDuration(3000);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        },TIME_OUT);

    }
}