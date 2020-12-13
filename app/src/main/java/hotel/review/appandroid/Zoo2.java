package hotel.review.appandroid;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Zoo2 extends AppCompatActivity {


    ImageView down_arrow,header_background;

    Button roadmap_button;
    ScrollView third_scrollview;
    Boolean flag=true;

    Animation from_bottom;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo2);

        down_arrow = findViewById(R.id.down_arrow);
        third_scrollview = findViewById(R.id.third_scrillview);

        roadmap_button=findViewById(R.id.roadmap_button);

        roadmap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String tag=roadmap_button.getTag().toString();

                Intent palace=new Intent(Zoo2.this,Map.class);
                palace.putExtra("V",12.302467753006647);
                palace.putExtra("V1",76.66420965426286);
                palace.putExtra("Tag",tag);
                startActivity(palace);
            }
        });


        header_background=findViewById(R.id.header_background);

        header_background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(flag)
                {
                    header_background.setImageResource(R.drawable.zoo);
                    flag=false;
                }
                else{
                    header_background.setImageResource(R.drawable.z);
                    flag=true;
                }
            }
        });

        from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);

        down_arrow.setAnimation(from_bottom);
        third_scrollview.setAnimation(from_bottom);



        //Hide status bar and navigation bar at the bottom
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        this.getWindow().getDecorView().setSystemUiVisibility(

                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );


        down_arrow.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Zoo2.this, Zoo.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(down_arrow, "background_image_transition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Zoo2.this, pairs);
                startActivity(intent, options.toBundle());
            }
        });


    }
}


