import java.math.BigDecimal;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
//Crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
enum Operazioni {
    ADDIZIONE,
    SOTTRAZIONE,
    MOLTIPLICAZIONE,
    DIVISIONE,
    MIN,
    MAX
}

public class Main {
    public static void main(String[] args) throws Exception {
        BigDecimal big1 = BigDecimal.valueOf(2.57);
        System.out.println("numero 1: "+big1);
        BigDecimal big2 = BigDecimal.valueOf(7.98);
        System.out.println("numero 2: "+big2);
        Operazioni op1 = Operazioni.DIVISIONE;

        switch (op1){
            case ADDIZIONE :
                System.out.println(resultAddizione(big1, big2));
                System.out.println(op1);
                break;
            case SOTTRAZIONE:
                System.out.println(resultSottrazione(big1, big2));
                System.out.println(op1);
                break;
            case MOLTIPLICAZIONE:
                System.out.println(resultMoltiplicazione(big1, big2));
                System.out.println(op1);
                break;
            case DIVISIONE:
                System.out.println(resultDivisione(big1, big2));
                System.out.println(op1);
                break;
            case MIN:
                System.out.println(resultMin(big1, big2));
                System.out.println(op1);
                break;
            case MAX:
                System.out.println(resultMax(big1, big2));
                System.out.println(op1);
                break;
        }
    }

    public static BigDecimal resultAddizione(BigDecimal big1, BigDecimal big2){
        return big1.add(big2);
    }

    public static BigDecimal resultSottrazione(BigDecimal big1, BigDecimal big2){
        return big1.subtract(big2);
    }
    public static BigDecimal resultMoltiplicazione(BigDecimal big1, BigDecimal big2){
        return big1.multiply(big2);
    }

    public static BigDecimal resultDivisione(BigDecimal big1, BigDecimal big2) throws Exception{
        if (big2.compareTo(BigDecimal.ZERO) != 0) {
            return big1.divide(big2, 2, BigDecimal.ROUND_HALF_EVEN);
        }else {
            throw new ArithmeticException("inserire un valore diverso da zero");
        }
    }
    public static BigDecimal resultMin(BigDecimal big1, BigDecimal big2){
        return big1.min(big2);
    }
    public static BigDecimal resultMax(BigDecimal big1, BigDecimal big2){
        return big1.max(big2);
    }
}