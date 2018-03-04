package com.example.android.singlescreenapp;

        import android.Manifest;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.net.Uri;
        import android.support.v4.app.ActivityCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method calls the Activity to call Pizzeria Starita on the phone
    public void chiama(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+390815573682"));
        startActivity(intent);
    }

    // This method open the browser and Starita's website
    public void vaialsito(View v) {
        String url = "http://www.pizzeriestarita.it/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    // This method open google maps with Pizzeria Starita
    public void aprigooglemaps(View v) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=80136 Via+Materdei, 27/28, Starita, Napoli");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}