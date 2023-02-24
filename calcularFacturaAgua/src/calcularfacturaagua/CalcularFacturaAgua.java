package calcularfacturaagua;

import javax.swing.JOptionPane;

public class CalcularFacturaAgua
{
    public static int leerInt(String mensaje)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static void imprimirMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int calcularSubsidio(int estrato)
    {
        int subsidio;
        
        switch (estrato)
        {
            case 1: subsidio = 10000;
                    break;
            
            case 2: subsidio = 10000;
                    break;
                    
            case 3: subsidio = 7000;
                    break;
                    
            case 4: subsidio = 5000;
                    break;
                    
            case 5: subsidio = 0;
                    break;
                    
            case 6: subsidio = 0;
                    break;
                    
            default:subsidio = 0;
                    imprimirMensaje("El estrato ingresado no existe");
                    break;
        }
        return subsidio;
    }
    
    public static int calcularFactura(int estrato, int m3, int subsidio)
    {
        int total;
        
        switch(estrato)
        {
            case 1: total = (m3 * 3000)- subsidio;
                    break;
                    
            case 2: total = (m3 * 3500)- subsidio;
                    break;
                    
            case 3: total = (m3 * 3800)- subsidio;
                    break;
                    
            case 4: total = (m3 * 4100)- subsidio;
                    break;
                    
            case 5: total = (m3 * 4500)- subsidio;
                    break; 
                    
            case 6: total = (m3 * 5799)- subsidio;
                    break;
                    
            default:total=0;
                    break;
        }
        return total;
    }
    
    public static void main(String[] args)
    {
        int s, m3, e, f;
        
        e=leerInt("Ingrese el estrato: ");
        m3=leerInt("Ingrese la cantidad de metros cúbicos de agua consumidos: ");
        
        s=calcularSubsidio(e);
        f=calcularFactura(e, m3, s);
        
        imprimirMensaje("El valor de la factura del agua es: "+f);
    }  
}