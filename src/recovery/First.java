package recovery;

import parser.*;

public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet mainRecovery = new RecoverySet();
    static public final RecoverySet blocoRecovery = new RecoverySet();
    
    static public final RecoverySet coisasDentroDoBlocoRecovery = new RecoverySet();    
    static public final RecoverySet tipoDeDadoEDecalaracaoDeVariaveisRecovery = new RecoverySet();
    static public final RecoverySet condicionalRecovery =  new RecoverySet();
    static public final RecoverySet repeticaoEnquantoRecovery =  new RecoverySet();
    static public final RecoverySet repeticaoFacaEnquantoRecovery =  new RecoverySet();
    static public final RecoverySet leituraRecovery =  new RecoverySet();
    static public final RecoverySet escritaRecovery = new RecoverySet(); 
    static public final RecoverySet atribuicaoValorVariavelJaDeclaradaRecovery = new RecoverySet();

    static public final RecoverySet atribuicaoValorRecovery = new RecoverySet();    

    static public final RecoverySet umaOuMaisvariaveisComOuSemAtribuicaoRecovery = new RecoverySet();
    static public final RecoverySet declaracaoDeOutraVariavelRecovery = new RecoverySet();
    
    static public final RecoverySet operacaoMatematicaRecovery = new RecoverySet(); 
    static public final RecoverySet continuaOperacaoMatematicaRecovery = new RecoverySet();   

    static public final RecoverySet expressaoLogicaRecovery = new RecoverySet();
    static public final RecoverySet continuaExpressaoLogicaRecovery = new RecoverySet();
    static public final RecoverySet operadorLogicoRecovery = new RecoverySet();
    
    static public final RecoverySet operadorMatematicoRecovery = new RecoverySet();   

    static public final RecoverySet idOuDecimalRecovery = new RecoverySet(); 
    
    static public final RecoverySet tipoDadoRecovery = new RecoverySet();    
    static public final RecoverySet valorRecovery = new RecoverySet();       
    static public final RecoverySet idOuValorRecovery = new RecoverySet(); 
    static public final RecoverySet valorBooleanoRecovery = new RecoverySet(); 
    
    static {
    	mainRecovery.add(new Integer(CompiladorTrabalhoConstants.EOF));

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
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.ID));
    	coisasDentroDoBlocoRecovery.add(new Integer(CompiladorTrabalhoConstants.EVIVERAMFELIZESPARASEMPRE));
    	coisasDentroDoBlocoRecovery.union(coisasDentroDoBlocoRecovery);
    	
    	tipoDeDadoEDecalaracaoDeVariaveisRecovery.union(coisasDentroDoBlocoRecovery);
    	condicionalRecovery.union(coisasDentroDoBlocoRecovery);
    	repeticaoEnquantoRecovery.union(coisasDentroDoBlocoRecovery);
    	repeticaoFacaEnquantoRecovery.union(coisasDentroDoBlocoRecovery);
    	leituraRecovery.union(coisasDentroDoBlocoRecovery);
    	leituraRecovery.union(coisasDentroDoBlocoRecovery);
    	atribuicaoValorVariavelJaDeclaradaRecovery.union(coisasDentroDoBlocoRecovery);
    	
    	atribuicaoValorRecovery.add(new Integer(CompiladorTrabalhoConstants.VIRGULA));
    	atribuicaoValorRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));
    	
    	umaOuMaisvariaveisComOuSemAtribuicaoRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));
    	declaracaoDeOutraVariavelRecovery.union(umaOuMaisvariaveisComOuSemAtribuicaoRecovery);
    	
    	operacaoMatematicaRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	continuaOperacaoMatematicaRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));
    	continuaOperacaoMatematicaRecovery.union(operacaoMatematicaRecovery);
    	continuaOperacaoMatematicaRecovery.union(atribuicaoValorRecovery);

    	expressaoLogicaRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	continuaExpressaoLogicaRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	continuaExpressaoLogicaRecovery.add(new Integer(CompiladorTrabalhoConstants.PONTOEVIRGULA));
    	continuaExpressaoLogicaRecovery.union(expressaoLogicaRecovery);
    	continuaExpressaoLogicaRecovery.union(atribuicaoValorRecovery);
    	
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.ID));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.CARACTER));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.DECIMAL));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.VERDADEIRO));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.FALSO));
    	operadorLogicoRecovery.add(new Integer(CompiladorTrabalhoConstants.ABREPARENTESES));

    	operadorMatematicoRecovery.add(new Integer(CompiladorTrabalhoConstants.ABREPARENTESES));
    	operadorMatematicoRecovery.add(new Integer(CompiladorTrabalhoConstants.ID));
    	operadorMatematicoRecovery.add(new Integer(CompiladorTrabalhoConstants.DECIMAL));

    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.SOMA));
    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.SUBTRACAO));
    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.MULTIPLICACAO));
    	idOuDecimalRecovery.add(new Integer(CompiladorTrabalhoConstants.DIVISAO));
    	
    	tipoDadoRecovery.add(new Integer(CompiladorTrabalhoConstants.ID));
    	
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.SOMA));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.SUBTRACAO));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.MULTIPLICACAO));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.DIVISAO));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.IGUAL));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.MAIORIGUAL));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.MENORIGUAL));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.MAIOR));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.MENOR));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.DIFERENTE));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.E));
    	valorRecovery.add(new Integer(CompiladorTrabalhoConstants.OU));
    	
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.FECHAPARENTESES));
    	idOuValorRecovery.union(expressaoLogicaRecovery);
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.IGUAL));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.MAIORIGUAL));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.MENORIGUAL));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.MAIOR));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.MENOR));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.DIFERENTE));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.E));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.OU));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.SOMA));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.SUBTRACAO));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.MULTIPLICACAO));
    	idOuValorRecovery.add(new Integer(CompiladorTrabalhoConstants.DIVISAO));
    	
    	valorBooleanoRecovery.union(valorRecovery);
    }
}
