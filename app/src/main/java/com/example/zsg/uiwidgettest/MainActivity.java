package com.example.zsg.uiwidgettest;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et;
    Button bt;
    ImageView iv;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        bt = (Button) findViewById(R.id.bt);
//        et = (EditText) findViewById(R.id.et);
//        iv = (ImageView) findViewById(R.id.iv);
//        pb = (ProgressBar) findViewById(R.id.pb);
//        bt.setOnClickListener(this);

        //隐藏系统自带的标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.hide();
    }


    @Override
    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.bt:
//                //String inputString = et.getText().toString();
//                //Toast.makeText(MainActivity.this, inputString, Toast.LENGTH_LONG).show();
//
//                //设置图片
//                //iv.setImageResource(R.mipmap.ic_launcher_round);
//
//                //进度条显示与隐藏
////                if (pb.getVisibility() == View.GONE)
////                    pb.setVisibility(View.VISIBLE);
////                else
////                    pb.setVisibility(View.GONE);
////                break;
//
//                //条形进度条
////                int progress = pb.getProgress();
////                progress += 10;
////                pb.setProgress(progress);
//
//                // 当前界面弹出对话框(有按钮的那种)
////                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
////                dialog.setTitle("this is a dialog");
////                dialog.setMessage("something important");
////                dialog.setCancelable(false);//是否可以取消
////                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialogInterface, int i) {
////                        String inputString = et.getText().toString();
////                        Toast.makeText(MainActivity.this, inputString, Toast.LENGTH_LONG).show();
////                    }
////                });
////                dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialogInterface, int i) {
////                        iv.setImageResource(R.mipmap.ic_launcher_round);
////                    }
////                });
////                dialog.show();
//
//                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
//                progressDialog.setTitle("This is a progressDialog");
//                progressDialog.setMessage("Loading...");
//                progressDialog.setCancelable(true);
//                progressDialog.show();
//                break;
//            default:
//                break;
//        }
    }
}
