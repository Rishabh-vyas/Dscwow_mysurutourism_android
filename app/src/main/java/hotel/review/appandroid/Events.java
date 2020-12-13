package hotel.review.appandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Events extends AppCompatActivity {

    CardView Dashra,yoga;
    Animation anim_from_button, anim_from_top, anim_from_left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        yoga=findViewById(R.id.yoga);
        Dashra=findViewById(R.id.Dashra);

        anim_from_button = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);
        anim_from_top = AnimationUtils.loadAnimation(this, R.anim.anim_from_top);
        anim_from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);

        yoga.setAnimation(anim_from_button);
        Dashra.setAnimation(anim_from_button);

        Dashra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Events.this, Dashra.class);
                startActivity(karanji);
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karanji = new Intent(Events.this, Yoga.class);
                startActivity(karanji);
            }
        });
    }
}