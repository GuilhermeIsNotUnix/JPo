package jpo;

import java.util.Random;
import javax.swing.JOptionPane;

public class JPo
{
    public static Random random = new Random();
    public static final int PEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TESOURA = 3;
    public static final int DERROTA = 0;
    public static final int VITORIA = 1;
    public static final int EMPATE = 2;
    
    public static int jogadausuario = 0;
    public static int jogadabot;
    public static int status;
    public static int pontosbot = 0, pontosjogador = 0;
    
    public static void titulo()
    {
        float versao;
        
        versao = 2.1f;
        JOptionPane.showMessageDialog(null, "JPo (JavaPo)\nVersão: " +versao +"\n\n" +"© 2019 GuilhermeIsNotUnix\n" +"https://github.com/GuilhermeIsNotUnix/JPo");
    }
    
    //Metodo onde o Menu principal se desenvolve
    public static void menu()
    {
        boolean erro;        
        
        do
        {
            erro = false;
            
            try
            {
                jogadausuario = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Pedra\n[2] Papel\n[3] Tesoura\n[0] Sair\nVOCE " +pontosjogador +" VS BOT " +pontosbot));
                jogadabot = gerarJogadaBot();
                duelar();
            }

            catch(Exception e)
            {
                erro = true;
                JOptionPane.showMessageDialog(null, "Erro: Entrada invalida, digite um numero inteiro");
            }
        } while(JOptionPane.showConfirmDialog(null, "Deseja continuar?") == JOptionPane.YES_OPTION || erro == true);
    }
    
    public static int gerarJogadaBot()
    {
        int jogadabot = random.nextInt(3) + 1;
        return jogadabot;
    }
    
    public static int duelar()
    {
        
        if(jogadausuario == jogadabot)
        {
            if(jogadausuario == PEDRA)
                JOptionPane.showMessageDialog(null, "Jogador jogou Pedra\nBot jogou Pedra\nEMPATE");
            if(jogadausuario == PAPEL)
                JOptionPane.showMessageDialog(null, "Jogador jogou Papel\nBot jogou Papel\nEMPATE");
            if(jogadausuario == TESOURA)
                JOptionPane.showMessageDialog(null, "Jogador jogou Tesoura\nBot jogou Tesoura\nEMPATE");
            
            status = EMPATE;
            return EMPATE;
        }
        
        else
        {
            if(jogadausuario == PEDRA && jogadabot == PAPEL)
            {
                JOptionPane.showMessageDialog(null, "Jogador jogou Pedra\nBot jogou Papel\nVocê perdeu :(");
                status = DERROTA;
                pontosbot++;
                return DERROTA;
            }
            
            if(jogadausuario == PEDRA && jogadabot == TESOURA)
            {
                JOptionPane.showMessageDialog(null, "Jogador jogou Pedra\nBot jogou Tesoura\nVocê ganhou :)");
                status = VITORIA;
                pontosjogador++;
                return VITORIA;
            }
            
            if(jogadausuario == PAPEL && jogadabot == PEDRA)
            {
                JOptionPane.showMessageDialog(null, "Jogador jogou Papel\nBot jogou Pedra\nVocê ganhou :)");
                pontosjogador++;
                status = VITORIA;
                return VITORIA;
            }
            
            if(jogadausuario == PAPEL && jogadabot == TESOURA)
            {
                JOptionPane.showMessageDialog(null, "Jogador jogou Papel\nBot jogou Tesoura\nVocê perdeu :(");
                status = DERROTA;
                pontosbot++;
                return DERROTA;
            }
            
            if(jogadausuario == TESOURA && jogadabot == PAPEL)
            {
                JOptionPane.showMessageDialog(null, "Jogador jogou Tesoura\nBot jogou Papel\nVocê ganhou :)");
                status = VITORIA;
                pontosjogador++;
                return VITORIA;
            }
            
            if(jogadausuario == TESOURA && jogadabot == PEDRA)
            {
                JOptionPane.showMessageDialog(null, "Jogador jogou Tesoura\nBot jogou Pedra\nVocê perdeu :(");
                status = DERROTA;
                pontosbot++;
                return DERROTA;
            }
        }
        
        return status;
    }
}
