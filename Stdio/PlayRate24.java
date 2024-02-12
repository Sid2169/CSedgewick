/*
1.5.24 Write a program that takes the name of a .wav file and a playback rate r as command-line arguments and plays the file at the given rate. First, use StdAudio.read() to read the file into an array a[]. If r = 1, play a[]; otherwise, create a new array b[] of approximate size r times the length of a[]. If r < 1, populate b[] by sampling from the original; if r > 1, populate b[] by interpolating from the original. Then play b[]
 */
