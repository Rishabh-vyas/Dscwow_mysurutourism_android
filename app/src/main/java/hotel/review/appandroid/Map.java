package hotel.review.appandroid;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE | GoogleMap.MAP_TYPE_HYBRID);




        if (getIntent().getExtras() != null) {
            String tag=getIntent().getStringExtra("Tag");

            if(tag.equals("0"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Mysuru Palace"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("1"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Karanji Lake"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("2"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Shri Chamundeshwari Temple"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("3"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Infosys Campus "));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("4"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("St. Philomena's Cathedral "));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("6"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Mysuru Zoo"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("7"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Brindavan Gardens"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("8"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Somnathpur Tempale"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("9"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("GRS Fantasy Park"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("10"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title("Mysuru Dam"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }

            if(tag.equals("11"))
            {
                Double lat = getIntent().getDoubleExtra("V", 0.0);
                Double lon = getIntent().getDoubleExtra("V1", 0.0);

                Toast.makeText(this,tag.toString(),Toast.LENGTH_SHORT).show();
                LatLng palace = new LatLng(lat, lon);
                mMap.addMarker(new MarkerOptions().position(palace).title(" Museums Mysuru"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palace,15));
            }


        }


    }
}