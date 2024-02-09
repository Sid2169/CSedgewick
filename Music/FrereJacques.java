public class FrereJacques
{
    public static void main(String[] args)
    {
        // Define the frequencies for the notes A, B, and C# in Hz
        double A = 440.0; // Frequency of note A
        double B = A * Math.pow(2.0, 2.0/12.0); // Frequency of note B
        double Csharp = A * Math.pow(2.0, 4.0/12.0); // Frequency of note C#

        // Define the duration for each note in seconds
        double duration = 0.5;

        // Play the tune "Frère Jacques"
        FrereJacques(A, duration);
        FrereJacques(B, duration);
        FrereJacques(Csharp, duration);
        FrereJacques(A, duration);

        // Repeat the pattern
        FrereJacques(A, duration);
        FrereJacques(B, duration);
        FrereJacques(Csharp, duration);
        FrereJacques(A, duration);
    }

    // Method to play a note of a given frequency for a given duration
    public static void FrereJacques(double frequency, double duration) {
        double[] note = new double[(int) (StdAudio.SAMPLE_RATE * duration)];
        for (int i = 0; i < note.length; i++) {
            note[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
        }
        StdAudio.play(note);
    }
}