package mx.com.smartsoftamerica.business;

public class ConjuntosDifusos {
    
    public double TnormMin(double x, double y)
    {
        double tnormM = Math.min(x, y);
        return tnormM;
    }
    public double TnormProd(double x, double y)
    {
        double tnormP = x * y;
        return tnormP;
    }
    public double TnormLukasiewicz(double x, double y)
    {
        double tnormLukasiewicz = Math.max( (x + y) - 1, 0 );
        return tnormLukasiewicz;
    }
    public double TnormDrastic(double x, double y)
    {
        double tnormDrastic = x == 1 ? y : y == 1 ? x : 0;
        return tnormDrastic;
    }
}
