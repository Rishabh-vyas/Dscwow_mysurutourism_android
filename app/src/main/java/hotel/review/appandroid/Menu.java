package hotel.review.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> arrayList=new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView=findViewById(R.id.listView);
        arrayList.add("Place");
        arrayList.add("Events");
        arrayList.add("COVID Notification");

        arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
//                Toast.makeText(Menu.this,"names"+ i,Toast.LENGTH_SHORT).show();
                if (i==0)
                {
                    Intent intent=new Intent(Menu.this,Places.class);
                    startActivity(intent);
                }
                else if(i==1)
                {
                    Intent intent=new Intent(Menu.this,Events.class);
                    startActivity(intent);
                }
                else if(i==2)
                {
                    Intent intent=new Intent(Menu.this,COVID.class);
                    startActivity(intent);
                }
            }
        });
    }
}