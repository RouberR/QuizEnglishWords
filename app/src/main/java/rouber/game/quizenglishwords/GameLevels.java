package rouber.game.quizenglishwords;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button buttonBack = findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });

        //переход на первый уровень
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                Intent intent = new Intent(GameLevels.this, Level1.class);
                startActivity(intent); finish();
            }catch (Exception e){
                }
            }
        });
        //переход на 2 уровень
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level2.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });
        //переход на 3 уровень
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level3.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });
        //переход на 4 уровень
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level4.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });
        //переход на 5 уровень
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level5.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });
        //переход на 6 уровень
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level6.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });
        //переход на 7 уровень
        TextView textView7 = findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level7.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });
        //переход на 8 уровень
        TextView textView8 = findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level8.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 9 уровень
        TextView textView9 = findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level9.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 10 уровень
        TextView textView10 = findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level10.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 11 уровень
        TextView textView11 = findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level11.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 12 уровень
        TextView textView12 = findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level12.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 13 уровень
        TextView textView13 = findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level13.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 14 уровень
        TextView textView14 = findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level14.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 15 уровень
        TextView textView15 = findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level15.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 16 уровень
        TextView textView16 = findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level16.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 17 уровень
        TextView textView17 = findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level17.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 18 уровень
        TextView textView18 = findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level18.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 19 уровень
        TextView textView19 = findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level19.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });

        //переход на 20 уровень
        TextView textView20 = findViewById(R.id.textView20);
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(GameLevels.this, Level20.class);
                    startActivity(intent); finish();
                }catch (Exception e){
                }
            }
        });



    }
//Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent); finish();
        }catch (Exception e){

        }
    }

}
