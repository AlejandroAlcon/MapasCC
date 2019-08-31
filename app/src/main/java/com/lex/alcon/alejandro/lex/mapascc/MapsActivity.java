package com.lex.alcon.alejandro.lex.mapascc;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        final LatLng position = new LatLng(-16.503789, -68.120793);//-16.496209, -68.137129

        final LatLng position2 = new LatLng(-16.488361, -68.118889);

        mMap.addMarker(new MarkerOptions().position(position).title("Inicio"));
        mMap.addMarker(new MarkerOptions().position(position2).title("Final"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(position));




        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(position.latitude,position.longitude),14.0f));

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                mMap.clear();
                mMap.addMarker(new MarkerOptions().position(position).title("Inicio"));
                mMap.addMarker(new MarkerOptions().position(position2).title("Final"));
                PolylineOptions rectOptions=new PolylineOptions()
                        .add(new LatLng(-16.503789, -68.120793))
                        .add(new LatLng(-16.494627, -68.121275))
                        .add(new LatLng(-16.494514, -68.121173))
                        .add(new LatLng(-16.494329, -68.121152))
                        .add(new LatLng(-16.494175, -68.121324))
                        .add(new LatLng(-16.489782, -68.121453))
                        .add(new LatLng(-16.489761, -68.120863))
                        .add(new LatLng(-16.489658, -68.120670))
                        .add(new LatLng(-16.488403, -68.119747))
                        .add(new LatLng(-16.488454, -68.119050))
                        .add(new LatLng(-16.488361, -68.118889))
                        .color(Color.CYAN).geodesic(true);
                mMap.addPolyline(rectOptions);


            }
        });

        PolylineOptions rectOptions=new PolylineOptions()
                .add(new LatLng(-16.503789, -68.120793))
                .add(new LatLng(-16.494627, -68.121275))
                .add(new LatLng(-16.494514, -68.121173))
                .add(new LatLng(-16.494329, -68.121152))
                .add(new LatLng(-16.494175, -68.121324))
                .add(new LatLng(-16.489782, -68.121453))
                .add(new LatLng(-16.489761, -68.120863))
                .add(new LatLng(-16.489658, -68.120670))
                .add(new LatLng(-16.488403, -68.119747))
                .add(new LatLng(-16.488454, -68.119050))
                .add(new LatLng(-16.488361, -68.118889))
                .color(Color.RED).geodesic(true);
        mMap.addPolyline(rectOptions);


    }
}
