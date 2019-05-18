package android.shilon.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class First_Activity extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(First_Activity.this,Third_Activity.class);
                startActivity(intent);
                //无结果的页面跳转
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(First_Activity.this,Second_Activity.class);
                startActivityForResult(intent,1);
                //有结果的跳转
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent intent) {
        super.onActivityResult(requestCode,resultCode,intent);
        if (requestCode==1&&resultCode==2) {
            String string=intent.getStringExtra("data");
            Toast.makeText(First_Activity.this,string,Toast.LENGTH_SHORT).show();
            //将一些简短的信息通知给用户
        }
    }
    //接收回传数据，
    // 参数表示（请求访问界面即主动方的int型标志，被请求访问界面即被动方的int型标志，Intent对象）
}
