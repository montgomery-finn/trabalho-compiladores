package recovery;

import parser.*;

public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet mainRecovery = new RecoverySet();
    
    static public final RecoverySet declaracaoVariavel = new RecoverySet();

    static public final RecoverySet eraUmaVezRecovery = new RecoverySet();

    static public final RecoverySet blocoRecovery = new RecoverySet();

    
    static public final RecoverySet coisasDentroDoBlocoRecovery = new RecoverySet();    
    static public final RecoverySet tipoDeDadoEDecalaracaoDeVariaveisRecovery = coisasDentroDoBlocoRecovery;
    static public final RecoverySet condicionalRecovery = coisasDentroDoBlocoRecovery;
    static public final RecoverySet repeticaoEnquantoRecovery = coisasDentroDoBlocoRecovery;
    static public final RecoverySet repeticaoFacaEnquantoRecovery = coisasDentroDoBlocoRecovery;
    static public final RecoverySet leituraRecovery = coisasDentroDoBlocoRecovery; 
    static public final RecoverySet escritaRecovery = coisasDentroDoBlocoRecovery; 
    
    static public final RecoverySet expressaoLogicaRecovery = new RecoverySet();
    static public final RecoverySet continuaExpressaoLogicaRecovery = new RecoverySet();
    static public final RecoverySet operadorLogicoRecovery = new RecoverySet();

    static public final RecoverySet umaOuMaisvariaveisComOuSemAtribuicaoRecovery = new RecoverySet();
    static public final RecoverySet atribuicaoValorRecovery = new RecoverySet();    
    static public final RecoverySet declaracaoDeOutraVariavelRecovery = umaOuMaisvariaveisComOuSemAtribuicaoRecovery;   

    static public final RecoverySet operacaoMatematicaRecovery = new RecoverySet(); 
    static public final RecoverySet continuaOperacaoMatematicaRecovery = new RecoverySet();   
    static public final RecoverySet idOuDecimalRecovery = new RecoverySet();     
    static public final RecoverySet operadorMatematicoRecovery = new RecoverySet();   
    
  

    
    static {
    	mainRecovery.add(new Integer(CompiladorTrabalhoConstants.EOF));

    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.TIPOINTEIRO));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.TIPOBOOLEANO));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.TIPOCARACTER));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.SE));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.ENQUANTO));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.FACA));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.LEIA));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.ESCREVA));
    	eraUmaVezRecovery.add(new Integer(CompiladorTrabalhoConstants.EVIVERAMFELIZESPARASEMPRE));


    	blocoRecovery.add(new Integer(CompiladorTrabalhoConstants.EVIVERAMFELIZESPARASEMPRE));
    	blocoRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHACHAVES));

    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.TIPOINTEIRO));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.TIPOBOOLEANO));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.TIPOCARACTER));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.SE));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.ENQUANTO));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.FACA));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.LEIA));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.ESCREVA));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.EVIVERAMFELIZESPARASEMPRE));

    
    	

    	expressaoLogicaRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	
    	continuaExpressaoLogicaRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	continuaExpressaoLogicaRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));

    	
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.ID));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.CARACTER));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.DECIMAL));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.VERDADEIRO));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.FALSO));

    	umaOuMaisvariaveisComOuSemAtribuicaoRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));
    	
    	atribuicaoValorRecovery.add(new Integer(CompiladorTrabalhoConstants.VIRGULA));
    	atribuicaoValorRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));
    	
    	operacaoMatematicaRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	continuaOperacaoMatematicaRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));
    	

    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.SOMA));
    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.SUBTRACAO));
    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.MULTIPLICACAO));
    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.DIVISAO));

    	operadorMatematicoRecovery.add(new Integer(CompiladorTrabalhoConstants.ABREPARENTESES));
    	operadorMatematicoRecovery.add(new Integer(CompiladorTrabalhoConstants.ID));
    	operadorMatematicoRecovery.add(new Integer(CompiladorTrabalhoConstants.DECIMAL));
    	
    	
    }
}
