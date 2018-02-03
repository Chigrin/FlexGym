package com.example.android.flexgym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ChallengeActivity extends AppCompatActivity {
    int sergey_score = 0;
    int den_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
    }

    public void sergey_beer_button(View v) {
        if (sergey_score <= 2) {
            Toast.makeText(this, R.string.eat, Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Серёга! Алкоголь вреден для здоровья, ты же знаешь! -3 очка", Toast.LENGTH_SHORT).show();
        sergey_score = sergey_score - 3;
        displayForSergey(sergey_score);
    }

    public void sergey_club_button(View v) {
        if (sergey_score <= 1) {
            Toast.makeText(this, R.string.gym, Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Серёга! Ты снова всю ночь не спал и орал в караоке! -2 очка", Toast.LENGTH_SHORT).show();
        sergey_score = sergey_score - 2;
        displayForSergey(sergey_score);
    }

    public void sergey_chicken_button(View v) {
        if (sergey_score >= 7) {
            displayForSergey(sergey_score = 10);
        }
        else {
            Toast.makeText(this, "Курочка ням - ням! +3 очка", Toast.LENGTH_SHORT).show();
        sergey_score = sergey_score + 3;
        displayForSergey(sergey_score);
    }}

    public void sergey_fitness_button(View v) {
        if (sergey_score >= 8) {
            displayForSergey(sergey_score = 10);
        }

        else {
            Toast.makeText(this, "Серёга машина! Спорт сила! +2 очка", Toast.LENGTH_SHORT).show();
            sergey_score = sergey_score + 2;
            displayForSergey(sergey_score);
        }
    }

    public void sergey_sleep_button(View v) {
        if (sergey_score >= 9) {
            displayForSergey(sergey_score = 10);
        }
        else {
            Toast.makeText(this, "Во сне мышцы восстанавливаются! +1 очко", Toast.LENGTH_SHORT).show();
        sergey_score = sergey_score + 1;
        displayForSergey(sergey_score);
    }}

    public void sergey_love_button(View v) {
        if (sergey_score == 0) {
            Toast.makeText(this, R.string.sleep, Toast.LENGTH_SHORT).show();
            return;        }
        Toast.makeText(this, "Серёга! Ты всю ночь не спал, машина! Но мышцы не восстановились -1 очко", Toast.LENGTH_SHORT).show();
        sergey_score = sergey_score - 1;
        displayForSergey(sergey_score);
    }


//      Displays the given score for Sergey.

    public void displayForSergey(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sergey_score);
        scoreView.setText(String.valueOf(score));
        if (sergey_score >= 10) {
            startActivity(new Intent(ChallengeActivity.this, Main3Activity.class));
        }}


    public void den_beer_button(View v) {
        if (den_score <= 2) {
            Toast.makeText(this, R.string.eat, Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Дениск! Ты же не пьёшь! -3 очка", Toast.LENGTH_SHORT).show();
        den_score = den_score - 3;
        displayForDen(den_score);
    }

    public void den_club_button(View v) {
        if (den_score <= 1) {
            Toast.makeText(this, R.string.gym, Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Дениска клаббер! Редко но метко! -2 очка", Toast.LENGTH_SHORT).show();
        den_score = den_score - 2;
        displayForDen(den_score);
    }

    public void den_chiсken_button(View v) {
        if (den_score >= 7) {
            displayForDen(den_score = 10);
        }
        else {
            Toast.makeText(this, "Курочка ням - ням! +3 очка", Toast.LENGTH_SHORT).show();
        den_score = den_score + 3;
        displayForDen(den_score);
    }}

    public void den_fitness_button(View v) {
        if (den_score >= 8) {
            displayForDen(den_score = 10);
        }
        else {
            Toast.makeText(this, "Дениска машина! Спорт сила! +2 очка", Toast.LENGTH_SHORT).show();
        den_score = den_score + 2;
        displayForDen(den_score);
    }}


    public void den_sleep_button(View v) {
        if (den_score >= 9) {
            displayForDen(den_score = 10);
        }
        else {
            Toast.makeText(this, "Во сне мышцы восстанавливаются! +1 очко", Toast.LENGTH_SHORT).show();
        den_score = den_score + 1;
        displayForDen(den_score);
    }}


    public void den_love_button(View v) {
        if (den_score == 0) {
            Toast.makeText(this, R.string.sleep, Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Дениск! Ты женат, так что, если только с женой! Мышцы не восстановились -1 очко", Toast.LENGTH_SHORT).show();
        den_score = den_score - 1;
        displayForDen(den_score);

    }


    //      Displays the given score for Den.

    public void displayForDen(int score) {
        TextView scoreView = (TextView) findViewById(R.id.den_score);
        scoreView.setText(String.valueOf(score));
        if (den_score >= 10) {
            startActivity(new Intent(ChallengeActivity.this, Main2Activity.class));
        }


    }

    public void reset(View v) {
        sergey_score = 0;
        den_score = 0;
        displayForSergey(sergey_score);
        displayForDen(den_score);

    }
}






