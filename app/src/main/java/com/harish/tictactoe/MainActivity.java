package com.harish.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button bt[]=new Button[9];
    Button rst;
    TextView tvResult,tv;
    int click=0,g=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt[0]=findViewById(R.id.bt1);
        bt[1]=findViewById(R.id.bt2);
        bt[2]=findViewById(R.id.bt3);
        bt[3]=findViewById(R.id.bt4);
        bt[4]=findViewById(R.id.bt5);
        bt[5]=findViewById(R.id.bt6);
        bt[6]=findViewById(R.id.bt7);
        bt[7]=findViewById(R.id.bt8);
        bt[8]=findViewById(R.id.bt9);
        rst=findViewById(R.id.bt10);

        tvResult=findViewById(R.id.tvResult);
        tv=findViewById(R.id.tv);

        rst.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                click=0;
                g=0;
                for(int i=0;i<9;i++)
                {
                    bt[i].setText("");
                    bt[i].setClickable(true);
                }
                tvResult.setText("");
            }
        });
        bt[0].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[0].getText().toString()).equals("X")==false && (bt[0].getText().toString()).equals("O")==false && click%2==0)
                    bt[0].setText("X");
                else if(click<9 && (bt[0].getText().toString()).equals("X")==false && (bt[0].getText().toString()).equals("O")==false)
                    bt[0].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[1].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[1].getText().toString()).equals("X")==false && (bt[1].getText().toString()).equals("O")==false && click%2==0)
                    bt[1].setText("X");
                else if(click<9 && (bt[1].getText().toString()).equals("X")==false && (bt[1].getText().toString()).equals("O")==false)
                    bt[1].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this, "Invalid Position!", Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[2].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[2].getText().toString()).equals("X")==false && (bt[2].getText().toString()).equals("O")==false && click%2==0)
                    bt[2].setText("X");
                else if(click<9 && (bt[2].getText().toString()).equals("X")==false && (bt[2].getText().toString()).equals("O")==false)
                    bt[2].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[3].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[3].getText().toString()).equals("X")==false && (bt[3].getText().toString()).equals("O")==false && click%2==0)
                    bt[3].setText("X");
                else if(click<9 && (bt[3].getText().toString()).equals("X")==false && (bt[3].getText().toString()).equals("O")==false)
                    bt[3].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[4].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[4].getText().toString()).equals("X")==false && (bt[4].getText().toString()).equals("O")==false && click%2==0)
                    bt[4].setText("X");
                else if(click<9 && (bt[4].getText().toString()).equals("X")==false && (bt[4].getText().toString()).equals("O")==false)
                    bt[4].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[5].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[5].getText().toString()).equals("X")==false && (bt[5].getText().toString()).equals("O")==false && click%2==0)
                    bt[5].setText("X");
                else if(click<9 && (bt[5].getText().toString()).equals("X")==false && (bt[5].getText().toString()).equals("O")==false)
                    bt[5].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[6].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[6].getText().toString()).equals("X")==false && (bt[6].getText().toString()).equals("O")==false && click%2==0)
                    bt[6].setText("X");
                else if(click<9 && (bt[6].getText().toString()).equals("X")==false && (bt[6].getText().toString()).equals("O")==false)
                    bt[6].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[7].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[7].getText().toString()).equals("X")==false && (bt[7].getText().toString()).equals("O")==false && click%2==0)
                    bt[7].setText("X");
                else if(click<9 && (bt[7].getText().toString()).equals("X")==false && (bt[7].getText().toString()).equals("O")==false)
                    bt[7].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
        bt[8].setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(click<9 && (bt[8].getText().toString()).equals("X")==false && (bt[8].getText().toString()).equals("O")==false && click%2==0)
                    bt[8].setText("X");
                else if(click<9 && (bt[8].getText().toString()).equals("X")==false && (bt[8].getText().toString()).equals("O")==false)
                    bt[8].setText("O");
                else
                {
                    click--;
                    Toast.makeText(MainActivity.this,"Invalid Position!",Toast.LENGTH_SHORT).show();
                }
                check();
                click++;
            }
        });
    }

    public void check()
    {
        String s[][]=new String[3][3];
        String s1="",s2="",s3="",s4="";
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                s[i][j]=bt[k++].getText().toString();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                s1+=s[i][j];
                s2+=s[j][i];
                if(i==j)
                    s3+=s[i][j];
                if(i+j==2)
                    s4+=s[i][j];
            }
            checkWin(s1);
            s1="";
            checkWin(s2);
            s2="";
        }
        checkWin(s3);
        checkWin(s4);
        checkTie();
    }

    public void checkWin(String s)
    {
        if(s.equalsIgnoreCase("XXX")==true)
        {
            tvResult.setText("Player X Wins!");
            for(int i=0;i<9;i++)
                bt[i].setClickable(false);
        }
        else if(s.equalsIgnoreCase("OOO")==true)
        {
            tvResult.setText("Player O Wins!");
            for(int i=0;i<9;i++)
                bt[i].setClickable(false);
        }
    }

    public void checkTie()
    {
        g=0;
        for(int i=0;i<9;i++)
        {
            if(bt[i].getText().toString().equals("X") || bt[i].getText().toString().equals("O"))
                g+=1;
        }
        if(g==9)
        {
            tvResult.setText("Tie!");
            for(int i=0;i<9;i++)
                bt[i].setClickable(false);
        }
    }
}
