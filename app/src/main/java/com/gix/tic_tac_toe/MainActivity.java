package com.gix.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9;
    TextView textView;
    private boolean turn;
    private boolean winOrNot;
    private int [][] cur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();

        turn = true;
        winOrNot = false;
        cur = new int[3][3];

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[0][0]!=0) {
                    return;
                }else if (turn) {
                    imageView1.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[0][0] = 1;
                } else {
                    imageView1.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[0][0] = 2;
                }
                check(1);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[0][1]!=0) {
                    return;
                }else if (turn) {
                    imageView2.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[0][1] = 1;
                } else {
                    imageView2.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[0][1] = 2;
                }
                check(2);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[0][2]!=0) {
                    return;
                }else if (turn) {
                    imageView3.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[0][2] = 1;
                } else {
                    imageView3.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[0][2] = 2;
                }
                check(3);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[1][0]!=0) {
                    return;
                }else if (turn) {
                    imageView4.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[1][0] = 1;
                } else {
                    imageView4.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[1][0] = 2;
                }
                check(4);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[1][1]!=0) {
                    return;
                }else if (turn) {
                    imageView5.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[1][1] = 1;
                } else {
                    imageView5.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[1][1] = 2;
                }
                check(5);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[1][2]!=0) {
                    return;
                }else if (turn) {
                    imageView6.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[1][2] = 1;
                } else {
                    imageView6.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[1][2] = 2;
                }
                check(6);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[2][0]!=0) {
                    return;
                }else if (turn) {
                    imageView7.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[2][0] = 1;
                } else {
                    imageView7.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[2][0] = 2;
                }
                check(7);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[2][1]!=0) {
                    return;
                }else if (turn) {
                    imageView8.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[2][1] = 1;
                } else {
                    imageView8.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[2][1] = 2;
                }
                check(8);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cur[2][2]!=0) {
                    return;
                }else if (turn) {
                    imageView9.setImageResource(R.drawable.x);
                    turn=!turn;
                    cur[2][2] = 1;
                } else {
                    imageView9.setImageResource(R.drawable.oo);
                    turn=!turn;
                    cur[2][2] = 2;
                }
                check(9);
                if (winOrNot == true) {
                    textView.setText("You win!");
                }else if (isFull()) {
                    textView.setText("No winner. Reset the game.");
                }

            }

        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }

        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reSetBoard();
            }

        });

    }

    public void check(int i) {
        int temp;
        switch(i) {
            case 1:
                // code block
                temp = cur[0][0];
                if ((temp == cur[0][1] && temp == cur[0][2])||(temp == cur[1][0] && temp == cur[2][0])||(temp == cur[1][1] && temp == cur[2][2])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 2:
                // code
                temp = cur[0][1];
                if ((temp == cur[0][0] && temp == cur[0][2])||(temp == cur[1][1] && temp == cur[2][1])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 3:
                // code block
                temp = cur[0][2];
                if ((temp == cur[0][1] && temp == cur[0][0])||(temp == cur[1][2] && temp == cur[2][2])||(temp == cur[1][1] && temp == cur[2][0])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 4:
                // code
                temp = cur[1][0];
                if ((temp == cur[0][0] && temp == cur[2][0])||(temp == cur[1][1] && temp == cur[1][2])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 5:
                // code block
                temp = cur[1][1];
                if ((temp == cur[0][1] && temp == cur[2][1])||(temp == cur[1][0] && temp == cur[1][2])||(temp == cur[0][0] && temp == cur[2][2])||(temp == cur[2][0] && temp == cur[0][2])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 6:
                // code
                temp = cur[1][2];
                if ((temp == cur[0][2] && temp == cur[2][2])||(temp == cur[1][1] && temp == cur[1][0])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 7:
                // code block
                temp = cur[2][0];
                if ((temp == cur[0][0] && temp == cur[1][0])||(temp == cur[2][1] && temp == cur[2][2])||(temp == cur[1][1] && temp == cur[0][2])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 8:
                // code
                temp = cur[2][1];
                if ((temp == cur[2][0] && temp == cur[2][2])||(temp == cur[1][1] && temp == cur[0][1])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            case 9:
                // code block
                temp = cur[2][2];
                if ((temp == cur[0][2] && temp == cur[1][2])||(temp == cur[2][0] && temp == cur[2][1])||(temp == cur[1][1] && temp == cur[0][0])) {
                    winOrNot = true;
                    stopUser();
                }
                break;
            default:
                // code block
                stopUser();

        }
    }

    public void stopUser() {
        for(int i=0; i < cur.length;i++) {
            for(int j=0; j<cur[0].length;j++) {
                cur[i][j] = 2;
            }
        }
    }
    public boolean isFull() {
        for(int i=0; i < cur.length;i++) {
            for(int j=0; j<cur[0].length;j++) {
                if (cur[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reSetBoard() {
        cur = new int [3][3];
        winOrNot = false;
        turn = true;
        textView.setText("Tic Tac Toe");
        imageView1.setImageDrawable(null);
        imageView2.setImageDrawable(null);
        imageView3.setImageDrawable(null);
        imageView4.setImageDrawable(null);
        imageView5.setImageDrawable(null);
        imageView6.setImageDrawable(null);
        imageView7.setImageDrawable(null);
        imageView8.setImageDrawable(null);
        imageView9.setImageDrawable(null);

    }
    public void setup() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);

        button1.getBackground().setAlpha(0);
        button2.getBackground().setAlpha(0);
        button3.getBackground().setAlpha(0);
        button4.getBackground().setAlpha(0);
        button5.getBackground().setAlpha(0);
        button6.getBackground().setAlpha(0);
        button7.getBackground().setAlpha(0);
        button8.getBackground().setAlpha(0);
        button9.getBackground().setAlpha(0);


        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);

        imageView1.setImageDrawable(null);
        imageView2.setImageDrawable(null);
        imageView3.setImageDrawable(null);
        imageView4.setImageDrawable(null);
        imageView5.setImageDrawable(null);
        imageView6.setImageDrawable(null);
        imageView7.setImageDrawable(null);
        imageView8.setImageDrawable(null);
        imageView9.setImageDrawable(null);

        textView = findViewById(R.id.textView);
    }


}
