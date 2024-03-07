package CalculadoraJunit;

/**
 * Classe Calculadora, que simula una calculadora bàsica amb les funcions 
 * de suma, resta, multiplica, divideix i majorQue.
 * @author Cristian 
 */
public class Calculadora {
	private float lastResult;
	private String lastOp;
	
    /**
     * Funció que retorna l'últim resultat
     * @return
     */
    public float getLastResult() {
		return this.lastResult;
	}
	
    /**
     * Funció que retorna l'última operació
     * @return
     */
    public String getLastOp() {
		return this.lastOp;
	}
	
    /**
     * Funció que realitza una suma de dos operands
     * @param op1
     * @param op2
     * @return
     */
    public float suma( float op1, float op2) {
		float result = op1 + op2;
		this.lastResult = result;
		this.lastOp = "Suma";
		return result;
	}
	
    /**
     * Funció que realitza una resta de dos operands
     * @param op1
     * @param op2
     * @return
     */
    public float resta(float op1, float op2) {
		float result = op1 - op2;
		this.lastResult = result;
		this.lastOp = "Resta";
		return result;
	}
	
    /**
     * Funció que realitza una multiplicació de dos operands
     * @param op1
     * @param op2
     * @return
     */
    public float multiplica(float op1, float op2) {
		float result = op1 * op2;
		this.lastResult = result;
		this.lastOp = "Multiplica";
		return result;
	}
	
    /**
     * Funció que realitza una divisió entre dos operands
     * @param op1
     * @param op2
     * @return
     */
    public float divideix(float op1, float op2) {
		float result = op1 / op2;
		this.lastResult = result;
		this.lastOp = "Divideix";
		return result;
	}
	
    /**
     * Funció que retorna si el primer operand és major que el segón
     * @param op1
     * @param op2
     * @return
     */
    public boolean majorQue (float op1, float op2) {
		if (op1 > op2) {
			return true;
		}
		return false;
	}
	
    /**
     * Funció que reestableix els valors inicials del resultat i l'operació
     */
    public void restablecer(){
		this.lastResult = 0;
		this.lastOp = "Ninguna";
	}
}



