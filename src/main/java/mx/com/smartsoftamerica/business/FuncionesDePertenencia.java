package mx.com.smartsoftamerica.business;

public class FuncionesDePertenencia {

    public double fmtrian(double x, double a, double b, double c)
    {
        double mu_x = Math.max( Math.min( ( (x - a)/(b - a) ), ( (c - x)/(c - b) ) ), 0 );
        return mu_x;
    }

    public double fmtrap(double x, double a, double b, double c, double d)
    {
        double mu_x = Math.max( Math.min( 1 , Math.min(( (x - a)/(b - a) ) , ( (d - x)/(d - c) ) )) , 0 );
        return mu_x;
    }

    public double fmgauss(double x, double m, double k)
    {
        double mu_x = Math.exp( -( (Math.pow(x - m, 2))/(2 * Math.pow(k, 2)) ) );
        return mu_x;
    }

    public double fmcampanag(double x, double a, double b, double c)
    {
        double mu_x = 1 / ( 1 + Math.pow( ( (x - c) / (a)) , 2 * b ) );
        return mu_x;
    }
    
}
