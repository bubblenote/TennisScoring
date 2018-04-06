package com.example.android.tennisscoring;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int setNumber = 0;
    int setA = 0;
    int setB = 0;
    boolean jokeserve = true;
    boolean nadalserve = false;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void addOneGameForTeamA(View v){
        if (scoreTeamB == 6 && scoreTeamA <=4){
            setNumber +=1;
            setB += 1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setB ==2 && setA <= 1){
                toastyB();
            }
            if (setB ==3 && setA == 2){
                toastyB();
            }
            return;
        }

        if (scoreTeamB == 7 && scoreTeamA == 5){
            setNumber +=1;
            setB += 1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setB ==2 && setA <= 1){
                toastyB();
            }
            if (setB ==3 && setA == 2){
                toastyB();
            }
            return;
        }

        if (scoreTeamB == 7 && scoreTeamA == 6){
            setNumber +=1;
            setB += 1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setB ==2 && setA <= 1){
                toastyB();
            }
            if (setB ==3 && setA == 2){
                toastyB();
            }
            return;
        }

        if (scoreTeamA == 6 && scoreTeamB <=4){
            setNumber +=1;
            setA +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setA ==2 && setB <= 1){
                toastyA();
            }
            if (setA ==3 && setB == 2){
                toastyA();
            }
            return;
        }

        if (scoreTeamA == 7 && scoreTeamB == 5){
            setNumber +=1;
            setA +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setA ==2 && setB <= 1){
                toastyA();
            }
            if (setA ==3 && setB == 2){
                toastyA();
            }
            return;
        }

        if (scoreTeamA == 7 && scoreTeamB == 6){
            setNumber +=1;
            setA +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setA ==2 && setB <= 1){
                toastyA();
            }
            if (setA ==3 && setB == 2){
                toastyA();
            }
            return;
        }
        server();
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);


    }


    public void addOneGameForTeamB(View v){
        if (scoreTeamA == 6 && scoreTeamB <=4){
            setNumber +=1;
            setA +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setA ==2 && setB <= 1){
                toastyA();
            }
            if (setA ==3 && setB == 2){
                toastyA();
            }
            return;
        }

        if (scoreTeamA == 7 && scoreTeamB == 5){
            setNumber +=1;
            setA +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setA ==2 && setB <= 1){
                toastyA();
            }
            if (setA ==3 && setB == 2){
                toastyA();
            }
            return;
        }

        if (scoreTeamA == 7 && scoreTeamB == 6){
            setNumber +=1;
            setA +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setA ==2 && setB <= 1){
                toastyA();
            }
            if (setA ==3 && setB == 2){
                toastyA();
            }
            return;
        }

        if (scoreTeamB == 6 && scoreTeamA <=4){
            setNumber +=1;
            setB +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setB ==2 && setA <= 1){
                toastyB();
            }
            if (setB ==3 && setA == 2){
                toastyB();
            }
            return;
        }

        if (scoreTeamB == 7 && scoreTeamA == 5){
            setNumber +=1;
            setB +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setB ==2 && setA <= 1){
                toastyB();
            }
            if (setB ==3 && setA == 2){
                toastyB();
            }
            return;
        }

        if (scoreTeamB == 7 && scoreTeamA == 6){
            setNumber +=1;
            setB +=1;
            displayTeamASetScore(scoreTeamA);
            displayTeamBSetScore(scoreTeamB);
            resetScore();
            server();
            if (setB ==2 && setA <= 1){
                toastyB();
            }
            if (setB ==3 && setA == 2){
                toastyB();
            }
            return;
        }
        server();
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }


    public void displayTeamASetScore(int game){
        if (setNumber == 1){
            TextView setone = (TextView) findViewById(R.id.teamASet1Score);
            setone.setText("" + game);
        }

        if (setNumber == 2){
            TextView settwo = (TextView) findViewById(R.id.teamASet2Score);
            settwo.setText("" + game);
        }

        if (setNumber == 3){
            TextView setthree = (TextView) findViewById(R.id.teamASet3Score);
            setthree.setText("" + game);
        }


    }

    public void displayForTeamA(int number) {
        TextView countViewer = (TextView) findViewById(R.id.team_a_score);
        countViewer.setText("" + number);


    }

    public void displayTeamBSetScore(int game){
        if (setNumber == 1){
            TextView setone = (TextView) findViewById(R.id.teamBSet1Score);
            setone.setText("" + game);
        }

        if (setNumber == 2){
            TextView settwo = (TextView) findViewById(R.id.teamBSet2Score);
            settwo.setText("" + game);
        }

        if (setNumber == 3){
            TextView setthree = (TextView) findViewById(R.id.teamBSet3Score);
            setthree.setText("" + game);
        }


    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));


    }



    public void resetTeamA(View view){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }

    public void resetTeamB(View view){
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    public void resetGame(View v){
        jokeserve = true;
        nadalserve = false;
        TextView Nadal = (TextView)findViewById(R.id.nadalServe);
        TextView Joke = (TextView)findViewById(R.id.jokeServe);
        Nadal.setText("Nadal");
        Joke.setText("Joke");
        resetScore();
        setNumber = 0;
        setA = 0;
        setB = 0;
        jokeserve = true;
        nadalserve = false;
        TextView setAone = (TextView) findViewById(R.id.teamASet1Score);
        setAone.setText("" + 0);

        TextView setAtwo = (TextView) findViewById(R.id.teamASet2Score);
        setAtwo.setText("" + 0);

        TextView setAthree = (TextView) findViewById(R.id.teamASet3Score);
        setAthree.setText("" + 0);

        TextView setBone = (TextView) findViewById(R.id.teamBSet1Score);
        setBone.setText("" + 0);

        TextView setBtwo = (TextView) findViewById(R.id.teamBSet2Score);
        setBtwo.setText("" + 0);

        TextView setBthree = (TextView) findViewById(R.id.teamBSet3Score);
        setBthree.setText("" + 0);
    }

    public void toastyA(){
        Toast toast = Toast.makeText(getApplicationContext(),"Rafael Nadal WON!🎈",Toast.LENGTH_LONG);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        v.setTextColor(Color.WHITE);
        View happy = toast.getView();

        //To change the Background of Toast
        happy.setBackgroundColor(Color.BLACK);
        toast.show();
        return;
    }

    public void toastyB(){
        Toast toast = Toast.makeText(getApplicationContext(),"Novak Djokovic WON!🎉",Toast.LENGTH_LONG);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        v.setTextColor(Color.WHITE);
        View happy = toast.getView();

        //To change the Background of Toast
        happy.setBackgroundColor(Color.BLACK);
        toast.show();
        return;
    }

    public void server(){
        TextView Nadal = (TextView)findViewById(R.id.nadalServe);
        TextView Joke = (TextView)findViewById(R.id.jokeServe);
        if (jokeserve == true){
            jokeserve = false;
            nadalserve = true;
            Joke.setText(""+ "Not serving");
            Nadal.setText(""+ "Serving");
        }

        if (nadalserve == true){
            nadalserve = false;
            jokeserve = true;
            Nadal.setText(""+ "Not serving");
            Joke.setText(""+ "Serving");
        }




            /**if (Nadal.getText() == "🎾"){
            Nadal.setText("");
            Joke.setText("🎾");
        }
        else if (Nadal.getText()==""){
            Nadal.setText("🎾");
            Joke.setText("");

        }
             */
        Log.v("Main Activity", "test");
    }

}