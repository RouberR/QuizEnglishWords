package rouber.game.quizenglishwords;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Level1 extends AppCompatActivity {


    Dialog dialog;
    Dialog dialogEnd;

    public int numLeft;
    public int numRight;
    public int numTop;
    Array array = new Array();
    Random random = new Random(); // генерация
    public int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        TextView textLevels = findViewById(R.id.text_levels); // текст Уровень 1
        textLevels.setText(R.string.level_1);

        final ImageView img_left = findViewById(R.id.img_left);
        //округление углов
        img_left.setClipToOutline(true);
        final ImageView img_right = findViewById(R.id.img_right);
        img_right.setClipToOutline(true);

        final TextView textLeft = findViewById(R.id.text_left);
        final TextView textRight = findViewById(R.id.text_right);
        final TextView textTop = findViewById(R.id.text_game_Top);
        //развернуть на весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);



        //Вызов диалогового окна, в начале игры
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); //Скрыть заголовок
        dialog.setContentView(R.layout.previewdialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //Прозрачны
        //фон диалогового окна
        dialog.setCancelable(false); //окно нельзя закрыть кнопкой назад
        //Кнопка закрыть
        TextView buttonClose = dialog.findViewById(R.id.button_close);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
                dialog.dismiss(); // закрыть диалоговое окно
            }
        });
        //кнопка продолжить
        Button buttonContinue = dialog.findViewById(R.id.button_continue);
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


        dialog.show(); // показать диалоговое окно

        //_______________________________________


        //Вызов диалогового окна, в конце игры
        dialogEnd = new Dialog(this);
        dialogEnd.requestWindowFeature(Window.FEATURE_NO_TITLE); //Скрыть заголовок
        dialogEnd.setContentView(R.layout.dialogeng);
        dialogEnd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); //Прозрачны
        //фон диалогового окна
        dialogEnd.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT);
        dialogEnd.setCancelable(false); //окно нельзя закрыть кнопкой назад
        //Кнопка закрыть
        TextView buttonClose2 = dialogEnd.findViewById(R.id.button_close);
        buttonClose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
                dialogEnd.dismiss(); // закрыть диалоговое окно
            }
        });
        //кнопка продолжить
        Button buttonContinue2 = dialogEnd.findViewById(R.id.button_continue);
        buttonContinue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(Level1.this, Level2.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
                dialogEnd.dismiss();
            }
        });

        //_______________________________________



        //Кнопка назад
        Button buttonBack = findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });


        //Массив для прогресса игры
        final int[] progress = {
                R.id.point1,R.id.point2,R.id.point3,R.id.point4,
                R.id.point5,R.id.point6,R.id.point7,R.id.point8,
                R.id.point9,R.id.point10,R.id.point11,R.id.point12,
                R.id.point13,R.id.point14,R.id.point15,R.id.point16,
                R.id.point17,R.id.point18,R.id.point19,R.id.point20,

        };


        //подключаем анимацию
        final Animation a = AnimationUtils.loadAnimation(Level1.this, R.anim.alpha);


        numLeft = random.nextInt(15);
        img_left.setImageResource(array.images1[numLeft]); //Достаем картинку из массива
        textLeft.setText(array.rusPower1[numLeft]);

        numRight = random.nextInt(15);

        while(numLeft == numRight){
            numRight=random.nextInt(15);
        }
        img_right.setImageResource(array.images1[numRight]);
        textRight.setText(array.rusPower1[numRight]);

        numTop = random.nextInt(2);
       //0 - правая картинка     1- левая
        if (numTop == 0){
           textTop.setText(array.engPower1[numRight]);
        } else {
            textTop.setText(array.engPower1[numLeft]);
        }
                //обработка левой картинки
        img_left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                //Условие касания картинки
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    //Если коснулся картинки
                    img_right.setEnabled(false); //Блокировка правой картинки
                    if (numTop == 1){
                        img_left.setImageResource(R.drawable.truee); //Картинка tryee
                    } else {
                        img_left.setImageResource(R.drawable.falsee); //Картинка falsee
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    //Если отпутил палец
                    if (numTop == 1){
                        if(count<20){
                            count++;
                        }
                        //закраска прогресса игры в серый цвет
                        for(int i = 0; i <20; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }else{
                        if (count > 0){
                            if(count == 1){
                                count = 0;
                            } else{
                                count = count -2;
                            }
                        }
                        //закраска прогресса игры в серый цвет
                        for(int i = 0; i <19; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    }
                    if (count == 20){
                        //Выход из уровня!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        dialogEnd.show();
                    } else{
                        numLeft = random.nextInt(15);
                        img_left.setImageResource(array.images1[numLeft]); //Достаем картинку из массива
                        img_left.startAnimation(a);
                        textLeft.setText(array.rusPower1[numLeft]);

                        numRight = random.nextInt(15);

                        while(numLeft == numRight){
                            numRight=random.nextInt(15);
                        }
                        img_right.setImageResource(array.images1[numRight]);
                        img_right.startAnimation(a);
                        textRight.setText(array.rusPower1[numRight]);

                        numTop = random.nextInt(2);
                        //0 - правая картинка     1- левая
                        if (numTop == 0){
                            textTop.setText(array.engPower1[numRight]);
                        } else {
                            textTop.setText(array.engPower1[numLeft]);
                        }
                        img_right.setEnabled(true);
                    }
                }

                return true;
            }
        });
        //обработка левой картинки КОНЕЦ

//Обработка правой картинки
        img_right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {

                //Условие касания картинки
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    //Если коснулся картинки
                    img_left.setEnabled(false); //Блокировка левой картинки
                    if (numTop == 0){
                        img_right.setImageResource(R.drawable.truee); //Картинка tryee
                    } else {
                        img_right.setImageResource(R.drawable.falsee); //Картинка falsee
                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP){
                    //Если отпутил палец
                    if (numTop == 0){
                        if(count<20){
                            count++;
                        }
                        //закраска прогресса игры в серый цвет
                        for(int i = 0; i <20; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }
                    }else{
                        if (count > 0){
                            if(count == 1){
                                count = 0;
                            } else{
                                count = count -2;
                            }
                        }
                        //закраска прогресса игры в серый цвет
                        for(int i = 0; i <19; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points);
                        }

                        for(int i = 0; i < count; i++){
                            TextView tv = findViewById(progress[i]);
                            tv.setBackgroundResource(R.drawable.style_points_green);
                        }

                    }
                    if (count == 20){
                        //Выход из уровня!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                       dialogEnd.show();
                    } else{
                        numLeft = random.nextInt(15);
                        img_left.setImageResource(array.images1[numLeft]); //Достаем картинку из массива
                        img_left.startAnimation(a);
                        textLeft.setText(array.rusPower1[numLeft]);

                        numRight = random.nextInt(15);

                        while(numLeft == numRight){
                            numRight=random.nextInt(15);
                        }
                        img_right.setImageResource(array.images1[numRight]);
                        img_right.startAnimation(a);
                        textRight.setText(array.rusPower1[numRight]);

                        numTop = random.nextInt(2);
                        //0 - правая картинка     1- левая
                        if (numTop == 0){
                            textTop.setText(array.engPower1[numRight]);
                        } else {
                            textTop.setText(array.engPower1[numLeft]);
                        }
                        img_left.setEnabled(true);
                    }
                }

                return true;
            }
        });
    //Обработка правой картинки конец
    }
    //Системная кнопка
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Level1.this, GameLevels.class);
            startActivity(intent); finish();
        }catch (Exception e){

        }
    }
}