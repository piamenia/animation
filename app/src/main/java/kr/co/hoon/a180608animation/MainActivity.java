package kr.co.hoon.a180608animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable ani;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //이미지 뷰 찾기
        ImageView imageView = (ImageView)findViewById(R.id.imgView);
        //이미지 뷰의 배경 찾기
        ani = (AnimationDrawable)imageView.getBackground();
        //애니메이션 시작
        imageView.post(new Runnable() {
            @Override
            public void run() {
                ani.start();
            }
        });

        //시작 버튼의 이벤트 핸들러 작성
        Button anistart = (Button)findViewById(R.id.anistart);
        anistart.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                ani.start();
            }
        });

        //종료 버튼의 이벤트 핸들러 작성
        Button anistop = (Button)findViewById(R.id.anistop);
        anistop.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                ani.stop();
            }
        });
    }
}
