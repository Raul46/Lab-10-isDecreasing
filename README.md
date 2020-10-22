# Lab 10 - isDecreasing

### Lab Goal: ###

This lab was designed to teach you more about processing arrays and algorithms.

### Lab Description: ###

Write a program that will go through an array to see if the numbers are decreasing. You must combine variables, ifs, and a loop to create a working method. There will always be at least one item in the array. Each prior number has to be greater than the following number for the array to be considered going down.

Sample Data | Sample Output
------------|--------------
[-99,1,2,3,4,5,6,7,8,9,10,12345] | false
[10,9,8,7,6,5,4,3,2,1,-99] | true
[10,20,30,40,50,-11818,40,30,20,10] | false
[32767] | true
[255,255] | false
[9,10,-88,100,-555,1000] | false
[10,10,10,11,456] | false
[-111,1,2,3,9,11,20,30] | false
[9,8,7,6,5,4,3,2,0,-2,-989] | true
[12,15,18,21,23,1000] | false
[250,19,17,15,13,11,10,9,6,3,2,1,-455] | true
[9,10,-8,10000,-5000,1000] | false