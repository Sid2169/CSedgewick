/******************************************************************************
 *  Compilation:  javac BlackScholes.java
 *  Execution:    java BlackScholes s x r sigma t
 *  Dependencies: Gaussian.java
 *
 *  Reads in five command line inputs and calculates the option price
 *  according to the Black-Scholes formula.
 *
 *  % java BlackScholes 23.75 15.00 0.01 0.35 0.5
 *  8.879159279691955                                  (actual =  9.10)
 *
 *  % java BlackScholes 30.14 15.0 0.01 0.332 0.25
 *  15.177462481562186                                 (actual = 14.50)
 *
 *
 *  Information calculated based on closing data on Monday, June 9th 2003.
 *
 *      Microsoft:   share price:             23.75
 *                   strike price:            15.00
 *                   risk-free interest rate:  1%
 *                   volatility:              35%          (historical estimate)
 *                   time until expiration:    0.5 years
 *
 *       GE:         share price:             30.14
 *                   strike price:            15.00
 *                   risk-free interest rate   1%
 *                   volatility:              33.2%         (historical estimate)
 *                   time until expiration     0.25 years
 *
 *
 *  Reference:  http://www.hoadley.net/options/develtoolsvolcalc.htm
 *
 ******************************************************************************/

public class BlackScholes
{
    
}