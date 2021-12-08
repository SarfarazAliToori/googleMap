package com.example.navigationdrawerandmap.ui.map

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawerandmap.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val sydney = LatLng(-34.0, 151.0)
        googleMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))


        val pakistan = LatLng(30.542450726741276, 68.76353834440107)
        googleMap.addMarker(MarkerOptions().position(pakistan).title("Marker in Pakistan"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(pakistan))

        val Afghanistan = LatLng(34.46948479803741, 64.98424182509005)
        googleMap.addMarker(MarkerOptions().position(Afghanistan).title("Marker in Afghanistan"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(Afghanistan))

        val india = LatLng(23.7525653581922, 79.36087355735188)
        googleMap.addMarker(MarkerOptions().position(india).title("india"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(india))

        val china = LatLng(37.100565381745064, 102.53840952286913)
        googleMap.addMarker(MarkerOptions().position(china).title("China"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(china))


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}