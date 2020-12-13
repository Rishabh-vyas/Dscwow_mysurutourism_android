package hotel.review.appandroid;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CardView Mysuru, karanji, chamundaTempale,infosysCampus,ph,Dashra,zoo,gardan,yoga,somnathpur,fantasy,dam,muvsiam;
    ImageView menuBar;
    TextView textView, textView2, textView3, textView4, textView5;
    SearchView searchView;
    ImageSlider slider;

    Animation anim_from_button, anim_from_top, anim_from_left;


    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        slider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.infosys,"Infosys Campus"));
        slideModels.add(new SlideModel(R.drawable.ph,"philomenas"));
        slideModels.add(new SlideModel(R.drawable.dushra,"Dusshera Festival"));
        slideModels.add(new SlideModel(R.drawable.palace,"Mysuru Palace"));
        slideModels.add(new SlideModel(R.drawable.in,"Infosys Campus"));
        slideModels.add(new SlideModel(R.drawable.chamunda,"Chamundeshwari"));
        slideModels.add(new SlideModel(R.drawable.lake,"Lake"));
        slideModels.add(new SlideModel(R.drawable.du,"Dusshera Festival"));
        slideModels.add(new SlideModel(R.drawable.philomenas,"Philomenas"));
        slideModels.add(new SlideModel(R.drawable.chamundeshwari,"chamundeshwari"));
        slideModels.add(new SlideModel(R.drawable.chennakesava,"chamundeshwari"));
        slideModels.add(new SlideModel(R.drawable.zoo,"Zoo"));
        slideModels.add(new SlideModel(R.drawable.museum,"Mysuru Museum"));
        slideModels.add(new SlideModel(R.drawable.fantasy,"Fantasy Park"));
        slideModels.add(new SlideModel(R.drawable.z,"Zoo"));
        slideModels.add(new SlideModel(R.drawable.dam,"Mysuru Dam"));
        slideModels.add(new SlideModel(R.drawable.brindavan,"Brindavan Gardan"));

        slider.setImageList(slideModels,true);



        Mysuru = findViewById(R.id.Mysuru);
        karanji = findViewById(R.id.karanji);
        chamundaTempale = findViewById(R.id.chamundaView);
        infosysCampus=findViewById(R.id.infosysCampus);
        ph=findViewById(R.id.ph);
        zoo=findViewById(R.id.zoo);
        gardan=findViewById(R.id.gardan);
        yoga=findViewById(R.id.yoga);
        Dashra=findViewById(R.id.Dashra);
        somnathpur=findViewById(R.id.somnathpur);
        fantasy=findViewById(R.id.fantasy);
        dam=findViewById(R.id.dam);
        muvsiam=findViewById(R.id.muvsiam);

        menuBar = findViewById(R.id.menuBar);
        textView = findViewById(R.id.firstText);
        textView2 = findViewById(R.id.textView);
        searchView = findViewById(R.id.searchView);

        //Load Animations
        anim_from_button = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);
        anim_from_top = AnimationUtils.loadAnimation(this, R.anim.anim_from_top);
        anim_from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);

        //Set Animations
        Mysuru.setAnimation(anim_from_button);
        karanji.setAnimation(anim_from_button);
        chamundaTempale.setAnimation(anim_from_button);
        infosysCampus.setAnimation(anim_from_button);
        ph.setAnimation(anim_from_button);
        gardan.setAnimation(anim_from_button);
        yoga.setAnimation(anim_from_button);
        Dashra.setAnimation(anim_from_button);
        somnathpur.setAnimation(anim_from_button);
        fantasy.setAnimation(anim_from_button);
        zoo.setAnimation(anim_from_button);
        muvsiam.setAnimation(anim_from_button);
        dam.setAnimation(anim_from_button);

        menuBar.setAnimation(anim_from_top);
        textView.setAnimation(anim_from_top);
        textView2.setAnimation(anim_from_top);

        searchView.setAnimation(anim_from_left);

        Mysuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(MainActivity.this, MysuruPalace.class);
                startActivity(secondActivity);
            }
        });

        karanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, KaranjiLake.class);
                startActivity(karanji);
            }
        });

        chamundaTempale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Chamunda.class);
                startActivity(karanji);
            }
        });

        infosysCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Infosys.class);
                startActivity(karanji);
            }
        });

        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Philomenas.class);
                startActivity(karanji);
            }
        });

        Dashra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Dashra.class);
                startActivity(karanji);
            }
        });

        zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Zoo.class);
                startActivity(karanji);
            }
        });

        gardan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Garden.class);
                startActivity(karanji);
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Yoga.class);
                startActivity(karanji);
            }
        });

        somnathpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Somnathpur.class);
                startActivity(karanji);
            }
        });

        fantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Park.class);
                startActivity(karanji);
            }
        });

        muvsiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Muvsiam.class);
                startActivity(karanji);
            }
        });

        dam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(MainActivity.this, Dam.class);
                startActivity(karanji);
            }
        });



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

    }

    public void goToMenu(View view) {
        Intent secondActivity = new Intent(MainActivity.this, Menu.class);
        startActivity(secondActivity);
    }
}
