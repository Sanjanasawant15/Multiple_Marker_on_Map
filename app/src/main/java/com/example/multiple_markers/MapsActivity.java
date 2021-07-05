package com.example.multiple_markers;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng>arrayList=new ArrayList<LatLng>();
    LatLng Mumbai = new LatLng(19.087389, 72.872250);
    LatLng Pune = new LatLng(18.533955, 73.855244);
    LatLng Nashik = new LatLng(20.016072, 73.793173);
    LatLng Sindhudurg = new LatLng(16.080842, 73.467187);
    LatLng Nagpur = new LatLng(21.157186, 79.086235);
    LatLng Ratanagiri = new LatLng(17.009010, 73.269503);
    LatLng Raigad = new LatLng(18.234961, 73.446519);
    LatLng Nanded = new LatLng(19.142062, 77.318599);
    LatLng Chandrapur = new LatLng(19.961562373689613, 79.2933919969412);
    LatLng Ahmadnagar = new LatLng(19.100901224641134, 74.75125437196414);
    ArrayList<String> title=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(Mumbai);
        arrayList.add(Pune);
        arrayList.add(Nashik);
        arrayList.add(Sindhudurg);
        arrayList.add(Nagpur);
        arrayList.add(Ratanagiri);
        arrayList.add(Raigad);
        arrayList.add(Nanded);
        arrayList.add(Chandrapur);
        arrayList.add(Ahmadnagar);

        title.add("Mumbai");
        title.add("Pune");
        title.add("Nashik");
        title.add("Sindhudurg");
        title.add("Nagpur");
        title.add("Ratanagiri");
        title.add("Raigad");
        title.add("Nanded");
        title.add("Chandrapur");
        title.add("Ahmadnagar");
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

       for (int i = 0;i<arrayList.size();i++){
           for (int j=0;j<title.size();j++){
               mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title(String.valueOf(title.get(j))));
           }
           mMap.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));

       }
    }
}