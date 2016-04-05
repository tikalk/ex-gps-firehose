# FleetTracker GPS Firehose

This micro service is is mocking the devices by sending raw-gps lines (HTTP or Socket), to the Device Manager.
It is based on SpringBoot platform

## How to build
_______________
From the project home folder run the following command:

./gradlew clean build -x test

This will create self contained zip, that you can unzip on host container.



## How to run
-----------
First thing you need to have is the input file that contain the GPS sample. You can download it from as follow:
 
https://drive.google.com/open?id=0B4Lvfo9HRfAcSHJWc2N0UjBnMVE

Next thing, you need to unzip it and put the files in /var/log/fleettracker/gps-files/. If you want to put it elsewhere, you wiil need to change the path on the config file.

Unzip the file as-gps-firehose/build/distributions/as-gps-firehose-1.0.0.tar.gz
cd to the created folder (as-gps-firehose-1.0.0)
Run the following command : 
./run-bin/gps-firehose.sh


## What to code
----------------
You should code which create a fireose of the MT-90 GPS device outputs into the system. 

The MT-90 record is as follows:
$$E142,<imei>,AAA,35,<Latitude>,<Longitude>,<readingTime>,A,3,17,<Speed>,<Heading>,7.1,22,100,200,310|260|7dc1|93c8,0000,0000|0000|0000|9d3|0,,*AA


Here is an example of it's record:
$$E142,3781,AAA,35,39.9604,116.37053,080202155756,A,3,17,53,267,7.1,22,100,200,310|260|7dc1|93c8,0000,0000|0000|0000|9d3|0,,*AA

The The important fields are as follows:

1. imei (field 1) - String, The unique field of the device
2. Latitude (field 4) - double
3. Longitude - (field 5)  - double
4. readingTime (field 6) - The time the GPS was read by the device. String with date-time formatted as yyMMddHHmmss
5. Speed (field 10) - integer, The speed of the vehicle
6. Heading (field 11) - integer (between 0 to 360) . The angle of the vehicle.




 

