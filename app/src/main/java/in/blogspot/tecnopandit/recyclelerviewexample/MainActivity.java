package in.blogspot.tecnopandit.recyclelerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
String [] names={"India","China","Japan","Mongolia","USA","Sri lnka"};
String desc="A RecyclerView needs to have a layout manager and an adapter to be instantiated. A layout manager positions item views inside a RecyclerView and determines when to reuse item views that are no longer visible to the user.";
int img=R.drawable.ic_launcher_foreground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcv);
        MyAdapter myAdapter=new MyAdapter(this,names,desc,img);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}