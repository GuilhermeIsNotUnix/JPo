import java.util.Scanner;
import java.util.Random;

public class main
{
    public static Scanner jout = new Scanner(System.in);
    public static int resp;
    
    public static void line()
    {
        System.out.println("\n==================================================\n");
    }
    
    //Metodo que indica a espera da entrada do usuario
    public static void signal()
    {
	   System.out.print("\n-> ");
    }
	
    //Metodo onde o Bot gera sua escolha
    public static void duel()
    {
        Random ran = new Random();
        int bot = ran.nextInt(2) + 1;
            
        if(resp == bot)
        {
            if(resp == 1)
            {
                System.out.println("Voce jogou: Pedra");
            }
            
            if(resp == 2)
            {
                System.out.println("Voce jogou: Papel");
            }
            
            if(resp == 3)
            {
                System.out.println("Voce jogou: Tesoura");
            }
            
            if(bot == 1)
            {
                System.out.println("Bot jogou: Pedra");
            }
            
            if(bot == 2)
            {
                System.out.println("Bot jogou: Papel");
            }
            
            if(bot == 3)
            {
                System.out.println("Bot jogou: Tesoura");
            }
            
            //System.out.println("Bot jogou: Pedra");
            System.out.println("Empate");
        }
		
        else
        {
            if(resp == 1 && bot == 2)
            {
                System.out.println("Voce jogou: Pedra");
                System.out.println("Bot jogou: Papel");
                System.out.println("Voce perdeu");
            }

            if(resp == 1 && bot == 3)
            {
                System.out.println("Voce jogou: Pedra");
                System.out.println("Bot jogou: Tesoura");
                System.out.println("Voce ganhou");	
            }

            else
            {
                if(resp == 2 && bot == 1)
                {
                    System.out.println("Voce jogou: Papel");
                    System.out.println("Bot jogou: Pedra");
                    System.out.println("Voce ganhou");		
                }
                
                if(resp == 2 && bot == 3)
                {
                    System.out.println("Voce jogou: Papel");
                    System.out.println("Bot jogou: Tesoura");
                    System.out.println("Voce perdeu");
                }
                
                else
                {
                    if(resp == 3 && bot == 1)
                    {
                        System.out.println("Voce jogou: Tesoura");
                        System.out.println("Bot jogou: Pedra");
                        System.out.println("Voce perdeu");
                    }
                    
                    if(resp == 3 && bot == 2)
                    {
                        System.out.println("Voce jogou: Tesoura");
                        System.out.println("Bot jogou: Papel");
                        System.out.println("Voce ganhou");
                    }
                }
            }
        }
    }
    
    public static void titulo()
    {
        System.out.println("     ██╗ █████╗ ██╗   ██╗ █████╗ ███╗   ██╗██████╗  ██████╗"); 
        System.out.println("     ██║██╔══██╗██║   ██║██╔══██╗████╗  ██║██╔══██╗██╔═══██╗");
        System.out.println("     ██║███████║██║   ██║███████║██╔██╗ ██║██████╔╝██║   ██║");
        System.out.println("██   ██║██╔══██║╚██╗ ██╔╝██╔══██║██║╚██╗██║██╔═══╝ ██║   ██║");
        System.out.println("╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║██║ ╚████║██║     ╚██████╔╝");
        System.out.println(" ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝      ╚═════╝");
    }
    //Metodo onde o Menu principal se desenvolve
    public static void menu()
    {	
        titulo();
        System.out.println("[1] Pedra");
	    System.out.println("[2] Papel");
	    System.out.println("[3] Tesoura");
	    signal();
        resp = jout.nextInt();
	    line();
        
	    duel();
    }
	
    //Metodo principal
    public static void main (String args[])
    {
        menu();
    }
}

