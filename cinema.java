package cinema;

import java.util.Scanner;
public class cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int AlphaA = 24;
        int AlphaB = 24;
        int AlphaC = 23;
        int AlphaD = 23;
        int AlphaE = 23;
        int AlphaF = 23;
        
        
        int AlphaTotal = AlphaA + AlphaB + AlphaC + AlphaD + AlphaE + AlphaF;
        
       
        int AlphaAPcD = 2;
        int AlphaBPcD = 2;
        int AlphaCPcD = 2;
        int AlphaDPcD = 2;
        int AlphaEPcD = 2;
        int AlphaFPcD = 2;
        
        
        int AlphaPcDTotal = AlphaAPcD + AlphaBPcD + AlphaCPcD + AlphaDPcD + AlphaEPcD + AlphaFPcD;

        
        int BetaA = 24;
        int BetaB = 24;
        int BetaC = 24;
        int BetaD = 24;
        int BetaE = 24;

       
        int BetaTotal = BetaA + BetaB + BetaC + BetaD + BetaE;

        
        int BetaAPcD = 2;
        int BetaBPcD = 1;
        int BetaCPcD = 1;
        int BetaDPcD = 1;
        int BetaEPcD = 1;

        
        int BetaPcDTotal = BetaAPcD + BetaBPcD + BetaCPcD + BetaDPcD + BetaEPcD ;

        int Qt_Ingresso, sala, assento, fileira;

        String nome;

        System.out.println("Oii, seja bem vindo! \nQual é o seu nome?");
        nome = sc.next();

        System.out.println("Seja bem vindo "+nome+", há apenas dois filmes em nosso catálogo nas salas Alpha e Beta! \n1. Alpha: As Branquelas \n2. Beta: A Chegada \nDigite o número do filme que deseja assistir: ");
        sala = sc.nextInt();

        
        if(sala == 1){
            System.out.println("Você escolheu a sala Alpha, nessa sala há: \n1. Assento padrão \n2. Assento para pessoas com Deficiência \nQual tipo de assento você deseja: ");
            assento = sc.nextInt();
           
            if (assento == 1){
                System.out.println("No assento padrão ainda há disponivel "+ AlphaTotal +" ingressos.\nNas fileiras: \n1. A: "+AlphaA+"\n2. B: "+AlphaB+"\n3. C: "+AlphaC+"\n4. D: "+AlphaD+"\n5. E: "+AlphaE+"\n6. F: "+AlphaF+"\nDigite o número da fileira escolhida:");
                fileira = sc.nextInt();

                System.out.println("Quantos ingressos deseja comprar?");
                Qt_Ingresso = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaA)){
                        AlphaA = AlphaA - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione a quantidade de ingressos entre 1 e "+AlphaA);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaB)){
                        AlphaB = AlphaB - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaB);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaC)){
                        AlphaC = AlphaC - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaC);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaD)){
                        AlphaD = AlphaD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaE)){
                        AlphaE = AlphaE - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaE);
                        sc.close();
                    }
                    break;

                    case 6:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaF)){
                        AlphaF = AlphaF - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaF);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Digite um número entre 1 e 6.");
                    break;
                }
            }
          
            else if (assento == 2){
                System.out.println("Foi escolhido o assento para pessoas com deficiência. Ainda há "+ AlphaPcDTotal +" ingressos.\nNas fileiras: \n1. A: "+AlphaAPcD+"\n2. B: "+AlphaBPcD+"\n3. C: "+AlphaCPcD+"\n4. D: "+AlphaDPcD+"\n5. E: "+AlphaEPcD+"\n6. F: "+AlphaFPcD+"\nDigite o número da fileira escolhida:");
                fileira = sc.nextInt();

                System.out.println("Quase lá, quantos ingressos você deseja?");
                Qt_Ingresso = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaAPcD)){
                        AlphaAPcD = AlphaAPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaAPcD);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaBPcD)){
                        AlphaBPcD = AlphaBPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaBPcD);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaCPcD)){
                        AlphaCPcD = AlphaCPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaCPcD);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaDPcD)){
                        AlphaDPcD = AlphaDPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaDPcD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaEPcD)){
                        AlphaEPcD = AlphaEPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaEPcD);
                        sc.close();
                    }
                    break;

                    case 6:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= AlphaFPcD)){
                        AlphaFPcD = AlphaFPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaFPcD);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Digite um número entre 1 e 6.");
                    break;
                }
            }
          
            else{
                System.out.print("Erro: Digite 1 ou 2");
            }
        }
       
        else if(sala == 2){
            System.out.println("Você escolheu a sala Beta, nessa sala há: \n1. Assento padrão \n2. Assento para pessoas com Deficiência \nQual tipo de assento você deseja: ");
            assento = sc.nextInt();

            
             if (assento == 1){
                System.out.println("No assento padrão ainda há disponivel "+BetaTotal+" ingressos.\nNas fileiras: \n1. A: "+BetaA+"\n2. B: "+BetaB+"\n3. C: "+BetaC+"\n4. D: "+BetaD+"\n5. E: "+BetaE+"\nDigite o número da fileira escolhida:");
                fileira = sc.nextInt();

                System.out.println("Quantos ingressos deseja comprar?");
                Qt_Ingresso = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso<= BetaA)){
                        BetaA = BetaA - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaA);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaB)){
                        BetaB = BetaB - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaB);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaC)){
                        BetaC = BetaC - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaC);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaD)){
                        BetaD = BetaD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaE)){
                        BetaE = BetaE - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaE);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Digite um número entre 1 e 5.");
                    break;
                }
             }
             //Assento PcD
             else if(assento == 2){
                System.out.println("Foi escolhido o assento para pessoas com deficiência. Ainda há "+ BetaPcDTotal+" ingressos.\nNas fileiras: \n1. A: "+BetaAPcD+"\n2. B: "+BetaBPcD+"\n3. C: "+BetaCPcD+"\n4. D: "+BetaDPcD+"\n5. E: "+BetaEPcD+"\nDigite o número da fileira escolhida: ");
                fileira = sc.nextInt();

                System.out.println("Quase lá, quantos ingressos você deseja?");
                Qt_Ingresso = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaAPcD)){
                        BetaAPcD = BetaAPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaAPcD);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaBPcD)){
                        BetaBPcD = BetaBPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaBPcD);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaCPcD)){
                        BetaCPcD = BetaCPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaCPcD);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaDPcD)){
                        BetaDPcD = BetaDPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaDPcD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((Qt_Ingresso > 0) && (Qt_Ingresso <= BetaEPcD)){
                        BetaEPcD = BetaEPcD - Qt_Ingresso;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso! E você ganhou um refrigerante e a pipoca grátis, aproveite o filme!!");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaEPcD);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Digite um número entre 1 e 5.");
                    break;
                }
             }
            
             else{
                 System.out.print("Erro: Digite 1 ou 2");
             }
        }
     
        else{
            System.out.print("Erro: Digite 1 ou 2.");
        }
    }
}
