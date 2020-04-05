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

        // Create a <script> tag and set the USGS URL as the source.
        var script = document.createElement('script');
        // This example uses a local copy of the GeoJSON stored at
        // http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.geojsonp
        script.src = 'https://developers.google.com/maps/documentation/javascript/examples/json/earthquake_GeoJSONP.js';
        document.getElementsByTagName('head')[0].appendChild(script);


        /*var script = document.createElement('script');
        script.src = 'http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.geojsonp';
        document.getElementsByTagName('head')[0].appendChild(script);*/


        var latLng1 = {lat: 57.6969678, lng: 11.9825582};
        var latLng2 = {lat: 57.6960678, lng: 11.9820582};

        let url_yellow = "http://maps.google.com/mapfiles/ms/icons/yellow-dot.png";
        let url_red = "http://maps.google.com/mapfiles/ms/icons/red-dot.png";

       /* var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 4,
            center: myLatLng1
        });*/

        var marker1 = new google.maps.Marker({
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
        });
    }

    // Loop through the results array and place a marker for each
    // set of coordinates.
    /*window.eqfeed_callback = function (results) {
        for (var i = 0; i < results.features.length; i++) {
            var coords = results.features[i].geometry.coordinates;
            var latLng = new google.maps.LatLng(coords[1], coords[0]);
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
    }*/
</script>
<!--Load the API from the specified URL
* The async attribute allows the browser to render the page while the API loads
* The key parameter will contain your own API key (which is not needed for this tutorial)
* The callback parameter executes the initMap() function
-->
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyClo3s7MejD7Fb1lIuwfwnnCqm_98BNIZc&callback=initMap">
</script>
</body>
<%--<body>
	<div>
		<div>
			<h1>Monitor Center</h1>
			&lt;%&ndash;<h2>Hello ${message}</h2>
			
			Click on this <strong><a href="next">link</a></strong> to visit another page.

		</div>
	</div>&ndash;%&gt;
		&lt;%&ndash;<title>Google Map Hello World Example</title>&ndash;%&gt;
		<style type="text/css">
			div#map_container{
				width:100%;
				height:350px;
			}
		</style>
		<script type="text/javascript"
				src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>

		<script type="text/javascript">
			function loadMap() {
				var latlng = new google.maps.LatLng(4.3695030, 101.1224120);
				var myOptions = {
					zoom: 4,
					center: latlng,
					mapTypeId: google.maps.MapTypeId.ROADMAP
				};
				var map = new google.maps.Map(document.getElementById("map_container"),myOptions);

				var marker = new google.maps.Marker({
					position: latlng,
					map: map,
					title:"my hometown, Malim Nawar!"
				});

			}
		</script>

	<body onload="loadMap()">
	<div id="map_container"></div>
	</body>

</body>--%>
</html>
