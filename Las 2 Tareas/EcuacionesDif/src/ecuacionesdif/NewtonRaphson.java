/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionesdif;

/**
 *
 * @author edgar
 */
public class NewtonRaphson {
    public double raiz(IFuncion f, IFuncion df, double x, double e, int n)
    {
        double r = Double.NaN;
        int k = 0;
        while (Math.abs(f.eval(x))>e&&k<n)
        {
            x = x-f.eval(x)/df.eval(x);
            k++;
        }
        if(k<n)r=x;
        return r;
    }
    
}
