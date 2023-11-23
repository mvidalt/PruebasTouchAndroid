package com.example.pruebastouch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureDetector = new GestureDetector(this, this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            Log.d("log","me han pulsado");
        }
            return gestureDetector.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        // No hacemos nada aquí
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        // No hacemos nada aquí
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        // No hacemos nada aquí
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.d("log","me han pulsado mucho");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        // Se llama cuando se detecta un gesto de fling
        if (Math.abs(velocityX) > Math.abs(velocityY)) {
            // Fling horizontal
            if (velocityX > 0) {
                // Fling hacia la derecha
                Log.d("Gesto", "Fling hacia la derecha");
            } else {
                // Fling hacia la izquierda
                Log.d("Gesto", "Fling hacia la izquierda");
            }
        } else {
            // Fling vertical
            if (velocityY > 0) {
                // Fling hacia abajo
                Log.d("Gesto", "Fling hacia abajo");
            } else {
                // Fling hacia arriba
                Log.d("Gesto", "Fling hacia arriba");
            }
        }
        return true;
    }
}
