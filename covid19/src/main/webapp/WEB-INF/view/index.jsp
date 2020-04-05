<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
<head>
    <style>
        /* Set the size of the div element that contains the map */
        #map {
            height: 400px; /* The height is 400 pixels */
            width: 100%; /* The width is the width of the web page */
        }
    </style>
</head>
<body>
<h3>The monitor center</h3>
<!--The div element for the map -->
<div id="map"></div>
<script>
    var map;

    function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
            zoom: 2,
            center: new google.maps.LatLng(57.6958466, 11.9817633),
            mapTypeId: 'terrain'
        });

       /* var latLng1 = {lat: 57.6969678, lng: 11.9825582};
        var latLng2 = {lat: 57.6960678, lng: 11.9820582};

        let url_yellow = "http://maps.google.com/mapfiles/ms/icons/yellow-dot.png";
        let url_red = "http://maps.google.com/mapfiles/ms/icons/red-dot.png";*/

       /* var marker1 = new google.maps.Marker({
            position: latLng1,
            map: map,
            title: 'COVID-19',
            icon: {
                url: url_red
            }
        });

        var marker2 = new google.maps.Marker({
            position: latLng2,
            map: map,
            title: 'Flu',
            icon: {
                url: url_yellow
            }
        });

        var cityCircle1 = new google.maps.Circle({
            strokeColor: '#FF0000',
            strokeOpacity: 0.8,
            strokeWeight: 2,
            fillColor: '#ff0000',
            fillOpacity: 0.35,
            map: map,
            center: latLng1,
            radius: 100
        });

        var cityCircle2 = new google.maps.Circle({
            strokeColor: '#FFFF00',
            strokeOpacity: 0.8,
            strokeWeight: 2,
            fillColor: '#ffff00',
            fillOpacity: 0.35,
            map: map,
            center: latLng2,
            radius: 100
        });*/



        // Create a <script> tag and set the USGS URL as the source.
        var script = document.createElement('script');
        script.src = 'https://amgupta29.github.io/covid19-webconsole/docs/covid19_map_data.js';
        document.getElementsByTagName('head')[0].appendChild(script);


    }

    // Loop through the results array and place a marker for each
    // set of coordinates.
    window.eqfeed_callback = function (results) {
        for (var i = 0; i < results.operationResponse.length; i++) {
            //var coords = results.operationResponse[0].value.coordinates;
            var latLng = new google.maps.LatLng(results.operationResponse[i].value.latitude, results.operationResponse[i].value.longitude);
            var marker = new google.maps.Marker({
                position: latLng,
                map: map
            });

            // Construct the circle for each value in citymap.
            // Note: We scale the area of the circle based on the population.
            // Add the circle for this city to the map.
            var cityCircle = new google.maps.Circle({
                strokeColor: '#FF0000',
                strokeOpacity: 0.8,
                strokeWeight: 2,
                fillColor: '#ff0000',
                fillOpacity: 0.35,
                map: map,
                center: latLng,
                radius: 100
            });
        }
    }
</script>
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyClo3s7MejD7Fb1lIuwfwnnCqm_98BNIZc&callback=initMap">
</script>
</body>
</html>
