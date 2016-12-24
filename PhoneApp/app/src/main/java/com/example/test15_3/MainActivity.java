package com.example.test15_3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    final String db_NAME="HotlineDB";
    final String tb_NAME="hotlist";
    final int MAX=8;
    final String[] FROM=new String[]{"name","phine","email"};
    SQLiteDatabase db;
    Cursor cur;
    SimpleCursorAdapter adapter;
    EditText etName,etPhone,etEmail;
    Button btInsert,btUpdate,btDelete;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=(EditText)findViewById(R.id.etName);
        etPhone=(EditText)findViewById(R.id.etPhone);
        etEmail=(EditText)findViewById(R.id.etEmail);
        btInsert=(Button)findViewById(R.id.btInsert);
        btUpdate=(Button)findViewById(R.id.btUpdate);
        btDelete=(Button)findViewById(R.id.btDelete);

        db=openOrCreateDatabase(db_NAME, Context.MODE_PRIVATE,null);
        String createTable="CREATE TABLE IF NOT EXISTS "+tb_NAME+"(_id INTEGER PRIMARY KEY AUTOINCREMENY, "+
                "name VARCHAR(32), "+"phone VARCHAR(16)"+"email VARCHAR(64))";
        db.execSQL(createTable);
        cur=db.rawQuery("SELECT * FROM "+tb_NAME,null);

//        if(cur.getCount()==0){
//            addData("我是標題","02-22222222","d679787@gmail.com");
//            addData("我","02-28989222","d6735677@gmail.com");
//
//        }
//        adapter=new SimpleCursorAdapter(this,R.layout.item,cur,FROM,new int[]{R.id.name,R.id.phone,R.id.email},0);
//        lv=(ListView)findViewById(R.id.lv);
//        lv.setAdapter(adapter);
//        lv.setOnItemClickListener(this);
//        requery();


    }

    private void requery() {
    }

    private void addData(String 我是標題, String s, String s1) {
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
