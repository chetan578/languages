package com.example.chetan578.sampleproject;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;


    public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer1,mPlayer2,mPlayer3,mPlayer4,mPlayer5,mPlayer6,mPlayer7,mPlayer8;

        public void clickedButton1(View view ) {

            mPlayer1.start();
        }
        public void clickedButton2(View view ) {

            mPlayer2.start();
    }
        public void clickedButton3(View view ) {

            mPlayer3.start();
    }
        public void clickedButton4(View view ) {

            mPlayer4.start();
    }
        public void clickedButton5(View view ) {

            mPlayer5.start();
    }
        public void clickedButton6(View view ) {

            mPlayer6.start();
    }
        public void clickedButton7(View view ) {

            mPlayer7.start();
    }
        public void clickedButton8(View view ) {

            mPlayer8.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer1= MediaPlayer.create(this,R.raw.english);
        mPlayer2=MediaPlayer.create(this,R.raw.hindi);
        mPlayer3=MediaPlayer.create(this,R.raw.french);
        mPlayer4=MediaPlayer.create(this,R.raw.german);
        mPlayer5=MediaPlayer.create(this,R.raw.japanese);
        mPlayer6= MediaPlayer.create(this,R.raw.russian);
        mPlayer7=MediaPlayer.create(this,R.raw.italian);
        mPlayer8=MediaPlayer.create(this,R.raw.chinese);


    }
}
