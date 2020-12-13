package hotel.review.appandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Places extends AppCompatActivity {

    CardView Mysuru, karanji, chamundaTempale,infosysCampus,ph,zoo,gardan,somnathpur,fantasy,dam,muvsiam;
    Animation anim_from_button, anim_from_top, anim_from_left;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);


        Mysuru = findViewById(R.id.Mysuru);
        karanji = findViewById(R.id.karanji);
        chamundaTempale = findViewById(R.id.chamundaView);
        infosysCampus=findViewById(R.id.infosysCampus);
        ph=findViewById(R.id.ph);
        zoo=findViewById(R.id.zoo);
        gardan=findViewById(R.id.gardan);
        somnathpur=findViewById(R.id.somnathpur);
        fantasy=findViewById(R.id.fantasy);
        dam=findViewById(R.id.dam);
        muvsiam=findViewById(R.id.muvsiam);

        anim_from_button = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);
        anim_from_top = AnimationUtils.loadAnimation(this, R.anim.anim_from_top);
        anim_from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);

        Mysuru.setAnimation(anim_from_button);
        karanji.setAnimation(anim_from_button);
        chamundaTempale.setAnimation(anim_from_button);
        infosysCampus.setAnimation(anim_from_button);
        ph.setAnimation(anim_from_button);
        gardan.setAnimation(anim_from_button);
        somnathpur.setAnimation(anim_from_button);
        fantasy.setAnimation(anim_from_button);
        zoo.setAnimation(anim_from_button);
        muvsiam.setAnimation(anim_from_button);
        dam.setAnimation(anim_from_button);

        Mysuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(Places.this, MysuruPalace.class);
                startActivity(secondActivity);
            }
        });

        karanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, KaranjiLake.class);
                startActivity(karanji);
            }
        });

        chamundaTempale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Chamunda.class);
                startActivity(karanji);
            }
        });

        infosysCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Infosys.class);
                startActivity(karanji);
            }
        });

        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Philomenas.class);
                startActivity(karanji);
            }
        });



        zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Zoo.class);
                startActivity(karanji);
            }
        });

        gardan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Garden.class);
                startActivity(karanji);
            }
        });



        somnathpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Somnathpur.class);
                startActivity(karanji);
            }
        });

        fantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Park.class);
                startActivity(karanji);
            }
        });

        muvsiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Muvsiam.class);
                startActivity(karanji);
            }
        });

        dam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Places.this, Dam.class);
                startActivity(karanji);
            }
        });


    }
}