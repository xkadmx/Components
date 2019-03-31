package com.example.components;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //createDialog();
        createCustomDialog();


    }
    public void createDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Niedzielny serwis dezinformacyjny:")
                .setMessage("Słowo na niedzielę")
                .setCancelable(false)
                .setPositiveButton("Tak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                }).setNegativeButton("Niekoniecznie", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Próbuj!",Toast.LENGTH_SHORT).show();


                    }
                }).show();
    }
    public void createCustomDialog(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_test);
        dialog.setTitle("Test");

        Button exit = (Button) dialog.findViewById(R.id.buttonExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    }

