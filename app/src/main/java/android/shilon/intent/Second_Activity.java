package android.shilon.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Activity extends AppCompatActivity {
    private Button button2;
    private String string="(ˉ▽￣～) 切~~";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("data",string);
                //存储需要回传的数据
                setResult(2,intent);
                //回传数据，参数表示(被请求访问界面即被动方的int型标志,Intent对象)
                finish();
                //结束当前页面的进程
            }
        });
    }
}
